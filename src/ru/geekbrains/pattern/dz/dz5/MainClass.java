package ru.geekbrains.pattern.dz.dz5;

import ru.geekbrains.pattern.dz.dz5.commands.Command;
import ru.geekbrains.pattern.dz.dz5.commands.CreditCommand;
import ru.geekbrains.pattern.dz.dz5.commands.DebitCommand;
import ru.geekbrains.pattern.dz.dz5.documents.CheckDocument;
import ru.geekbrains.pattern.dz.dz5.parthners.Company;
import ru.geekbrains.pattern.dz.dz5.parthners.Contractor;

public class MainClass {
    public static void main(String[] args) {
        Company myCompany = new Company("My company", "999999", "999999", "111111111");
        Contractor myContractor1 = new Contractor("My Contractor1", "000001", "000001", "000001");
        myContractor1.addContract("Contract with myCompany");

        CheckDocument doc = new CheckDocument(1000);
        doc.createDoc(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
        Command createDebit = new DebitCommand(doc);
        Command createCredit = new CreditCommand(doc);

        Invoker invoker = new Invoker(createDebit, createCredit);

        invoker.createDebit();
        invoker.createCredit();


    }
}
