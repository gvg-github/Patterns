package ru.geekbrains.pattern.dz6;

import ru.geekbrains.pattern.dz6.documents.CheckDocument;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DocumentMapper {
    private final Connection connection;

    public DocumentMapper(Connection connection) {
        this.connection = connection;
    }

    public void insert(CheckDocument document) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO ACCOUNT_RECORD(sum, number, date) values(?,?,?)");
        statement.setInt(1, document.getSum());
        statement.setString(1, document.getNumber());
        statement.setDate(2, (Date) document.getDate());
        statement.executeUpdate();
    }

    public void update(CheckDocument document) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE ACCOUNT_RECORD SET sum = ? WHERE number = ? and date = ?");
        statement.setString(1, document.getNumber());
        statement.setDate(2, (Date) document.getDate());
        statement.executeUpdate();
    }

    public void delete(CheckDocument document) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM ACCOUNT_RECORD WHERE number = ? and date = ?");
        statement.setString(1, document.getNumber());
        statement.setDate(2, (Date) document.getDate());
        statement.executeUpdate();
    }
}
