/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho.libraryproject.view;

import trabalho.libraryproject.view.JDialogUser;
import trabalho.libraryproject.view.JDialogAuthor;

/**
 *
 * @author Windows
 */
public class JFrameLabrary extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLabrary
     */
    public JFrameLabrary() {
        initComponents();
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
        jblLabrary = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBooks = new javax.swing.JButton();
        btnAuthors = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jblLabrary.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jblLabrary.setForeground(new java.awt.Color(153, 255, 255));
        jblLabrary.setText(" Library ");
        jPanel1.add(jblLabrary);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setForeground(new java.awt.Color(51, 204, 255));

        btnBooks.setBackground(new java.awt.Color(153, 204, 255));
        btnBooks.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        btnBooks.setForeground(new java.awt.Color(255, 255, 255));
        btnBooks.setText("BOOKs");
        btnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksActionPerformed(evt);
            }
        });
        jPanel2.add(btnBooks);

        btnAuthors.setBackground(new java.awt.Color(153, 204, 255));
        btnAuthors.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        btnAuthors.setForeground(new java.awt.Color(255, 255, 255));
        btnAuthors.setText("AUTHOR's");
        btnAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorsActionPerformed(evt);
            }
        });
        jPanel2.add(btnAuthors);

        btnUsers.setBackground(new java.awt.Color(0, 0, 0));
        btnUsers.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        btnUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnUsers.setText("USER's");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });
        jPanel2.add(btnUsers);

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksActionPerformed
        JDialogBook tela = new JDialogBook(this, true);
        tela.setVisible(true);
    }//GEN-LAST:event_btnBooksActionPerformed

    private void btnAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorsActionPerformed
       JDialogAuthor tela = new JDialogAuthor(this, true);
       tela.setVisible(true);
    }//GEN-LAST:event_btnAuthorsActionPerformed

    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
       JDialogUser tela = new JDialogUser(this, true);
       tela.setVisible(true);
    }//GEN-LAST:event_btnUsersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthors;
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jblLabrary;
    // End of variables declaration//GEN-END:variables
}
