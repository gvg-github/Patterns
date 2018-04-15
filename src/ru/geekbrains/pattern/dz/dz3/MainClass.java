package ru.geekbrains.pattern.dz.dz3;

public class MainClass {
    public static void main(String[] args) {
        Company myCompany = new Company("My company", "999999", "999999", "111111111");
        Contractor myContractor1 = new Contractor("My Contractor1", "000001", "000001", "000001");
        myContractor1.addContract("Contract with myCompany");

        Documentable checkDoc = myCompany.createCheck(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
        Documentable deliveryDoc = myCompany.createDelivery(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
        Documentable paymentDoc = myCompany.createPayment(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
        Documentable requestDoc = myCompany.createRequest(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
    }
}
