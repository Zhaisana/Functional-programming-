package eu.glowacki.utp.assignment02.employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Manager extends Worker {
	private final List<Employee> _subordinates;

	public Manager(String firstName, String surname, LocalDate birthDate, LocalDate employmentDate) {
		super(firstName, surname, birthDate, employmentDate);
		_subordinates = new ArrayList<>();
	}

	public List<Employee> getSubordinates() {
		return _subordinates;
	}

	public List<Employee> getAllSubordinates(){
		List<Employee> subordinates = getSubordinates();
		List<Employee> result = new ArrayList<>(subordinates);

		for(Employee e: subordinates){
			if(e instanceof Manager manager){
				result.addAll(manager.getAllSubordinates());
			}
		}

		return result;
	}

	public void addSubordinates(List<Employee> employees) {
		employees.forEach(emp -> {
			_subordinates.add(emp);
			emp.setManager(this);
		});
	}
}
