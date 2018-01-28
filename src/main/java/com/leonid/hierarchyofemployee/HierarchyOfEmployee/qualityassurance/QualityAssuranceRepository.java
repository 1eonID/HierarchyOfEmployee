package com.leonid.hierarchyofemployee.HierarchyOfEmployee.qualityassurance;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QualityAssuranceRepository extends JpaRepository<QualityAssurance, Integer> {
    List<QualityAssurance> findByHeadOfDepartment(HeadOfDepartment headOfDepartment);
}
