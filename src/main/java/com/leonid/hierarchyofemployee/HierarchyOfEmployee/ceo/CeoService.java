package com.leonid.hierarchyofemployee.HierarchyOfEmployee.ceo;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CeoService {
    private final CeoRepository ceoRepository;

    public List<HeadOfDepartment> getHeadsOfDepartment() {
        return ceoRepository.findAllHeadOfDepartment();
    }

    public Optional<Ceo> getById(Integer id) {
        return ceoRepository.findById(id);
    }

    public Ceo save(Ceo ceo) {
        return ceoRepository.save(ceo);
    }
}
