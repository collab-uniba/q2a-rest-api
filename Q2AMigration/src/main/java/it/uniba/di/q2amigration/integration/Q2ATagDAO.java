package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.q2a.Tag;
import it.uniba.di.q2amigration.integration.q2a.client.TagsClientResource;

import java.util.ArrayList;

public class Q2ATagDAO {
	public ArrayList<Tag> findAll() throws DAOException {
		TagsClientResource tags = new TagsClientResource();
		ArrayList<Tag> tagList = null;

		try {
			tagList = tags.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return tagList;
	}
}
