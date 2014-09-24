/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.views;



/**
 *
 * @author Ulquiorra Schiffer
 */
import com.actions.ImportActionListener;
import com.bo.Customer;
import com.handlers.CustomerHandler;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.JTextField;
public class CustomerForm extends JFrame {

        JButton btnImport = new JButton("Import CSV");
        JTextField txtName=new JTextField(50);
        JButton btnTest = new JButton("Test");
        
    public CustomerForm(String title) {
        initCompoments();
        this.setTitle(title);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setSize(300, 300);
        this.setVisible(true);
    }

    private void initCompoments() {
        /*JButton btnImport = new JButton("Import CSV");
        JTextField txtName=new JTextField(50);
        JButton btnTest = new JButton("Test");*/ 

        
        btnImport.addActionListener(new ImportActionListener(CustomerForm.this));
        this.getContentPane().add(btnImport);
        this.getContentPane().add(txtName);
        this.getContentPane().add(btnTest);
        
        btnTest.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnImport.setText(txtName.getText());
            }
        });
        
    }
   
    
    
        
    
    
}
