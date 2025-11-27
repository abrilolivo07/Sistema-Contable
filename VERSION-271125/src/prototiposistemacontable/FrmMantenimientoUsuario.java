package prototiposistemacontable;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class FrmMantenimientoUsuario extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmMantenimientoUsuario.class.getName());

    public FrmMantenimientoUsuario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipousuario = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        usuariolabel = new javax.swing.JLabel();
        nombrecampo = new javax.swing.JTextField();
        usuariocampo = new javax.swing.JTextField();
        apellidoslabel = new javax.swing.JLabel();
        nombrelabel = new javax.swing.JLabel();
        apellidoscampo = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        verpassword = new javax.swing.JCheckBox();
        passwordcampo = new javax.swing.JPasswordField();
        ventanalabel = new javax.swing.JLabel();
        emillabel = new javax.swing.JLabel();
        emailcampo = new javax.swing.JTextField();
        admin = new javax.swing.JRadioButton();
        normal = new javax.swing.JRadioButton();
        tipolabel = new javax.swing.JLabel();
        validarboton = new javax.swing.JButton();
        modificarboton = new javax.swing.JButton();
        crearboton = new javax.swing.JButton();
        buscarboton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento de Usuarios");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 231, 194));

        usuariolabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        usuariolabel.setText("Usuario");

        nombrecampo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        usuariocampo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        apellidoslabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        apellidoslabel.setText("Apellidos");

        nombrelabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        nombrelabel.setText("Nombre");

        apellidoscampo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        passwordlabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        passwordlabel.setText("Password");

        verpassword.setBackground(new java.awt.Color(255, 231, 194));
        verpassword.setForeground(new java.awt.Color(75, 81, 249));
        verpassword.setBorder(null);
        verpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verpasswordverpasswordActionPerformed(evt);
            }
        });

        passwordcampo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        ventanalabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        ventanalabel.setForeground(new java.awt.Color(2, 53, 54));
        ventanalabel.setText("USUARIO");

        emillabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        emillabel.setText("E-mail");

        emailcampo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        admin.setBackground(new java.awt.Color(255, 231, 194));
        tipousuario.add(admin);
        admin.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        admin.setForeground(new java.awt.Color(2, 53, 54));
        admin.setText("Administrador");

        normal.setBackground(new java.awt.Color(255, 231, 194));
        tipousuario.add(normal);
        normal.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        normal.setForeground(new java.awt.Color(2, 53, 54));
        normal.setText("Normal");

        tipolabel.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        tipolabel.setText("Tipo:");

        validarboton.setBackground(new java.awt.Color(2, 53, 54));
        validarboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        validarboton.setForeground(new java.awt.Color(255, 255, 255));
        validarboton.setText("Salir");
        validarboton.setBorder(null);
        validarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarbotonActionPerformed(evt);
            }
        });

        modificarboton.setBackground(new java.awt.Color(2, 53, 54));
        modificarboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modificarboton.setForeground(new java.awt.Color(255, 255, 255));
        modificarboton.setText("Modificar");
        modificarboton.setBorder(null);
        modificarboton.setEnabled(false);
        modificarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarbotonActionPerformed(evt);
            }
        });

        crearboton.setBackground(new java.awt.Color(2, 53, 54));
        crearboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        crearboton.setForeground(new java.awt.Color(255, 255, 255));
        crearboton.setText("Crear");
        crearboton.setBorder(null);
        crearboton.setEnabled(false);
        crearboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearbotonActionPerformed(evt);
            }
        });

        buscarboton.setBackground(new java.awt.Color(2, 53, 54));
        buscarboton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscarboton.setForeground(new java.awt.Color(255, 255, 255));
        buscarboton.setText("Buscar");
        buscarboton.setBorder(null);
        buscarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emillabel)
                    .addComponent(passwordlabel)
                    .addComponent(apellidoscampo)
                    .addComponent(nombrelabel)
                    .addComponent(apellidoslabel)
                    .addComponent(usuariocampo)
                    .addComponent(usuariolabel)
                    .addComponent(nombrecampo)
                    .addComponent(emailcampo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tipolabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(admin)
                        .addGap(47, 47, 47)
                        .addComponent(normal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(verpassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modificarboton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscarboton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crearboton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(validarboton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(ventanalabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(ventanalabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(usuariolabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuariocampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modificarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(verpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(nombrelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrecampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearboton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(apellidoslabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidoscampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emillabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin)
                    .addComponent(normal)
                    .addComponent(tipolabel))
                .addContainerGap(81, Short.MAX_VALUE))
        );

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

    private void crearbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearbotonActionPerformed
        char[] passw=passwordcampo.getPassword();
        String password=new String(passw);
        
        if(usuariocampo.getText().equals("") || nombrecampo.getText().equals("") || apellidoscampo.getText().equals("") || password.equals("") || !admin.isSelected() && !normal.isSelected()) {
            JOptionPane.showMessageDialog(null, "Llene campos obligatorios.");
        }
        else {
         String userUsuario = usuariocampo.getText().trim();
         String nombreUsuario = nombrecampo.getText().trim();
         String apellidosUsuario = apellidoscampo.getText().trim();
         String mailUsuario = emailcampo.getText().trim();
         String tipoUsuario;
         
         if(admin.isSelected()){
            tipoUsuario="admin";
        }
        else tipoUsuario="normal";
         
        ManejoArchivo manejo = new ManejoArchivo();
        manejo.crearUsuario(tipoUsuario, userUsuario, password, nombreUsuario, apellidosUsuario, mailUsuario);  
        JOptionPane.showMessageDialog(null, "Guardado Correctamente.");
        crearboton.setEnabled(false);
        buscarboton.setEnabled(true);
        limpiarCampos();
        }
    }//GEN-LAST:event_crearbotonActionPerformed

    private void validarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarbotonActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_validarbotonActionPerformed
  
    private void buscarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbotonActionPerformed
        //USAR METODO DE VERIFICACION
        modificarboton.setEnabled(false);
        char[] passw=passwordcampo.getPassword();
        String password=new String(passw);
        String user=usuariocampo.getText();
        
        if(user.equals("")){
            JOptionPane.showMessageDialog(null,"LLene campo de usuario.");
        }
        else {
            ManejoArchivo validacion = new ManejoArchivo();
             
                try {  //Aqui se verifica el usuario
                   lineaEncontrada = validacion.lecturaUsuario(1, user);
                } catch (FileNotFoundException ex) {
                   JOptionPane.showMessageDialog(null, "Error");
                }
        
           if(!lineaEncontrada.equals("")){ // si existe..
               String[] partes = lineaEncontrada.split(";");
               nombrecampo.setText(partes[3].trim());
               apellidoscampo.setText(partes[4].trim());
               passwordcampo.setText(partes[1].trim());
               emailcampo.setText(partes[5].trim());
               
               if(partes[2].trim().equals("admin")){
                   admin.setSelected(true);
               }
               else{
                   normal.setSelected(true);
               }
               modificarboton.setEnabled(true);
           }
           else{
               JOptionPane.showMessageDialog(null, "Usuario no encontrado, puede crear.");
               crearboton.setEnabled(true);
           }   
        }
        buscarboton.setEnabled(false);
    }//GEN-LAST:event_buscarbotonActionPerformed

    
    private void modificarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarbotonActionPerformed
        char[] passw=passwordcampo.getPassword();
    String password=new String(passw);
    String tipoUsuario;
      
    if(admin.isSelected()){
        tipoUsuario="admin";
    }
    else { 
        tipoUsuario="normal";
    }
    if(usuariocampo.getText().equals("") || nombrecampo.getText().equals("") || apellidoscampo.getText().equals("") || password.equals("")) {
        JOptionPane.showMessageDialog(null, "Llene todos los campos obligatorios.");
        return;
    }
    String nuevaLinea = 
        usuariocampo.getText().trim() + ";" + 
        password + ";" + 
        tipoUsuario + ";" + 
        nombrecampo.getText().trim() + ";" + 
        apellidoscampo.getText().trim() + ";" + 
        emailcampo.getText().trim() + ";";
    
    ManejoArchivo manejo = new ManejoArchivo();
    manejo.modificarUsuario(lineaEncontrada, nuevaLinea);
    
    JOptionPane.showMessageDialog(null, "Usuario modificado correctamente.");
    modificarboton.setEnabled(false);
    buscarboton.setEnabled(true);
    limpiarCampos();
    }//GEN-LAST:event_modificarbotonActionPerformed

    private void verpasswordverpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verpasswordverpasswordActionPerformed
        if (verpassword.isSelected()){
            passwordcampo.setEchoChar((char)0);
        }
        else
        passwordcampo.setEchoChar('•');
    }//GEN-LAST:event_verpasswordverpasswordActionPerformed
       
    public void limpiarCampos() {
    usuariocampo.setText(""); 
    passwordcampo.setText("");
    nombrecampo.setText("");
    apellidoscampo.setText("");
    emailcampo.setText("");
    usuariocampo.requestFocus();
}
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new FrmMantenimientoUsuario().setVisible(true));
    }
    private String lineaEncontrada = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.JTextField apellidoscampo;
    private javax.swing.JLabel apellidoslabel;
    private javax.swing.JButton buscarboton;
    private javax.swing.JButton crearboton;
    private javax.swing.JTextField emailcampo;
    private javax.swing.JLabel emillabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarboton;
    private javax.swing.JTextField nombrecampo;
    private javax.swing.JLabel nombrelabel;
    private javax.swing.JRadioButton normal;
    private javax.swing.JPasswordField passwordcampo;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JLabel tipolabel;
    private javax.swing.ButtonGroup tipousuario;
    private javax.swing.JTextField usuariocampo;
    private javax.swing.JLabel usuariolabel;
    private javax.swing.JButton validarboton;
    private javax.swing.JLabel ventanalabel;
    private javax.swing.JCheckBox verpassword;
    // End of variables declaration//GEN-END:variables
}
