package ru.geekbrains.pattern.dz6.documents;

import ru.geekbrains.pattern.dz6.parthners.Company;
import ru.geekbrains.pattern.dz6.parthners.Contractor;
import ru.geekbrains.pattern.dz6.parthners.ContractorContract;

import java.util.Date;

abstract class AbstractDocument {

    private Company company;
    private Contractor contractor;
    private ContractorContract contract;
    private String number;
    private Date date;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public void setContract(ContractorContract contract) {
        this.contract = contract;
    }

    public Company getCompany() {
        return company;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public ContractorContract getContract() {
        return contract;
    }

    public abstract void createDoc(Company company, Contractor contractor, ContractorContract contract);
}
