package edu.icet.empmanage.service;

import edu.icet.empmanage.dto.Employee;
import edu.icet.empmanage.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee> getAll();
}
