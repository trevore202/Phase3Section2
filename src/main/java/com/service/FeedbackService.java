package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FeedbackDao;
import com.model.Feedback;

@Service
public class FeedbackService {

	@Autowired
	FeedbackDao dao;
	
	public boolean submit(String fb) {
		try {
			Feedback feed=new Feedback(fb);
			dao.save(feed);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<Feedback> getFeedback() {
		return (List<Feedback>) dao.findAll();
	}
	
}
