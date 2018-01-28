package com.leonid.hierarchyofemployee.HierarchyOfEmployee.company;

import com.leonid.hierarchyofemployee.HierarchyOfEmployee.ceo.CeoService;
import com.leonid.hierarchyofemployee.HierarchyOfEmployee.headofdepartment.HeadOfDepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class CompanyController {
    private final CompanyService companyService;
    private final CeoService ceoService;
    private final HeadOfDepartmentService headOfDepartmentService;

    @GetMapping (value = "/company/{id}/hierarchi")
    public ResponseEntity<?> getCompanyHierarchi(@PathVariable Integer id) {
        Optional<Company> findCompanyById = companyService.getById(id);
        return findCompanyById.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
