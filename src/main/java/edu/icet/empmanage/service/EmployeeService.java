package edu.icet.empmanage.service;

import edu.icet.empmanage.dto.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee> getAll();

    void deleteEmpById( Long id);

    void updateEmployee(Employee employee);
}
