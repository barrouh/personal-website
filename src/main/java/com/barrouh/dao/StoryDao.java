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
	
	private String dataPath = "/Users/barrouh/Desktop/GitHub/BarrouhWebsite/src/main/data/Stories.json";
	
	final static Logger LOGGER = LogManager.getLogger(StoryDao.class);
	
	public List<Story> getStories() {
		List<Story> stories=new ArrayList<Story>();
		try {
			stories = mapper.readValue(new File(dataPath), new TypeReference<List<Story>>(){});
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
