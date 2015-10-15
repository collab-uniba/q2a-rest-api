package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.q2a.User;
import it.uniba.di.q2amigration.integration.q2a.client.UsersClientResource;

import java.util.ArrayList;

public class Q2AUserDAO {
	
	public ArrayList<User> findAll() throws DAOException {
		UsersClientResource users = new UsersClientResource();
		ArrayList<User> userList = null;

		try {
			userList = users.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userList;
	}

}
