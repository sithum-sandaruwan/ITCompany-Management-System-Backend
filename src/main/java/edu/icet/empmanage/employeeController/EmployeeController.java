package edu.icet.empmanage.employeeController;

import edu.icet.empmanage.dto.Employee;
import edu.icet.empmanage.entity.EmployeeEntity;
import edu.icet.empmanage.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {


    final EmployeeService employeeService;

    @PostMapping("add-employeee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @GetMapping("get-all")
    public Iterable<EmployeeEntity> getAll() {
        return employeeService.getAll();
    }
}
