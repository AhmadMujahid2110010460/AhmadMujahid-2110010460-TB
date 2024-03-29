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
import javax.swing.table.DefaultTableModel;


public class TambahDataAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TambahDataAdmin
     */
    public Statement st;
    public ResultSet rs;
    Connection cn =koneksi.KoneksiDatabase.BukaKoneksi();
    DefaultTableModel model;
    
    public void tampilkanData() {
    try {
        
         btnUbah.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUbahActionPerformed(evt);
        }
        });
         
        // Statement untuk mendapatkan data dari tb_pc
        String sqlGetData = "SELECT * FROM tb_pc";
        st = cn.createStatement();
        rs = st.executeQuery(sqlGetData);

        // Set model untuk tabel
        model = (DefaultTableModel) tbPC.getModel();
        model.setRowCount(0); // Menghapus semua baris yang ada

        // Mengisi tabel dengan data dari ResultSet
        while (rs.next()) {
            String idPc = rs.getString("id_pc");
            String brand = rs.getString("brand");
            String modelPc = rs.getString("model");
            String spek = rs.getString("spek");
            String ketersediaan = rs.getString("ketersediaan");
            String harga = rs.getString("harga");

            // Menambahkan baris baru ke tabel
            model.addRow(new Object[]{idPc, brand, modelPc, spek, ketersediaan, harga});
        }
    } catch (SQLException e) {
        // Tangani exception
        e.printStackTrace();
    }
}
    
    public TambahDataAdmin() {
        initComponents();
         // Menambahkan listener untuk event mouse double click pada tabel
        tbPC.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tbPCMouseClicked(evt);
        }
    });
        
        //menampilkan data ke table
         tampilkanData();
        
        // Set model awal untuk cbModel
        cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pilih"}));

        cbBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBrandActionPerformed(evt);
            }
        });
    }
   
          

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfIdpc = new javax.swing.JTextField();
        tfSpek = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPC = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        tfKetersediaan = new javax.swing.JTextField();
        cbBrand = new javax.swing.JComboBox<>();
        cbModel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("ID PC");

        jLabel2.setText("Model");

        jLabel3.setText("Brand");

        jLabel4.setText("Spek");

        jLabel5.setText("Ketersediaan");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Data PC");

        tfSpek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSpekActionPerformed(evt);
            }
        });

        tbPC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID PC", "Brand", "Model", "Spek", "Ketersediaan", "Harga Per Bulan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPC.setIntercellSpacing(new java.awt.Dimension(1, 0));
        tbPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPC);
        if (tbPC.getColumnModel().getColumnCount() > 0) {
            tbPC.getColumnModel().getColumn(0).setResizable(false);
            tbPC.getColumnModel().getColumn(0).setPreferredWidth(35);
            tbPC.getColumnModel().getColumn(1).setResizable(false);
            tbPC.getColumnModel().getColumn(1).setPreferredWidth(35);
            tbPC.getColumnModel().getColumn(2).setResizable(false);
            tbPC.getColumnModel().getColumn(3).setResizable(false);
            tbPC.getColumnModel().getColumn(3).setPreferredWidth(120);
            tbPC.getColumnModel().getColumn(4).setResizable(false);
            tbPC.getColumnModel().getColumn(5).setResizable(false);
        }

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        cbBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Dell", "Asus", "Acer" }));
        cbBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBrandActionPerformed(evt);
            }
        });

        cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Dell XPS Desktop", "Dell Inspiron Desktop", "Alienware Aurora", "Asus ROG Strix", "Asus VivoMini", "Asus ROG Huracan G21", "Acer Aspire TC", "Acer Predator Orion", "Acer Aspire XC" }));
        cbModel.setToolTipText("");
        cbModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModelActionPerformed(evt);
            }
        });

        jLabel7.setText("Harga Per Bulan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfIdpc, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfKetersediaan, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tfSpek, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbModel, javax.swing.GroupLayout.Alignment.TRAILING, 0, 163, Short.MAX_VALUE)
                                            .addComponent(cbBrand, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfIdpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSpek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfKetersediaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBatal)
                            .addComponent(btnTambah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKeluar)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfSpekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSpekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSpekActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
     // Ekstrak nilai dari elemen-elemen UI
    String idPc = tfIdpc.getText();
    String brand = cbBrand.getSelectedItem().toString();
    String model = cbModel.getSelectedItem().toString();
    String spek = tfSpek.getText();
    String ketersediaan = tfKetersediaan.getText();
    String harga = tfHarga.getText();

    // Validasi data kosong atau "Pilih" pada combobox
    if (idPc.isEmpty() || "Pilih".equals(brand) || "Pilih".equals(model) || spek.isEmpty() || ketersediaan.isEmpty() || harga.isEmpty()) {
        // Menampilkan pesan error jika ada data yang kosong atau belum dipilih
        JOptionPane.showMessageDialog(this, "Harap isi semua data sebelum menambahkan!", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            // Statement untuk menambahkan data ke tb_pc
            String sqlTambahDataPc = "INSERT INTO tb_pc (id_pc, model, brand, spek, ketersediaan, harga) VALUES ('" + idPc + "', '" + model + "', '" + brand + "', '" + spek + "', '" + ketersediaan + "', '" + harga + "')";

            // Eksekusi query
            st = cn.createStatement();
            st.executeUpdate(sqlTambahDataPc);

            // Tampilkan pesan berhasil atau tindakan lanjutan sesuai kebutuhan
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Menampilkan ulang data ke tabel setelah penambahan
            tampilkanData();

        } catch (SQLException e) {
            // Tangani exception
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         // Mendapatkan baris yang dipilih
    int row = tbPC.getSelectedRow();

    // Memeriksa apakah ada baris yang dipilih
    if (row >= 0) {
        // Mendapatkan nilai ID PC dari baris yang dipilih
        String idPc = tbPC.getValueAt(row, 0).toString();

        try {
            // Statement untuk menghapus data dari tb_pc berdasarkan ID PC
            String sqlHapusDataPc = "DELETE FROM tb_pc WHERE id_pc = '" + idPc + "'";

            // Eksekusi query
            st = cn.createStatement();
            st.executeUpdate(sqlHapusDataPc);

            // Tampilkan pesan berhasil atau tindakan lanjutan sesuai kebutuhan
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Memperbarui tampilan tabel
            tampilkanData();

            // Mengosongkan nilai dari elemen UI setelah penghapusan
            tfIdpc.setText("");
            cbBrand.setSelectedIndex(0);
            cbModel.setSelectedIndex(0);
            tfSpek.setText("");
            tfKetersediaan.setText("");
            tfHarga.setText("");

        } catch (SQLException e) {
            // Tangani exception
            e.printStackTrace();
        }
    } else {
        // Menampilkan pesan jika tidak ada baris yang dipilih
        JOptionPane.showMessageDialog(this, "Pilih baris terlebih dahulu sebelum menghapus!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void cbBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBrandActionPerformed
      // Mendapatkan merek yang dipilih
    String selectedBrand = cbBrand.getSelectedItem().toString();

    // Menyesuaikan model cbModel berdasarkan merek yang dipilih
    if ("Pilih".equals(selectedBrand)) {
        // Jika merek "Pilih" dipilih, reset model cbModel ke "Pilih"
        cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pilih"}));
    } else if ("Dell".equals(selectedBrand)) {
        cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pilih", "Dell XPS Desktop", "Dell Inspiron Desktop", "Alienware Aurora"}));
    } else if ("Asus".equals(selectedBrand)) {
        cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pilih", "Asus ROG Strix", "Asus VivoMini", "Asus ROG Huracan G21"}));
    } else if ("Acer".equals(selectedBrand)) {
        cbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pilih", "Acer Aspire TC", "Acer Predator Orion", "Acer Aspire XC"}));
    }
    }//GEN-LAST:event_cbBrandActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
     // Menghapus semua data yang telah dimasukkan
    tfIdpc.setText("");
    cbBrand.setSelectedIndex(0); // Mengatur kembali ke "Pilih"
    cbModel.setSelectedIndex(0); // Mengatur kembali ke "Pilih"
    tfSpek.setText("");
    tfKetersediaan.setText("");
    tfHarga.setText("");
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tbPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPCMouseClicked
       // Mendapatkan baris yang dipilih
    int row = tbPC.getSelectedRow();

    // Memeriksa apakah ada baris yang dipilih
    if (row >= 0) {
        // Mendapatkan nilai dari baris yang dipilih
        String idPc = tbPC.getValueAt(row, 0).toString();
        String brand = tbPC.getValueAt(row, 1).toString();
        String model = tbPC.getValueAt(row, 2).toString();
        String spek = tbPC.getValueAt(row, 3).toString();
        String ketersediaan = tbPC.getValueAt(row, 4).toString();
        String harga = tbPC.getValueAt(row, 5).toString();

        // Menetapkan nilai ke elemen UI
        tfIdpc.setText(idPc);
        cbBrand.setSelectedItem(brand);
        cbModel.setSelectedItem(model);
        tfSpek.setText(spek);
        tfKetersediaan.setText(ketersediaan);
        tfHarga.setText(harga);
    }
    }//GEN-LAST:event_tbPCMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
   // Mendapatkan baris yang dipilih
    int row = tbPC.getSelectedRow();

    // Memeriksa apakah ada baris yang dipilih
    if (row >= 0) {
        // Mendapatkan nilai ID PC dari baris yang dipilih
        String idPc = tbPC.getValueAt(row, 0).toString();

        // Ekstrak nilai dari elemen-elemen UI
        String brand = cbBrand.getSelectedItem().toString();
        String model = cbModel.getSelectedItem().toString();
        String spek = tfSpek.getText();
        String ketersediaan = tfKetersediaan.getText();
        String harga = tfHarga.getText();

        // Validasi data kosong atau "Pilih" pada combobox
        if ("Pilih".equals(brand) || "Pilih".equals(model) || spek.isEmpty() || ketersediaan.isEmpty() || harga.isEmpty()) {
            // Menampilkan pesan error jika ada data yang kosong atau belum dipilih
            JOptionPane.showMessageDialog(this, "Harap isi semua data sebelum mengubah!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Statement untuk mengupdate data di tb_pc berdasarkan ID PC
                String sqlUpdateDataPc = "UPDATE tb_pc SET model = '" + model + "', brand = '" + brand + "', spek = '" + spek + "', ketersediaan = '" + ketersediaan + "', harga = '" + harga + "' WHERE id_pc = '" + idPc + "'";

                // Eksekusi query
                st = cn.createStatement();
                st.executeUpdate(sqlUpdateDataPc);

                // Tampilkan pesan berhasil atau tindakan lanjutan sesuai kebutuhan
                JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                // Memperbarui tampilan tabel
                tampilkanData();

                // Mengosongkan nilai dari elemen UI setelah pengubahan
                tfIdpc.setText("");
                cbBrand.setSelectedIndex(0);
                cbModel.setSelectedIndex(0);
                tfSpek.setText("");
                tfKetersediaan.setText("");
                tfHarga.setText("");

            } catch (SQLException e) {
                // Tangani exception
                e.printStackTrace();
            }
        }
    } 
          

    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        new AplikasiPenyewaanPCAdmin().show();
            this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void cbModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbModelActionPerformed

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
            java.util.logging.Logger.getLogger(TambahDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahDataAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahDataAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPC;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfIdpc;
    private javax.swing.JTextField tfKetersediaan;
    private javax.swing.JTextField tfSpek;
    // End of variables declaration//GEN-END:variables
}
