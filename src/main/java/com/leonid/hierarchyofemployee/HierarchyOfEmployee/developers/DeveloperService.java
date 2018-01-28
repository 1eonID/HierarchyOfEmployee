package com.leonid.hierarchyofemployee.HierarchyOfEmployee.developers;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeveloperService {
    private final DeveloperRepository developerRepository;

    public List<Developer> getDevelopersByHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        return developerRepository.findByHeadOfDepartment(headOfDepartment);
    }

    public Optional<Developer> getById(Integer id) {
        return developerRepository.findById(id);
    }

    public Developer save(Developer developer) {
        return developerRepository.save(developer);
    }
}
