
package prototiposistemacontable;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FrmCatalogoCuentas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCatalogoCuentas.class.getName());
     private ManejoArchivo manejo = new ManejoArchivo();
     private String lineaAntigua = "";
    
    public FrmCatalogoCuentas() {
        initComponents();
        tipogrupo.add(genboton); // Cuenta General
        tipogrupo.add(detboton); // Cuenta Detalle
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        if (debitoacumcampo != null) debitoacumcampo.setEditable(false);
        if (creditoacumcampo != null) creditoacumcampo.setEditable(false);
        if (balancecampo != null) balancecampo.setEditable(false);
        limpiarCamposCompletos();
        cargarTablaCuentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipogrupo = new javax.swing.ButtonGroup();
        panelbase = new javax.swing.JPanel();
        grupocombo = new javax.swing.JComboBox<>();
        genboton = new javax.swing.JRadioButton();
        detboton = new javax.swing.JRadioButton();
        buscarBoton = new javax.swing.JButton();
        Modificarboton = new javax.swing.JButton();
        crearBoton = new javax.swing.JButton();
        limpiarBoton = new javax.swing.JButton();
        salirboton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblnumcuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nrocuentacampo = new javax.swing.JTextField();
        nombrecampo = new javax.swing.JTextField();
        lblnivel = new javax.swing.JLabel();
        nivelcampo = new javax.swing.JTextField();
        lblpadre = new javax.swing.JLabel();
        cuentapadrecampo = new javax.swing.JTextField();
        lblgrupo = new javax.swing.JLabel();
        lbldebacu = new javax.swing.JLabel();
        lblcredacu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        debitoacumcampo = new javax.swing.JTextField();
        creditoacumcampo = new javax.swing.JTextField();
        balancecampo = new javax.swing.JTextField();
        estadolabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblfecha = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCuentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento Catalogo de Cuentas");

        panelbase.setBackground(new java.awt.Color(243, 197, 127));

        grupocombo.setBackground(new java.awt.Color(2, 53, 54));
        grupocombo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        grupocombo.setForeground(new java.awt.Color(255, 231, 194));
        grupocombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital", "Ingresos", "Costos", "Gastos" }));
        grupocombo.setBorder(null);
        grupocombo.setEnabled(false);

        genboton.setBackground(new java.awt.Color(243, 197, 127));
        genboton.setText("Cuenta General");
        genboton.setEnabled(false);
        genboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genbotonActionPerformed(evt);
            }
        });

        detboton.setBackground(new java.awt.Color(243, 197, 127));
        detboton.setText("Cuenta Detalle");
        detboton.setEnabled(false);

        buscarBoton.setBackground(new java.awt.Color(2, 53, 54));
        buscarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscarBoton.setForeground(new java.awt.Color(255, 231, 194));
        buscarBoton.setText("Buscar");
        buscarBoton.setBorder(null);
        buscarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarBotonMouseExited(evt);
            }
        });
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        Modificarboton.setBackground(new java.awt.Color(2, 53, 54));
        Modificarboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Modificarboton.setForeground(new java.awt.Color(255, 231, 194));
        Modificarboton.setText("Modificar");
        Modificarboton.setBorder(null);
        Modificarboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificarbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificarbotonMouseExited(evt);
            }
        });
        Modificarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarbotonActionPerformed(evt);
            }
        });

        crearBoton.setBackground(new java.awt.Color(2, 53, 54));
        crearBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crearBoton.setForeground(new java.awt.Color(255, 231, 194));
        crearBoton.setText("Crear");
        crearBoton.setBorder(null);
        crearBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearBotonMouseExited(evt);
            }
        });
        crearBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBotonActionPerformed(evt);
            }
        });

        limpiarBoton.setBackground(new java.awt.Color(2, 53, 54));
        limpiarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        limpiarBoton.setForeground(new java.awt.Color(255, 231, 194));
        limpiarBoton.setText("Limpiar");
        limpiarBoton.setBorder(null);
        limpiarBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                limpiarBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                limpiarBotonMouseExited(evt);
            }
        });
        limpiarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBotonActionPerformed(evt);
            }
        });

        salirboton.setBackground(new java.awt.Color(2, 53, 54));
        salirboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salirboton.setForeground(new java.awt.Color(255, 231, 194));
        salirboton.setText("Salir");
        salirboton.setBorder(null);
        salirboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirbotonMouseExited(evt);
            }
        });
        salirboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbotonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo:");

        lblnumcuenta.setText("Numero de cuenta:");

        jLabel2.setText("Nombre de la cuenta:");

        nrocuentacampo.setBorder(null);

        nombrecampo.setBorder(null);
        nombrecampo.setEnabled(false);

        lblnivel.setText("Nivel:");

        nivelcampo.setBorder(null);
        nivelcampo.setEnabled(false);

        lblpadre.setText("Cuenta Padre:");

        cuentapadrecampo.setBorder(null);
        cuentapadrecampo.setEnabled(false);

        lblgrupo.setText("Grupo:");

        lbldebacu.setText("Debito acumulado");

        lblcredacu.setText("Credito Acumulado");

        jLabel5.setText("Balance");

        debitoacumcampo.setBorder(null);
        debitoacumcampo.setEnabled(false);

        creditoacumcampo.setBorder(null);
        creditoacumcampo.setEnabled(false);

        balancecampo.setEditable(false);
        balancecampo.setBackground(new java.awt.Color(255, 255, 255));
        balancecampo.setBorder(null);
        balancecampo.setEnabled(false);

        estadolabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estadolabel.setForeground(new java.awt.Color(2, 53, 54));
        estadolabel.setText("CUENTAS");

        jSeparator1.setBackground(new java.awt.Color(243, 197, 127));
        jSeparator1.setForeground(new java.awt.Color(2, 53, 54));

        lblfecha.setText("Fecha");

        jLabel3.setText("Hora");

        jTablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro_Cuenta", "Descripcion_Cta", "Tipo_Cta", "Nivel_Cta", "Cta_Padre", "Grupo_Cta", "Fecha_Creacion_Cta", "Hora_Creacion_Cta", "Debito_Acum_Cta", "Credito_Acum_Cta", "Balance_Cta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaCuentas);

        javax.swing.GroupLayout panelbaseLayout = new javax.swing.GroupLayout(panelbase);
        panelbase.setLayout(panelbaseLayout);
        panelbaseLayout.setHorizontalGroup(
            panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbaseLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumcuenta)
                                    .addComponent(nrocuentacampo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(nombrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnivel)
                                    .addComponent(nivelcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpadre)
                                    .addComponent(cuentapadrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addComponent(lbldebacu)
                                        .addGap(67, 67, 67)
                                        .addComponent(lblcredacu)
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel5)
                                        .addGap(147, 147, 147)
                                        .addComponent(jLabel1))
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addComponent(debitoacumcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(creditoacumcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(balancecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(detboton)
                                    .addComponent(genboton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgrupo)
                            .addComponent(grupocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(lblfecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estadolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelbaseLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(buscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Modificarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(crearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)))
                        .addGap(40, 40, 40))))
        );
        panelbaseLayout.setVerticalGroup(
            panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbaseLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(estadolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(lblnivel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nivelcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(nombrecampo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(37, 37, 37)))
                        .addGap(42, 42, 42)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldebacu)
                            .addComponent(lblcredacu)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(genboton)
                            .addComponent(lblfecha)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(creditoacumcampo)
                                .addComponent(balancecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(detboton)
                                .addComponent(jLabel3)
                                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(debitoacumcampo, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                                .addComponent(lblnumcuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nrocuentacampo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(lblgrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grupocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(lblpadre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cuentapadrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBotonActionPerformed
        
        String nroCta = nrocuentacampo.getText().trim();
        String descripcion = nombrecampo.getText().trim();
        String nivelCta = nivelcampo.getText().trim();
        String ctaPadre = cuentapadrecampo.getText().trim();
        String grupoCta = grupocombo.getSelectedItem().toString().trim();

        String tipoCta = "";
        if (genboton.isSelected()) tipoCta = "General";
        else if (detboton.isSelected()) tipoCta = "Detalle";
        if (nroCta.isEmpty() || descripcion.isEmpty() || nivelCta.isEmpty() || ctaPadre.isEmpty() || grupoCta.isEmpty() || tipoCta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos obligatorios.", "Error de Validación", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean opcion = manejo.crearCuenta(nroCta, descripcion, tipoCta, nivelCta, ctaPadre, grupoCta);
        if (opcion){
            limpiarCamposCompletos();  
            setEnabledFalseCampos();
        } 
    }//GEN-LAST:event_crearBotonActionPerformed

    private void ModificarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarbotonActionPerformed
        if (lineaAntigua.isEmpty() || !Modificarboton.isEnabled()) {
            JOptionPane.showMessageDialog(this, "No hay cuenta cargada o la modificación no está permitida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nroCta = nrocuentacampo.getText().trim();
        String descripcion = nombrecampo.getText().trim();
        String nivelCta = nivelcampo.getText().trim();
        String ctaPadre = cuentapadrecampo.getText().trim();
        String grupoCta = grupocombo.getSelectedItem().toString().trim();

        String tipoCta = "";
        if (genboton.isSelected()) tipoCta = "General";
        else if (detboton.isSelected()) tipoCta = "Detalle";

        String[] partesAntiguas = lineaAntigua.split(";");
        String fechaCreacion = partesAntiguas[6];
        String horaCreacion = partesAntiguas[7];
        String debitoAcum = partesAntiguas[8];
        String creditoAcum = partesAntiguas[9];
        String balance = partesAntiguas[10];

        String nuevaLinea =
        nroCta + ";" +
        descripcion + ";" +
        tipoCta + ";" +
        nivelCta + ";" +
        ctaPadre + ";" +
        grupoCta + ";" +
        fechaCreacion + ";" +
        horaCreacion + ";" +
        debitoAcum + ";" +
        creditoAcum + ";" +
        balance + ";";
        boolean opcion = manejo.modificarDoc(lineaAntigua, nuevaLinea, 0);
        if (opcion){
            limpiarCamposCompletos();  
            setEnabledFalseCampos();
        } 
    }//GEN-LAST:event_ModificarbotonActionPerformed

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed

        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);

        String nroCta = nrocuentacampo.getText().trim();

        if (nroCta.isEmpty() || nroCta.equals("No. Cuenta")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el Número de Cuenta para buscar.");
            nrocuentacampo.requestFocus();
            return;
        }
        lineaAntigua = manejo.lecturaCuenta(nroCta);

        if (!lineaAntigua.isEmpty()) { // modifica la cuenta si existe
            String[] partes = lineaAntigua.split(";");

            nombrecampo.setText(partes[1].trim());
            nivelcampo.setText(partes[3].trim());
            cuentapadrecampo.setText(partes[4].trim());
            grupocombo.setSelectedItem(partes[5].trim()); // Grupo

            if (partes[2].trim().equalsIgnoreCase("general")) {
                genboton.setSelected(true); // Cuenta General
            } else {
                detboton.setSelected(true); // Cuenta Detalle
            }
            if (balancecampo != null) {
                debitoacumcampo.setText(partes[8].trim());
                creditoacumcampo.setText(partes[9].trim());
                balancecampo.setText(partes[10].trim());
            }
            try {
                double balance = Double.parseDouble(partes[10].trim());
                if (balance != 0.0) {
                    JOptionPane.showMessageDialog(this, "Cuenta con Balance (" + balance + "). Modificación NO permitida.");

                } else {
                    JOptionPane.showMessageDialog(this, "Cuenta encontrada. Puede modificar cuenta.");
                    estadolabel.setText("MODIFICANDO CUENTA");
                    Modificarboton.setEnabled(true);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error de formato de Balance.", "Error Interno", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cuenta no encontrada. Puede crear nueva cuenta.");
            estadolabel.setText("CREANDO CUENTA");
            nombrecampo.setText("");
            nivelcampo.setText("");
            cuentapadrecampo.setText("");
            grupocombo.setSelectedIndex(0);
            tipogrupo.clearSelection();
            crearBoton.setEnabled(true);
            nrocuentacampo.setEditable(true);
        }
            setEnabledCampos();
            buscarBoton.setEnabled(false);
    }//GEN-LAST:event_buscarBotonActionPerformed

    private void salirbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbotonActionPerformed
          this.dispose();       
    }//GEN-LAST:event_salirbotonActionPerformed

    private void limpiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonActionPerformed
        buscarBoton.setEnabled(true);
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        limpiarCamposCompletos();
        setEnabledFalseCampos();
    }//GEN-LAST:event_limpiarBotonActionPerformed

    private void buscarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        buscarBoton.setBackground(new Color(hexbg));
        buscarBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_buscarBotonMouseEntered

    private void ModificarbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarbotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        Modificarboton.setBackground(new Color(hexbg));
        Modificarboton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_ModificarbotonMouseEntered

    private void crearBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        crearBoton.setBackground(new Color(hexbg));
        crearBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_crearBotonMouseEntered

    private void limpiarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        limpiarBoton.setBackground(new Color(hexbg));
        limpiarBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_limpiarBotonMouseEntered

    private void salirbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbotonMouseEntered
        int hexbg = Integer.parseInt("ffe7c2", 16);
        int hexfg = Integer.parseInt("023536", 16);
        salirboton.setBackground(new Color(hexbg));
        salirboton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_salirbotonMouseEntered

    private void buscarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarBotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        buscarBoton.setBackground(new Color(hexbg));
        buscarBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_buscarBotonMouseExited

    private void ModificarbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarbotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        Modificarboton.setBackground(new Color(hexbg));
        Modificarboton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_ModificarbotonMouseExited

    private void crearBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        crearBoton.setBackground(new Color(hexbg));
        crearBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_crearBotonMouseExited

    private void limpiarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        limpiarBoton.setBackground(new Color(hexbg));
        limpiarBoton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_limpiarBotonMouseExited

    private void salirbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbotonMouseExited
        int hexbg = Integer.parseInt("023536", 16);
        int hexfg = Integer.parseInt("ffe7c2", 16);
        salirboton.setBackground(new Color(hexbg));
        salirboton.setForeground(new Color(hexfg));
    }//GEN-LAST:event_salirbotonMouseExited

    private void genbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genbotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genbotonActionPerformed
     
     private void limpiarCamposCompletos() {
        estadolabel.setText("CUENTAS");
        nrocuentacampo.setText("");
        nrocuentacampo.setEditable(true); 
        
        nombrecampo.setText("");
        nivelcampo.setText("");
        cuentapadrecampo.setText("");
        grupocombo.setSelectedIndex(0); // El combo de Grupos (Activo, Pasivo, etc.)
        tipogrupo.clearSelection(); // Deseleccionar radio buttons

        if (debitoacumcampo != null) debitoacumcampo.setText("");
        if (creditoacumcampo != null) creditoacumcampo.setText("");
        if (balancecampo != null) balancecampo.setText("");
       
        lineaAntigua = "";
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        nrocuentacampo.requestFocus();
        buscarBoton.setEnabled(true);
    }
     
     private void setEnabledFalseCampos(){
            nombrecampo.setEnabled(false);
            nivelcampo.setEnabled(false);
            genboton.setEnabled(false);
            detboton.setEnabled(false);
            debitoacumcampo.setEnabled(false);
            creditoacumcampo.setEnabled(false);
            balancecampo.setEnabled(false);
            cuentapadrecampo.setEnabled(false);
            grupocombo.setEnabled(false);
     }
     
     private void setEnabledCampos(){
            nombrecampo.setEnabled(true);
            nivelcampo.setEnabled(true);
            genboton.setEnabled(true);
            detboton.setEnabled(true);
            debitoacumcampo.setEnabled(true);
            creditoacumcampo.setEnabled(true);
            balancecampo.setEnabled(true);
            cuentapadrecampo.setEnabled(true);
            grupocombo.setEnabled(true);
     }
     
     
    private void cargarTablaCuentas() {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("Nro. Cta");
    modelo.addColumn("Descripción");
    modelo.addColumn("Tipo");
    modelo.addColumn("Nivel");
    modelo.addColumn("Cta Padre");
    modelo.addColumn("Grupo");
    modelo.addColumn("Fecha");
    modelo.addColumn("Hora");
    modelo.addColumn("Débito");
    modelo.addColumn("Crédito");
    modelo.addColumn("Balance");
    
    jTablaCuentas.setModel(modelo);

    String rutaArchivo = "Cuentas.txt"; 
    String separador = ";"; 
    
    try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(separador);
            
            if (datos.length >= 11) { 
                Object[] fila = new Object[11];
                fila[0] = Integer.valueOf(datos[0]); // Nro_Cta (Integer)
                fila[1] = datos[1];                  // Descripcion (String)
                fila[2] = datos[2];                  // Tipo_Cta (String/Boolean)
                fila[3] = Integer.valueOf(datos[3]); // Nivel_Cta (Integer)
                fila[4] = Integer.valueOf(datos[4]); // Cta_Padre (Integer)
                fila[5] = (datos[5]); // Grupo_Cta (Integer)
                fila[6] = datos[6];                  // Fecha (Date/String)
                fila[7] = datos[7];                  // Hora (Time/String)
                fila[8] = Double.valueOf(datos[8]);  // Debito_Acum (Double)
                fila[9] = Double.valueOf(datos[9]);  // Credito_Acum (Double)
                fila[10] = Double.valueOf(datos[10]); // Balance (Double)
                
                modelo.addRow(fila);
            }
        }
    } catch (IOException e) {
        System.err.println("Error al cargar las cuentas: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.err.println("Error de formato numérico en el archivo: " + e.getMessage());
        javax.swing.JOptionPane.showMessageDialog(null, "Error: Un dato numérico en Cuentas.txt no es válido.", "Error de Datos", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
}
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmCatalogoCuentas().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificarboton;
    private javax.swing.JTextField balancecampo;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JButton crearBoton;
    private javax.swing.JTextField creditoacumcampo;
    private javax.swing.JTextField cuentapadrecampo;
    private javax.swing.JTextField debitoacumcampo;
    private javax.swing.JRadioButton detboton;
    private javax.swing.JLabel estadolabel;
    private javax.swing.JRadioButton genboton;
    private javax.swing.JComboBox<String> grupocombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablaCuentas;
    private javax.swing.JLabel lblcredacu;
    private javax.swing.JLabel lbldebacu;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblgrupo;
    private javax.swing.JLabel lblnivel;
    private javax.swing.JLabel lblnumcuenta;
    private javax.swing.JLabel lblpadre;
    private javax.swing.JButton limpiarBoton;
    private javax.swing.JTextField nivelcampo;
    private javax.swing.JTextField nombrecampo;
    private javax.swing.JTextField nrocuentacampo;
    private javax.swing.JPanel panelbase;
    private javax.swing.JButton salirboton;
    private javax.swing.ButtonGroup tipogrupo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txthora;
    // End of variables declaration//GEN-END:variables
}
