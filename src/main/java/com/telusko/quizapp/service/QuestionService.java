package com.telusko.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.quizapp.dao.QuestionDao;
import com.telusko.quizapp.model.Question;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}

	public List<Question> getQuestionByCategory(String category) {
		// TODO Auto-generated method stub
		return questionDao.findByCategory(category);
	}
 
	public String addQuestion(Question question) {
		 questionDao.save(question);
		 return "Success";
	}

	public String deleteQuestion(Integer id) {
		  questionDao.deleteById(id);
		  return "Deleted";
	}

	public String updateQuestion(Question question) {
		questionDao.save(question);
		return "Updated";
	}
	
	



}
