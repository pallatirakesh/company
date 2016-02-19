package com.company.springmvc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.springmvc.model.Company;
import com.company.springmvc.model.User;


@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<Company> companies;
	
	static{
		companies= populateDummyCompanies();
	}

	public List<Company> findAllCompanies() {
		return companies;
	}
	
	public Company findById(long id) {
		for(Company company : companies){
			if(company.getId() == id){
				return company;
			}
		}
		return null;
	}
	
	public Company findByName(String name) {
		for(Company company : companies){
			if(company.getName().equalsIgnoreCase(name)){
				return company;
			}
		}
		return null;
	}
	
	public void saveCompany(Company company) {
		company.setId(counter.incrementAndGet());
		companies.add(company);
	}

	public void updateCompany(Company company) {
		int index = companies.indexOf(company);
		companies.set(index, company);
	}

	public void deleteCompanyById(long id) {
		
		for (Iterator<Company> iterator = companies.iterator(); iterator.hasNext(); ) {
		    Company company = iterator.next();
		    if (company.getId() == id) {
		        iterator.remove();
		    }
		}
	}

	public boolean isCompanyExist(Company user) {
		return findByName(user.getName())!=null;
	}
	
	public void deleteAllCompanies(){
		companies.clear();
	}

	private static List<Company> populateDummyCompanies(){
		List<Company> company = new ArrayList<Company>();
		
		company.add(new Company(counter.incrementAndGet(),"SamComp", "NY","nyc" ,"USA","sam@abc.com","1111111111","Sam"));
		company.add(new Company(counter.incrementAndGet(),"Tomycomp", "ALBAMA","ALBAMA","USA", "tomy@abc.com","2222222222","Tomy"));
		company.add(new Company(counter.incrementAndGet(),"Kellycomp", "NEBRASKA","NEBRASKA","USA", "kelly@abc.com","6666666666","kelly"));
		
		return company;
	}

}
