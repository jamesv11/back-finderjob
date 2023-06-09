package com.login.micrologin.Interface.IService;

import com.login.micrologin.Entity.Company;
import com.login.micrologin.Service.Company.ServiceCompanyResponse;

import java.util.List;
import java.util.Optional;

public interface ICompanyService {
    ServiceCompanyResponse getAll();
    ServiceCompanyResponse findById(Long id);
    ServiceCompanyResponse save(Company company);
    ServiceCompanyResponse update(Company company);
    void delete(Long id);

}
