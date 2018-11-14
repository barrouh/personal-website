package com.barrouh.web;

import com.barrouh.dao.PersonDao;
import com.barrouh.dao.SkillDao;
import com.barrouh.dao.StoryDao;

public class Main {

	public static void main(String[] args) {
	    PersonDao dao = new PersonDao();
		SkillDao daos= new SkillDao();
		StoryDao ss = new StoryDao();
		
	   System.out.println(dao.getPersone().getFirstName());
	   System.out.println(daos.getSkills().size());
	   System.out.println(ss.getStories().size());

	}

}
