package ru.geekbrains.pattern.dz.dz5.documents;

import ru.geekbrains.pattern.dz.dz5.parthners.Company;
import ru.geekbrains.pattern.dz.dz5.parthners.Contractor;
import ru.geekbrains.pattern.dz.dz5.parthners.ContractorContract;

abstract class AbstractDocument {

    private Company company;
    private Contractor contractor;
    private ContractorContract contract;

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
