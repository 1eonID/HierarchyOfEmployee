package com.leonid.hierarchyofemployee.HierarchyOfEmployee.humanresources;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HumanResourcesRepository extends JpaRepository<HumanResources, Integer> {
    List<HumanResources> findByHeadOfDepartment(HeadOfDepartment headOfDepartment);
}
