package com.barrouh.dao;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.barrouh.domain.Person;
import com.barrouh.domain.Settings;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonDao {

	private final ObjectMapper mapper = new ObjectMapper();

	private String dataPath;

	static final Logger LOGGER = LogManager.getLogger(PersonDao.class);

	public PersonDao(Settings settings) {
		this.dataPath = settings.getDataPath() + "persone.json";
	}

	public Person getPersone() {
		Person person = null;
		try {
			LOGGER.info("Trying to getperson data ...");
			person = mapper.readValue(new File(dataPath), Person.class);
			LOGGER.info("Person data retrived successfully.");
		} catch (IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return person;
	}
}