package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String feedbackDetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFeedbackDetails() {
		return feedbackDetails;
	}
	public void setFeedbackDetails(String feedbackDetails) {
		this.feedbackDetails = feedbackDetails;
	}
	public Feedback(int id, String feedbackDetails) {
		super();
		this.id = id;
		this.feedbackDetails = feedbackDetails;
	}
	public Feedback(String feedbackDetails) {
		super();
		this.feedbackDetails = feedbackDetails;
	}
	public Feedback() {
	}

}
