package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class BookShelfGUI extends JFrame{
    private JPanel currentBooksPanel;
    private JPanel buttonPanel;
    private JButton selectFileButton;
    private File currentFile;
    private JTextField titleField = new JTextField(20);
    private JTextField authorField = new JTextField(20);
    private JTextField publisherField = new JTextField(20);
    private JLabel titleFieldLabel = new JLabel("Title");
    private JLabel authorFieldLabel = new JLabel("Author");
    private JLabel publisherFieldLabel = new JLabel("Publisher");
    private JPanel userInputPanel;
    private BookShelf myShelf = new BookShelf();
    //
    public BookShelfGUI() {
        setupFileButton();
        initializeGUIPanels();
        initializeGUIFrame();
        setInputPanel();
        this.setVisible(true);
    }
    private void setInputPanel() {
        userInputPanel = new JPanel(new GridLayout(3,2));
        titleField = new JTextField(20);
        authorField = new JTextField(20);
        publisherField = new JTextField(20);
        titleFieldLabel = new JLabel("Title");
        authorFieldLabel = new JLabel("Author");
        publisherFieldLabel = new JLabel("Publisher");
        userInputPanel.add(titleFieldLabel);
        userInputPanel.add(titleField);
        userInputPanel.add(authorFieldLabel);
        userInputPanel.add(authorField);
        userInputPanel.add(publisherFieldLabel);
        userInputPanel.add(publisherField);
    }
    //
    private void initializeGUIFrame() {
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(buttonPanel);
    }
    //
    private void initializeGUIPanels() {
        buttonPanel = new JPanel();
        buttonPanel.add(selectFileButton);
    }
    //
    private void setupFileButton() {
        selectFileButton = new JButton("Open File");
        selectFileButton.addActionListener(e -> {
            selectFile();
            myShelf.setBookFile(currentFile);
        });
    }
    private void selectFile() {
        final JFileChooser jc = new JFileChooser(".");
        int response;
        jc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        response = jc.showOpenDialog(null);
        if(response == JFileChooser.APPROVE_OPTION) {
            currentFile = jc.getSelectedFile();
            getBookDataFromUser();
        }
    }
    private void getBookDataFromUser() {
        int result = JOptionPane.showConfirmDialog(null, userInputPanel,
                "Enter Book Data", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION) {
            myShelf.setBook(titleField.getText(), authorField.getText(), publisherField.getText());
        }
    }
}
