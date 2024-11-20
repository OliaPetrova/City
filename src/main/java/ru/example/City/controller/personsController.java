package ru.example.City.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.example.City.entity.Person;
import ru.example.City.repository.PersonRepository;

import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/persons")
public class personsController {

	private final PersonRepository personRepository;

	public personsController(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@GetMapping("/by-city")
	public List<Person> getMethodName(@RequestParam String city) {
		return personRepository.getPersonsByCity(city);

	}

}
