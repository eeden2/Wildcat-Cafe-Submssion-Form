/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author mrglade
 */
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class SubmissionGUIPage2 extends javax.swing.JFrame {
    public currentOrder cO;
    public SubmissionGUIPage2() {
        initComponents();
    }

    public void setcO(currentOrder cO) {
        this.cO = cO;
        String temp = String.format("%.2f",cO.total);
        moneyDisplay.setText("$"+temp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        //Again, this extra setup was automatically put in by NetBeans
        //////////////////////////////////////////////////////////////

        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        displayText = new javax.swing.JLabel();
        moneyDisplay = new javax.swing.JLabel();
        roomText = new javax.swing.JLabel();
        roomInput = new javax.swing.JTextField();
        deliveryText = new javax.swing.JLabel();
        tuesday = new javax.swing.JRadioButton();
        friday = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderSpecifications = new javax.swing.JTextArea();
        specificationsText = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("URW Gothic", 0, 24)); // NOI18N
        title.setText("Wildcat Cafe Order Sheet");

        jLabel1.setIcon(new javax.swing.ImageIcon("cat.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("cat.png")); // NOI18N
//
        displayText.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        displayText.setText("Your Total Will Be:");

        moneyDisplay.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        moneyDisplay.setText("$ ");

        roomText.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        roomText.setText("Room to be delivered to:");

        roomInput.setText("");
        roomInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomInputActionPerformed(evt);
            }
        });

        deliveryText.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        deliveryText.setText("Date of Delivery:");

        tuesday.setText("Tuesday");
        tuesday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuesdayActionPerformed(evt);
            }
        });

        friday.setText("Friday");

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        orderSpecifications.setColumns(20);
        orderSpecifications.setRows(5);
        jScrollPane2.setViewportView(orderSpecifications);

        specificationsText.setText("Order Specifications");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(75, 75, 75)
                                                                .addComponent(title))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(114, 114, 114)
                                                                .addComponent(moneyDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(132, 132, 132)
                                                                .addComponent(displayText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(237, 237, 237)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(roomInput)
                                                                .addComponent(roomText))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(29, 29, 29)
                                                                        .addComponent(deliveryText))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGap(14, 14, 14)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addComponent(tuesday)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(friday))
                                                                                .addComponent(specificationsText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(displayText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(moneyDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(roomText)
                                .addGap(18, 18, 18)
                                .addComponent(roomInput, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deliveryText)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tuesday)
                                        .addComponent(friday))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(specificationsText, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>
    ///////////////////////////////////////////////////
    //These next two action methods are not needed unless further features permit.
    private void roomInputActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tuesdayActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {
        //Gets drivers setup for connection ton PostGreSQL
        Connection c = null;
        //Data type statement actually feeds the statement into the postGre server;
        Statement s = null;
        try {
            //First setup a connection to the database
            c = DriverManager
                    .getConnection("jdbc:postgresql://10.2.33.178:5432/wildcatcafe",
                            "postgres", "1234");
            //Instantiates a statement input
            s = c.createStatement();
            //Date is in second window, so to maintain consistency, I set it to its varaible
            //in currentOrder
            if(tuesday.isSelected())
            {
                cO.date = "Tuesday";
            }else{cO.date = "Friday";}

            //Set up date Format
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM");
            LocalDateTime now = LocalDateTime.now();
            String month = dtf.format(now);

            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd");
            String day = dtf2.format(now);

            dtf2 = DateTimeFormatter.ofPattern("yyyy");
            String year = dtf2.format(now);
            //A string is used to fill the place of a SQL command
            String state = String.format("INSERT INTO orders(room,total, date, coffeeamount,coffeecreamer,cocoa,danish,danishflavor,muffin,muffinflavor,bar,identifier,month,day,year,specifications) " +
                    "VALUES(%d,%f,'%s',%d,'%s',%d,%d,'%s',%d,'%s',%d,%d,'%s','%s','%s','%s');",Short.parseShort(roomInput.getText()),cO.total,cO.date,cO.coffeeAmount,cO.coffeeCreamer,cO.cocoa,cO.danish,cO.danishFlavor,cO.muffin,cO.muffinFlavor,cO.bar,cO.identifier,month,day,year, orderSpecifications.getText());

            //This sends command to database
            s.executeUpdate(state);

            //Program ends
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }

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
            java.util.logging.Logger.getLogger(SubmissionGUIPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmissionGUIPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmissionGUIPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmissionGUIPage2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmissionGUIPage2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel deliveryText;
    private javax.swing.JLabel displayText;
    private javax.swing.JRadioButton friday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel moneyDisplay;
    private javax.swing.JTextArea orderSpecifications;
    private javax.swing.JTextField roomInput;
    private javax.swing.JLabel roomText;
    private javax.swing.JLabel specificationsText;
    private javax.swing.JButton submit;
    private javax.swing.JLabel title;
    private javax.swing.JRadioButton tuesday;
    // End of variables declaration
}
