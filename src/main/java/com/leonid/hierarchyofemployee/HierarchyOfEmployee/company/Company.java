package com.leonid.hierarchyofemployee.HierarchyOfEmployee.company;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.ceo.Ceo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Ceo ceo;

    public Company(String name, Ceo ceo) {
        this.name = name;
        this.ceo = ceo;
    }
}
