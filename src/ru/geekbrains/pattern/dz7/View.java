package ru.geekbrains.pattern.dz7;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    private JTable resultTable = new JTable(3, 10);
    private JButton showButton = new JButton("Show results");

    public View(){
        setTitle("Results");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        showButton.addActionListener(new Controller(this));

        JPanel myPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        myPanel.add(showButton);
        myPanel.add(resultTable);

        add(myPanel);
        setVisible(true);

    }

    public JTable getResultTable() {
        return resultTable;
    }

    public void setResultTable(JTable resultTable) {
        this.resultTable = resultTable;
    }
}
