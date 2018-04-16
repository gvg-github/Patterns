package ru.geekbrains.pattern.dz.dz3;

public class Company extends Partner {

    private static AbstractDocument[] docs = {new CheckDocument(), new DeliveryDocument(), new PaymentDocument(), new RequestDocument()};

    public Company(String name, String inn, String kpp, String account) {
        super(name, inn, kpp, account);
    }

    public static Documentable createCheck(Company company, Contractor contractor, ContractorContract contract) {
        return docs[0].createDoc(company, contractor, contract);
    }

    public static Documentable createDelivery(Company company, Contractor contractor, ContractorContract contract) {
        return docs[1].createDoc(company, contractor, contract);
    }

    public static Documentable createPayment(Company company, Contractor contractor, ContractorContract contract) {
        return docs[2].createDoc(company, contractor, contract);
    }

    public static Documentable createRequest(Company company, Contractor contractor, ContractorContract contract) {
        return docs[3].createDoc(company, contractor, contract);
    }
}
