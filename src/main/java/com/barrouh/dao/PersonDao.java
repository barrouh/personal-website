package com.barrouh.dao;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;

import com.barrouh.domain.Person;

public class PersonDao {

	private ObjectMapper mapper = new ObjectMapper();

	private String dataPath = "src/main/data/Persone.json";

	static final Logger LOGGER = LogManager.getLogger(PersonDao.class);

	public Person getPersone() {
		Person person = null;
		try {
			LOGGER.info("Trying to get Person Data ...");
			person = mapper.readValue(new File(dataPath), Person.class);
			LOGGER.info("Person Data Retrived successfully.");
		} catch (JsonGenerationException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return person;
	}

}
