/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasipenyewaanpcGUI;

/**
 *
 * @author Mujahid
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class TableSewa extends javax.swing.JFrame {

    /**
     * Creates new form TableSewa
     */
    public TableSewa() {
        initComponents();
         showSewaData();
        // Menambahkan ActionListener ke tfCarisewa untuk fungsionalitas pencarian
        tfCarisewa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchSewaData();
            }
        });
        
        // Menambahkan DocumentListener ke tfCarisewa untuk pencarian langsung (live search)
        tfCarisewa.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                searchSewaData();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                searchSewaData();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Komponen teks biasa tidak memicu peristiwa ini
            }
        });
        
        btHapus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            hapusData();
        }
    });
    }
    
    // Metode untuk mengambil data dari tb_sewa dan menampilkannya di jTable1
    private void showSewaData() {
        try {
            Connection cn = koneksi.KoneksiDatabase.BukaKoneksi();
            String query = "SELECT * FROM tb_sewa";
            PreparedStatement pst = cn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            // Membuat DefaultTableModel untuk menyimpan data
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Menghapus data yang ada di tabel
            model.setRowCount(0);

            // Iterasi melalui hasil kueri dan menambahkan baris ke model tabel
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id_sewa"),
                    rs.getInt("id_pc"),
                    rs.getString("nama_penyewa"),
                    rs.getDate("tgl_rental")
                };
                model.addRow(row);
            }

            // Menutup sumber daya
            rs.close();
            pst.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    // Metode untuk mencari data di tb_sewa berdasarkan input pengguna
    private void searchSewaData() {
        try {
            Connection cn = koneksi.KoneksiDatabase.BukaKoneksi();
            String keyword = tfCarisewa.getText().trim();

            // Memeriksa apakah kolom pencarian kosong
            if (keyword.isEmpty()) {
                showSewaData(); // Jika kosong, tampilkan semua data
                return;
            }

            String query = "SELECT * FROM tb_sewa WHERE nama_penyewa LIKE ?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setString(1, "%" + keyword + "%");
            ResultSet rs = pst.executeQuery();

            // Membuat DefaultTableModel untuk menyimpan hasil pencarian
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Menghapus data yang ada di tabel
            model.setRowCount(0);

            // Iterasi melalui hasil kueri dan menambahkan baris ke model tabel
            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id_sewa"),
                    rs.getInt("id_pc"),
                    rs.getString("nama_penyewa"),
                    rs.getDate("tgl_rental")
                };
                model.addRow(row);
            }

            // Menutup sumber daya
            rs.close();
            pst.close();
            cn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    private void hapusData() {
    // Mendapatkan indeks baris yang dipilih
    int selectedRow = jTable1.getSelectedRow();

    // Memastikan bahwa baris yang dipilih valid
    if (selectedRow != -1) {
        int confirmDelete = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        // Jika pengguna menekan tombol Yes
        if (confirmDelete == JOptionPane.YES_OPTION) {
            try {
                Connection cn = koneksi.KoneksiDatabase.BukaKoneksi();
                int idSewa = (int) jTable1.getValueAt(selectedRow, 0); // Mengambil nilai ID Sewa dari kolom pertama
                String query = "DELETE FROM tb_sewa WHERE id_sewa = ?";
                PreparedStatement pst = cn.prepareStatement(query);
                pst.setInt(1, idSewa);
                
                // Menjalankan query hapus
                int result = pst.executeUpdate();

                // Jika berhasil dihapus, tampilkan pesan sukses dan refresh data
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
                    showSewaData();
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data.");
                }

                // Menutup sumber daya
                pst.close();
                cn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Pilih data yang akan dihapus.");
    }
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfCarisewa = new javax.swing.JTextField();
        btHapus = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Sewa", "ID PC", "Nama Penyewa", "Tanggal Sewa"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setText("Cari Data  :");

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btKeluar.setText("Keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCarisewa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btHapus)
                .addGap(12, 12, 12)
                .addComponent(btKeluar)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCarisewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHapus)
                    .addComponent(btKeluar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btHapusActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // TODO add your handling code here:
        new AplikasiPenyewaanPCAdmin().show();
            this.dispose();
    }//GEN-LAST:event_btKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(TableSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableSewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableSewa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfCarisewa;
    // End of variables declaration//GEN-END:variables
}
