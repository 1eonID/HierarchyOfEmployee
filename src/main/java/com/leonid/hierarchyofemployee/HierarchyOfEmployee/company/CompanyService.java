package com.leonid.hierarchyofemployee.HierarchyOfEmployee.company;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;

    public List<Company> getByCeo() {
        return companyRepository.findAllCompanyByCeo();
    }

    public Optional<Company> getById(Integer id) {
        return companyRepository.findById(id);
    }

    public Company save(Company ceo) {
        return companyRepository.save(ceo);
    }
}
