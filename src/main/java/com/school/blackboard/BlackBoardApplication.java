package com.school.blackboard;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.school.blackboard.dao.UserDAO;

@SpringBootApplication
public class BlackBoardApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	UserDAO userDao;
	
	@PostConstruct
	void started()
	{
		logger.info("->{}",TimeZone.getDefault());
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		logger.info("current time zone after->{}",TimeZone.getDefault());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BlackBoardApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
	
	logger.info("List of Users -> {}",userDao.findAllUsers());
	}
}
