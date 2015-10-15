package it.uniba.di.q2amigration.business;

import it.uniba.di.q2amigration.business.apispark.DotNet;
import it.uniba.di.q2amigration.business.apispark.DotNetList;
import it.uniba.di.q2amigration.business.apispark.Java;
import it.uniba.di.q2amigration.business.apispark.JavaList;
import it.uniba.di.q2amigration.business.apispark.Other;
import it.uniba.di.q2amigration.business.apispark.OtherList;
import it.uniba.di.q2amigration.business.apispark.PHP;
import it.uniba.di.q2amigration.business.apispark.PHPList;
import it.uniba.di.q2amigration.business.apispark.Ruby;
import it.uniba.di.q2amigration.business.apispark.RubyList;
import it.uniba.di.q2amigration.business.q2a.Answer;
import it.uniba.di.q2amigration.business.q2a.Question;
import it.uniba.di.q2amigration.integration.APISparkDotNetDAO;
import it.uniba.di.q2amigration.integration.APISparkJavaDAO;
import it.uniba.di.q2amigration.integration.APISparkOtherDAO;
import it.uniba.di.q2amigration.integration.APISparkPHPDAO;
import it.uniba.di.q2amigration.integration.APISparkRubyDAO;
import it.uniba.di.q2amigration.integration.DAOException;
import it.uniba.di.q2amigration.integration.Q2AAnswerDAO;
import it.uniba.di.q2amigration.integration.Q2AQuestionDAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MigrationAS {
	
	public MigrationAS() {
		javaMigration();
		dotNetMigration();
		otherMigration();
		phpMigration();
		rubyMigration();
	}
	
	public void javaMigration() {
		APISparkJavaDAO javaDAO = new APISparkJavaDAO();
		JavaList javaList = new JavaList();
		
		try {
			javaList = javaDAO.findAll();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JavaList javaQuestionList = new JavaList();
		JavaList javaAnswerList = new JavaList();
		
		for (Java java : javaList) {
			if (java.getType().equals("question"))
				javaQuestionList.add(java);
			else if (java.getType().equals("answer")) {
				List<String> uids = new ArrayList<String>(Arrays.asList(java.getUid().split("\\.")));
				java.setUid(uids.get(0));
				javaAnswerList.add(java);
			}
			
		}
		
		Q2AQuestionDAO questionDAO = new Q2AQuestionDAO();
		Q2AAnswerDAO answerDAO = new Q2AAnswerDAO();
		for (Java java : javaQuestionList) {
			Question question = new Question();
			question.setTitle(java.getTitle());
			question.setContent(java.getText());
			// Java category is 5 else get all categories and set this field
			question.setCategoryid(5);
			if (java.getTags() != null) {
				ArrayList<String> tags = new ArrayList<String>(Arrays.asList(java.getTags().split("\\. ")));
				question.setTags(tags);
			}
			Integer qid = null;
			try {
				qid = questionDAO.create(question);
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (Java javaAns : javaAnswerList) {
				if (javaAns.getUid().equals(java.getUid())) {
					Answer ans = new Answer();
					ans.setQuestionid(qid);
					ans.setContent(javaAns.getText());
					try {
						@SuppressWarnings("unused")
						Integer aid = answerDAO.create(ans);
					} catch (DAOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else 
					continue;
			}
		}
	}
	
	public void dotNetMigration() {
		APISparkDotNetDAO dotNetDAO = new APISparkDotNetDAO();
		DotNetList dotNetList = new DotNetList();
		
		try {
			dotNetList = dotNetDAO.findAll();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DotNetList dotNetQuestionList = new DotNetList();
		DotNetList dotNetAnswerList = new DotNetList();
		
		for (DotNet dotNet : dotNetList) {
			if (dotNet.getType().equals("question"))
				dotNetQuestionList.add(dotNet);
			else if (dotNet.getType().equals("answer")) {
				List<String> uids = new ArrayList<String>(Arrays.asList(dotNet.getUid().split("\\.")));
				dotNet.setUid(uids.get(0));
				dotNetAnswerList.add(dotNet);
			}
			
		}
		
		Q2AQuestionDAO questionDAO = new Q2AQuestionDAO();
		Q2AAnswerDAO answerDAO = new Q2AAnswerDAO();
		for (DotNet dotNet : dotNetQuestionList) {
			Question question = new Question();
			question.setTitle(dotNet.getTitle());
			question.setContent(dotNet.getText());
			// .NET category is 3 else get all categories and set this field
			question.setCategoryid(3);
			if (dotNet.getTags() != null) {
				ArrayList<String> tags = new ArrayList<String>(Arrays.asList(dotNet.getTags().split("\\. ")));
				question.setTags(tags);
			}
			Integer qid = null;
			try {
				qid = questionDAO.create(question);
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (DotNet dotNetAns : dotNetAnswerList) {
				if (dotNetAns.getUid().equals(dotNet.getUid())) {
					Answer ans = new Answer();
					ans.setQuestionid(qid);
					ans.setContent(dotNetAns.getText());
					try {
						@SuppressWarnings("unused")
						Integer aid = answerDAO.create(ans);
					} catch (DAOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else 
					continue;
			}
		}
	}
	
	public void otherMigration() {
		APISparkOtherDAO otherDAO = new APISparkOtherDAO();
		OtherList otherList = new OtherList();
		
		try {
			otherList = otherDAO.findAll();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		OtherList otherQuestionList = new OtherList();
		OtherList otherAnswerList = new OtherList();
		
		for (Other other : otherList) {
			if (other.getType().equals("question"))
				otherQuestionList.add(other);
			else if (other.getType().equals("answer")) {
				List<String> uids = new ArrayList<String>(Arrays.asList(other.getUid().split("\\.")));
				other.setUid(uids.get(0));
				otherAnswerList.add(other);
			}
			
		}
		
		Q2AQuestionDAO questionDAO = new Q2AQuestionDAO();
		Q2AAnswerDAO answerDAO = new Q2AAnswerDAO();
		for (Other other : otherQuestionList) {
			Question question = new Question();
			question.setTitle(other.getTitle());
			question.setContent(other.getText());
			// Other category is 7 else get all categories and set this field
			question.setCategoryid(7);
			if (other.getTags() != null) {
				ArrayList<String> tags = new ArrayList<String>(Arrays.asList(other.getTags().split("\\. ")));
				question.setTags(tags);
			}
			Integer qid = null;
			try {
				qid = questionDAO.create(question);
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (Other otherAns : otherAnswerList) {
				if (otherAns.getUid().equals(other.getUid())) {
					Answer ans = new Answer();
					ans.setQuestionid(qid);
					ans.setContent(otherAns.getText());
					try {
						@SuppressWarnings("unused")
						Integer aid = answerDAO.create(ans);
					} catch (DAOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else 
					continue;
			}
		}
	}
	
	public void phpMigration() {
		APISparkPHPDAO phpDAO = new APISparkPHPDAO();
		PHPList phpList = new PHPList();
		
		try {
			phpList = phpDAO.findAll();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PHPList phpQuestionList = new PHPList();
		PHPList phpAnswerList = new PHPList();
		
		for (PHP php : phpList) {
			if (php.getType().equals("question"))
				phpQuestionList.add(php);
			else if (php.getType().equals("answer")) {
				List<String> uids = new ArrayList<String>(Arrays.asList(php.getUid().split("\\.")));
				php.setUid(uids.get(0));
				phpAnswerList.add(php);
			}
			
		}
		
		Q2AQuestionDAO questionDAO = new Q2AQuestionDAO();
		Q2AAnswerDAO answerDAO = new Q2AAnswerDAO();
		for (PHP php : phpQuestionList) {
			if (Integer.valueOf(php.getUid()) > 48) {
			Question question = new Question();
			question.setTitle(php.getTitle());
			question.setContent(php.getText());
			// PHP category is 4 else get all categories and set this field
			question.setCategoryid(4);
			if (php.getTags() != null) {
				ArrayList<String> tags = new ArrayList<String>(Arrays.asList(php.getTags().split("\\. ")));
				question.setTags(tags);
			}
			Integer qid = null;
			try {
				qid = questionDAO.create(question);
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (PHP phpAns : phpAnswerList) {
				if (phpAns.getUid().equals(php.getUid())) {
					Answer ans = new Answer();
					ans.setQuestionid(qid);
					ans.setContent(phpAns.getText());
					try {
						@SuppressWarnings("unused")
						Integer aid = answerDAO.create(ans);
					} catch (DAOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else 
					continue;
			}
			}
		}
	}
	
	public void rubyMigration() {
		APISparkRubyDAO rubyDAO = new APISparkRubyDAO();
		RubyList rubyList = new RubyList();
		
		try {
			rubyList = rubyDAO.findAll();
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RubyList rubyQuestionList = new RubyList();
		RubyList rubyAnswerList = new RubyList();
		
		for (Ruby ruby : rubyList) {
			if (ruby.getType().equals("question"))
				rubyQuestionList.add(ruby);
			else if (ruby.getType().equals("answer")) {
				List<String> uids = new ArrayList<String>(Arrays.asList(ruby.getUid().split("\\.")));
				ruby.setUid(uids.get(0));
				rubyAnswerList.add(ruby);
			}
			
		}
		
		Q2AQuestionDAO questionDAO = new Q2AQuestionDAO();
		Q2AAnswerDAO answerDAO = new Q2AAnswerDAO();
		for (Ruby ruby : rubyQuestionList) {
			Question question = new Question();
			question.setTitle(ruby.getTitle());
			question.setContent(ruby.getText());
			// Ruby category is 6 else get all categories and set this field
			question.setCategoryid(6);
			if (ruby.getTags() != null) {
				ArrayList<String> tags = new ArrayList<String>(Arrays.asList(ruby.getTags().split("\\. ")));
				question.setTags(tags);
			}
			Integer qid = null;
			try {
				qid = questionDAO.create(question);
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (Ruby rubyAns : rubyAnswerList) {
				if (rubyAns.getUid().equals(ruby.getUid())) {
					Answer ans = new Answer();
					ans.setQuestionid(qid);
					ans.setContent(rubyAns.getText());
					try {
						@SuppressWarnings("unused")
						Integer aid = answerDAO.create(ans);
					} catch (DAOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else 
					continue;
			}
		}
	}

}
