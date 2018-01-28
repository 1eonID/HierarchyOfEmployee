package com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.Employee;
import com.leonid.hierarchyofemployee.HierarchyOfEmployee.ceo.Ceo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class HeadOfDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String position;
    private Integer age;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employees;
    @ManyToOne
    private Ceo ceo;

    public HeadOfDepartment(String name, String position, Integer age, List<Employee> employees, Ceo ceo) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.employees = employees;
        this.ceo = ceo;
    }
}
