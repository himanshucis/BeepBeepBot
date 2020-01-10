package com.beepbot;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beepbot.constant.Constant;
import com.beepbot.repository.CountryRepository;

@SpringBootApplication
public class BeepBotApplication implements CommandLineRunner {

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private CountryRepository countryReposiory;

	private static final Logger LOGGER = Logger.getLogger(BeepBotApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(BeepBotApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// inserting data in country table if table is empty
		if (countryReposiory.count() == 0) {
			LOGGER.info("Inserting data in Country table...");
			Query query = entityManager.createNativeQuery(Constant.INSERT_DATA_IN_COUNTRY);
			query.executeUpdate();
			LOGGER.info("Data inseted in country table successfully...");
		} else {
			LOGGER.info("Data alrady exist in country table...");
		}
	}

}
