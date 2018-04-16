package ru.geekbrains.pattern.dz.dz3;

public class MainClass {
    public static void main(String[] args) {
        Company myCompany = new Company("My company", "999999", "999999", "111111111");
        Contractor myContractor1 = new Contractor("My Contractor1", "000001", "000001", "000001");
        myContractor1.addContract("Contract with myCompany");

        Documentable checkDoc = Company.createCheck(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
        Documentable deliveryDoc = Company.createDelivery(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
        Documentable paymentDoc = Company.createPayment(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
        Documentable requestDoc = Company.createRequest(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
    }
}
