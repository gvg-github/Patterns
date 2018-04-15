package ru.geekbrains.pattern.dz.dz3;

public class DeliveryDocument extends AbstractDocument{

    @Override
    public Documentable createDoc(Company company, Contractor contractor, ContractorContract contract) {
        DeliveryDoc doc = new DeliveryDoc();
        doc.setCompany(company);
        doc.setContractor(contractor);
        doc.setContract(contract);
        return doc;
    }
}
