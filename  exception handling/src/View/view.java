/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * view.java
 *
 * Created on Oct 31, 2014, 6:19:22 PM
 */
package View;
import Control.Controller;
import Model.*;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Praktikan
 */
public class view extends javax.swing.JFrame
{  Controller C = new Controller();
Pattern pattern;
Matcher matcher;
    

    /** Creates new form view */
    public view()
    {
        initComponents();
        btnInputPemandu();
    }

  public void cleartxt() {
        txtNama.setText("");
        txtGaji.setText("");
        txtNip.setText("");
        txtTglAngkat.setText("");
    }

    public void btnInputPemandu() {
        //clue : dipanggil saat btnGuru ditekan
        btnInput.setText("Input Pemandu");
        jLabel8.setVisible(true);
        jRadioButtonDalamNeg.setVisible(true);
        jRadioButtonLuarNeg.setVisible(true);
        jRadioButtonDalamNeg.setSelected(true);
        jRadioButtonLuarNeg.setSelected(false);
        jLabel9.setVisible(false);
        jRadioButtonSementara.setVisible(false);
        jRadioButtonTetap.setVisible(false);
       

    }

    public void btnInputPenerjemah() {
        //clue : dipanggil saat btnKaryawan ditekan
        btnInput.setText("Input Penerjemah");
        jLabel8.setVisible(false);
        jRadioButtonDalamNeg.setVisible(false);
        jRadioButtonLuarNeg.setVisible(false);
        jLabel9.setVisible(true);
        jRadioButtonSementara.setVisible(true);
        jRadioButtonTetap.setVisible(true);
        jRadioButtonSementara.setSelected(false);
        jRadioButtonTetap.setSelected(true);
          
    }
    
    void tanggal()
    {
        pattern = Pattern.compile("\\\\d{4}-\\\\d{2}-\\\\d{2}");
                //matcher = pattern.matcher(txtTglAngkat.getText());
    }
    
    void cekkosong(String nip,String nama,String tanggal,String gaji) throws Model.exkosong
    {
        if(nip.equalsIgnoreCase("") || nama.equalsIgnoreCase("") || tanggal.equalsIgnoreCase("") || gaji.equalsIgnoreCase(""))
        {
             throw  new exkosong();
        }
    
    }
    void format_tanggal(String tanggal) throws Model.exformattanggal
    {
        Matcher tgl = pattern.matcher(txtTglAngkat.getText()); 
        if (!tgl.matches())
        {
            throw new exformattanggal();
        }
        
        
    }
    void cek_digit(String tanggal) throws extanggal 
    {
        if(tanggal.length()!= 8)
        {
            throw new extanggal();
        }
        
    }
    
