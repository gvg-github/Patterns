package ru.geekbrains.pattern.dz.dz3;

abstract class AbstractDocument {
    public abstract Documentable createDoc(Company company, Contractor contractor, ContractorContract contract);
}
