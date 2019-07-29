
CREATE TABLE user (
  user_id serial PRIMARY KEY ,
  user_name varchar(50) NOT NULL ,
  user_firstname varchar(50) NOT NULL,
  user_birthdate date NOT NULL,
  user_email varchar(50) NOT NULL unique,
  user_password varchar(50) NOT NULL,
  constraint UK_Name_Firstname_Birthdate UNIQUE (user_name, user_firstname, user_birthdate)
);

CREATE TABLE event (
  event_id serial PRIMARY KEY ,
  event_name varchar(100) NOT NULL ,
  event_place varchar(100) NOT NULL,
  event_dateTimeStart TIMESTAMPtz,
  event_dateTimeEnd TIMESTAMPtz,
  event_description varchar (400),
  event_userManager int,
  constraint UK_Name_Place_DateTime UNIQUE (event_name, event_place, event_dateTimeStart),
  constraint CheckTimeRelation check ( (event_dateTimeEnd - event_dateTimeStart) >= interval '00:00:00'),
  foreign key (event_userManager) references user (user_id)
);

CREATE TABLE activity (
  activity_id serial PRIMARY KEY ,
  activity_name varchar(100) NOT NULL ,
  activity_place varchar(20) NOT NULL,
  activity_dateTimeStart TIMESTAMPtz,
  activity_dateTimeEnd TIMESTAMPtz,
  activity_description varchar (400),
  event_id int,
  constraint UK_Name_Place_DateTime UNIQUE (activity_name, activity_place, activity_dateTimeStart),
  constraint CheckTimeRelation check ( (activity_dateTimeEnd - activity_dateTimeStart) >= interval '00:00:00'),
  foreign key (event_id) references event (event_id)
);

CREATE TABLE inscriptionActivity (
  inscription_id serial PRIMARY KEY,
  user_id int,
  activity_id int,
  foreign key (user_id) references user (user_id),
  foreign key (activity_id) references event (activity_id)
);
