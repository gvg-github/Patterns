package ru.geekbrains.pattern.dz.dz3;

public class PaymentDocument extends AbstractDocument {

    @Override
    public Documentable createDoc(Company company, Contractor contractor, ContractorContract contract) {
        PaymentDoc doc = new PaymentDoc();
        doc.setCompany(company);
        doc.setContractor(contractor);
        doc.setContract(contract);
        return doc;
    }
}
