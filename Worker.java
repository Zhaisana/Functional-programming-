package eu.glowacki.utp.assignment02.employee;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Worker extends Employee {
	private final LocalDate _employmentDate;
	private BigDecimal _bonus;

	public Worker(String firstName, String surname, LocalDate birthDate, LocalDate employmentDate) {
		super(firstName, surname, birthDate);
		_employmentDate = employmentDate;
	}

	public LocalDate getEmploymentDate() {
		return _employmentDate;
	}

	public BigDecimal getBonus() {
		if(_bonus == null) return BigDecimal.valueOf(0);
		return _bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this._bonus = bonus;
	}
}