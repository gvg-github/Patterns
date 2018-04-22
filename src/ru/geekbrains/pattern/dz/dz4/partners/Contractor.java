package ru.geekbrains.pattern.dz.dz4.partners;

import java.util.HashSet;

public class Contractor extends Partner {

    private HashSet<ContractorContract> contracts;

    public Contractor(String name, String inn, String kpp, String account) {
        super(name, inn, kpp, account);
    }

    public void addContract(String name) {
        contracts.add(new ContractorContract(name, this));
    }

    public ContractorContract getContract(String name) {
        if (contracts.size() > 0) {
            for (ContractorContract element : contracts
                    ) {
                if (element.getName().equals(name)) {
                    return element;
                }
            }
        }
        return null;
    }
}
