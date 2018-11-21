package com.barrouh.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.barrouh.domain.Settings;
import com.barrouh.domain.Skill;

public class SkillDao {

	private final ObjectMapper mapper = new ObjectMapper();

	private String dataPath;

	static final Logger LOGGER = LogManager.getLogger(SkillDao.class);
	
	public SkillDao(Settings settings) {
		this.dataPath = settings.getDataPath()+"Skills.json";
	}

	public List<Skill> getSkills() {
		List<Skill> skills = new ArrayList<>();
		try {
			LOGGER.info("Trying to get Skills Data ...");
			skills = mapper.readValue(new File(dataPath), new TypeReference<List<Skill>>() {
			});
			LOGGER.info("Skills Data Retrived successfully.");
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return skills;
	}
}
