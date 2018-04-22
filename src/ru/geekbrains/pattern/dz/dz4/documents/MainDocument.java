package ru.geekbrains.pattern.dz.dz4.documents;

import ru.geekbrains.pattern.dz.dz4.partners.Company;
import ru.geekbrains.pattern.dz.dz4.partners.Contractor;
import ru.geekbrains.pattern.dz.dz4.partners.ContractorContract;

public class MainDocument implements Documentable {
    private Company company;
    private Contractor contractor;
    private ContractorContract contract;
    private int sum;

    public MainDocument(Company company, Contractor contractor, ContractorContract contract, int sum) {
        this.company = company;
        this.contractor = contractor;
        this.contract = contract;
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
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
}

