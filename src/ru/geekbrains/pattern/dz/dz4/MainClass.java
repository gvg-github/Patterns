package ru.geekbrains.pattern.dz.dz4;

import ru.geekbrains.pattern.dz.dz4.documents.DeliveryDocument;
import ru.geekbrains.pattern.dz.dz4.documents.MainDocument;
import ru.geekbrains.pattern.dz.dz4.documents.PaymentDocument;
import ru.geekbrains.pattern.dz.dz4.partners.Company;
import ru.geekbrains.pattern.dz.dz4.partners.Contractor;

//Попытка реализации паттерна Декоратор
public class MainClass {
    public static void main(String[] args) {
        Company myCompany = new Company("My company", "999999", "999999", "111111111");
        Contractor myContractor1 = new Contractor("My Contractor1", "000001", "000001", "000001");
        myContractor1.addContract("Contract with myCompany");

        MainDocument mainDocument = new MainDocument(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"), 1000);
        PaymentDocument paymentDocument = new PaymentDocument(mainDocument);
        DeliveryDocument deliveryDocument= new DeliveryDocument(mainDocument);

        paymentDocument.makeRegistration();
        deliveryDocument.makeRegistration();
    }
}
