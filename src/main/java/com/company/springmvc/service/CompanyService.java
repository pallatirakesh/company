package com.company.springmvc.service;

import java.util.List;

import com.company.springmvc.model.Company;

public interface CompanyService {
		
		Company findById(long id);
		
		Company findByName(String name);
		
		void saveCompany(Company user);
		
		void updateCompany(Company user);
		
		void deleteCompanyById(long id);

		List<Company> findAllCompanies(); 
		
		void deleteAllCompanies();
		
		public boolean isCompanyExist(Company company);
		
	}


