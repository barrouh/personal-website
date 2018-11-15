package com.barrouh.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.barrouh.dao.PersonDao;
import com.barrouh.dao.SkillDao;
import com.barrouh.dao.StoryDao;
import com.barrouh.domain.Person;
import com.barrouh.domain.Skill;
import com.barrouh.domain.Story;

public class PersoneService {
	
	static final Logger LOGGER = LogManager.getLogger(PersonDao.class);
	
	private PersonDao personDao;
	
	private SkillDao skillDao;
	
	private StoryDao storyDao;
	
	public PersoneService() {
		personDao= new PersonDao();
		skillDao= new SkillDao();
		storyDao= new StoryDao();
	}
	
	public Person getPerson() {
		Person person;
	    List<Skill> skills;
		List<Story> stories;
		try {
		person=personDao.getPersone();
		skills=skillDao.getSkills();
		stories=storyDao.getStories();
		person.setSkills(skills);
		person.setStories(stories);
		return person;
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
		
	}

}
