package com.barrouh.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.barrouh.dao.PersonDao;
import com.barrouh.dao.SkillDao;
import com.barrouh.dao.StoryDao;
import com.barrouh.domain.Person;
import com.barrouh.domain.Skill;
import com.barrouh.domain.Story;

public class PersoneService {
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private SkillDao skillDao;
	
	@Autowired
	private StoryDao storyDao;
	
	static final Logger LOGGER = LogManager.getLogger(PersoneService.class);
	
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

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public SkillDao getSkillDao() {
		return skillDao;
	}

	public void setSkillDao(SkillDao skillDao) {
		this.skillDao = skillDao;
	}

	public StoryDao getStoryDao() {
		return storyDao;
	}

	public void setStoryDao(StoryDao storyDao) {
		this.storyDao = storyDao;
	}
}
