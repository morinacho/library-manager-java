package librarymanager.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import librarymanager.Files;
import librarymanager.Partner;

/**
 *
 * @author nacho
 */
public class PartnerAdd extends javax.swing.JFrame {

    /**
     * Creates new form NewSocioWindow
     */
    public PartnerAdd() {
        initComponents();
        partnerNumInput.setText("lm-partner-" + (Partner.i));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameInput = new javax.swing.JTextField();
        lastnameInput = new javax.swing.JTextField();
        dniInput = new javax.swing.JTextField();
        partnerNumInput = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        dniSocioLabel = new javax.swing.JLabel();
        nroSocioLabel = new javax.swing.JLabel();
        aceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addressInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear socio");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setType(java.awt.Window.Type.UTILITY);

        lastnameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameInputActionPerformed(evt);
            }
        });

        dniInput.setToolTipText("");

        partnerNumInput.setEditable(false);

        nameLabel.setText("Nombre");

        firstNameLabel.setText("Apellido");

        dniSocioLabel.setText("DNI");

        nroSocioLabel.setText("Nro Socio");

        aceptButton.setText("Aceptar");
        aceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Dirección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nroSocioLabel)
                        .addComponent(partnerNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dniSocioLabel)
                            .addComponent(dniInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(aceptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(firstNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dniSocioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dniInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nroSocioLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(partnerNumInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(aceptButton))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameInputActionPerformed

    private void aceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()== aceptButton){
            String name     = nameInput.getText(),
                   lastname = lastnameInput.getText(),
                   dni      = dniInput.getText(),
                   address  = addressInput.getText();
            Partner partner = new Partner(name, lastname, dni, address);
            List<Partner> partners;
            Files partnerfile;
                 
            try{
                partnerfile = new Files("partners");
                partners = new ArrayList<>(partnerfile.readFile("partners"));
                partners.add(partner);
                Collections.sort(partners);
                partnerfile.writeFile(partners); 
                this.setVisible(false);
            }
            catch(IOException ex){
                ex.getMessage();
            }
        }
        
    }//GEN-LAST:event_aceptButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PartnerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartnerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartnerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartnerAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartnerAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptButton;
    private javax.swing.JTextField addressInput;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField dniInput;
    private javax.swing.JLabel dniSocioLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastnameInput;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nroSocioLabel;
    private javax.swing.JTextField partnerNumInput;
    // End of variables declaration//GEN-END:variables
}
