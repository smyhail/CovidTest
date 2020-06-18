package com.aub.CovidTest;

import com.aub.CovidTest.entities.Persons;
import com.aub.CovidTest.repositories.CovidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CovidTestApplication implements CommandLineRunner {

	@Autowired
	private CovidRepository covidRepository;

	public static void main(String[] args) {
		SpringApplication.run(CovidTestApplication.class, args);
	}

	@Override
	public void run( String[] args) throws Exception{

		covidRepository.save( new Persons("Tymoteusz ","Majchrzak","Gliwice",true));
		covidRepository.save( new Persons("Jakub ","Bielecki","Wrocław",false));;
		covidRepository.save( new Persons("Liliana ","Sobczak","Czestachowa",true));
		covidRepository.save( new Persons("Franciszek ","Kacprzak","Łodz",false));
		covidRepository.save( new Persons("Julia ","Piotrowska","Warszawa",true));
		covidRepository.save( new Persons("Szymon ","Jankowski","Poznań",false));
		covidRepository.save( new Persons("Martyna ","Przybylska","Sieradz",true));
		covidRepository.save( new Persons("Urszula ","Smolińska","Gdynia",false));
	}

}
