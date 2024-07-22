package edu.icet.empmanage.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String role_id;
    private String department_id;
}
