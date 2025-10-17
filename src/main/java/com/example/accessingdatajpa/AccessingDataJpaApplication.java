package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = { //
        //DataSourceAutoConfiguration.class, //
})
//@EnableJpaRepositories
public class AccessingDataJpaApplication {

	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}

	@Bean
	public CommandLineRunner demo(
            PrSearchRepo prSearchRepo) {
		return (args) -> {

            log.info("PROVISION SEARCH REPO:");
            log.info("-------------------------------");
            prSearchRepo.searchPr().forEach(provision
                    -> {
                log.info(provision.toString());
            });
            log.info("");

		};
	}

}
