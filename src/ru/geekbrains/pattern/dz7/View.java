package ru.geekbrains.pattern.dz7;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class View extends JFrame {

    private JTable resultTable;
    private JButton showButton = new JButton("Show results");
    private final Vector column_names = new Vector();
    JScrollPane scrollPane;

    public View(){
        setTitle("Results");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        column_names.add("Номер");
        column_names.add("Дата");
        column_names.add("Сумма");
        column_names.add("Тип");

        resultTable = new JTable(new Vector(), column_names);

        showButton.addActionListener(new Controller(this));

        JPanel myPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        myPanel.add(showButton);
        add(myPanel, BorderLayout.NORTH);

        scrollPane = new JScrollPane(resultTable);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);

    }

    public JTable getResultTable() {
        return resultTable;
    }

    public void setResultTable(JTable resultTable) {
        this.resultTable = resultTable;
    }

    public Vector getColumn_names() {
        return column_names;
    }
}
