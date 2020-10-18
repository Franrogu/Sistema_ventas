/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


public class Principal extends javax.swing.JFrame {

    ProductosForm ProductosForm;
    VendedorForm VendedoresForm;
    ClientesForm ClientesForm;
    VentasForm ventasForm;
            
    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        PrincipalMenu = new javax.swing.JMenu();
        ayuda = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        PrincipalVentas = new javax.swing.JMenu();
        generarventa = new javax.swing.JMenuItem();
        PrincipalUsuarios = new javax.swing.JMenu();
        clientes = new javax.swing.JMenuItem();
        vendedor = new javax.swing.JMenuItem();
        Principalinventario = new javax.swing.JMenu();
        inventario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        PrincipalMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu1.png"))); // NOI18N
        PrincipalMenu.setText("Menu");

        ayuda.setText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        PrincipalMenu.add(ayuda);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        PrincipalMenu.add(salir);

        jMenuBar1.add(PrincipalMenu);

        PrincipalVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ventas.png"))); // NOI18N
        PrincipalVentas.setText("Ventas");

        generarventa.setText("Generar Venta");
        generarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarventaActionPerformed(evt);
            }
        });
        PrincipalVentas.add(generarventa);

        jMenuBar1.add(PrincipalVentas);

        PrincipalUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cliente(1).png"))); // NOI18N
        PrincipalUsuarios.setText("Usuarios");

        clientes.setText("Clientes");
        clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesActionPerformed(evt);
            }
        });
        PrincipalUsuarios.add(clientes);

        vendedor.setText("Vendedores");
        vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedorActionPerformed(evt);
            }
        });
        PrincipalUsuarios.add(vendedor);

        jMenuBar1.add(PrincipalUsuarios);

        Principalinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/inventario(1).png"))); // NOI18N
        Principalinventario.setText("Inventario");

        inventario.setText("Inventario");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        Principalinventario.add(inventario);

        jMenuBar1.add(Principalinventario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(VentanaPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayudaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void generarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarventaActionPerformed
      //  VentasForm vf=new VentasForm();
      // CentrarVentana(vf);  
      ventasForm = new VentasForm();
        CentrarVentanas(ventasForm);
    }//GEN-LAST:event_generarventaActionPerformed

    private void clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesActionPerformed
       // ClientesForm cf=new ClientesForm();
      //  CentrarVentana(cf);
      ClientesForm=new ClientesForm();
        CentrarVentanas(ClientesForm);
    }//GEN-LAST:event_clientesActionPerformed

    private void vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedorActionPerformed
      //  VendedorForm vf=new VendedorForm();
      //  CentrarVentana(vf);
      VendedoresForm=new VendedorForm();
        CentrarVentanas(VendedoresForm);
    }//GEN-LAST:event_vendedorActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
    //    ProductosForm pf=new ProductosForm();
    //    CentrarVentana(pf);
    ProductosForm=new ProductosForm();
        CentrarVentanas(ProductosForm);
    }//GEN-LAST:event_inventarioActionPerformed
    
    
    //******************************CODIGO PARA CENTRAR VENTANAS DEL PROGRAMA *********************************************
   
    public void CentrarVentanas(JInternalFrame internalFrame){
        int x = (VentanaPrincipal.getWidth()/2)-(internalFrame.getWidth()/2);
        int y = (VentanaPrincipal.getHeight()/2)-(internalFrame.getHeight()/2); //Se calculan las posiciones x,y
        if (internalFrame.isShowing()) {                                        //Comprobamos si la ventana ya esta ejecutada
            internalFrame.setLocation(x,y);                                     //Si la ventana esta ejecutada solo lo colocamos en la mitad
        }else{
            VentanaPrincipal.add(internalFrame);                                //Si no esta ejecutada lo insertamos dentro del desktoppane
            internalFrame.setLocation(x,y); 
            internalFrame.show();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* void CentrarVentana(JInternalFrame frame){
        VentanaPrincipal.add(frame);
        Dimension dimension=VentanaPrincipal.getSize(); //Obtiene tamaño de ventana principal
        Dimension Dframe=frame.getSize(); //Obtiene tamaño de formulario ventas
        frame.setLocation((dimension.width - Dframe.height)/2,(dimension.height-Dframe.width)/2); //Centramos el frame de Generar venta
        
        frame.show();
              
    } */
    /**
     * @param args the command line arguments
     */
    //*****************************************************************************************************************************
    //A CONTINUACION COMENTAMOS EL METODO PRINCIPAL 
    //PARA QUE DE ESTA MANERA EL USUARIO NO PUEDA 
    //INGRESAR DIRECTAMENTE A LA PANTALLA PRINCIPA
    //
    //*****************************************************************************************************************************
    //
    // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       // try {
       //     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
       //         if ("Nimbus".equals(info.getName())) {
       //             javax.swing.UIManager.setLookAndFeel(info.getClassName());
       //             break;
       //         }
       //     }
       // } catch (ClassNotFoundException ex) {
       //     java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (InstantiationException ex) {
       //     java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (IllegalAccessException ex) {
       //     java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
       //     java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // }
        //</editor-fold>

        /* Create and display the form */
    //    java.awt.EventQueue.invokeLater(new Runnable() {
    //        public void run() {
    //            new Principal().setVisible(true);
    //        }
    //    });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu PrincipalMenu;
    private javax.swing.JMenu PrincipalUsuarios;
    private javax.swing.JMenu PrincipalVentas;
    private javax.swing.JMenu Principalinventario;
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenuItem ayuda;
    private javax.swing.JMenuItem clientes;
    private javax.swing.JMenuItem generarventa;
    private javax.swing.JMenuItem inventario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem vendedor;
    // End of variables declaration//GEN-END:variables
}
