package com.wcjung.lambda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;

public class LambdaSQSMain implements RequestHandler<SQSEvent, Void> {
	private static final Logger LOGGER = LogManager.getLogger(LambdaSQSMain.class);

	@Override
	public Void handleRequest(SQSEvent event, Context context) {

		if (null == event.getRecords()) {
			LOGGER.error("event getRecords method is null : {}", event.toString());
			return null;
		}

		// to do
		
		return null;
	}

}
