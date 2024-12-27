package in.oracle.mohak.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
@ConfigurationProperties(prefix = "org.pw")
public class Company {
    private String name;
    private String address;
    private String location;
    private String title;
    private String tech;
    private List<String> employees;
    private String[] business;
    private Set<String> departments;
    private Map<String , Long> bankAccounts;
    private CompanyValuation companyValuation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return name + " " + address
                +" " + location
                +" "+title
                +" "+tech
                +" "+employees
                +" "+ Arrays.toString(business)
                +" "+departments
                +" "+bankAccounts
                +" "+companyValuation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public String[] getBusiness() {
        return business;
    }

    public void setBusiness(String[] business) {
        this.business = business;
    }

    public Set<String> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<String> departments) {
        this.departments = departments;
    }

    public Map<String, Long> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(Map<String, Long> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public CompanyValuation getCompanyValuation() {
        return companyValuation;
    }

    public void setCompanyValuation(CompanyValuation companyValuation) {
        this.companyValuation = companyValuation;
    }
}
