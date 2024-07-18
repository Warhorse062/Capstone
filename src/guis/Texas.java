/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon Collins
 */
public class Texas extends javax.swing.JFrame {
    double ante = 15.00;
    String ace_spades = "Ace of Spades";
    String two_spades = "2 Spades";
    String three_spades ="3 Spades";
    String four_spades = "4 Spades";
    String five_spades="5 Spades";
    String six_spades="6 Spades";
    String seven_spades="7 Spades";
    String eight_spades="8 Spades";
    String nine_spades="9 Spades";
    String ten_spades="Ten Spades";
    String jack_spades="Jack of Spades";
    String queen_spades="Queen of Spades";
    String king_spades="King of Spades";
            //
    
    String ace_hearts = "Ace of Hearts";
    String two_hearts = "2 Hearts";
    String three_hearts ="3 Hearts";
    String four_hearts = "4 Hearts";
    String five_hearts="5 Hearts";
    String six_hearts="6 Hearts";
    String seven_hearts="7 Hearts";
    String eight_hearts="8 Hearts";
    String nine_hearts="9 Hearts";
    String ten_hearts="10 Hearts";
    String jack_hearts="Jack of Hearts";
    String queen_hearts="Queen of Hearts";
    String king_hearts="King of Hearts";
            //
   
    String ace_clubs = "Ace of Clubs";
    String two_clubs  = "2 Clubs";
    String three_clubs  ="3 Clubs";
    String four_clubs  = "4 Clubs";
    String five_clubs ="5 Clubs";
    String six_clubs ="6 Clubs";
    String seven_clubs ="7 Clubs";
    String eight_clubs ="8 Clubs";
    String nine_clubs ="9 Clubs";
    String ten_clubs ="10 Clubs";
    String jack_clubs ="Jack of Clubs";
    String queen_clubs ="Queen of Clubs";
    String king_clubs ="King of Clubs";
            //
    
    String ace_diamonds = "Ace of Diamonds";
    String two_diamonds = "2 Diamonds";
    String three_diamonds ="3 Diamonds";
    String four_diamonds = "4 Diamonds";
    String five_diamonds="5 Diamonds";
    String six_diamonds="6 Diamonds";
    String seven_diamonds="7 Diamonds";
    String eight_diamonds="8 Diamonds";
    String nine_diamonds="9 Diamonds";
    String ten_diamonds="10 Diamonds";
    String jack_diamonds="Jack of Diamonds";
    String queen_diamonds="Queen of Diamonds";
    String king_diamonds="King of Diamonds";
    
    String deck[] = new String[]{ ace_spades,two_spades, three_spades, four_spades, five_spades, six_spades, seven_spades, eight_spades, nine_spades, ten_spades, jack_spades, queen_spades, king_spades,
         ace_hearts,two_hearts, three_hearts, four_hearts, five_hearts, six_hearts, seven_hearts, eight_hearts, nine_hearts, ten_hearts, jack_hearts, queen_hearts, king_hearts,
         ace_diamonds,two_diamonds, three_diamonds, four_diamonds, five_diamonds, six_diamonds, seven_diamonds, eight_diamonds, nine_diamonds, ten_diamonds, jack_diamonds, queen_diamonds, king_diamonds,
         ace_clubs,two_clubs, three_clubs, four_clubs, five_clubs, six_clubs, seven_clubs, eight_clubs, nine_clubs, ten_clubs, jack_clubs, queen_clubs, king_clubs
    
    };

    String dealer_raise = "I'm going to raise you $2.00!";
    String dealer_call = "I'm calling your Bet";
    String dealer_check = "I'm going to check";
    String dealerchoice[] = new String[]{dealer_raise, dealer_call, dealer_check};
    
    int card1 = new Random().nextInt(deck.length);
    String base_hand_1 = (deck[card1]);
    int card2 = new Random().nextInt(deck.length);
    String base_hand_2 = (deck[card2]);
    String myHand = base_hand_1 +" " + base_hand_2;
    
