package com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HeadOfDepartmentRepository extends JpaRepository<HeadOfDepartment, Integer> {
    List<Employee> findByHeadOfDepartment(HeadOfDepartment headOfDepartment);
}
