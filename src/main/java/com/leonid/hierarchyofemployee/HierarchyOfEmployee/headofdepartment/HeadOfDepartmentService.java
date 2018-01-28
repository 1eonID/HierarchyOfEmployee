package com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HeadOfDepartmentService {
    private final HeadOfDepartmentRepository headOfDepartmentRepository;

    public List<Employee> getEmployeesByHeadOfDepartment(HeadOfDepartment headOfDepartment) {
        return headOfDepartmentRepository.findByHeadOfDepartment(headOfDepartment);
    }

    public Optional<HeadOfDepartment> getById(Integer id) {
        return headOfDepartmentRepository.findById(id);
    }

    public HeadOfDepartment save(HeadOfDepartment headOfDepartment) {
        return headOfDepartmentRepository.save(headOfDepartment);
    }
}
