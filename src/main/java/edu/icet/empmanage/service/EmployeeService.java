package edu.icet.empmanage.service;

import edu.icet.empmanage.dto.Employee;
import edu.icet.empmanage.entity.EmployeeEntity;

public interface EmployeeService {

    void addEmployee(Employee employee);

    Iterable<EmployeeEntity> getAll();
}
