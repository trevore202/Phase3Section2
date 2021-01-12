package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.model.Feedback;
import com.service.FeedbackService;

@RestController
public class FeedbackRestController {

	@Autowired
	FeedbackService service;
	
	
	@GetMapping("/submitfeedback")
	public ModelAndView showFeedbackForm() {
		Feedback f1 = new Feedback();
		return new ModelAndView("submitfeedback","form",f1);
	}
	
	@PostMapping("/submitfeedback")
	public ModelAndView submitFeedback(@RequestParam("feedback")String fb) {
		service.submit(fb);
		List<Feedback> fblist = service.getFeedback();
		return new ModelAndView("viewfb","fbs",fblist);
	
	}
	
	/*@GetMapping("/getfeedback")
	public ModelAndView getFeedback() {
		List<Feedback> fblist = service.getFeedback();
		return new ModelAndView("viewfb","fbs",fblist);
	
	}*/
}
