package ru.geekbrains.pattern.dz7;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Controller implements ActionListener {

    private View frame;

    public Controller(View frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show results")) {

            ResultSet rs = Model.getData();
            if (rs != null) {

                Vector db_infoRows = new Vector();
                try {
                    while (rs.next()) {
                        Vector db_info = new Vector();
                        db_info.add(rs.getInt("Номер"));
                        db_info.add(rs.getString("Дата"));
                        db_info.add(rs.getDouble("Сумма"));
                        db_info.add(rs.getString("Тип"));
                        db_infoRows.add(db_info);
                    }
                    Vector column_names = frame.getColumn_names();
                    JTable table = new JTable(db_infoRows, column_names);
                    TableModel dtm = table.getModel();
                    frame.getResultTable().setModel(dtm);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

}
