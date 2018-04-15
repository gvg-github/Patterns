package ru.geekbrains.pattern.dz.dz3;

public class CheckDocument extends AbstractDocument {

    @Override
    public Documentable createDoc(Company company, Contractor contractor, ContractorContract contract) {
        CheckDoc doc = new CheckDoc();
        return doc;
    }
}
