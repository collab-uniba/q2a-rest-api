package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.q2a.Category;
import it.uniba.di.q2amigration.integration.q2a.client.CategoriesClientResource;

import java.util.ArrayList;

public class Q2ACategoryDAO {
	public ArrayList<Category> findAll() throws DAOException {
		CategoriesClientResource categories = new CategoriesClientResource();
		ArrayList<Category> categoryList = null;

		try {
			categoryList = categories.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return categoryList;
	}
}
