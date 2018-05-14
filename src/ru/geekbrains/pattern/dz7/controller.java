package ru.geekbrains.pattern.dz.dz7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Controller implements ActionListener {

    private View frame;
    private Vector column_names;

    public Controller(View frame) {
        this.frame = frame;
        column_names = new Vector();
        column_names.add("Дата");
        column_names.add("Сумма");
        column_names.add("Тип");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show results")) {

            ResultSet rs = Model.getData();
            if (rs != null) {
                Vector db_info = new Vector();
                try {
                    while (rs.next()) {
                        db_info.add(rs.getDate("Дата"));
                        db_info.add(rs.getDouble("Сумма"));
                        db_info.add(rs.getString("Тип"));
                    }
                    frame.setResultTable(new JTable(column_names, db_info));
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

}

