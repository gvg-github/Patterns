package ru.geekbrains.pattern.dz6;

import ru.geekbrains.pattern.dz6.documents.CheckDocument;
import ru.geekbrains.pattern.dz6.parthners.Company;
import ru.geekbrains.pattern.dz6.parthners.Contractor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {
    public static void main(String[] args) throws SQLException {
        Company myCompany = new Company("My company", "999999", "999999", "111111111");
        Contractor myContractor1 = new Contractor("My Contractor1", "000001", "000001", "000001");
        myContractor1.addContract("Contract with myCompany");

        CheckDocument doc = new CheckDocument(1000);
        doc.createDoc(myCompany, myContractor1, myContractor1.getContract("Contract with myCompany"));
        Connection connection = DriverManager.getConnection("url", "user", "pass");
        DocumentMapper documentMapper = new DocumentMapper(connection);
        documentMapper.insert(doc);

    }
}
