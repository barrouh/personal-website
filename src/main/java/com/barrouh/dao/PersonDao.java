package com.barrouh.dao;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.barrouh.domain.Person;

public class PersonDao {

	private ObjectMapper mapper = new ObjectMapper();
	
	private String dataPath = "/Users/barrouh/Desktop/GitHub/BarrouhWebsite/src/main/data/Persone.json";
	
	final static Logger LOGGER = LogManager.getLogger(PersonDao.class);
	
	public Person getPersone() {
		Person person=null;
		try {
		   person = mapper.readValue(new File(dataPath), Person.class);
		} catch (JsonGenerationException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (JsonMappingException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return person;
	}
	
}
