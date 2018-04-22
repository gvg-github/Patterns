package ru.geekbrains.pattern.dz.dz4.partners;

public class ContractorContract {

    private String name;
    private Contractor owner;

    public ContractorContract(String name, Contractor owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Contractor getOwner() {
        return owner;
    }
}
