package eu.glowacki.utp.assignment02.employee;

import java.time.LocalDate;


public class Trainee extends Employee {
	private final LocalDate apprenticeshipStartDate;
	private final int apprenticeshipLength;

	public Trainee(String firstName, String surname, LocalDate birthDate, LocalDate startDate, int length) {
		super(firstName, surname, birthDate);
		apprenticeshipLength = length;
		apprenticeshipStartDate = startDate;
	}

	public LocalDate getApprenticeshipStartDate() {
		return apprenticeshipStartDate;
	}

	public int getApprenticeshipLength() {
		return apprenticeshipLength;
	}
}
