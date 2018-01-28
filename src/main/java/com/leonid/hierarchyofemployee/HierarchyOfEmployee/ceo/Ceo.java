package com.leonid.hierarchyofemployee.HierarchyOfEmployee.ceo;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.company.Company;
import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Ceo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String position;
    private Integer age;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<HeadOfDepartment> headsOfDepartment;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Company company;

    public Ceo(String name, String position, Integer age, List<HeadOfDepartment> headsOfDepartment, Company company) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.headsOfDepartment = headsOfDepartment;
        this.company = company;
    }
}
