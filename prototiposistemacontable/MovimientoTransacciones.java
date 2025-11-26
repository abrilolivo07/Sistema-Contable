package prototiposistemacontable;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class MovimientoTransacciones extends javax.swing.JFrame {
     
    private final ManejoArchivo manejo = new ManejoArchivo();
     private String lineaAntigua = "";
     Login user = new Login();
   
    public MovimientoTransacciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelbase = new javax.swing.JPanel();
        nrodocucampo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tipodoclabel = new javax.swing.JLabel();
        autorlabel = new javax.swing.JLabel();
        autorcampo = new javax.swing.JTextField();
        cclabel = new javax.swing.JLabel();
        cccampo = new javax.swing.JTextField();
        fechalabel = new javax.swing.JLabel();
        fechacampo = new javax.swing.JTextField();
        montolabel = new javax.swing.JLabel();
        montocampo = new javax.swing.JTextField();
        tipocombo = new javax.swing.JComboBox<>();
        buscarboton = new javax.swing.JButton();
        modificarboton = new javax.swing.JButton();
        crearboton = new javax.swing.JButton();
        limpiarBoton = new javax.swing.JButton();
        salirboton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movimiento de transacciones");

        panelbase.setBackground(new java.awt.Color(243, 197, 127));

        jLabel1.setText("Numero de documento: ");

        tipodoclabel.setText("Tipo de documento:");

        autorlabel.setText("Hecho por: ");

        autorcampo.setEditable(false);

        cclabel.setText("Cuenta contable: ");

        fechalabel.setText("Fecha:");

        fechacampo.setEditable(false);

        montolabel.setText("Monto: ");

        tipocombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Factura", "Ajuste", "Documento Interno", "Depósito", "Asiento de diario", "Orden de compra", "Cheque", "Abono", "Nota de crédito", "Nota de débito", "Cargo manual" }));

        buscarboton.setBackground(new java.awt.Color(2, 53, 54));
        buscarboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscarboton.setForeground(new java.awt.Color(255, 231, 194));
        buscarboton.setText("Buscar");
        buscarboton.setBorder(null);
        buscarboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarbotonMouseExited(evt);
            }
        });
        buscarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbotonActionPerformed(evt);
            }
        });

        modificarboton.setBackground(new java.awt.Color(2, 53, 54));
        modificarboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modificarboton.setForeground(new java.awt.Color(255, 231, 194));
        modificarboton.setText("Modificar");
        modificarboton.setBorder(null);
        modificarboton.setEnabled(false);
        modificarboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarbotonMouseExited(evt);
            }
        });
        modificarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbotonActionPerformed(evt);
            }
        });

        crearboton.setBackground(new java.awt.Color(2, 53, 54));
        crearboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crearboton.setForeground(new java.awt.Color(255, 231, 194));
        crearboton.setText("Crear");
        crearboton.setBorder(null);
        crearboton.setEnabled(false);
        crearboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearbotonMouseExited(evt);
            }
        });
        crearboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearbotonActionPerformed(evt);
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

        javax.swing.GroupLayout panelbaseLayout = new javax.swing.GroupLayout(panelbase);
        panelbase.setLayout(panelbaseLayout);
        panelbaseLayout.setHorizontalGroup(
            panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbaseLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addComponent(montolabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(montocampo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nrodocucampo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipodoclabel)
                            .addComponent(cclabel))
                        .addGap(8, 8, 8)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tipocombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cccampo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(autorlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(autorcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelbaseLayout.createSequentialGroup()
                                .addComponent(fechalabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechacampo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(crearboton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        panelbaseLayout.setVerticalGroup(
            panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbaseLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nrodocucampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(montocampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(montolabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbaseLayout.createSequentialGroup()
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tipodoclabel)
                                    .addComponent(tipocombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cclabel)
                                    .addComponent(cccampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54))))
                    .addGroup(panelbaseLayout.createSequentialGroup()
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechacampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechalabel))
                        .addGap(32, 32, 32)
                        .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(autorcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(autorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearboton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
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
        int hexbgEnt = Integer.parseInt("ffe7c2", 16);
        int hexfgEnt = Integer.parseInt("023536", 16);
        int hexfgExt = Integer.parseInt("ffe7c2", 16);
        int hexbgExt = Integer.parseInt("023536", 16);
      
        
    private void limpiarBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBotonMouseEntered
        limpiarBoton.setBackground(new Color(hexbgEnt));
        limpiarBoton.setForeground(new Color(hexfgEnt));
    }//GEN-LAST:event_limpiarBotonMouseEntered

    private void limpiarBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarBotonMouseExited
        limpiarBoton.setBackground(new Color(hexbgExt));
        limpiarBoton.setForeground(new Color(hexfgExt));
    }//GEN-LAST:event_limpiarBotonMouseExited

    private void limpiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonActionPerformed
        buscarboton.setEnabled(true);
        modificarboton.setEnabled(false);
        crearboton.setEnabled(false);
        limpiarCamposCompletos();
        setEnabledFalseCampos();
    }//GEN-LAST:event_limpiarBotonActionPerformed

    private void salirbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbotonMouseEntered
        salirboton.setBackground(new Color(hexbgEnt));
        salirboton.setForeground(new Color(hexfgEnt));
    }//GEN-LAST:event_salirbotonMouseEntered

    private void salirbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbotonMouseExited
        salirboton.setBackground(new Color(hexbgExt));
        salirboton.setForeground(new Color(hexfgExt));
    }//GEN-LAST:event_salirbotonMouseExited

    private void salirbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbotonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirbotonActionPerformed

    private void buscarbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarbotonMouseEntered
        buscarboton.setBackground(new Color(hexbgEnt));
        buscarboton.setForeground(new Color(hexfgEnt));
    }//GEN-LAST:event_buscarbotonMouseEntered

    private void buscarbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarbotonMouseExited
        buscarboton.setBackground(new Color(hexbgExt));
        buscarboton.setForeground(new Color(hexfgExt));
    }//GEN-LAST:event_buscarbotonMouseExited

    private void modificarbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarbotonMouseEntered
        modificarboton.setBackground(new Color(hexbgEnt));
        modificarboton.setForeground(new Color(hexfgEnt));
    }//GEN-LAST:event_modificarbotonMouseEntered

    private void modificarbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarbotonMouseExited
        modificarboton.setBackground(new Color(hexbgExt));
        modificarboton.setForeground(new Color(hexfgExt));
    }//GEN-LAST:event_modificarbotonMouseExited

    private void crearbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearbotonMouseEntered
        crearboton.setBackground(new Color(hexbgEnt));
        crearboton.setForeground(new Color(hexfgEnt));
    }//GEN-LAST:event_crearbotonMouseEntered

    private void crearbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearbotonMouseExited
    crearboton.setBackground(new Color(hexbgExt));
    crearboton.setForeground(new Color(hexfgExt));
    }//GEN-LAST:event_crearbotonMouseExited

    private void buscarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbotonActionPerformed
        if(nrodocucampo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe ingresar el no. de documento.");
        }
        else{ 
            
            lineaAntigua=manejo.busquedaDocTrans(nrodocucampo.getText(), 0);
            if(!lineaAntigua.isEmpty()) {  
                String[] partes = lineaAntigua.split(";");
                
                switch (partes[1].trim()) {
                    case "Factura" -> tipocombo.setSelectedIndex(0);
                    case "Ajuste" -> tipocombo.setSelectedIndex(1);
                    case "Documento Interno" -> tipocombo.setSelectedIndex(2);
                    case "Depósito" -> tipocombo.setSelectedIndex(3);
                    case "Cheque" -> tipocombo.setSelectedIndex(4);
                    default -> tipocombo.setSelectedIndex(5);
                }
                
                cccampo.setText(partes[2].trim());
                montocampo.setText(partes[3].trim());
                fechacampo.setText(partes[4].trim());
                autorcampo.setText(partes[5].trim());
                
                JOptionPane.showConfirmDialog(null, "Cuenta encontrada. Puede Modificar.");
                modificarboton.setEnabled(true);
                buscarboton.setEnabled(false);
            }else JOptionPane.showMessageDialog(null, "Cuenta No encontrada. Puede crear");
            crearboton.setEnabled(true);
            buscarboton.setEnabled(false);
        }
    }//GEN-LAST:event_buscarbotonActionPerformed

    private void crearbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearbotonActionPerformed
    if(nrodocucampo.getText().equals("") || cccampo.getText().equals("") || montocampo.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Debe llenar campos faltantes");
        return; 
    }
    boolean nodoc = manejo.busquedaNoDocTrans(nrodocucampo.getText());
    
    if(nodoc){
        JOptionPane.showMessageDialog(null, "El no. de documento está en uso.");
        return;
    }
    
    if(!cccampo.getText().matches("\\d+")){
        JOptionPane.showMessageDialog(null, "El no. de cuenta solo debe estar compuesto de dígitos.");
        return; 
    }
    
    boolean cuentaExiste = manejo.lecturaCuenta(cccampo.getText(), null);
    if(cuentaExiste){
        
        String montoTexto = montocampo.getText();
        String formatopunto = "^\\d+(\\.\\d+)?$";
        String formatocoma = "^\\d+(,\\d+)?$";
        
        if (montoTexto.matches(formatopunto) || montoTexto.matches(formatocoma)) {
            String montoNormalizado = montoTexto.replace(',', '.');
            
            try {
                double montoNumerico = Double.parseDouble(montoNormalizado);
                if (montoNumerico <= 0) {
                    JOptionPane.showMessageDialog(null, "El monto de la transacción debe ser un valor positivo.");
                    return;
                }
                
                boolean creacion = manejo.crearTransaccion(nrodocucampo.getText(), tipocombo.getSelectedItem().toString(), cccampo.getText(), montoNormalizado, user.user);
                
                if(creacion){
                    limpiarCamposCompletos();
                    setEnabledFalseCampos();
                    JOptionPane.showMessageDialog(null, "Transaccion registrada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo crear.");
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error interno al procesar el valor del monto.");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "El monto ingresado no es un número válido. Use punto o coma decimal si es necesario.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "La cuenta ingresada no existe.");
    }
    }//GEN-LAST:event_crearbotonActionPerformed

    private void modificarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbotonActionPerformed
     if (lineaAntigua.isEmpty() || !modificarboton.isEnabled()) {
            JOptionPane.showMessageDialog(this, "No hay cuenta cargada o la modificación no está permitida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nrodocu = nrodocucampo.getText().trim();
        String tipo = tipocombo.getSelectedItem().toString().trim();
        String cc = cccampo.getText().trim();
        String montoc = montocampo.getText().trim();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateF = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fecha = now.format(dateF);

        String nuevaLinea =
        nrodocu + ";" +
        tipo + ";" +
        cc + ";" +
        montoc + ";" +
        fecha + ";" +
        user + ";";
        
        boolean opcion = manejo.modificarDoc(lineaAntigua, nuevaLinea, 1);
        if (opcion){
            limpiarCamposCompletos();  
            setEnabledFalseCampos();
        } 
        modificarboton.setEnabled(false);
    }//GEN-LAST:event_modificarbotonActionPerformed

        public void setEnabledFalseCampos(){
        fechacampo.setEnabled(false);
        autorcampo.setEnabled(false);
        }
        public void limpiarCamposCompletos (){
        nrodocucampo.setText("");
        cccampo.setText("");
        tipocombo.setSelectedIndex(0);
        montocampo.setText("");
        fechacampo.setText("");
        autorcampo.setText("");
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MovimientoTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovimientoTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovimientoTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovimientoTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MovimientoTransacciones().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autorcampo;
    private javax.swing.JLabel autorlabel;
    private javax.swing.JButton buscarboton;
    private javax.swing.JTextField cccampo;
    private javax.swing.JLabel cclabel;
    private javax.swing.JButton crearboton;
    private javax.swing.JTextField fechacampo;
    private javax.swing.JLabel fechalabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpiarBoton;
    private javax.swing.JButton modificarboton;
    private javax.swing.JTextField montocampo;
    private javax.swing.JLabel montolabel;
    private javax.swing.JTextField nrodocucampo;
    private javax.swing.JPanel panelbase;
    private javax.swing.JButton salirboton;
    private javax.swing.JComboBox<String> tipocombo;
    private javax.swing.JLabel tipodoclabel;
    // End of variables declaration//GEN-END:variables
}