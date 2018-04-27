package ru.geekbrains.pattern.dz.dz5.parthners;

import java.util.ArrayList;

public class Contractor extends Partner {

    private ArrayList<ContractorContract> contracts;

    public Contractor(String name, String inn, String kpp, String account) {
        super(name, inn, kpp, account);
    }

    public void addContract(String name){
        contracts.add(new ContractorContract(name, this));
    }

    public ContractorContract getContract(String name){
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).getName().equals(name)){
                return contracts.get(i);
            }
        }
        return null;
    }
}
