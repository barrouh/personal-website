package com.barrouh.service;

import java.util.List;

import com.barrouh.dao.PersonDao;
import com.barrouh.dao.SkillDao;
import com.barrouh.dao.StoryDao;
import com.barrouh.domain.Person;
import com.barrouh.domain.Skill;
import com.barrouh.domain.Story;

public class PersoneService {
	
	private PersonDao personDao;
	
	private SkillDao skillDao;
	
	private StoryDao storyDao;
	
	private Person person;
	
    private List<Skill> skills;
	
	private List<Story> stories;
	
	public PersoneService() {
		personDao= new PersonDao();
		skillDao= new SkillDao();
		storyDao= new StoryDao();
	}
	
	public Person getPerson() {
		person=personDao.getPersone();
		skills=skillDao.getSkills();
		stories=storyDao.getStories();
		person.setSkills(skills);
		person.setStories(stories);
		return person;
	}

}
