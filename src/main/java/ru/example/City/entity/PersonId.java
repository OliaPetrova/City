package ru.example.City.entity;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class PersonId implements Serializable {

	private String name;
	private String surname;
	private int age;

	public PersonId() {
		// TODO Auto-generated constructor stub
	}

	public PersonId(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonId other = (PersonId) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "PersonId [name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}
	
	

}
