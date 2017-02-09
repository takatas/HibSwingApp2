/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.ui;

import com.vektorel.hibswingapp.entity.Il;
import com.vektorel.hibswingapp.service.IlService;
import javax.swing.JOptionPane;

/**
 *
 * @author takatas
 */
public class frmIlEkle extends javax.swing.JDialog {

    /**
     * Creates new form frmIlEkle
     */
    public frmIlEkle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lblIl.setVisible(false);
        lblIlId.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIlKodu = new javax.swing.JLabel();
        lblIlAdi = new javax.swing.JLabel();
        txtIlKodu = new javax.swing.JTextField();
        txtIlAdi = new javax.swing.JTextField();
        btnIlIptal = new javax.swing.JButton();
        btnIlKaydet = new javax.swing.JButton();
        lblIl = new javax.swing.JLabel();
        lblIlId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblIlKodu.setText("İl Kodu");

        lblIlAdi.setText("İl Adı");

        btnIlIptal.setText("İptal");
        btnIlIptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIlIptalActionPerformed(evt);
            }
        });

        btnIlKaydet.setText("Kaydet");
        btnIlKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIlKaydetActionPerformed(evt);
            }
        });

        lblIl.setText("İl Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIlKodu)
                    .addComponent(lblIlAdi)
                    .addComponent(lblIl))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIlAdi)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnIlIptal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(btnIlKaydet))
                            .addComponent(txtIlKodu))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblIlId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIlId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIlKodu)
                    .addComponent(txtIlKodu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIlAdi)
                    .addComponent(txtIlAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIlIptal)
                    .addComponent(btnIlKaydet))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIlIptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIlIptalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnIlIptalActionPerformed

    private void btnIlKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIlKaydetActionPerformed

        try {
            IlService ilService = new IlService();
            if (lblIlId.getText().trim().equals("")) {

                ilService.save(new Il(null, txtIlKodu.getText(), txtIlAdi.getText()));
            } else {

                ilService.update(new Il(new Long(lblIlId.getText()), txtIlKodu.getText(), txtIlAdi.getText()));
            }
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }


    }//GEN-LAST:event_btnIlKaydetActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIlIptal;
    private javax.swing.JButton btnIlKaydet;
    private javax.swing.JLabel lblIl;
    private javax.swing.JLabel lblIlAdi;
    private javax.swing.JLabel lblIlId;
    private javax.swing.JLabel lblIlKodu;
    private javax.swing.JTextField txtIlAdi;
    private javax.swing.JTextField txtIlKodu;
    // End of variables declaration//GEN-END:variables
}
