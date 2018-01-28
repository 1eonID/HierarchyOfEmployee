package com.leonid.hierarchyofemployee.HierarchyOfEmployee.qualityassurance;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QualityAssuranceService {
    private final QualityAssuranceRepository qualityAssuranceRepository;

    public List<QualityAssurance> getQualityAssurancesByHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        return qualityAssuranceRepository.findByHeadOfDepartment(headOfDepartment);
    }

    public Optional<QualityAssurance> getById(Integer id) {
        return qualityAssuranceRepository.findById(id);
    }

    public QualityAssurance save(QualityAssurance qualityAssurance) {
        return qualityAssuranceRepository.save(qualityAssurance);
    }
}
