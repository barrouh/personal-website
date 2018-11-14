package com.barrouh.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.barrouh.domain.Skill;

public class SkillDao {

    private ObjectMapper mapper = new ObjectMapper();
	
	private String dataPath = "/Users/barrouh/Desktop/GitHub/BarrouhWebsite/src/main/data/Skills.json";
	
	final static Logger LOGGER = LogManager.getLogger(SkillDao.class);
	
	public List<Skill> getSkills() {
		List<Skill> skills=new ArrayList<Skill>();
		try {
			skills = mapper.readValue(new File(dataPath), new TypeReference<List<Skill>>(){});
		} catch (JsonGenerationException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (JsonMappingException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return skills;
	}
}
