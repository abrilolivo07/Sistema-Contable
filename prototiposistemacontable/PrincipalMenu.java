package prototiposistemacontable;

public class PrincipalMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrincipalMenu.class.getName());

    private String nivelAccesoUsuario;
    public PrincipalMenu(String nivelAcceso) {
        initComponents();
        this.nivelAccesoUsuario = nivelAcceso; 
        configurarPermisosMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        Panelfondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menumantenimiento = new javax.swing.JMenu();
        itemusuario = new javax.swing.JMenuItem();
        itemcatalogo = new javax.swing.JMenuItem();
        menumovimiento = new javax.swing.JMenu();
        itemtransacciones = new javax.swing.JMenuItem();
        menuprocesos = new javax.swing.JMenu();
        itemcierrediario = new javax.swing.JMenuItem();
        itemcierreaño = new javax.swing.JMenuItem();
        menuconsultas = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        logoutItem = new javax.swing.JMenuItem();
        salirItem = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem16.setText("jMenuItem16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setSize(new java.awt.Dimension(1920, 852));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panelfondo.setBackground(new java.awt.Color(2, 65, 62));
        Panelfondo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Interface.png"))); // NOI18N
        Panelfondo.add(jLabel1, new java.awt.GridBagConstraints());

        getContentPane().add(Panelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 700));

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 153));

        Menumantenimiento.setBackground(new java.awt.Color(255, 204, 153));
        Menumantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/departamento-de-ti.png"))); // NOI18N
        Menumantenimiento.setText("Mantenimientos");

        itemusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_10613751_2.png"))); // NOI18N
        itemusuario.setText("a) De usuarios");
        itemusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemusuarioActionPerformed(evt);
            }
        });
        Menumantenimiento.add(itemusuario);

        itemcatalogo.setText("b) De catalogo de cuentas");
        itemcatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcatalogoActionPerformed(evt);
            }
        });
        Menumantenimiento.add(itemcatalogo);

        jMenuBar1.add(Menumantenimiento);

        menumovimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ingenieria.png"))); // NOI18N
        menumovimiento.setText("Movimiento");

        itemtransacciones.setText("De Transacciones");
        itemtransacciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemtransaccionesActionPerformed(evt);
            }
        });
        menumovimiento.add(itemtransacciones);

        jMenuBar1.add(menumovimiento);

        menuprocesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/procesamiento-de-archivos.png"))); // NOI18N
        menuprocesos.setText("Procesos");

        itemcierrediario.setText("a) Cierre de Diario por Fecha");
        menuprocesos.add(itemcierrediario);

        itemcierreaño.setText("b) Cierre de fin de año fiscal por fecha año fiscal");
        menuprocesos.add(itemcierreaño);

        jMenuBar1.add(menuprocesos);

        menuconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/descompostura.png"))); // NOI18N
        menuconsultas.setText("Consultas");
        menuconsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem7.setText("a) De Catálogo de Cuenta");
        menuconsultas.add(jMenuItem7);

        jMenuItem8.setText("b) De Transacciones por Fecha");
        menuconsultas.add(jMenuItem8);

        jMenuItem9.setText("c) De Transacciones por rango de fechas");
        menuconsultas.add(jMenuItem9);

        jMenuItem10.setText("d) De Transacciones por Documento");
        menuconsultas.add(jMenuItem10);

        jMenuItem11.setText("e) De Transacciones por Tipo de Documento");
        menuconsultas.add(jMenuItem11);

        jMenuItem12.setText("f) Balanza General (Activos, pasivo, capital)");
        menuconsultas.add(jMenuItem12);

        jMenuItem13.setText("g) Balanza de Comprobacion ");
        menuconsultas.add(jMenuItem13);

        jMenuItem14.setText("h) Resumen de Gastos Generales");
        menuconsultas.add(jMenuItem14);

        jMenuItem15.setText("i) Estado de Ganancias y Perdidas ");
        menuconsultas.add(jMenuItem15);

        jMenuBar1.add(menuconsultas);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tuerca-removebg-preview.png"))); // NOI18N
        jMenu1.setText("Terminar");

        logoutItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-sesion-removebg-preview-removebg-preview.png"))); // NOI18N
        logoutItem.setText("Cerrar Sesión");
        logoutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutItemActionPerformed(evt);
            }
        });
        jMenu1.add(logoutItem);

        salirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salida-removebg-preview.png"))); // NOI18N
        salirItem.setText("Salir");
        salirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirItemActionPerformed(evt);
            }
        });
        jMenu1.add(salirItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void configurarPermisosMenu() {  
    if ("Normal".equalsIgnoreCase(nivelAccesoUsuario)) {
        itemusuario.setEnabled(false);
        menuprocesos.setEnabled(false);
    }
}
    
    private void itemusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemusuarioActionPerformed
         FrmMantenimientoUsuario frmUsuario = new FrmMantenimientoUsuario(); 
    frmUsuario.setLocationRelativeTo(null); 
    frmUsuario.setVisible(true);       
    }//GEN-LAST:event_itemusuarioActionPerformed

    private void itemcatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcatalogoActionPerformed
        FrmCatalogoCuentas catalogo = new FrmCatalogoCuentas();
    catalogo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    catalogo.setVisible(true);
    catalogo.setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_itemcatalogoActionPerformed

    private void logoutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutItemActionPerformed
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro que desea cerrar la sesión?",
            "Cerrar Sesión",
            javax.swing.JOptionPane.YES_NO_OPTION);

    if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        this.dispose(); 
        try {
            // Asumo que tienes una clase LoginView o algo similar
            Login login = new Login(); 
            login.setLocationRelativeTo(null); 
            login.setVisible(true);
        } catch (Exception e) {
            logger.log(java.util.logging.Level.SEVERE, "Error al abrir el formulario de Login.", e);
        }
    } 
    }//GEN-LAST:event_logoutItemActionPerformed
   
    private void salirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirItemActionPerformed
    int respuesta = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro que desea salir del sistema?",
            "Salir",
            javax.swing.JOptionPane.YES_NO_OPTION);

    if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);
    } 
    }//GEN-LAST:event_salirItemActionPerformed

    private void itemtransaccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemtransaccionesActionPerformed
     MovimientoTransacciones movimiento = new MovimientoTransacciones();
     movimiento.setLocationRelativeTo(null);
     movimiento.setVisible(true);    
    }//GEN-LAST:event_itemtransaccionesActionPerformed

    public static void main(String args[]) {
    
      java.awt.EventQueue.invokeLater(() -> new PrincipalMenu("admin").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menumantenimiento;
    private javax.swing.JPanel Panelfondo;
    private javax.swing.JMenuItem itemcatalogo;
    private javax.swing.JMenuItem itemcierreaño;
    private javax.swing.JMenuItem itemcierrediario;
    private javax.swing.JMenuItem itemtransacciones;
    private javax.swing.JMenuItem itemusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem logoutItem;
    private javax.swing.JMenu menuconsultas;
    private javax.swing.JMenu menumovimiento;
    private javax.swing.JMenu menuprocesos;
    private javax.swing.JMenuItem salirItem;
    // End of variables declaration//GEN-END:variables
}
