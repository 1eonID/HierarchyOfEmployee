package com.leonid.hierarchyofemployee.HierarchyOfEmployee.developers;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeveloperRepository extends JpaRepository<Developer, Integer> {
    List<Developer> findByHeadOfDepartment(HeadOfDepartment headOfDepartment);
}
