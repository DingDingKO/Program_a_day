package com.Day4_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame implements ActionListener {
    final int WIDTH = 800;
    final int HEIGHT = 520;
    final int TEXT_HEIGHT = 30;
    final int TEXT_WIDTH = 20;
    JTextArea text = new JTextArea(TEXT_HEIGHT,TEXT_WIDTH);
    JTextArea output = new JTextArea(TEXT_HEIGHT,TEXT_WIDTH);
    JButton button = new JButton("Normal");
    JButton addQuotation = new JButton("With Quotation Marks");
    JScrollPane scrollPane = new JScrollPane(text);
    JScrollPane scrollPaneOut = new JScrollPane(output);

    public MyJFrame() {

        super("Make into list:");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());

        add(scrollPane);
        add(addQuotation);
        add(button);
        add(scrollPaneOut);

        button.addActionListener(this);
        addQuotation.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = text.getText();
        Object source = e.getSource();
        addCommas(input,source);
    }

    private void addCommas(String input,Object button) {
        String textList;

        if (button == addQuotation) {
            textList = "\"" + input.replaceAll("\n", "\", \"") + "\"";
        } else {
            textList = input.replaceAll("\n", ", ");
        }
        textList = textList.replaceAll(", \"\"", "");
        output.setText(textList.toString());
    }
}
