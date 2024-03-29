/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasipenyewaanpcGUI;

/**
 *
 * @author Mujahid
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class AplikasiPenyewaanPCCustomer extends javax.swing.JFrame {

    /**
     *  AplikasiPenyewaanPCCustomer
     */
    public Statement st;
    public ResultSet rs;
    Connection cn =koneksi.KoneksiDatabase.BukaKoneksi();
    public AplikasiPenyewaanPCCustomer() {
        initComponents();
        initializeComboBoxes();
     
    }
    private void initializeComboBoxes() {
        // Set model awal untuk cbModel
        cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pilih"}));
 
  
   
  
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSewa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        cbModel = new javax.swing.JComboBox<>();
        cbBrand = new javax.swing.JComboBox<>();
        tfKetersediaan = new javax.swing.JTextField();
        tfHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfSpek = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Model");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Brand");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Ketersediaan");

        btnSewa.setText("Sewa PC");
        btnSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSewaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("PENYEWAAN PC");

        jLabel5.setText("Harga Per Bulan");

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Dell XPS Desktop", "Dell Inspiron Desktop", "Alienware Aurora", "Asus ROG Strix", "Asus VivoMini", "Asus ROG Huracan G21", "Acer Aspire TC", "Acer Predator Orion", "Acer Aspire XC" }));
        cbModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModelActionPerformed(evt);
            }
        });

        cbBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Dell", "Asus", "Acer" }));
        cbBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBrandMouseClicked(evt);
            }
        });
        cbBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBrandActionPerformed(evt);
            }
        });

        tfKetersediaan.setEnabled(false);

        tfHarga.setEnabled(false);

        jLabel7.setText("Spek");

        tfSpek.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfKetersediaan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfSpek, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbModel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(btnSewa)
                            .addGap(33, 33, 33)
                            .addComponent(btnBatal)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnKeluar)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfSpek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfKetersediaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSewa)
                    .addComponent(btnBatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnKeluar)
                .addGap(49, 49, 49))
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

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
       // Mengosongkan kolom teks
    tfSpek.setText("");
    tfKetersediaan.setText("");
    tfHarga.setText("");

    // Mereset combo box ke keadaan awal
    cbBrand.setSelectedIndex(0);
    cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pilih"}));
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSewaActionPerformed
      // Dapatkan brand, model, dan nama_penyewa yang dipilih

    String selectedBrand = cbBrand.getSelectedItem().toString();
    String selectedModel = cbModel.getSelectedItem().toString();
    String namaPenyewa = JOptionPane.showInputDialog("Masukkan Nama Penyewa:");

    if (!selectedBrand.equals("Pilih") && !selectedModel.equals("Pilih") && namaPenyewa != null && !namaPenyewa.isEmpty()) {
        try {
             // Buat Query SQL untuk mendapatkan id_pc dan ketersediaan berdasarkan brand dan model yang dipilih
            String getPcInfoSql = "SELECT id_pc, ketersediaan FROM tb_pc WHERE brand = ? AND model = ?";
            PreparedStatement getPcInfoStatement = cn.prepareStatement(getPcInfoSql);
            getPcInfoStatement.setString(1, selectedBrand);
            getPcInfoStatement.setString(2, selectedModel);
            ResultSet pcInfoResult = getPcInfoStatement.executeQuery();

            // Periksa apakah hasil set memiliki data
            if (pcInfoResult.next()) {
                int idPc = pcInfoResult.getInt("id_pc");
                int ketersediaan = pcInfoResult.getInt("ketersediaan");

                 // Periksa apakah PC tersedia
                if (ketersediaan > 0) {
                    // Perbarui ketersediaan di tb_pc
                    String updateKetersediaanSql = "UPDATE tb_pc SET ketersediaan = ? WHERE id_pc = ?";
                    PreparedStatement updateKetersediaanStatement = cn.prepareStatement(updateKetersediaanSql);
                    updateKetersediaanStatement.setInt(1, ketersediaan - 1);
                    updateKetersediaanStatement.setInt(2, idPc);
                    updateKetersediaanStatement.executeUpdate();

                  // Masukkan data ke tb_sewa, pastikan kepatuhan kunci asing dan atur tgl_rental ke tanggal saat ini
                    String insertSewaSql = "INSERT INTO tb_sewa(id_pc, nama_penyewa, tgl_rental) VALUES (?, ?, CURRENT_DATE)";
                    PreparedStatement insertSewaStatement = cn.prepareStatement(insertSewaSql);
                    insertSewaStatement.setInt(1, idPc);
                    insertSewaStatement.setString(2, namaPenyewa);
                    int rowsAffected = insertSewaStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Penyewaan berhasil" + idPc);
                    } else {
                        JOptionPane.showMessageDialog(null, "Gagal menyewa PC. Silakan coba lagi.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "PC tidak tersedia.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Data PC tidak ditemukan.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Silakan pilih brand, model, dan masukkan nama penyewa.");
    }
    }//GEN-LAST:event_btnSewaActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
         new Login().show();
            this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void cbBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBrandActionPerformed
         // Ketika pengguna memilih merek dari cbBrand, perbarui cbModel sesuai
    Object selectedBrandObj = cbBrand.getSelectedItem();

     // Periksa apakah selectedBrandObj tidak null
    if (selectedBrandObj != null) {
        String selectedBrand = selectedBrandObj.toString(); // Convert to string

         // Bersihkan kolom teks
        tfSpek.setText("");
        tfKetersediaan.setText("");
        tfHarga.setText("");

        if (!selectedBrand.equals("Pilih")) {
            try {
                // Buat Query SQL untuk mengambil model berdasarkan merek yang dipilih
                String sql = "SELECT model FROM tb_pc WHERE brand = ?";

               // Jalankan Query dengan PreparedStatement
                PreparedStatement preparedStatement = cn.prepareStatement(sql);
                preparedStatement.setString(1, selectedBrand);
                rs = preparedStatement.executeQuery();

               // Hapus item yang ada di combo box cbModel
                cbModel.removeAllItems();
                 // Tambahkan item default
                cbModel.addItem("Pilih");

                // Isi cbModel dengan data yang diambil
                while (rs.next()) {
                    cbModel.addItem(rs.getString("model"));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error fetching model data: " + e.getMessage());
            }
        } else {
            // Jika pengguna memilih "Pilih" di cbBrand, bersihkan cbModel
           
            cbModel.removeAllItems();
            cbModel.addItem("Pilih");
        }
    }
    }//GEN-LAST:event_cbBrandActionPerformed

    private void cbModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModelActionPerformed
     // Dapatkan merek dan model yang dipilih
    Object selectedBrandObj = cbBrand.getSelectedItem();
    Object selectedModelObj = cbModel.getSelectedItem();

   // Periksa apakah selectedBrandObj dan selectedModelObj tidak null
  
    if (selectedBrandObj != null && selectedModelObj != null) {
        String selectedBrand = selectedBrandObj.toString();
        String selectedModel = selectedModelObj.toString();

        if (!selectedBrand.equals("Pilih") && !selectedModel.equals("Pilih")) {
            try {
               // Buat Query SQL untuk mengambil data berdasarkan merek dan model yang dipilih
                String sql = "SELECT spek, ketersediaan, harga FROM tb_pc WHERE brand = ? AND model = ?";

               // Jalankan Query dengan PreparedStatement
                PreparedStatement preparedStatement = cn.prepareStatement(sql);
                preparedStatement.setString(1, selectedBrand);
                preparedStatement.setString(2, selectedModel);
                rs = preparedStatement.executeQuery();

                 // Periksa apakah hasil set data memiliki data
                if (rs.next()) {
                      // Atur nilai ke kolom teks
                    tfSpek.setText(rs.getString("spek"));
                    tfKetersediaan.setText(rs.getString("ketersediaan"));
                    tfHarga.setText(rs.getString("harga"));
                } else {
                   // Tangani kasus di mana tidak ada data yang ditemukan
                    JOptionPane.showMessageDialog(null, "Data not found for the selected brand and model.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
            }
        } else {
            // Tangani kasus di mana "Pilih" dipilih baik di cbBrand atau cbModel
            tfSpek.setText("");
            tfKetersediaan.setText("");
            tfHarga.setText("");
        }
    }
    }//GEN-LAST:event_cbModelActionPerformed

    private void cbBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBrandMouseClicked
       
            
    }//GEN-LAST:event_cbBrandMouseClicked

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
            java.util.logging.Logger.getLogger(AplikasiPenyewaanPCCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenyewaanPCCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenyewaanPCCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenyewaanPCCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AplikasiPenyewaanPCCustomer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSewa;
    private javax.swing.JComboBox<String> cbBrand;
    private javax.swing.JComboBox<String> cbModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfKetersediaan;
    private javax.swing.JTextField tfSpek;
    // End of variables declaration//GEN-END:variables
}
