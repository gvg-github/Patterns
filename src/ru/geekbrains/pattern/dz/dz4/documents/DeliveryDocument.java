package ru.geekbrains.pattern.dz.dz4.documents;

import ru.geekbrains.pattern.dz.dz4.partners.Company;
import ru.geekbrains.pattern.dz.dz4.partners.Contractor;
import ru.geekbrains.pattern.dz.dz4.partners.ContractorContract;
import ru.geekbrains.pattern.dz.dz4.registry.AccountRegistry;
import ru.geekbrains.pattern.dz.dz4.registry.DocumentsType;

public class DeliveryDocument implements Documentable{

    private Company company;
    private Contractor contractor;
    private ContractorContract contract;
    private int sum;

    public DeliveryDocument(){

    }

    public DeliveryDocument(MainDocument document){
        this.company = document.getCompany();
        this.contractor = document.getContractor();
        this.contract = document.getContract();
        this.sum = document.getSum();
    }

    public void makeRegistration(){
        AccountRegistry.record(this, DocumentsType.CREDIT);
    }

}
