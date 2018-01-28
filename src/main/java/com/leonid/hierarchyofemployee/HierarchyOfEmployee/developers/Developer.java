package com.leonid.hierarchyofemployee.HierarchyOfEmployee.developers;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.Employee;
import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Developer extends Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String position;
    private Integer age;
    @ManyToOne
    private HeadOfDepartment headOfDepartment;

    public Developer(String name, String position, Integer age, HeadOfDepartment headOfDepartment) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.headOfDepartment = headOfDepartment;
    }
}
