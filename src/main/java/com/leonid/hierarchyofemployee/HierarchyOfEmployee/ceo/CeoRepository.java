package com.leonid.hierarchyofemployee.HierarchyOfEmployee.ceo;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CeoRepository extends JpaRepository<Ceo, Integer> {
    List<HeadOfDepartment> findAllHeadOfDepartment();
}
