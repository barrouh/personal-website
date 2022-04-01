package com.barrouh.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.barrouh.domain.Settings;
import com.barrouh.domain.Skill;

public class SkillDao {

	private final ObjectMapper mapper = new ObjectMapper();

	private String dataPath;

	static final Logger LOGGER = LogManager.getLogger(SkillDao.class);

	public SkillDao(Settings settings) {
		this.dataPath = settings.getDataPath() + "skills.json";
	}

	public List<Skill> getSkills() {
		List<Skill> skills = new ArrayList<>();
		try {
			LOGGER.info("Trying to get skills data ...");
			skills = mapper.readValue(new File(dataPath), new TypeReference<List<Skill>>() {
			});
			LOGGER.info("Skills data retrived successfully.");
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return skills;
	}
}