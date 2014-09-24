/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.actions;

import com.bo.Customer;
import com.handlers.CustomerHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author Ulquiorra Schiffer
 */
public class ImportActionListener implements ActionListener{
      JFrame form=null;
      public ImportActionListener(JFrame form)  {
          this.form=form;
      }

            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(form);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File f = fileChooser.getSelectedFile();
                    //System.out.println(f.getAbsolutePath());
                    String line = "", broken = "", gooddata = "";
                    StringBuilder builderBroken = new StringBuilder();
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(f));
                        while ((line = br.readLine()) != null) {
                            String[] tokens = line.split(",");
                            if (tokens.length >= 4) {
                                // System.out.println(tokens[1]+","+tokens[2]+","+tokens[3]);
                                Customer c = new Customer();
                                c.setCustomerName(tokens[1]);
                                c.setCustomerPhone(tokens[2]);
                                c.setCustomerAddress(tokens[3]);
                                CustomerHandler.insert(c);

                            }
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }

                System.out.println("csv file copied to database");
            }

        }