package edu.icet.empmanage.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.empmanage.dto.Employee;
import edu.icet.empmanage.entity.EmployeeEntity;
import edu.icet.empmanage.repository.EmployeeRepository;
import edu.icet.empmanage.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    final EmployeeRepository empRepo;

    @Override
    public void addEmployee(Employee employee) {

        EmployeeEntity employeeEntity = new ObjectMapper().convertValue(employee, EmployeeEntity.class);
        empRepo.save(employeeEntity);
    }

    @Override
    public Iterable<EmployeeEntity> getAll() {
        return empRepo.findAll();
    }
}
