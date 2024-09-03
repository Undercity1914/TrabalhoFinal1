/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package trabalho.libraryproject.view;

import trabalho.libraryproject.model.entities.Author;
import trabalho.libraryproject.view.TableModel.TMCadAuthor;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class JDialogAuthor extends javax.swing.JDialog {
    private boolean editando;
    private String cpfAntigo;
   //
    
    public JDialogAuthor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.editando = false;
        this.cpfAntigo = "";
        //
        //
        //
        //this.authorController = AuthorController(authorDao);
        
        initComponents();
        setLocationRelativeTo(parent);
        initData();
    }
    
    private void initData(){
        this.habilitarCampos(false);
        this.limparCampos();
        
        this.atualizarTabela();
        
    }
    
    public void habilitarCampos(boolean flag){
        edtName.setEnabled(flag);
        edtCPF.setEnabled(flag);
        edtAge.setEnabled(flag);
        edtISBN.setEnabled(flag);
        
    }
    
    public void limparCampos(){
        edtName.setText("");
        edtCPF.setText("");
        edtAge.setText("");
        edtISBN.setText("");
    }
    
    public void objetoParaCampos(Author a){
        edtName.setText(a.getName());
        edtCPF.setText(a.getCpf());
        edtAge.setText(a.getAge());
        //edtISBN.setText(a.);
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
        lblAuthorRegistratio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        edtName = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        edtCPF = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        edtAge = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblISBN = new javax.swing.JLabel();
        edtISBN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdAuthor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        lblAuthorRegistratio.setBackground(new java.awt.Color(255, 255, 255));
        lblAuthorRegistratio.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        lblAuthorRegistratio.setForeground(new java.awt.Color(255, 255, 255));
        lblAuthorRegistratio.setText("Author Registration");
        jPanel1.add(lblAuthorRegistratio);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        btnNew.setBackground(new java.awt.Color(204, 204, 255));
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel2.add(btnNew);

        btnCancel.setBackground(new java.awt.Color(204, 204, 255));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel);

        btnEdit.setBackground(new java.awt.Color(204, 204, 255));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel2.add(btnEdit);

        btnDelete.setBackground(new java.awt.Color(204, 204, 255));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        jPanel2.add(btnDelete);

        btnSave.setBackground(new java.awt.Color(204, 204, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name : ");

        edtName.setForeground(new java.awt.Color(0, 0, 0));

        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText(" CPF : ");

        edtCPF.setForeground(new java.awt.Color(0, 0, 0));

        lblAge.setForeground(new java.awt.Color(0, 0, 0));
        lblAge.setText("Age : ");

        edtAge.setForeground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblISBN.setForeground(new java.awt.Color(0, 0, 0));
        lblISBN.setText("ISBN : ");

        edtISBN.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblISBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(edtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtAge)))
                .addGap(18, 18, 18)
                .addComponent(lblCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(edtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF)
                    .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(edtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        grdAuthor.setBackground(new java.awt.Color(204, 204, 255));
        grdAuthor.setForeground(new java.awt.Color(0, 0, 0));
        grdAuthor.setModel(new javax.swing.table.DefaultTableModel(
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
        grdAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grdAuthorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grdAuthor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.habilitarCampos(true);
        this.limparCampos();
        this.editando = false;
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       if (this.editando == true){
         //  this.authorController.atualizarAuthor(cpfAntigo,)
       }
       else{
          // this.authorController.addAuthor()
       }
       this.limparCampos();
       this.habilitarCampos(false);
       this.editando = false;
       
       this.atualizarTabela();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.limparCampos();
        this.habilitarCampos(false);
        this.editando = false;
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Author chosenAuthor =  this.getObjetoSelecionadoNaGrid();
        
        String cpfChosen = chosenAuthor.getCpf();
        
        Author authorEditing = authorController.findAuthor(cpfChosen);
        
        if(authorEditing == null){
            JOptionPane.showMessageDialog(this,"There is no author with this cpf.");
            this.editando = false;
        }else{
            this.limparCampos();
            this.habilitarCampos(true);
            
            this.objetoParaCampos(authorEditing);
            this.editando = true;
            this.cpfAntigo = authorEditing.getCpf();
        }
}
       
    }//GEN-LAST:event_btnEditActionPerformed
    public Author getObjetoSelecionadoGrind(){
        int linhaSelecionada = grdAuthor.getSelectedRow();
        
        if(linhaSelecionada >= 0){
        TMCadAuthor tmCadAuthor = (TMCadAuthor) grdAuthor.getModel();
        Author author = tmCadAuthor.getObjetoAuthor(linhaSelecionada);
        return author;
        }
        return null;
    }
        
    public void atualizarTabela(){
        List<Author> lista = this.AuthorController.listarAuthors();
        TMCadAuthor tmcadauthor = new TMCadAuthor(lista);
        grdAuthor.setModel(tmcadauthor);
        }
        
    private void grdAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grdAuthorMouseClicked
        Author a = this.getObjetoSelecionadoNaGrid();
        this.objetoParaCampos(a);
    }//GEN-LAST:event_grdAuthorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField edtAge;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtISBN;
    private javax.swing.JTextField edtName;
    private javax.swing.JTable grdAuthor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAuthorRegistratio;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
