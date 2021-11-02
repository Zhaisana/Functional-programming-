package eu.glowacki.utp.assignment02.employee;

import java.time.LocalDate;

public abstract class Person {
	private final String _firstName;
	private final String _surname;
	private final LocalDate _birthDate;

	protected Person(String firstName, String surname, LocalDate birthDate) {
		_firstName = firstName;
		_surname = surname;
		_birthDate = birthDate;
	}

	public String getFirstName() { // getter
		return _firstName;
	}

	public String getSurname() {
		return _surname;
	}

	public short getAge() {
		LocalDate today = LocalDate.now();
		int age = today.getYear() - _birthDate.getYear();

		if (today.getMonthValue() < _birthDate.getMonthValue())
			age--;

		return (short) age;
	}
}