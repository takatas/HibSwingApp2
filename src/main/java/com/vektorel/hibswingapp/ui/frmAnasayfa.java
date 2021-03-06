/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.hibswingapp.ui;

import com.vektorel.hibswingapp.entity.Bolum;
import com.vektorel.hibswingapp.entity.Il;
import com.vektorel.hibswingapp.entity.Kullanici;
import com.vektorel.hibswingapp.entity.Ogrenci;
import com.vektorel.hibswingapp.service.BolumService;
import com.vektorel.hibswingapp.service.IlService;
import com.vektorel.hibswingapp.service.KullaniciService;
import com.vektorel.hibswingapp.service.OgrenciService;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author soner
 */
public class frmAnasayfa extends javax.swing.JFrame {

    Kullanici kullanici;
    KullaniciService kullaniciService = new KullaniciService();
    BolumService bolumService = new BolumService();
    IlService ilService = new IlService();
    OgrenciService ogrenciService = new OgrenciService();

    /**
     * Creates new form frmAnasayfa
     */
    public frmAnasayfa(Kullanici kullanici) {
        initComponents();
        this.kullanici = kullanici;
        setLocationRelativeTo(null);
        kullaniciTabloyuDoldur();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jPopUpGuncelle = new javax.swing.JMenuItem();
        jPopUpSil = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnasayfa = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuKullaniciListesi = new javax.swing.JMenuItem();
        mnuKullaniciEkle = new javax.swing.JMenuItem();
        mnuKullaniciSil = new javax.swing.JMenuItem();
        mnuKullaniciGuncelle = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuOgrenciEkle = new javax.swing.JMenuItem();
        mnuOgrenciListele = new javax.swing.JMenuItem();
        mnuOgrenciDuzenle = new javax.swing.JMenuItem();
        mnuBolum = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mnuBolumEkle = new javax.swing.JMenuItem();
        mnuBolumListele = new javax.swing.JMenuItem();
        mnuBolumDuzenle = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuIlEkle = new javax.swing.JMenuItem();
        mnuIlListesi = new javax.swing.JMenuItem();
        mnuIlGuncelle = new javax.swing.JMenuItem();

        jPopUpGuncelle.setText("Güncelle");
        jPopUpGuncelle.setToolTipText("");
        jPopUpGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopUpGuncelleActionPerformed(evt);
            }
        });
        jPopupMenu.add(jPopUpGuncelle);

        jPopUpSil.setText("Sil");
        jPopUpSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPopUpSilActionPerformed(evt);
            }
        });
        jPopupMenu.add(jPopUpSil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAnasayfa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAnasayfa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblAnasayfaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblAnasayfa);

        jMenu1.setText("Kullanıcı İşlemleri");

        mnuKullaniciListesi.setText("Kullanıcı Listesi");
        mnuKullaniciListesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKullaniciListesiActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKullaniciListesi);

        mnuKullaniciEkle.setText("Kullanıcı Ekle");
        mnuKullaniciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKullaniciEkleActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKullaniciEkle);

        mnuKullaniciSil.setText("Kullanıcı Sil");
        mnuKullaniciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKullaniciSilActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKullaniciSil);

        mnuKullaniciGuncelle.setText("Kullanıcı Güncelle");
        mnuKullaniciGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKullaniciGuncelleActionPerformed(evt);
            }
        });
        jMenu1.add(mnuKullaniciGuncelle);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Öğrenci İşlemleri");

        mnuOgrenciEkle.setText("Öğrenci Ekle");
        mnuOgrenciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOgrenciEkleActionPerformed(evt);
            }
        });
        jMenu2.add(mnuOgrenciEkle);

        mnuOgrenciListele.setText("Öğrenci Listele");
        mnuOgrenciListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOgrenciListeleActionPerformed(evt);
            }
        });
        jMenu2.add(mnuOgrenciListele);

        mnuOgrenciDuzenle.setText("Öğrenci Düzenle");
        mnuOgrenciDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOgrenciDuzenleActionPerformed(evt);
            }
        });
        jMenu2.add(mnuOgrenciDuzenle);

        jMenuBar1.add(jMenu2);

        mnuBolum.setText("Tanımlar");

        jMenu4.setText("Bölüm");

        mnuBolumEkle.setText("Bölüm Tanımla");
        mnuBolumEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBolumEkleActionPerformed(evt);
            }
        });
        jMenu4.add(mnuBolumEkle);

        mnuBolumListele.setText("Bölüm Listesi");
        mnuBolumListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBolumListeleActionPerformed(evt);
            }
        });
        jMenu4.add(mnuBolumListele);

        mnuBolumDuzenle.setText("Bölüm Düzenle");
        mnuBolumDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBolumDuzenleActionPerformed(evt);
            }
        });
        jMenu4.add(mnuBolumDuzenle);

        mnuBolum.add(jMenu4);

        jMenu3.setText("İl");

        mnuIlEkle.setText("İl Tanımla");
        mnuIlEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIlEkleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuIlEkle);

        mnuIlListesi.setText("İl Listesi");
        mnuIlListesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIlListesiActionPerformed(evt);
            }
        });
        jMenu3.add(mnuIlListesi);

        mnuIlGuncelle.setText("İl Güncelle");
        mnuIlGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIlGuncelleActionPerformed(evt);
            }
        });
        jMenu3.add(mnuIlGuncelle);

        mnuBolum.add(jMenu3);

        jMenuBar1.add(mnuBolum);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuKullaniciListesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKullaniciListesiActionPerformed
        kullaniciTabloyuDoldur();
    }//GEN-LAST:event_mnuKullaniciListesiActionPerformed

    private void mnuKullaniciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKullaniciEkleActionPerformed
        frmKullaniciEkle ekle = new frmKullaniciEkle(this, true);
        ekle.show();
        kullaniciTabloyuDoldur();
    }//GEN-LAST:event_mnuKullaniciEkleActionPerformed

    private void mnuKullaniciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKullaniciSilActionPerformed
        kullaniciSil();
    }//GEN-LAST:event_mnuKullaniciSilActionPerformed

    private void mnuKullaniciGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKullaniciGuncelleActionPerformed
        kullaniciGuncelle();
    }//GEN-LAST:event_mnuKullaniciGuncelleActionPerformed

    private void mnuBolumEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBolumEkleActionPerformed

        frmBolumEkle bolumEkle = new frmBolumEkle(this, true);
        bolumEkle.show();
        bolumTabloyuDoldur();
    }//GEN-LAST:event_mnuBolumEkleActionPerformed

    private void mnuBolumListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBolumListeleActionPerformed
        bolumTabloyuDoldur();
    }//GEN-LAST:event_mnuBolumListeleActionPerformed

    private void mnuIlEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIlEkleActionPerformed
        frmIlEkle ilEkle = new frmIlEkle(this, true);
        ilEkle.show();
        IlTabloyuDoldur();
    }//GEN-LAST:event_mnuIlEkleActionPerformed

    private void mnuIlListesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIlListesiActionPerformed
        IlTabloyuDoldur();
    }//GEN-LAST:event_mnuIlListesiActionPerformed

    private void mnuOgrenciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOgrenciEkleActionPerformed
        frmOgrenciEkle ogrenciEkle = new frmOgrenciEkle(this, true);
        ogrenciEkle.show();
        ogrenciTabloyuDoldur();
    }//GEN-LAST:event_mnuOgrenciEkleActionPerformed

    private void mnuOgrenciListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOgrenciListeleActionPerformed
        ogrenciTabloyuDoldur();
    }//GEN-LAST:event_mnuOgrenciListeleActionPerformed

    private void tblAnasayfaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAnasayfaMouseReleased
        if (evt.isPopupTrigger()) {
            jPopupMenu.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblAnasayfaMouseReleased

    private void jPopUpGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopUpGuncelleActionPerformed
        kullaniciGuncelle();
    }//GEN-LAST:event_jPopUpGuncelleActionPerformed

    private void jPopUpSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPopUpSilActionPerformed
        kullaniciSil();
    }//GEN-LAST:event_jPopUpSilActionPerformed

    private void mnuOgrenciDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOgrenciDuzenleActionPerformed
        int seciliKayit = tblAnasayfa.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblAnasayfa.getValueAt(seciliKayit, 0).toString();
            Ogrenci ogrenci = ogrenciService.getById(new Long(value));
            frmOgrenciEkle guncelle = new frmOgrenciEkle(this, true, ogrenci);
            guncelle.show();
            ogrenciTabloyuDoldur();
        }
    }//GEN-LAST:event_mnuOgrenciDuzenleActionPerformed

    private void mnuBolumDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBolumDuzenleActionPerformed
        int seciliKayit = tblAnasayfa.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblAnasayfa.getValueAt(seciliKayit, 0).toString();
            Bolum bolum = bolumService.getById(new Long(value));
            frmBolumEkle guncelle = new frmBolumEkle(this, true, bolum);
            guncelle.show();
            bolumTabloyuDoldur();
        }
    }//GEN-LAST:event_mnuBolumDuzenleActionPerformed

    private void mnuIlGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIlGuncelleActionPerformed
        int seciliKayit = tblAnasayfa.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblAnasayfa.getValueAt(seciliKayit, 0).toString();
            Il il = ilService.getById(new Long(value));
            frmIlEkle guncelle = new frmIlEkle(this, true, il);
            guncelle.show();
            IlTabloyuDoldur();
    }//GEN-LAST:event_mnuIlGuncelleActionPerformed

    /**
         * @param args the command line arguments
         */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jPopUpGuncelle;
    private javax.swing.JMenuItem jPopUpSil;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mnuBolum;
    private javax.swing.JMenuItem mnuBolumDuzenle;
    private javax.swing.JMenuItem mnuBolumEkle;
    private javax.swing.JMenuItem mnuBolumListele;
    private javax.swing.JMenuItem mnuIlEkle;
    private javax.swing.JMenuItem mnuIlGuncelle;
    private javax.swing.JMenuItem mnuIlListesi;
    private javax.swing.JMenuItem mnuKullaniciEkle;
    private javax.swing.JMenuItem mnuKullaniciGuncelle;
    private javax.swing.JMenuItem mnuKullaniciListesi;
    private javax.swing.JMenuItem mnuKullaniciSil;
    private javax.swing.JMenuItem mnuOgrenciDuzenle;
    private javax.swing.JMenuItem mnuOgrenciEkle;
    private javax.swing.JMenuItem mnuOgrenciListele;
    private javax.swing.JTable tblAnasayfa;
    // End of variables declaration//GEN-END:variables

    private void kullaniciTabloyuDoldur() {
        List<Kullanici> kullanici = kullaniciService.getAll(null);
        String[][] data = new String[kullanici.size()][6];
        for (int i = 0; i < kullanici.size(); i++) {
            data[i][0] = kullanici.get(i).getId().toString();
            data[i][1] = kullanici.get(i).getAdSoyad();
            data[i][2] = kullanici.get(i).getUsername();

        }

        tblAnasayfa.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Id", "Ad Soyad", "Kullanıcı Adı"
                }
        ));
    }

    private void bolumTabloyuDoldur() {
        List<Bolum> bolum = bolumService.getAll(null);
        String[][] data = new String[bolum.size()][6];
        for (int i = 0; i < bolum.size(); i++) {
            data[i][0] = bolum.get(i).getId().toString();
            data[i][1] = bolum.get(i).getKod();
            data[i][2] = bolum.get(i).getBolumAdi();

        }

        tblAnasayfa.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Id", "Bolum Kodu", "Bolum Adı"
                }
        ));
    }

    private void IlTabloyuDoldur() {
        //tablo doldur
        List<Il> il = ilService.getAll(null);
        String[][] data = new String[il.size()][6];
        for (int i = 0; i < il.size(); i++) {
            //data[i][0] = il.get(i).getId().toString();
            data[i][0] = il.get(i).getKodu();
            data[i][1] = il.get(i).getAdi();
        }
        tblAnasayfa.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "İl Kodu", "İl Adı"
                }
        ));
    }

    private void ogrenciTabloyuDoldur() {
        List<Ogrenci> ogrenci = ogrenciService.getAll(null);
        String[][] data = new String[ogrenci.size()][11];
        for (int i = 0; i < ogrenci.size(); i++) {
            data[i][0] = ogrenci.get(i).getId().toString();
            data[i][1] = ogrenci.get(i).getAd();
            data[i][2] = ogrenci.get(i).getSoyad();
            data[i][3] = ogrenci.get(i).getTcKimlikNo().toString();
            data[i][4] = ogrenci.get(i).getBolum() != null ? ogrenci.get(i).getBolum().getBolumAdi() : "";
            data[i][5] = ogrenci.get(i).getAdres();
            data[i][6] = ogrenci.get(i).getOkulNo();
            //data[i][7] = ogrenci.get(i).getDogumTarihi() != null ? ogrenci.get(i).getDogumTarihi().toString() : "";

            if (ogrenci.get(i).getDogumTarihi() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                data[i][7] = sdf.format(ogrenci.get(i).getDogumTarihi());
            }
            if (ogrenci.get(i).getOkulaBaslamaTarihi() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
                data[i][8] = sdf.format(ogrenci.get(i).getOkulaBaslamaTarihi());
            }
            //data[i][8] = ogrenci.get(i).getAktif() != null ? ogrenci.get(i).getAktif().toString() : "";

            if (ogrenci.get(i).getAktif() != null) {
                data[i][9] = "Aktif";
            } else {
                data[i][9] = "Pasif";
            }

            if (ogrenci.get(i).getCinsiyet() == 0 && ogrenci.get(i).getCinsiyet() > -1) {
                data[i][10] = "Erkek";
            } else if (ogrenci.get(i).getCinsiyet() == 1 && ogrenci.get(i).getCinsiyet() > -1) {
                data[i][10] = "Kadın";
            } else if (ogrenci.get(i).getCinsiyet() == 2 && ogrenci.get(i).getCinsiyet() > -1) {
                data[i][10] = "Diğer";
            }
        }

        tblAnasayfa.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                    "Id", "Ad", "Soyad", "Kimlik No", "Bölüm Adı", "Adres", "Okul No", "Doğum Tarihi", "Okula Başlama Tarihi", "Aktif", "Cinsiyet"
                }
        ));
    }

    private void kullaniciSil() {
        int seciliKayit = tblAnasayfa.getSelectedRow();
        if (seciliKayit > -1) {
            int silisinMi = (JOptionPane.showConfirmDialog(rootPane, "Silmek İstediğinize Emin misiniz?"));
            if (silisinMi == 0) {
                String value = tblAnasayfa.getValueAt(seciliKayit, 0).toString();
                Kullanici kullanici = kullaniciService.getById(new Long(value));
                kullaniciService.delete(kullanici);
                kullaniciTabloyuDoldur();
            }
        }

    }

    private void kullaniciGuncelle() {
        int seciliKayit = tblAnasayfa.getSelectedRow();
        if (seciliKayit > -1) {
            String value = tblAnasayfa.getValueAt(seciliKayit, 0).toString();
            Kullanici k = kullaniciService.getById(new Long(value));
            frmKullaniciEkle guncelle = new frmKullaniciEkle(this, true, k);
            guncelle.show();
            kullaniciTabloyuDoldur();
        }
    }

}
