package eu.glowacki.utp.assignment02.payroll;

import java.math.BigDecimal;

import eu.glowacki.utp.assignment02.employee.Employee;


public final class PayrollEntry {
	private final Employee _employee;
	private final BigDecimal _salaryPlusBonus;

	public PayrollEntry(Employee employee, BigDecimal salary, BigDecimal bonus) {
		if (salary == null || bonus == null)
			throw new IllegalArgumentException();
		_employee = employee;
		_salaryPlusBonus = salary.add(bonus);
	}

	public Employee getEmployee() {
		return _employee;
	}

	public BigDecimal getSalaryPlusBonus() {
		return _salaryPlusBonus;
	}
}