    void cek_nip(String nip) throws exnip
    {
        if(nip.length()!=7)
        {
            throw  new exnip();
        }
    }
    
    
    
             
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPemandu = new javax.swing.JButton();
        btnPenerjemah = new javax.swing.JButton();
        jPanelPekerja = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGaji = new javax.swing.JTextField();
        txtTglAngkat = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnInput = new javax.swing.JButton();
        txtNip = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jRadioButtonDalamNeg = new javax.swing.JRadioButton();
        jRadioButtonLuarNeg = new javax.swing.JRadioButton();
        jRadioButtonTetap = new javax.swing.JRadioButton();
        jRadioButtonSementara = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnTampilPemandu = new javax.swing.JButton();
        btnTampilPenerjemah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(java.awt.Color.red);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 0, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36));
        jLabel1.setText("Vacation Tour");

        btnPemandu.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));
        btnPemandu.setText("Pemandu");
        btnPemandu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPemanduActionPerformed(evt);
            }
        });

        btnPenerjemah.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12));
        btnPenerjemah.setText("Penerjemah");
        btnPenerjemah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenerjemahActionPerformed(evt);
            }
        });

        jPanelPekerja.setBackground(new java.awt.Color(204, 204, 255));
        jPanelPekerja.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pegawai"));

        jLabel2.setText("Nama");

        jLabel3.setText("Tanggal Angkat");

        jLabel4.setText("Gaji Pokok");

        btnInput.setText("Input Pemandu");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        jLabel7.setText("NIP");

        jLabel8.setText("Area");

        jLabel9.setText("Kategori");

        jRadioButtonDalamNeg.setText("Dalam Negeri");
        jRadioButtonDalamNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDalamNegActionPerformed(evt);
            }
        });

        jRadioButtonLuarNeg.setText("Luar Negeri");
        jRadioButtonLuarNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLuarNegActionPerformed(evt);
            }
        });

        jRadioButtonTetap.setText("Tetap");
        jRadioButtonTetap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTetapActionPerformed(evt);
            }
        });

        jRadioButtonSementara.setText("Sementara");
        jRadioButtonSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonSementaraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPekerjaLayout = new javax.swing.GroupLayout(jPanelPekerja);
        jPanelPekerja.setLayout(jPanelPekerjaLayout);
        jPanelPekerjaLayout.setHorizontalGroup(
            jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPekerjaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInput, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addGroup(jPanelPekerjaLayout.createSequentialGroup()
                        .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtGaji, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtTglAngkat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtNip, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPekerjaLayout.createSequentialGroup()
                                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonDalamNeg)
                                    .addComponent(jRadioButtonTetap))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonSementara)
                                    .addComponent(jRadioButtonLuarNeg))))))
                .addGap(15, 15, 15))
        );
        jPanelPekerjaLayout.setVerticalGroup(
            jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPekerjaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTglAngkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButtonDalamNeg)
                    .addComponent(jRadioButtonLuarNeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPekerjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButtonTetap)
                    .addComponent(jRadioButtonSementara))
                .addGap(2, 2, 2)
                .addComponent(btnInput)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tampil Data"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnTampilPemandu.setText("Tampil Pemandu");
        btnTampilPemandu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilPemanduActionPerformed(evt);
            }
        });

        btnTampilPenerjemah.setText("Tampil Penerjemah");
        btnTampilPenerjemah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilPenerjemahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btnTampilPemandu)
                                .addGap(31, 31, 31)
                                .addComponent(btnTampilPenerjemah))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnPemandu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPenerjemah))
                    .addComponent(jPanelPekerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPenerjemah)
                            .addComponent(btnPemandu, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTampilPemandu)
                                    .addComponent(btnTampilPenerjemah)))
                            .addComponent(jPanelPekerja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanelPekerja.getAccessibleContext().setAccessibleDescription("Data Pegawai");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPenerjemahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenerjemahActionPerformed
        // TODO add your handling code here:
        btnInputPenerjemah();
    }//GEN-LAST:event_btnPenerjemahActionPerformed

    private void btnPemanduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPemanduActionPerformed
        // TODO add your handling code here:
        btnInputPemandu();
    }//GEN-LAST:event_btnPemanduActionPerformed

    private void jRadioButtonSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonSementaraActionPerformed
        // TODO add your handling code here:
        jRadioButtonTetap.setSelected(false);
    }//GEN-LAST:event_jRadioButtonSementaraActionPerformed

    private void jRadioButtonTetapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTetapActionPerformed
        // TODO add your handling code here:
        jRadioButtonSementara.setSelected(false);
    }//GEN-LAST:event_jRadioButtonTetapActionPerformed

    private void jRadioButtonLuarNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLuarNegActionPerformed
        // TODO add your handling code here:
        jRadioButtonDalamNeg.setSelected(false);
    }//GEN-LAST:event_jRadioButtonLuarNegActionPerformed

    private void jRadioButtonDalamNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDalamNegActionPerformed
        // TODO add your handling code here:
        jRadioButtonLuarNeg.setSelected(false);
    }//GEN-LAST:event_jRadioButtonDalamNegActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInputActionPerformed
    {//GEN-HEADEREND:event_btnInputActionPerformed
        // TODO add your handling code here:
        try
         {  
             cekkosong(txtNip.getText(), txtNama.getText(), txtTglAngkat.getText(), txtGaji.getText());
                cek_digit(txtTglAngkat.getText());
                cek_nip(txtNip.getText());
                format_tanggal(txtTglAngkat.getText());
                 
               
                         
             if(btnInput.getText().equalsIgnoreCase("input penerjemah"))
            {
               
                cek_digit(txtTglAngkat.getText());
                cek_nip(txtNip.getText());
                format_tanggal(txtTglAngkat.getText());
                Penerjemah P = new Penerjemah(txtTglAngkat.getText(),txtNama.getText(), txtTglAngkat.getText(), Double.parseDouble(txtGaji.getText()), null);
                C.add_penerjemah(P);
                   
              // C.add_penerjemah(;
                  
            }
             else 
             if(btnInput.getText().equalsIgnoreCase("input pemandu"))
            {
                
                cek_digit(txtTglAngkat.getText());
                cek_nip(txtNip.getText());
                    
                         Pemandu P = new Pemandu(txtTglAngkat.getText(),txtNama.getText(), txtTglAngkat.getText(), Double.parseDouble(txtGaji.getText()), null);
                C.add_pemandu(P);
                  
            }
         }          
         catch(exkosong ex)
         {
             JOptionPane.showMessageDialog(null, "data kosong", "Peringatan", JOptionPane.ERROR_MESSAGE);
             ex.msgkosong();        
         }
        catch(exnip ex)
         {
             JOptionPane.showMessageDialog(null, "digit nip harus 7 digit ", "Peringatan", JOptionPane.ERROR_MESSAGE);
           
            ex.msgnip();        
         }
        catch(extanggal ex)
         {
             JOptionPane.showMessageDialog(null, "digit tanggal harus 8 digit ", "Peringatan", JOptionPane.ERROR_MESSAGE);
             
            ex.msgtanggal();        
         }
        catch(exformattanggal ex)
        {
            JOptionPane.showMessageDialog(null, "format tanggal harus sesuai ", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
       
        
        
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnTampilPemanduActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTampilPemanduActionPerformed
    {//GEN-HEADEREND:event_btnTampilPemanduActionPerformed
        // TODO add your handling code here:
      jTextArea1.setText(C.getPemandu());
              
    }//GEN-LAST:event_btnTampilPemanduActionPerformed

    private void btnTampilPenerjemahActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTampilPenerjemahActionPerformed
    {//GEN-HEADEREND:event_btnTampilPenerjemahActionPerformed
        // TODO add your handling code here:
     //  jTextArea1.setText(C.getPemandu(),10);
        
        jTextArea1.setText(C.getPenerjemah());
    }//GEN-LAST:event_btnTampilPenerjemahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new view().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnPemandu;
    private javax.swing.JButton btnPenerjemah;
    private javax.swing.JButton btnTampilPemandu;
    private javax.swing.JButton btnTampilPenerjemah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPekerja;
    private javax.swing.JRadioButton jRadioButtonDalamNeg;
    private javax.swing.JRadioButton jRadioButtonLuarNeg;
    private javax.swing.JRadioButton jRadioButtonSementara;
    private javax.swing.JRadioButton jRadioButtonTetap;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtTglAngkat;
    // End of variables declaration//GEN-END:variables
}