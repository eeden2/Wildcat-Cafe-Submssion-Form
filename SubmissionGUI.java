/*
 * @author mrglade
 */
import java.util.*;
import java.io.*;
public class SubmissionGUI extends javax.swing.JFrame {

    public currentOrder cO;
    public HashMap<String, Double> prices = new HashMap<>();

    public SubmissionGUI() {

        //I have all the items pre-set at instantiation, so they can be accessed in getTotal()
        prices.put("coffee", 2.0);
        prices.put("danish", 1.5);
        prices.put("bar",1.0);
        prices.put("muffin",.75);
        prices.put("cocoa",2.0);
        initComponents();
    }

    public double getTotal()
    {
        double total = 0.0;
        try
        {
            //First get the input from the text area
            int dan = Integer.parseInt(danishAmount.getText());
            int coffee = Integer.parseInt(coffeeAmount.getText());
            int muffin = Integer.parseInt(muffinAmount.getText());
            int cocoa = Integer.parseInt(cocoaAmount.getText());
            int bar = Integer.parseInt(barAmount.getText());

            //Calculate the price and add to the total
            total+=(dan*prices.get("danish"));
            total+=(coffee*prices.get("coffee"));
            total+=(muffin*prices.get("muffin"));
            total+=(cocoa*prices.get("cocoa"));
            total+=(bar*prices.get("bar"));
            return total;
        }catch(Exception e){e.printStackTrace();}
        return total;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        nextPage = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        coffee = new javax.swing.JLabel();
        coffeeAmount = new javax.swing.JTextField();
        creamerList = new javax.swing.JComboBox<>();
        creamer = new javax.swing.JLabel();
        cocoa = new javax.swing.JLabel();
        cocoaAmount = new javax.swing.JTextField();
        danish = new javax.swing.JLabel();
        danishAmount = new javax.swing.JTextField();
        danishList = new javax.swing.JComboBox<>();
        danishFlavor = new javax.swing.JLabel();
        muffin = new javax.swing.JLabel();
        muffinAmount = new javax.swing.JTextField();
        muffinFlavor = new javax.swing.JLabel();
        muffinList = new javax.swing.JComboBox<>();
        bar = new javax.swing.JLabel();
        barAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Basic stuff to actually setup the GUI Window. This was done by NetBeans automatically
        nextPage.setText("Next");
        nextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("URW Gothic", 0, 24)); // NOI18N
        title.setText("Wildcat Cafe Order Sheet");

        coffee.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        coffee.setText("Coffee:");

        coffeeAmount.setText("0");

        creamerList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Vanilla", "Caramel", "Hazelnut", "Orig.", "Cinnamon PUMPKIN SPICE" }));
        creamerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creamerListActionPerformed(evt);
            }
        });

        creamer.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        creamer.setText("Creamer For Coffee:");

        cocoa.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        cocoa.setText("Hot Cocoa:");

        cocoaAmount.setText("0");

        danish.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        danish.setText("Danish:");

        danishAmount.setText("0");
        danishAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danishAmountActionPerformed(evt);
            }
        });

        danishList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None","Cheese", "Cherry" }));
        danishList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danishListActionPerformed(evt);
            }
        });

        danishFlavor.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        danishFlavor.setText("Danish Flavor:");

        muffin.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        muffin.setText("Muffin:");

        muffinAmount.setText("0");
        muffinAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muffinAmountActionPerformed(evt);
            }
        });

        muffinFlavor.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        muffinFlavor.setText("Muffin Flavor:");

        muffinList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None","Banana", "Blueberry" }));
        muffinList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muffinListActionPerformed(evt);
            }
        });

        bar.setFont(new java.awt.Font("Fira Sans", 0, 18)); // NOI18N
        bar.setText("Nature Valley Bar:");

        barAmount.setText("0");
        barAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barAmountActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("cat.png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("cat.png")); // NOI18N

        jLabel3.setText("(Type in a Number for the quantity of each item)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jLabel1)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(74, 74, 74)
                                                                                .addComponent(coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(title)
                                                                                        .addComponent(jLabel3))
                                                                                .addGap(81, 81, 81))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(88, 88, 88)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(cocoa)
                                                                                        .addComponent(danish)
                                                                                        .addComponent(muffin)
                                                                                        .addComponent(creamer))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(cocoaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(danishAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(muffinAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(creamerList, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(coffeeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(bar)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(barAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(danishFlavor)
                                                                                        .addComponent(muffinFlavor))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(danishList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(muffinList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jLabel2)))
                                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))
                                                .addGap(67, 67, 67))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(coffeeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(creamerList, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(creamer))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cocoaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cocoa))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(danishAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(danish))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(danishList, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(danishFlavor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(muffinAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(muffin))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(muffinList, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(muffinFlavor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(barAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
        );

        //Always pack a JFrame or your results won't show
        pack();
    }// </editor-fold>

    private void nextPageActionPerformed(java.awt.event.ActionEvent evt) {
        //First instantiate the currentOrder class to store variables
        //Simply sending variables in page2 as parameters did not work after various attempts
        cO = new currentOrder(getTotal(),Short.parseShort(coffeeAmount.getText()),creamerList.getSelectedItem().toString(),Short.parseShort(cocoaAmount.getText()),Short.parseShort(danishAmount.getText()),danishList.getSelectedItem().toString(),
                Short.parseShort(muffinAmount.getText()),muffinList.getSelectedItem().toString(),Short.parseShort(barAmount.getText()));
        SubmissionGUIPage2 page2 = new SubmissionGUIPage2();
        //I also could not put cO as a parameter, so I made a void method to set it, bypassing such error.
        page2.setcO(cO);
        page2.setVisible(true);
    }

    private void creamerListActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void danishAmountActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void danishListActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void muffinAmountActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void muffinListActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void barAmountActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(SubmissionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmissionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmissionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmissionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            SubmissionGUI sGUI = new SubmissionGUI();
            public void run() {
                sGUI.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel bar;
    private javax.swing.JTextField barAmount;
    private javax.swing.JLabel cocoa;
    private javax.swing.JTextField cocoaAmount;
    private javax.swing.JLabel coffee;
    private javax.swing.JTextField coffeeAmount;
    private javax.swing.JLabel creamer;
    private javax.swing.JComboBox<String> creamerList;
    private javax.swing.JLabel danish;
    private javax.swing.JTextField danishAmount;
    private javax.swing.JLabel danishFlavor;
    private javax.swing.JComboBox<String> danishList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel muffin;
    private javax.swing.JTextField muffinAmount;
    private javax.swing.JLabel muffinFlavor;
    private javax.swing.JComboBox<String> muffinList;
    private javax.swing.JButton nextPage;
    private javax.swing.JLabel title;
    // End of variables declaration
}
