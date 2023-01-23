package com.example.awslambda;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class WelcomeLambda implements RequestHandler<Map<String,String>, String>{
	
	@Override
	public String handleRequest(Map<String, String> event, Context context) {
		LambdaLogger logger = context.getLogger();
	    
		logger.log("EVENT: " + event.toString() + "\n");
	    logger.log("EVENT TYPE: " + event.getClass().toString() + "\n");
	    Book book = new Book(Integer.valueOf(event.get("id")), event.get("name"), event.get("author"));
	    return book.toString();
	}
}
