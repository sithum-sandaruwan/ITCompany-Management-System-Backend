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
import java.util.Optional;

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
    public List<Employee> getAll() {

        List<Employee> emoployeeList = new ArrayList<>();

        List<EmployeeEntity> all = (List<EmployeeEntity>) empRepo.findAll();
        all.forEach(entity -> {
            emoployeeList.add(new ObjectMapper().convertValue(entity, Employee.class));
        });

        return emoployeeList;
    }

    @Override
    public void deleteEmpById(Long id) {

        if (empRepo.existsById(id)) {
            empRepo.deleteById(id);
        }

    }

    @Override
    public void updateEmployee(Employee employee) {

        if (empRepo.findById(employee.getId()).isPresent()){
            empRepo.save(new ObjectMapper().convertValue(employee, EmployeeEntity.class));
        }
    }

    @Override
    public Employee findEmployeeById(Long id) {

        if (empRepo.findById(id).isPresent()){
            Optional<EmployeeEntity> employeeById = empRepo.findById(id);
            return new ObjectMapper().convertValue(employeeById.get(),Employee.class);
        }
        return new Employee();
    }
}
