package com.scheduleExample;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dario
 */

@Component
public class Schedule {
	
    private static final Logger log = LoggerFactory.getLogger(Schedule.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
    	log.info("The time is now: {}", dateFormat.format(new Date()));
    }
    
    
    
}
