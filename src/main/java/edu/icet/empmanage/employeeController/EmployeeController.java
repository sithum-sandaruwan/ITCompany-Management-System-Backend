package edu.icet.empmanage.employeeController;

import edu.icet.empmanage.dto.Employee;
import edu.icet.empmanage.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService employeeService;

    @PostMapping("add-employeee")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Employee employee) {

        employeeService.addEmployee(employee);
    }

    @GetMapping("get-all")
    public List<Employee> getAll() {

        return employeeService.getAll();
    }

    @DeleteMapping("/delete-emp/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmpById(id);
        return "Deleted";
    }

    @PostMapping("/update-emp")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);

    }

    @GetMapping("/find-by-id/{id}")
    public Employee findById(@PathVariable Long id){
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("/find-by-firstName/{firstName}")
    public Employee findByFirstName(@PathVariable String firstName){
        return employeeService.findByFirstName(firstName);
    }
}
