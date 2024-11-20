package ru.example.City.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.example.City.entity.Person;

@Repository
public class PersonRepository {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Person> getPersonsByCity(String city) {
		String jpql = "SELECT p FROM Person p WHERE p.cityOfLiving = :city";
		return entityManager.createQuery(jpql, Person.class)
				.setParameter("city", city)
				.getResultList();
	}
	
	
}
