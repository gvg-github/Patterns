package ru.geekbrains.pattern.dz.dz3;

public class RequestDocument extends AbstractDocument {

    @Override
    public Documentable createDoc(Company company, Contractor contractor, ContractorContract contract) {
        RequestDoc doc = new RequestDoc();
        doc.setCompany(company);
        doc.setContractor(contractor);
        doc.setContract(contract);
        return doc;
    }
}
