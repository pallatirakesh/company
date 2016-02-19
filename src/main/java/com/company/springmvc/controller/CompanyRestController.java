package com.company.springmvc.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.company.springmvc.model.Company;
import com.company.springmvc.service.CompanyService;
 
@RestController
public class CompanyRestController {
 
    @Autowired
    CompanyService companyService;  //Service which will do all data retrieval/manipulation work
 
    
    //-------------------Retrieve All Companies--------------------------------------------------------
     
    @RequestMapping(value = "/company/", method = RequestMethod.GET)
    public ResponseEntity<List<Company>> listAllUcompanies() {
        List<Company> companies = companyService.findAllCompanies();
        if(companies.isEmpty()){
            return new ResponseEntity<List<Company>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Company>>(companies, HttpStatus.OK);
    }
 
 
    
    //-------------------Retrieve Single Company--------------------------------------------------------
     
    @RequestMapping(value = "/company/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Company> getCompany(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        Company company = companyService.findById(id);
        if (company == null) {
            System.out.println("Company with id " + id + " not found");
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Company>(company, HttpStatus.OK);
    }
 
     
     
    //-------------------Create a Company--------------------------------------------------------
     
    @RequestMapping(value = "/company/", method = RequestMethod.POST)
    public ResponseEntity<Void> createCompany(@RequestBody Company company,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating Company " + company.getName());
 
        if (companyService.isCompanyExist(company)) {
            System.out.println("A Company with name " + company.getName() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
 
        companyService.saveCompany(company);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/company/{id}").buildAndExpand(company.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
 
    
     
    //------------------- Update a Company --------------------------------------------------------
     
    @RequestMapping(value = "/company/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Company> updateCompany(@PathVariable("id") long id, @RequestBody Company company) {
        System.out.println("Updating User " + id);
         
        Company currentCompany = companyService.findById(id);
         
        if (currentCompany==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
 
        currentCompany.setName(company.getName());
        currentCompany.setAddress(company.getAddress());
        currentCompany.setCity(company.getCity());
        currentCompany.setCountry(company.getCountry());
        currentCompany.setPhonenumber(company.getPhonenumber());
        currentCompany.setOwners(company.getOwners());
        currentCompany.setEmail(company.getEmail());
         
        companyService.updateCompany(currentCompany);
        return new ResponseEntity<Company>(currentCompany, HttpStatus.OK);
    }
 
    
    
    //------------------- Delete a Company --------------------------------------------------------
     
    @RequestMapping(value = "/company/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Company> deleteCompany(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting User with id " + id);
 
        Company company = companyService.findById(id);
        if (company == null) {
            System.out.println("Unable to delete. Company with id " + id + " not found");
            return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
        }
 
        companyService.deleteCompanyById(id);
        return new ResponseEntity<Company>(HttpStatus.NO_CONTENT);
    }
 
     
    
    //------------------- Delete All Companies --------------------------------------------------------
     
    @RequestMapping(value = "/company/", method = RequestMethod.DELETE)
    public ResponseEntity<Company> deleteAllCompanies() {
        System.out.println("Deleting All Companies");
 
        companyService.deleteAllCompanies();
        return new ResponseEntity<Company>(HttpStatus.NO_CONTENT);
    }
 
}