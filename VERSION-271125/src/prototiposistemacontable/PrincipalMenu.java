package prototiposistemacontable;

public class PrincipalMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrincipalMenu.class.getName());

    private String nivelAccesoUsuario;
    public PrincipalMenu(String nivelAcceso) {
        initComponents();
        setLocationRelativeTo(null);
        this.nivelAccesoUsuario = nivelAcceso; 
        configurarPermisosMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelfondo = new javax.swing.JPanel();
        logolabel = new javax.swing.JLabel();
        barramenu = new javax.swing.JMenuBar();
        Menumantenimiento = new javax.swing.JMenu();
        mantenimUsuarios = new javax.swing.JMenuItem();
        mantenimCatalogo = new javax.swing.JMenuItem();
        menumovimiento = new javax.swing.JMenu();
        mantenimTransacc = new javax.swing.JMenuItem();
        menuprocesos = new javax.swing.JMenu();
        cierreDPF = new javax.swing.JMenuItem();
        cierreFAF = new javax.swing.JMenuItem();
        menuconsultas = new javax.swing.JMenu();
        cCatCuentas = new javax.swing.JMenuItem();
        cTransFecha = new javax.swing.JMenuItem();
        cTransRangF = new javax.swing.JMenuItem();
        cTransDoc = new javax.swing.JMenuItem();
        cTransTipoDoc = new javax.swing.JMenuItem();
        cBalanzaGen = new javax.swing.JMenuItem();
        cBalanzaComp = new javax.swing.JMenuItem();
        cResumen = new javax.swing.JMenuItem();
        cEstadosGan = new javax.swing.JMenuItem();
        terminarmenu = new javax.swing.JMenu();
        tCerrarSesion = new javax.swing.JMenuItem();
        tSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setSize(new java.awt.Dimension(1920, 852));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panelfondo.setBackground(new java.awt.Color(2, 65, 62));
        Panelfondo.setLayout(new java.awt.GridBagLayout());

        logolabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Interface.png"))); // NOI18N
        Panelfondo.add(logolabel, new java.awt.GridBagConstraints());

        getContentPane().add(Panelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1140, 650));

        barramenu.setBackground(new java.awt.Color(255, 231, 194));

        Menumantenimiento.setBackground(new java.awt.Color(255, 231, 194));
        Menumantenimiento.setBorder(null);
        Menumantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/departamento-de-ti.png"))); // NOI18N
        Menumantenimiento.setText("Mantenimientos");

        mantenimUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/user_10613751_2.png"))); // NOI18N
        mantenimUsuarios.setText("a) De usuarios");
        mantenimUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimUsuariosActionPerformed(evt);
            }
        });
        Menumantenimiento.add(mantenimUsuarios);

        mantenimCatalogo.setText("b) De catalogo de cuentas");
        mantenimCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimCatalogoActionPerformed(evt);
            }
        });
        Menumantenimiento.add(mantenimCatalogo);

        barramenu.add(Menumantenimiento);

        menumovimiento.setBackground(new java.awt.Color(255, 231, 194));
        menumovimiento.setBorder(null);
        menumovimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ingenieria.png"))); // NOI18N
        menumovimiento.setText("Movimiento");

        mantenimTransacc.setText("De Transacciones");
        mantenimTransacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimTransaccActionPerformed(evt);
            }
        });
        menumovimiento.add(mantenimTransacc);

        barramenu.add(menumovimiento);

        menuprocesos.setBackground(new java.awt.Color(255, 231, 194));
        menuprocesos.setBorder(null);
        menuprocesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/procesamiento-de-archivos.png"))); // NOI18N
        menuprocesos.setText("Procesos");

        cierreDPF.setText("a) Cierre de Diario por Fecha");
        menuprocesos.add(cierreDPF);

        cierreFAF.setText("b) Cierre de fin de año fiscal por fecha año fiscal");
        menuprocesos.add(cierreFAF);

        barramenu.add(menuprocesos);

        menuconsultas.setBackground(new java.awt.Color(255, 231, 194));
        menuconsultas.setBorder(null);
        menuconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/descompostura.png"))); // NOI18N
        menuconsultas.setText("Consultas");
        menuconsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cCatCuentas.setText("a) De Catálogo de Cuenta");
        menuconsultas.add(cCatCuentas);

        cTransFecha.setText("b) De Transacciones por Fecha");
        menuconsultas.add(cTransFecha);

        cTransRangF.setText("c) De Transacciones por rango de fechas");
        menuconsultas.add(cTransRangF);

        cTransDoc.setText("d) De Transacciones por Documento");
        menuconsultas.add(cTransDoc);

        cTransTipoDoc.setText("e) De Transacciones por Tipo de Documento");
        menuconsultas.add(cTransTipoDoc);

        cBalanzaGen.setText("f) Balanza General (Activos, pasivo, capital)");
        menuconsultas.add(cBalanzaGen);

        cBalanzaComp.setText("g) Balanza de Comprobacion ");
        menuconsultas.add(cBalanzaComp);

        cResumen.setText("h) Resumen de Gastos Generales");
        menuconsultas.add(cResumen);

        cEstadosGan.setText("i) Estado de Ganancias y Perdidas ");
        menuconsultas.add(cEstadosGan);

        barramenu.add(menuconsultas);

        terminarmenu.setBackground(new java.awt.Color(255, 231, 194));
        terminarmenu.setBorder(null);
        terminarmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tuerca-removebg-preview.png"))); // NOI18N
        terminarmenu.setText("Terminar");

        tCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-sesion-removebg-preview-removebg-preview.png"))); // NOI18N
        tCerrarSesion.setText("Cerrar Sesión");
        tCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCerrarSesionActionPerformed(evt);
            }
        });
        terminarmenu.add(tCerrarSesion);

        tSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salida-removebg-preview.png"))); // NOI18N
        tSalir.setText("Salir");
        tSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSalirActionPerformed(evt);
            }
        });
        terminarmenu.add(tSalir);

        barramenu.add(terminarmenu);

        setJMenuBar(barramenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void configurarPermisosMenu() {  
    if ("Normal".equalsIgnoreCase(nivelAccesoUsuario)) {
        mantenimUsuarios.setEnabled(false);
        menuprocesos.setEnabled(false);
    }
}
    
    private void mantenimUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimUsuariosActionPerformed
         FrmMantenimientoUsuario frmUsuario = new FrmMantenimientoUsuario(); 
    frmUsuario.setLocationRelativeTo(null); 
    frmUsuario.setVisible(true);       
    }//GEN-LAST:event_mantenimUsuariosActionPerformed

    private void mantenimCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimCatalogoActionPerformed
    FrmCatalogoCuentas catalogo = new FrmCatalogoCuentas();
    catalogo.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    catalogo.setVisible(true);
    catalogo.setLocationRelativeTo(null);
    }//GEN-LAST:event_mantenimCatalogoActionPerformed

    private void tCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCerrarSesionActionPerformed
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(this, "¿Está seguro que desea cerrar la sesión?", "Cerrar Sesión", javax.swing.JOptionPane.YES_NO_OPTION);

    if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        this.dispose(); 
        try {
            Login login = new Login();  
            login.setVisible(true);
        } catch (Exception e) {
            logger.log(java.util.logging.Level.SEVERE, "Error al abrir el Login.", e);
        }
    } 
    }//GEN-LAST:event_tCerrarSesionActionPerformed
   
    private void tSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSalirActionPerformed
    int respuesta = javax.swing.JOptionPane.showConfirmDialog( this, "¿Está seguro que desea salir del sistema?", "Salir",javax.swing.JOptionPane.YES_NO_OPTION);

    if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);
    } 
    }//GEN-LAST:event_tSalirActionPerformed

    private void mantenimTransaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimTransaccActionPerformed
     MovimientoTransacciones movimiento = new MovimientoTransacciones();
     movimiento.setLocationRelativeTo(null);
     movimiento.setVisible(true);    
    }//GEN-LAST:event_mantenimTransaccActionPerformed

    public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(() -> new PrincipalMenu("admin").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menumantenimiento;
    private javax.swing.JPanel Panelfondo;
    private javax.swing.JMenuBar barramenu;
    private javax.swing.JMenuItem cBalanzaComp;
    private javax.swing.JMenuItem cBalanzaGen;
    private javax.swing.JMenuItem cCatCuentas;
    private javax.swing.JMenuItem cEstadosGan;
    private javax.swing.JMenuItem cResumen;
    private javax.swing.JMenuItem cTransDoc;
    private javax.swing.JMenuItem cTransFecha;
    private javax.swing.JMenuItem cTransRangF;
    private javax.swing.JMenuItem cTransTipoDoc;
    private javax.swing.JMenuItem cierreDPF;
    private javax.swing.JMenuItem cierreFAF;
    private javax.swing.JLabel logolabel;
    private javax.swing.JMenuItem mantenimCatalogo;
    private javax.swing.JMenuItem mantenimTransacc;
    private javax.swing.JMenuItem mantenimUsuarios;
    private javax.swing.JMenu menuconsultas;
    private javax.swing.JMenu menumovimiento;
    private javax.swing.JMenu menuprocesos;
    private javax.swing.JMenuItem tCerrarSesion;
    private javax.swing.JMenuItem tSalir;
    private javax.swing.JMenu terminarmenu;
    // End of variables declaration//GEN-END:variables
}
