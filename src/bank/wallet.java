/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bank;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class wallet extends javax.swing.JFrame {

    /**
     * Creates new form wallet
     */
    public wallet() {
        initComponents();
        Image icon = new ImageIcon("C:/Users/user/Desktop/JAVA/BANK/src/bank/logo.png").getImage();
        this.setIconImage(icon); 
        loadAndDisplayCurrentBalance();
       
    }
    int Wcount;
    int Dcount;
    int Scount;
    double Balance = loadCurrentBalance();
    private String historyFilePath = "C:/Users/user/Desktop/JAVA/BANK/src/bank/history.txt";

    
    
    
    private void saveCurrentBalance(double balance) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/user/Desktop/JAVA/BANK/src/bank/balance.txt"))) {
        writer.write(String.valueOf(balance));
    } catch (IOException e) {
        System.out.println("An error occurred while saving the balance: " + e.getMessage());
    }
}
    
    private double loadCurrentBalance() {
    double balance=0; // Default balance
    try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/user/Desktop/JAVA/BANK/src/bank/balance.txt"))) {
        String line = reader.readLine();
        if (line != null) {
            balance = Double.parseDouble(line);
        }
    } catch (IOException e) {
        System.out.println("An error occurred while loading the balance: " + e.getMessage());
    }
    return balance;
}

    
    private void loadAndDisplayCurrentBalance() { 
        double balance = loadCurrentBalance();
        String displayAmount = String.valueOf(balance);
        currentBalance.setText(displayAmount);
    } 

    
    
    
    
    
   /* private void processTransaction() {
        String action = actionField.getText().toLowerCase();
        String amountText = txtAmount.getText();
        
        if (action.isBlank() || amountText.isBlank()) {
            DA.setText("Please enter both action and amount.");
            DA.setForeground(Color.red);
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            if (amount <= 0) {
                DA.setText("Amount must be positive.");
                DA.setForeground(Color.red);
                return;
            }

            if (action.equals("deposit")) {
                deposit(amount);
                DA.setText("Deposit successful!");
                DA.setForeground(Color.green);
            } else if (action.equals("withdraw")) {
                withdraw(amount);
                DA.setText("Withdrawal successful!");
                DA.setForeground(Color.green);
            } else {
                DA.setText("Invalid action. Enter 'deposit' or 'withdraw'.");
                DA.setForeground(Color.red);
            }
        } catch (NumberFormatException e) {
            DA.setText("Please enter a valid number for the amount.");
            DA.setForeground(Color.red);
        }
    }

    private void deposit(double amount) {
        String transactionDetail = "Deposit: R" + amount;
        recordTransaction(transactionDetail);
    }

    private void withdraw(double amount) {
        String transactionDetail = "Withdrawal: R" + amount;
        recordTransaction(transactionDetail);
    }

    private void recordTransaction(String transactionDetail) {
        try {
            FileWriter fw = new FileWriter(historyFilePath, true); // Append mode
            BufferedWriter bw = new BufferedWriter(fw);

            // Get the current date and time
            LocalDateTime now = LocalDateTime.now();
            // Format the date and time
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm");
            String formattedDate = now.format(formatter);

            // Write the transaction detail with the formatted date and time
            bw.write(transactionDetail + " on " + formattedDate);
            bw.newLine();

            bw.close();
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to history file: " + e.getMessage());
        }
    }*/
    
    
    
    private void recordTransaction(String transactionDetail) {
    try {
        FileWriter fw = new FileWriter("C:/Users/user/Desktop/JAVA/BANK/src/bank/history.txt", true); // Append mode
        BufferedWriter bw = new BufferedWriter(fw);

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm");
        String formattedDate = now.format(formatter);

        // Write the transaction detail with the formatted date and time
        bw.write(transactionDetail + " on " + formattedDate);
        bw.newLine();

        bw.close();
        fw.close();
    } catch (IOException e) {
        System.out.println("Error writing to history file: " + e.getMessage());
    }
}

        
  
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblwithdraw = new javax.swing.JLabel();
        lbldeposit = new javax.swing.JLabel();
        lblsend = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        DA = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        R = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        currentBalance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WALLET");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/wealthpennyLogo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/receipt.png"))); // NOI18N
        jLabel4.setText("TRANS. HISTORY");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        lblwithdraw.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblwithdraw.setForeground(new java.awt.Color(255, 255, 255));
        lblwithdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/cash-withdrawal.png"))); // NOI18N
        lblwithdraw.setText("WITHDRAW");
        lblwithdraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblwithdrawMouseClicked(evt);
            }
        });

        lbldeposit.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbldeposit.setForeground(new java.awt.Color(255, 255, 255));
        lbldeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/deposit.png"))); // NOI18N
        lbldeposit.setText("DEPOSIT");
        lbldeposit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldepositMouseClicked(evt);
            }
        });

        lblsend.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblsend.setForeground(new java.awt.Color(255, 255, 255));
        lblsend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/send.png"))); // NOI18N
        lblsend.setText("SEND");
        lblsend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsendMouseClicked(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/cleaning.png"))); // NOI18N
        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clear)
                    .addComponent(lblsend)
                    .addComponent(lbldeposit)
                    .addComponent(lblwithdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lblwithdraw)
                .addGap(18, 18, 18)
                .addComponent(lbldeposit)
                .addGap(18, 18, 18)
                .addComponent(lblsend)
                .addGap(18, 18, 18)
                .addComponent(clear)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        R.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        R.setText("R");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ENTER AMOUNT : ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/card.png"))); // NOI18N

        currentBalance.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        currentBalance.setText("960");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/brightDay.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/brightNight.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank/org.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(R)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(DA, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R)
                            .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        /*String SBalance = String.valueOf(currentBalance);
        JOptionPane.showMessageDialog(null, "Your current balance is R"+Balance);
        DA.setText("Balance checked");
        DA.setForeground(Color.green);*/
        new History().setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void lblwithdrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblwithdrawMouseClicked
        // TODO add your handling code here:
        //int randomNumber = (int) (Math.random() * 100);
        //int randomNumber2 = (int) (Math.random() * 100);
        
        /*String amount = txtAmount.getText();
        
        if(amount.isBlank()){
            DA.setText("Field can't be blank");
            DA.setForeground(Color.red);
        }
        else{
            double Amounttt = Double.parseDouble(amount);
            Wcount++;
            if(Wcount>10){
                JOptionPane.showMessageDialog(null, "You have tried too many times your account is temporarily ban");
                txtAmount.setEditable(false);
                new CheckInfo().setVisible(false);
                lblwithdraw.setEnabled(false);
                currentBalance.setEnabled(false);
                currentBalance.setText("DISABLED!");
                R.setForeground(Color.GRAY);
                txtAmount.setText("DISABLED");
                txtAmount.setForeground(Color.gray);
                DA.setText("DISABLED");
                DA.setForeground(Color.red);
            }
            else{
                if(Amounttt>Balance){
                DA.setForeground(Color.red);
                DA.setText("Inufficent Funds");
                new ErrorInfo().setVisible(true);
            }
            else{
                double Amountt = Double.parseDouble(amount);
                Balance = Balance - Amountt;
                new CheckInfo().setVisible(true);
                String DisplayAmount = String.valueOf(Balance);
                currentBalance.setText(DisplayAmount);
                //JOptionPane.showMessageDialog(null, "Voucher number is : "+randomNumber+randomNumber2);
                DA.setText("R"+amount+" withdrawn successful");
                DA.setForeground(Color.green);
            }
            }
        }*/
        String amount = txtAmount.getText();
    
        if (amount.isBlank()) {
            DA.setText("Field can't be blank");
            DA.setForeground(Color.red);
        }
        else {
            double Amounttt = Double.parseDouble(amount);
            Wcount++;
            if (Wcount > 10) {
                JOptionPane.showMessageDialog(null, "You have tried too many times, your account is temporarily banned.");
                txtAmount.setEditable(false);
                new CheckInfo().setVisible(false);
                lblwithdraw.setEnabled(false);
                currentBalance.setEnabled(false);
                currentBalance.setText("DISABLED!");
                R.setForeground(Color.GRAY);
                txtAmount.setText("DISABLED");
                txtAmount.setForeground(Color.gray);
                DA.setText("DISABLED");
                DA.setForeground(Color.red);
            }
            else {
                if (Amounttt > Balance) {
                    DA.setForeground(Color.red);
                    DA.setText("Insufficient Funds");
                    new ErrorInfo().setVisible(true);
                }
                else {
                    String pin = JOptionPane.showInputDialog("Enter your pin to proceed with transaction");
                    if(!pin.equalsIgnoreCase("1234")){
                        String errorMessage = "Incorrect pin. Try again.";

                        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        Balance = Balance - Amounttt;
                        new CheckInfo().setVisible(true);
                        String DisplayAmount = String.valueOf(Balance);
                        currentBalance.setText(DisplayAmount);
                        DA.setText("R" + amount + " withdrawn successfully");
                        DA.setForeground(Color.green);

                        saveCurrentBalance(Balance);

                        // Record the transaction
                        recordTransaction("Withdrawal: R" + amount);
                    } 
                }
            }
        }        
    }//GEN-LAST:event_lblwithdrawMouseClicked

    private void lbldepositMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldepositMouseClicked
        /*String amount = txtAmount.getText();
        if(amount.isBlank()){
            DA.setText("Field can't be blank");
            DA.setForeground(Color.red);
        }
        else{
            double Amounttt = Double.parseDouble(amount);
            Dcount++;
            if(Dcount>10){
                JOptionPane.showMessageDialog(null, "You have tried too many times your account is temporarily ban");
                txtAmount.setEditable(false);
                new CheckInfo().setVisible(false);
                lbldeposit.setEnabled(false);
                currentBalance.setEnabled(false);
                currentBalance.setText("DISABLED!");
                R.setForeground(Color.GRAY);
                txtAmount.setText("DISABLED");
                txtAmount.setForeground(Color.gray);
                DA.setText("DISABLED");
                DA.setForeground(Color.red);
            }
            else{
                if(Amounttt>99999){
                    DA.setForeground(Color.red);
                    DA.setText("Amount exceeds limit");
                    new ErrorInfo().setVisible(true);
                }
                else{
                    double Amountt = Double.parseDouble(amount);
                    Balance = Balance + Amountt;
                    new CheckInfo().setVisible(true);
                    String DisplayAmount = String.valueOf(Balance);
                    currentBalance.setText(DisplayAmount);
                    currentBalance.setText(DisplayAmount);
                    DA.setText("R"+amount+" deposited successful");
                    DA.setForeground(Color.green);
                }
            }
        }*/

        String amount = txtAmount.getText();

        if (amount.isBlank()) {
            DA.setText("Field can't be blank");
            DA.setForeground(Color.red);
        }
        else {
            double Amounttt = Double.parseDouble(amount);
            Dcount++;
            if (Dcount > 10) {
                JOptionPane.showMessageDialog(null, "You have tried too many times, your account is temporarily banned.");
                txtAmount.setEditable(false);
                new CheckInfo().setVisible(false);
                lbldeposit.setEnabled(false);
                currentBalance.setEnabled(false);
                currentBalance.setText("DISABLED!");
                R.setForeground(Color.GRAY);
                txtAmount.setText("DISABLED");
                txtAmount.setForeground(Color.gray);
                DA.setText("DISABLED");
                DA.setForeground(Color.red);
            }
            else {
                if (Amounttt > 99999) {
                    DA.setForeground(Color.red);
                    DA.setText("Amount exceeds limit");
                    new ErrorInfo().setVisible(true);
                }
                else {
                    Balance = Balance + Amounttt;
                    new CheckInfo().setVisible(true);
                    String DisplayAmount = String.valueOf(Balance);
                    currentBalance.setText(DisplayAmount);
                    DA.setText("R" + amount + " deposited successfully");
                    DA.setForeground(Color.green);

                    saveCurrentBalance(Balance);
                    
                    // Record the transaction
                    recordTransaction("Deposit: R" + amount);
                }
            }
        } 
    }//GEN-LAST:event_lbldepositMouseClicked

    private void lblsendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsendMouseClicked
        // TODO add your handling code here:
        /*String amount = txtAmount.getText();
        if(amount.isBlank()){
            DA.setText("Field can't be blank");
            DA.setForeground(Color.red);
        }
        else{
            double Amounttt = Double.parseDouble(amount);
            Scount++;
            if(Scount>10){
                JOptionPane.showMessageDialog(null, "You have tried too many times your account is temporarily ban");
                txtAmount.setEditable(false);
                new CheckInfo().setVisible(false);
                lblsend.setEnabled(false);
                R.setForeground(Color.GRAY);
                txtAmount.setText("DISABLED");
                txtAmount.setForeground(Color.gray);
                DA.setText("DISABLED");
                DA.setForeground(Color.red);
            }
            else{
                if(Amounttt>Balance){
                    DA.setForeground(Color.red);
                    DA.setText("Inufficent Funds");
                    new ErrorInfo().setVisible(true);
                }
                else{
                    double Amountt = Double.parseDouble(amount);
                    Balance = Balance - Amountt;
                    new CheckInfo().setVisible(true);
                    String DisplayAmount = String.valueOf(Balance);
                    currentBalance.setText(DisplayAmount);
                    currentBalance.setText(DisplayAmount);
                    DA.setText("R"+amount+" sent successful");
                    DA.setForeground(Color.green);
                }
            }
        }*/
        String amount = txtAmount.getText();

        if (amount.isBlank()) {
            DA.setText("Field can't be blank");
            DA.setForeground(Color.red);
        }
        else {
            double Amounttt = Double.parseDouble(amount);
            Scount++;
            if (Scount > 10) {
                JOptionPane.showMessageDialog(null, "You have tried too many times, your account is temporarily banned.");
                txtAmount.setEditable(false);
                new CheckInfo().setVisible(false);
                lblsend.setEnabled(false);
                R.setForeground(Color.GRAY);
                txtAmount.setText("DISABLED");
                txtAmount.setForeground(Color.gray);
                currentBalance.setEnabled(false);
                currentBalance.setText("DISABLED!");
                DA.setText("DISABLED");
                DA.setForeground(Color.red);
            }
            else {
                if (Amounttt > Balance) {
                    DA.setForeground(Color.red);
                    DA.setText("Insufficient Funds");
                    new ErrorInfo().setVisible(true);
                }
                else {
                    String name = JOptionPane.showInputDialog("Enter the Name of the account holder ");
                    String accountNumber = JOptionPane.showInputDialog("Enter the Account Number");
                    if(name.isBlank()){
                        String errorMessage = "Account Number can not be empty";

                        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if(accountNumber.isBlank()){
                        String errorMessage = "Account Number can not be empty";

                        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        Balance = Balance - Amounttt;
                        new CheckInfo().setVisible(true);
                        String DisplayAmount = String.valueOf(Balance);
                        currentBalance.setText(DisplayAmount);
                        DA.setText("R" + amount + " sent successfully");
                        DA.setForeground(Color.green);

                        saveCurrentBalance(Balance);

                        // Record the transaction
                        recordTransaction("Send: R" + amount);
                    }
                }
            }
        }   
    }//GEN-LAST:event_lblsendMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        txtAmount.setText("");
        DA.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(Color.white);
        jPanel4.setBackground(Color.white);
        R.setForeground(Color.black);
        currentBalance.setForeground(Color.black);
        jLabel5.setForeground(Color.black);
        jLabel4.setForeground(Color.black);
        lblwithdraw.setForeground(Color.black);
        lbldeposit.setForeground(Color.black);
        lblsend.setForeground(Color.black);
        clear.setForeground(Color.black);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jPanel1.setBackground(Color.black);
        jPanel4.setBackground(Color.black);
        R.setForeground(Color.white);
        currentBalance.setForeground(Color.white);
        jLabel5.setForeground(Color.white);
        jLabel4.setForeground(Color.white);
        lblwithdraw.setForeground(Color.white);
        lbldeposit.setForeground(Color.white);
        lblsend.setForeground(Color.white);
        clear.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new wallet().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wallet().setVisible(true);
            }
        });
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DA;
    private javax.swing.JLabel R;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel currentBalance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbldeposit;
    private javax.swing.JLabel lblsend;
    private javax.swing.JLabel lblwithdraw;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
