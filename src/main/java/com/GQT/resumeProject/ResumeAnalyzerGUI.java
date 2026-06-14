package com.GQT.resumeProject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ResumeAnalyzerGUI extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    private JLabel lblTotal;
    private JLabel lblJava;
    private JLabel lblPython;

    private JTextArea detailsArea;

    public ResumeAnalyzerGUI() {

        setTitle("Resume Analysis System");
        setSize(1000, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

       

        JLabel title = new JLabel(
                "RESUME ANALYSIS SYSTEM",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 28));

        add(title, BorderLayout.NORTH);

        // TOP PANEL

        JPanel topPanel = new JPanel();

        lblTotal = new JLabel("Total Resumes : 0");
        lblJava = new JLabel("Java Candidates : 0");
        lblPython = new JLabel("Python Candidates : 0");

        JButton btnLoad = new JButton("Load Resumes");

        topPanel.add(lblTotal);
        topPanel.add(lblJava);
        topPanel.add(lblPython);
        topPanel.add(btnLoad);

        add(topPanel, BorderLayout.SOUTH);

       
        JPanel centerPanel = new JPanel(new GridLayout(2, 1));

      

        model = new DefaultTableModel();

        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Skills");
        model.addColumn("Number");

        table = new JTable(model);

        table.setRowHeight(30);

        JScrollPane tableScroll = new JScrollPane(table);

        tableScroll.setBorder(
                BorderFactory.createTitledBorder("Resume Records"));

        centerPanel.add(tableScroll);

        

        detailsArea = new JTextArea();

        detailsArea.setEditable(false);

        detailsArea.setFont(
                new Font("Monospaced", Font.PLAIN, 14));

        detailsArea.setText(
                "Click Load Resumes to view candidate details.");

        JScrollPane detailsScroll =
                new JScrollPane(detailsArea);

        detailsScroll.setBorder(
                BorderFactory.createTitledBorder("Candidate Details"));

        centerPanel.add(detailsScroll);

        add(centerPanel, BorderLayout.CENTER);

       

        btnLoad.addActionListener(e -> {

            try {

                model.setRowCount(0);

                Manager rm = new Manager();

                rm.readResume(
                        "C:\\Users\\gavar\\Downloads\\ResumeReader\\ResumeReader\\samples");

                int javaCount = 0;
                int pythonCount = 0;

                for (Resume r : rm.getResumes()) {

                    model.addRow(new Object[]{
                            r.getName(),
                            r.getEmail(),
                            r.getSkill(),
                            r.getNumber()
                    });

                    if (r.getSkill().toLowerCase().contains("java")) {
                        javaCount++;
                    }

                    if (r.getSkill().toLowerCase().contains("python")) {
                        pythonCount++;
                    }
                }

                lblTotal.setText(
                        "Total Resumes : " + rm.getResumes().size());

                lblJava.setText(
                        "Java Candidates : " + javaCount);

                lblPython.setText(
                        "Python Candidates : " + pythonCount);


                if (model.getRowCount() > 0) {

                    table.setRowSelectionInterval(0, 0);

                    String name =
                            table.getValueAt(0, 0).toString();

                    String email =
                            table.getValueAt(0, 1).toString();

                    String skills =
                            table.getValueAt(0, 2).toString();
                    String number =
                            table.getValueAt(0, 3).toString();

                    detailsArea.setText(
                            "Candidate Information\n\n" +
                            "Name      : " + name + "\n\n" +
                            "Email     : " + email + "\n\n" +
                            "Number    : " + number + "\n\n" +
                            "Skills    : " + skills);
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        ex.getMessage());
            }

        });


        table.getSelectionModel().addListSelectionListener(e -> {

            int row = table.getSelectedRow();

            if (row >= 0) {

                String name =
                        table.getValueAt(row, 0).toString();

                String email =
                        table.getValueAt(row, 1).toString();

                String skills =
                        table.getValueAt(row, 2).toString();
                String number =
                		    table.getValueAt(row, 3).toString();

                detailsArea.setText(
                        "Candidate Information\n\n" +
                        "Name      : " + name + "\n\n" +
                        "Email     : " + email + "\n\n" +
                        "Skills    : " + skills + "\n\n" +
                        "Number    : " + number );
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new ResumeAnalyzerGUI();
    }
}