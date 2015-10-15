package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.q2a.Answer;
import it.uniba.di.q2amigration.integration.q2a.client.AnswersClientResource;

import java.util.ArrayList;

public class Q2AAnswerDAO {
	
	public ArrayList<Answer> findAll() throws DAOException {
		AnswersClientResource answers = new AnswersClientResource();
		ArrayList<Answer> answerList = null;

		try {
			answerList = answers.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return answerList;
	}
	
	public Integer create(Answer bean) throws DAOException {
		AnswersClientResource answers = new AnswersClientResource();
		Answer answer = null;

		try {
			answer = answers.add(bean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return answer.getAnswerid();
	}

}
