
package prototiposistemacontable;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FrmCatalogoCuentas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmCatalogoCuentas.class.getName());
    private  final ManejoArchivo manejo = new ManejoArchivo();
     private String lineaAntigua = "";
    
    public FrmCatalogoCuentas() {
        initComponents();
        setLocationRelativeTo(null);
        
        tipogrupo.add(genboton);
        tipogrupo.add(detboton);
        
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        
        if (debitoacumcampo != null) 
            debitoacumcampo.setEditable(false);
        if (creditoacumcampo != null) 
            creditoacumcampo.setEditable(false);
        if (balancecampo != null) 
            balancecampo.setEditable(false);
        
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
        tablacuentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento Catalogo de Cuentas");
        setUndecorated(true);

        panelbase.setBackground(new java.awt.Color(255, 231, 194));

        grupocombo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        grupocombo.setForeground(new java.awt.Color(2, 53, 54));
        grupocombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Pasivo", "Capital", "Ingresos", "Costos", "Gastos" }));
        grupocombo.setBorder(null);
        grupocombo.setEnabled(false);

        genboton.setBackground(new java.awt.Color(255, 231, 194));
        genboton.setText("Cuenta General");
        genboton.setEnabled(false);
        genboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genbotonActionPerformed(evt);
            }
        });

        detboton.setBackground(new java.awt.Color(255, 231, 194));
        detboton.setText("Cuenta Detalle");
        detboton.setEnabled(false);

        Modificarboton.setBackground(new java.awt.Color(2, 53, 54));
        Modificarboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Modificarboton.setForeground(new java.awt.Color(255, 231, 194));
        Modificarboton.setText("Modificar");
        Modificarboton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        crearBoton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        limpiarBoton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        salirboton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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

        jLabel2.setText("Descripción:");

        nrocuentacampo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        nrocuentacampo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        nrocuentacampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nrocuentacampoActionPerformed(evt);
            }
        });

        nombrecampo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        nombrecampo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        nombrecampo.setEnabled(false);

        lblnivel.setText("Nivel:");

        nivelcampo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        nivelcampo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        nivelcampo.setEnabled(false);

        lblpadre.setText("Cuenta Padre:");

        cuentapadrecampo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        cuentapadrecampo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        cuentapadrecampo.setEnabled(false);

        lblgrupo.setText("Grupo:");

        lbldebacu.setText("Debito acumulado");

        lblcredacu.setText("Credito Acumulado");

        jLabel5.setText("Balance");
        jLabel5.setEnabled(false);

        debitoacumcampo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        debitoacumcampo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        debitoacumcampo.setEnabled(false);

        creditoacumcampo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        creditoacumcampo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        creditoacumcampo.setEnabled(false);

        balancecampo.setEditable(false);
        balancecampo.setBackground(new java.awt.Color(255, 255, 255));
        balancecampo.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        balancecampo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        balancecampo.setEnabled(false);

        estadolabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estadolabel.setForeground(new java.awt.Color(2, 53, 54));
        estadolabel.setText("CUENTAS");

        jSeparator1.setBackground(new java.awt.Color(243, 197, 127));
        jSeparator1.setForeground(new java.awt.Color(2, 53, 54));

        lblfecha.setText("Fecha");
        lblfecha.setEnabled(false);

        txtfecha.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        txtfecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtfecha.setEnabled(false);

        jLabel3.setText("Hora");
        jLabel3.setEnabled(false);

        txthora.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        txthora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txthora.setEnabled(false);

        tablacuentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablacuentas);

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
                                    .addComponent(lbldebacu)
                                    .addComponent(debitoacumcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(creditoacumcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcredacu))
                                .addGap(67, 67, 67)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelbaseLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(177, 177, 177)
                                        .addComponent(jLabel1))
                                    .addComponent(balancecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(detboton)
                                    .addComponent(genboton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgrupo)
                            .addComponent(grupocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panelbaseLayout.createSequentialGroup()
                                    .addComponent(lblfecha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtfecha))
                                .addGroup(panelbaseLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(Modificarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(crearBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(40, 40, 40))
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                .addComponent(nombrecampo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
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
                                .addComponent(balancecampo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(detboton)
                                .addComponent(jLabel3)
                                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(debitoacumcampo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditoacumcampo, javax.swing.GroupLayout.Alignment.LEADING)))
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
            .addComponent(panelbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBotonActionPerformed
        
        String nroCta = nrocuentacampo.getText().trim();
        String descripcion = nombrecampo.getText().trim();
        String nivelCta = nivelcampo.getText().trim();
        String ctaPadre = cuentapadrecampo.getText().trim();
        String grupoCta = grupocombo.getSelectedItem().toString().trim();

        String tipoCta;
        if (genboton.isSelected()) 
            tipoCta = "General";
        else 
            tipoCta = "Detalle";
        
        if (nroCta.isEmpty() || descripcion.isEmpty() || nivelCta.isEmpty() || ctaPadre.isEmpty() || grupoCta.isEmpty() || tipoCta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos obligatorios.");
            return;
        }
        
        String linea = manejo.crearCuenta(nroCta, descripcion, tipoCta, nivelCta, ctaPadre, grupoCta);
        if (!linea.equals("")){
            String[] partes = linea.split(";");
            
            nroCta = partes[0].trim();
            descripcion = partes[1].trim();
            tipoCta = partes[2].trim();
            nivelCta = partes[3].trim();
            ctaPadre = partes[4].trim();
            grupoCta = partes[5].trim();
            String fecha = partes[6].trim();
            String hora = partes[7].trim();
            String deb = partes[8].trim();
            String cr = partes[9].trim();
            String balance = partes[10].trim();
            
            agregarFilaEnTabla(-1, nroCta, descripcion, tipoCta, nivelCta, ctaPadre, grupoCta, fecha, hora,
                              deb, cr, balance);
                               
            limpiarCamposCompletos();  
            setEnabledFalseCampos();
        } 
    }//GEN-LAST:event_crearBotonActionPerformed

    private void ModificarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarbotonActionPerformed
    if (lineaAntigua.isEmpty() || !Modificarboton.isEnabled()) {
        JOptionPane.showMessageDialog(null, "No hay cuenta cargada o la modificación no está permitida.");
        return;
    }

    String nroCta = nrocuentacampo.getText().trim();
    String descripcion = nombrecampo.getText().trim();
    String nivelCta = nivelcampo.getText().trim();
    String ctaPadre = cuentapadrecampo.getText().trim();
    String grupoCta = grupocombo.getSelectedItem().toString().trim();

    String tipoCta;
    if (genboton.isSelected()) 
        tipoCta = "General";
    else 
        tipoCta = "Detalle";

    String[] partesAntiguas = lineaAntigua.split(";");
    String fechaCreacion = partesAntiguas[6];
    String horaCreacion = partesAntiguas[7];
    String debitoAcum = partesAntiguas[8];
    String creditoAcum = partesAntiguas[9];
    String balance = partesAntiguas[10];

    String nuevaLinea = nroCta + ";" + descripcion + ";" + tipoCta + ";" + nivelCta + ";" + ctaPadre + ";" +
                        grupoCta + ";" + fechaCreacion + ";" + horaCreacion + ";" + debitoAcum + ";" + creditoAcum + ";" + balance+ ";";
    
    String linea = manejo.modificarDoc(lineaAntigua, nuevaLinea);
    
    if (!linea.equals("")) {
        String[] datos = linea.split("\\|");
        int valor = Integer.parseInt(datos[0].trim());
        String lineamod = datos[1].trim();
        String[] partes = lineamod.split(";");

        nroCta = partes[0].trim();
        descripcion = partes[1].trim();
        tipoCta = partes[2].trim();
        nivelCta = partes[3].trim();
        ctaPadre = partes[4].trim();
        grupoCta = partes[5].trim();
        String fecha = partes[6].trim();
        String hora = partes[7].trim();
        String deb = partes[8].trim();
        String cr = partes[9].trim();
        String balanceNuevo = partes[10].trim();

        agregarFilaEnTabla(valor, nroCta, descripcion, tipoCta, nivelCta, ctaPadre, grupoCta, fecha, hora, deb, cr, balanceNuevo);

        limpiarCamposCompletos();  
        setEnabledFalseCampos();
        Modificarboton.setEnabled(false);
    } 
    }//GEN-LAST:event_ModificarbotonActionPerformed

    private void salirbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbotonActionPerformed
          this.dispose();       
    }//GEN-LAST:event_salirbotonActionPerformed

    private void limpiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonActionPerformed
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        limpiarCamposCompletos();
        setEnabledFalseCampos();
    }//GEN-LAST:event_limpiarBotonActionPerformed

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

    private void nrocuentacampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nrocuentacampoActionPerformed
        
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);

        String nroCta = nrocuentacampo.getText().trim();

        if (nroCta.isEmpty() || nroCta.equals("No. Cuenta")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el Número de Cuenta para buscar.");
        }
        
        lineaAntigua = manejo.lecturaCuenta(nroCta);

        if (!lineaAntigua.isEmpty()) {
            String[] partes = lineaAntigua.split(";");

            nombrecampo.setText(partes[1].trim());
            nivelcampo.setText(partes[3].trim());
            cuentapadrecampo.setText(partes[4].trim());
            grupocombo.setSelectedItem(partes[5].trim());

            if (partes[2].trim().equalsIgnoreCase("general")) {
                genboton.setSelected(true);
            } else {
                detboton.setSelected(true);
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
    }//GEN-LAST:event_nrocuentacampoActionPerformed
     
     private void limpiarCamposCompletos() {
        estadolabel.setText("CUENTAS");
        nrocuentacampo.setText("");
        nrocuentacampo.setEditable(true); 
        
        nombrecampo.setText("");
        nivelcampo.setText("");
        cuentapadrecampo.setText("");
        grupocombo.setSelectedIndex(0);
        tipogrupo.clearSelection();

        if (debitoacumcampo != null) debitoacumcampo.setText("");
        if (creditoacumcampo != null) creditoacumcampo.setText("");
        if (balancecampo != null) balancecampo.setText("");
       
        lineaAntigua = "";
        Modificarboton.setEnabled(false);
        crearBoton.setEnabled(false);
        nrocuentacampo.requestFocus();
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
     
    DefaultTableModel tablaCuentas = new DefaultTableModel();
    private void cargarTablaCuentas() {
    
    tablaCuentas.addColumn("Nro. Cta");
    tablaCuentas.addColumn("Descripción");
    tablaCuentas.addColumn("Tipo");
    tablaCuentas.addColumn("Nivel");
    tablaCuentas.addColumn("Cta Padre");
    tablaCuentas.addColumn("Grupo");
    tablaCuentas.addColumn("Fecha");
    tablaCuentas.addColumn("Hora");
    tablaCuentas.addColumn("Débito");
    tablaCuentas.addColumn("Crédito");
    tablaCuentas.addColumn("Balance");
    
    tablacuentas.setModel(tablaCuentas);

    try (BufferedReader br = new BufferedReader(new FileReader("src/Cuentas.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            
            if (datos.length >= 11) { 
                Object[] fila = new Object[11];
                fila[0] = Integer.valueOf(datos[0]); // Nro_Cta (Integer)
                fila[1] = datos[1];                  // Descripcion (String)
                fila[2] = datos[2];                  // Tipo_Cta (String/Boolean)
                fila[3] = Integer.valueOf(datos[3]); // Nivel_Cta (Integer)
                fila[4] = Integer.valueOf(datos[4]); // Cta_Padre (Integer)
                fila[5] = (datos[5]);                // Grupo_Cta (Integer)
                fila[6] = datos[6];                  // Fecha (Date/String)
                fila[7] = datos[7];                  // Hora (Time/String)
                fila[8] = Double.valueOf(datos[8]);  // Debito_Acum (Double)
                fila[9] = Double.valueOf(datos[9]);  // Credito_Acum (Double)
                fila[10] = Double.valueOf(datos[10]); // Balance (Double)
                
                tablaCuentas.addRow(fila);
            }
        }
    } 
    catch (IOException e) {
        System.err.println("Error al cargar las cuentas: " + e.getMessage());
    } 
    catch (NumberFormatException e) {
        System.err.println("Error de formato numérico en el archivo: " + e.getMessage());
        javax.swing.JOptionPane.showMessageDialog(null, "Error: Un dato numérico en Cuentas.txt no es válido.", "Error de Datos", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
}
    
    private void agregarFilaEnTabla(int fila, String nro, String nombre, String tipo, String niv,
                                String pad, String clasif, String fecha, String hora, String deb, String cr, String bal) {

    DefaultTableModel model = (DefaultTableModel) tablacuentas.getModel();

    Object[] datos = {nro, nombre, tipo, niv, pad, clasif, fecha, hora, deb, cr, bal};
    if (fila < 0) {
        model.addRow(datos);
        return;
    }
    for (int col = 0; col < datos.length; col++) {
        model.setValueAt(datos[col], fila, col);
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
    private javax.swing.JTable tablacuentas;
    private javax.swing.ButtonGroup tipogrupo;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txthora;
    // End of variables declaration//GEN-END:variables
}
