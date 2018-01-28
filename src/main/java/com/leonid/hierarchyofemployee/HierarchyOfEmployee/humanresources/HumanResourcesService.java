package com.leonid.hierarchyofemployee.HierarchyOfEmployee.humanresources;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HumanResourcesService {
    private final HumanResourcesRepository humanResourcesRepository;

    public List<HumanResources> getHumanResourcesByHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        return humanResourcesRepository.findByHeadOfDepartment(headOfDepartment);
    }

    public Optional<HumanResources> getById(Integer id) {
        return humanResourcesRepository.findById(id);
    }

    public HumanResources save(HumanResources humanResources) {
        return humanResourcesRepository.save(humanResources);
    }
}
