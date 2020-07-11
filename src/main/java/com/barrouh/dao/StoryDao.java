package com.barrouh.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.barrouh.domain.Settings;
import com.barrouh.domain.Story;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StoryDao {

    private final ObjectMapper mapper = new ObjectMapper();
	
	private String dataPath;
	
	static final Logger LOGGER = LogManager.getLogger(StoryDao.class);
	
	public StoryDao(Settings settings) {
		this.dataPath = settings.getDataPath()+"Stories.json";
	}
	
	public List<Story> getStories() {
		List<Story> stories=new ArrayList<>();
		try {
			LOGGER.info("Trying to get Stories Data ...");
			stories = mapper.readValue(new File(dataPath), new TypeReference<List<Story>>(){});
			LOGGER.info("Stories Data Retrived successfully.");
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return stories;
	}
}
