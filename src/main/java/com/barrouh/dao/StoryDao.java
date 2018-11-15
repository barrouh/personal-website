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

import com.barrouh.domain.Story;

public class StoryDao {

private ObjectMapper mapper = new ObjectMapper();
	
	private String dataPath = "src/main/data/Stories.json";
	
	static final Logger LOGGER = LogManager.getLogger(StoryDao.class);
	
	public List<Story> getStories() {
		List<Story> stories=new ArrayList<>();
		try {
			LOGGER.info("Trying to get Stories Data ...");
			stories = mapper.readValue(new File(dataPath), new TypeReference<List<Story>>(){});
			LOGGER.info("Stories Data Retrived successfully.");
		} catch (JsonGenerationException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (JsonMappingException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return stories;
	}
}
