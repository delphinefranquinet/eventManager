package be.afelio.eventManagerJava.teamZDRR.impl;

import java.sql.ResultSet;

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
	

/*
	public User connexion(String login, String mot_de_passe) {

		User person = null;

		String sql = "Select id_person, \"namePerson\", \"firstnamePerson\" From persons Where login = ? AND password = ?";
		try (java.sql.Connection connection = java.sql.DriverManager.getConnection(url, user, password);
				java.sql.PreparedStatement query = connection.prepareStatement(sql);) {
			query.setString(1, login);
			query.setString(2, mot_de_passe);
			try (ResultSet resultSet = query.executeQuery()) {
				if (resultSet.next()) {

					person = createPerson(resultSet);

				}
			}
		} catch (java.sql.SQLException sqle) {
			throw new RuntimeException(sqle);
		}

		return User;
	}*/


}
