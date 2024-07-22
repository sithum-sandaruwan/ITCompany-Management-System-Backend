package edu.icet.empmanage.service.impl;

import edu.icet.empmanage.dto.Employee;
import edu.icet.empmanage.repository.EmployeeRepository;
import edu.icet.empmanage.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    final EmployeeRepository empRepo;

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }
}
