package ru.geekbrains.pattern.dz.dz3;

public abstract class DocParameters {
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
}