    int dealCard1 = new Random().nextInt(deck.length);
    String dealCard_1 = (deck[dealCard1]);
    int dealCard2 = new Random().nextInt(deck.length);
    String dealCard_2 = (deck[dealCard2]);
    String dealHand = dealCard_1+" " + dealCard_2;
    
    double grand_tot = 15.00;
    double total = 0.00;
    int potCard1 = new Random().nextInt(deck.length);
    String potCard_1 = (deck[potCard1]);
    int potCard2 = new Random().nextInt(deck.length);
    String potCard_2 = (deck[potCard2]);
    int potCard3 = new Random().nextInt(deck.length);
    String potCard_3 = (deck[potCard3]);
    String pot = potCard_1 +  "     " + potCard_2 +"        " + potCard_3;    
    /**
     * Creates new form Texas
     */
    public Texas() {
        initComponents();
        
    JOptionPane.showMessageDialog(null, "My name is Chad Waters and I will be your dealer today!");
    
    
 JOptionPane.showMessageDialog(null, "The Buy in is $15.00!");
 
    playerCard1.setText(base_hand_1 + " " + base_hand_2);
 
    String blind;
       blind= JOptionPane.showInputDialog("You Must First Enter a Big Blind to play");
      double blind_tot = Double.parseDouble(blind);
        grand_tot = grand_tot - blind_tot;
        tot_label.setText("Total $"+ grand_tot);
        potResult.setText("Pot: $"+ blind_tot);
        JOptionPane.showMessageDialog(null, "Click the button you want to play!");
        
        JFrame poker = new JFrame();
        
                }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PokerFrame = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        potPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        potLabel = new javax.swing.JLabel();
        myCardsPanel = new javax.swing.JPanel();
        playerCard1 = new javax.swing.JLabel();
        callButton = new javax.swing.JButton();
        raiseButton = new javax.swing.JButton();
        foldButton = new javax.swing.JButton();
        menuButtion = new javax.swing.JButton();
        quitButtion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        potResult = new javax.swing.JLabel();
        tot_label = new javax.swing.JLabel();
        dealPanel = new javax.swing.JPanel();
        dealHandLabel = new javax.swing.JLabel();
        checkbutton = new javax.swing.JButton();
        endButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PokerFrameLayout = new javax.swing.GroupLayout(PokerFrame.getContentPane());
        PokerFrame.getContentPane().setLayout(PokerFrameLayout);
        PokerFrameLayout.setHorizontalGroup(
            PokerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        PokerFrameLayout.setVerticalGroup(
            PokerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 153, 0));
        setIconImages(getIconImages());
        setLocationByPlatform(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(potLabel)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(potLabel)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout potPanelLayout = new javax.swing.GroupLayout(potPanel);
        potPanel.setLayout(potPanelLayout);
        potPanelLayout.setHorizontalGroup(
            potPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(potPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        potPanelLayout.setVerticalGroup(
            potPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, potPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        playerCard1.setText("hand");

        javax.swing.GroupLayout myCardsPanelLayout = new javax.swing.GroupLayout(myCardsPanel);
        myCardsPanel.setLayout(myCardsPanelLayout);
        myCardsPanelLayout.setHorizontalGroup(
            myCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myCardsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerCard1)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        myCardsPanelLayout.setVerticalGroup(
            myCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myCardsPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(playerCard1)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        callButton.setText("Call");
        callButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callButtonActionPerformed(evt);
            }
        });

        raiseButton.setText("Raise");
        raiseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raiseButtonActionPerformed(evt);
            }
        });

        foldButton.setText("Fold");
        foldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foldButtonActionPerformed(evt);
            }
        });

        menuButtion.setText("Menu");
        menuButtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtionActionPerformed(evt);
            }
        });

        quitButtion.setText("Quit");
        quitButtion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtionActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guis/images/chad.png"))); // NOI18N
        jLabel1.setText("Dealer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        potResult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        potResult.setText("Pot: $0.00");

        tot_label.setText("Total:");

        dealHandLabel.setText("Dealer's Hand");

        javax.swing.GroupLayout dealPanelLayout = new javax.swing.GroupLayout(dealPanel);
        dealPanel.setLayout(dealPanelLayout);
        dealPanelLayout.setHorizontalGroup(
            dealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dealHandLabel)
                .addGap(20, 20, 20))
        );
        dealPanelLayout.setVerticalGroup(
            dealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dealPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(dealHandLabel)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        checkbutton.setText("Check");
        checkbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbuttonActionPerformed(evt);
            }
        });

        endButton.setText("End Game");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(endButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(raiseButton)
                                .addComponent(callButton)
                                .addComponent(foldButton)
                                .addComponent(checkbutton)))))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(potPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(potResult)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(myCardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(menuButtion)
                                .addGap(18, 18, 18)
                                .addComponent(quitButtion, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tot_label)
                                .addGap(109, 109, 109))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(dealPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(potResult))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(potPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(dealPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tot_label)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quitButtion)
                            .addComponent(menuButtion))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(myCardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(endButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkbutton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(callButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raiseButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(foldButton)))
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtionActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);

        this.dispose();
    }//GEN-LAST:event_menuButtionActionPerformed

    private void quitButtionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtionActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_quitButtionActionPerformed

    private void callButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callButtonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_callButtonActionPerformed

    private void raiseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raiseButtonActionPerformed
        // TODO add your handling code here:
       String raise;
       raise= JOptionPane.showInputDialog("How much do you want to raise?");
      double rays= Double.parseDouble(raise);
       potLabel.setText(pot);
      total = total + rays;
      potResult.setText("Pot: $"+ total);
      grand_tot = grand_tot - rays;
      tot_label.setText("Total $"+ grand_tot);

     dealerChoice();

     
      grand_tot += 2;
      tot_label.setText("Total $"+ grand_tot);
      //dealerPlay();
    }//GEN-LAST:event_raiseButtonActionPerformed

    private void foldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foldButtonActionPerformed
        // TODO add your handling code here:
        foldButton.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                showCards();
            }


        });
    }//GEN-LAST:event_foldButtonActionPerformed

    private void checkbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbuttonActionPerformed
        // TODO add your handling code here:
        dealerChoice();
    int potCard4 = new Random().nextInt(deck.length);
    String potCard_4 = (deck[potCard4]);
     pot = pot + "      " + potCard_4;  
     
     potLabel.setText(pot);
  
    }//GEN-LAST:event_checkbuttonActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        // TODO add your handling code here:
         endButton.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                showCards();
            }


        });
    }//GEN-LAST:event_endButtonActionPerformed
        private void showCards() {
                dealHandLabel.setText(dealHand);
            }
    public void dealerChoice(){   
        int d_C = new Random().nextInt(dealerchoice.length);
        String dealerC = (dealerchoice[d_C]);
         JOptionPane.showMessageDialog(null, dealerC);
    }
    private void music() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            java.util.logging.Logger.getLogger(Texas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Texas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Texas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Texas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Texas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame PokerFrame;
    private javax.swing.JButton callButton;
    private javax.swing.JButton checkbutton;
    private javax.swing.JLabel dealHandLabel;
    private javax.swing.JPanel dealPanel;
    private javax.swing.JButton endButton;
    private javax.swing.JButton foldButton;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton menuButtion;
    private javax.swing.JPanel myCardsPanel;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel potLabel;
    private javax.swing.JPanel potPanel;
    private javax.swing.JLabel potResult;
    private javax.swing.JButton quitButtion;
    private javax.swing.JButton raiseButton;
    private javax.swing.JLabel tot_label;
    // End of variables declaration//GEN-END:variables


/*
    private void dealerPlay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

*/
}
