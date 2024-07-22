package edu.icet.empmanage.employeeController;

import edu.icet.empmanage.dto.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp-controller")
public class EmployeeController {

    @PostMapping("add-employeee")
    void addEmployee(@RequestBody Employee employee){


    }
}
