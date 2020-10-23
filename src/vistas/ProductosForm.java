
package vistas;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;
import modelo.ProductosDAO;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Conexion;


public class ProductosForm extends javax.swing.JInternalFrame {

    ProductosDAO dao=new ProductosDAO();
    Producto pl=new Producto();
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
   
    
    DefaultTableModel modelo=new DefaultTableModel();
    int ids;
    
    public ProductosForm() {
        initComponents();
        listar();
    }
    
    
    void listar(){
        List<Producto> lista=dao.listar();
        modelo=(DefaultTableModel)Tabla.getModel();
        Object[]ob=new Object[9];             ///*****************INSTANCIAMOS LA CANTIDAD DE OBJETOS QUE TIENE EL OBJECT***************
                
        for(int i=0; i< lista.size() ; i++){
            ob[0]=lista.get(i).getId();
            ob[1]=lista.get(i).getProveedor();
            ob[2]=lista.get(i).getCodigo();
            ob[3]=lista.get(i).getTamaño();
            ob[4]=lista.get(i).getTipo();
            ob[5]=lista.get(i).getStock();
            ob[6]=lista.get(i).getPreciomay();
            ob[7]=lista.get(i).getPreciocat();
            ob[8]=lista.get(i).getPreciomen();
                       
            modelo.addRow(ob);
        }
        Tabla.setModel(modelo);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtTamaño = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtRutaImg = new javax.swing.JTextField();
        btnSelecionarImg = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecMay = new javax.swing.JTextField();
        txtPrecCat = new javax.swing.JTextField();
        txtPrecMen = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Inventario");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("PROVEEDOR:");

        jLabel2.setText("CODIGO:");

        jLabel3.setText("TAMAÑO:");

        jLabel4.setText("TIPO:");

        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel6.setText("IMAGEN: ");

        txtRutaImg.setEditable(false);

        btnSelecionarImg.setText("Seleccionar");
        btnSelecionarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarImgActionPerformed(evt);
            }
        });

        jLabel5.setText("STOCK: ");

        jLabel7.setText("PREC. MAY. $");

        jLabel8.setText("PREC. CAT. $");

        jLabel9.setText("PREC. MEN. $");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProveedor)
                            .addComponent(txtCodigo)
                            .addComponent(txtTamaño)
                            .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecMen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtPrecCat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecMay, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRutaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionarImg)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrecCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPrecMen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarImg)
                    .addComponent(txtRutaImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROVEEDOR", "CODIGO", "TAMAÑO", "TIPO", "STOCK", "$MAY", "$CAT", "$MEN", "Foto"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            actualizar();
            limpiarTabla();
            listar();
            nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
            agregar();
            limpiarTabla();
            listar();
            nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            eliminar();
            limpiarTabla();
            listar();
            nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
            nuevo();
            limpiarTabla();
            listar();
            nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        int fila=Tabla.getSelectedRow();        //obtienes 
        if(fila==-1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar Fila");
        }else{
            ids=Integer.parseInt(Tabla.getValueAt(fila, 0).toString());
            String proveedor=Tabla.getValueAt(fila, 1).toString();
            String codigo=Tabla.getValueAt(fila, 2).toString();
            String tamaño=Tabla.getValueAt(fila, 3).toString();
            String tipo=Tabla.getValueAt(fila, 4).toString();
            String stock =Tabla.getValueAt(fila, 5).toString();
            String preciomay=Tabla.getValueAt(fila, 6).toString();
            String precicat=Tabla.getValueAt(fila, 7).toString();
            String preciomen=Tabla.getValueAt(fila, 8).toString();
                       
            txtProveedor.setText(proveedor);
            txtCodigo.setText(codigo);
            txtTamaño.setText(tamaño);
            txtTipo.setText(tipo);
            txtStock.setText(stock);
            txtPrecMay.setText(preciomay);
            txtPrecCat.setText(precicat);
            txtPrecMen.setText(preciomen);
            
                      
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void btnSelecionarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarImgActionPerformed
        FileNameExtensionFilter filtro = new  FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)","jpg","jpeg");
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(filtro);
        fc.setDialogTitle("Seleccione Imagen");
        File ruta = new  File("C:\\Users\\Default.DESKTOP-TUNUQMI\\Desktop\\spv_netbeans\\SistemaVentas\\src\\Img");
        fc.setCurrentDirectory(ruta);
        
       int ventana = fc.showOpenDialog(null);
        if (ventana==JFileChooser.APPROVE_OPTION) {
            File file=fc.getSelectedFile();
            txtRutaImg.setText(String.valueOf(file));
            Image img=getToolkit().getImage(txtRutaImg.getText());
            img=img.getScaledInstance(330, 330, Image.SCALE_DEFAULT);
            lblFoto.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btnSelecionarImgActionPerformed

    void agregar(){
        
        String proveedor=txtProveedor.getText();
        String codigo=txtCodigo.getText();
        String tamaño=txtTamaño.getText();
        String tipo=txtTipo.getText();
        String stock= txtStock.getText();
        String premay=txtPrecMay.getText();
        String precat=txtPrecCat.getText();
        String premen=txtPrecMen.getText();
        String nomimg=txtRutaImg.getText();
        
        Object[] ob=new Object[8];
        ob[0]=proveedor;
        ob[1]=codigo;
        ob[2]=tamaño;
        ob[3]=tipo;
        ob[4]=stock;
        ob[5]=premay;
        ob[6]=precat;
        ob[7]=premen; 
        dao.add(ob);
              
    }
    
    
   
    
    void actualizar(){
        int fila =Tabla.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else{
        
        String prov=txtProveedor.getText();
        String cod=txtCodigo.getText();
        String tam=txtTamaño.getText();
        String tipo=txtTipo.getText();
        String stock=txtStock.getText();
        String premay=txtPrecMay.getText();
        String precat=txtPrecCat.getText();
        String premen=txtPrecMen.getText();
        
        Object[] obj=new Object[9];
        obj[0]=prov;
        obj[1]=cod;
        obj[2]=tam;
        obj[3]=tipo;
        obj[4]=stock;
        obj[5]=premay;
        obj[6]=precat;
        obj[7]=premen;
        obj[8]=ids;
        dao.actualizar(obj);
        }
    }
    
    
    void eliminar(){
        int fila=Tabla.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila ");
        }else{
            dao.eliminar(ids);
        }
    }
    
    
    void nuevo(){
        txtProveedor.setText("");
        txtCodigo.setText("");
        txtTamaño.setText("");
        txtTipo.setText("");
        txtStock.setText("");
        txtPrecMay.setText("");
        txtPrecCat.setText("");
        txtPrecMen.setText("");
        txtProveedor.requestFocus();
                              
    }
    
    
    void limpiarTabla(){
        for(int i=0; i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSelecionarImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPrecCat;
    private javax.swing.JTextField txtPrecMay;
    private javax.swing.JTextField txtPrecMen;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtRutaImg;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTamaño;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}


