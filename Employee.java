package eu.glowacki.utp.assignment02.employee;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Employee extends Person {
	private BigDecimal salary;
	private Manager manager;

	protected Employee(String firstName, String surname, LocalDate birthDate) {
		super(firstName, surname, birthDate);
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public BigDecimal getBonus(){
		BigDecimal bonus = BigDecimal.valueOf(0);
		if (this instanceof Worker worker) {
			bonus = worker.getBonus();
		}
		return bonus;
	}

	public BigDecimal getSalaryPlusBonus() {
		BigDecimal bonus = getBonus();
		if(bonus == null) return salary;
		return salary.add(bonus);
	}
}
