package be.afelio.eventManagerJava.teamZDRR.impl;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import be.afelio.eventManagerJava.teamZDRR.beans.Event;

public class implementEventMangerRepository {

	protected String user;
	protected String password;
	protected String url;

	public implementEventMangerRepository(String user, String password, String url) {
		super();
		this.user = user;
		this.password = password;
		this.url = url;
	}

	public List<Event> FindAllEvents() {

		List<Event> events = new ArrayList<>();
		String sql = "select event_id, event_name, event_place, event_datetimestart, event_datetimeend, event_description, event_usermanager from events";

		try (java.sql.Connection connection = java.sql.DriverManager.getConnection(url, user, password);
				java.sql.PreparedStatement query = connection.prepareStatement(sql)) {

			try (ResultSet rs = query.executeQuery()) {

				while (rs.next()) {
					Event event = new Event();
					event.setId(rs.getInt(1));
					event.setName(rs.getString(2));
					event.setPlace(rs.getString(3));

					Timestamp timestamp = rs.getTimestamp(4); // récupérer le timestamp
					LocalDateTime localDateTime = timestamp.toLocalDateTime(); // convertir Timestamp en localDateTime
					event.setStartEvent(localDateTime); // stock l'information dans l'event

					event.setEndEvent(rs.getTimestamp(5).toLocalDateTime()); // idem 3 lignes
					
					
					event.setDescription(rs.getString(6));
					event.setIdManager(rs.getInt(7));

					events.add(event);
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return events;
	}

	/*
	 * public User connexion(String login, String mot_de_passe) {
	 * 
	 * User person = null;
	 * 
	 * String sql =
	 * "Select id_person, \"namePerson\", \"firstnamePerson\" From persons Where login = ? AND password = ?"
	 * ; try (java.sql.Connection connection =
	 * java.sql.DriverManager.getConnection(url, user, password);
	 * java.sql.PreparedStatement query = connection.prepareStatement(sql);) {
	 * query.setString(1, login); query.setString(2, mot_de_passe); try (ResultSet
	 * resultSet = query.executeQuery()) { if (resultSet.next()) {
	 * 
	 * person = createPerson(resultSet);
	 * 
	 * } } } catch (java.sql.SQLException sqle) { throw new RuntimeException(sqle);
	 * }
	 * 
	 * return User; }
	 */

}
