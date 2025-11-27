package prototiposistemacontable;

import java.awt.Color;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    
    public String user;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginbase = new javax.swing.JPanel();
        login1 = new javax.swing.JPanel();
        usuariocampo = new javax.swing.JTextField();
        passwordcampo = new javax.swing.JPasswordField();
        usuariolabel1 = new javax.swing.JLabel();
        contrasenalabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        separador4 = new javax.swing.JSeparator();
        ingresarboton = new javax.swing.JButton();
        salirboton = new javax.swing.JButton();
        verpassword = new javax.swing.JCheckBox();
        advertencialabel = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log in");
        setBackground(new java.awt.Color(75, 81, 249));
        setSize(new java.awt.Dimension(1916, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginbase.setBackground(new java.awt.Color(2, 53, 54));
        loginbase.setPreferredSize(new java.awt.Dimension(0, 0));

        login1.setBackground(new java.awt.Color(255, 255, 255));

        usuariocampo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        usuariocampo.setForeground(new java.awt.Color(102, 102, 102));
        usuariocampo.setBorder(null);
        usuariocampo.setMargin(new java.awt.Insets(2, 6, 0, 6));

        passwordcampo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        passwordcampo.setForeground(new java.awt.Color(102, 102, 102));
        passwordcampo.setBorder(null);

        usuariolabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        usuariolabel1.setText("Usuario");

        contrasenalabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        contrasenalabel1.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 53, 54));
        jLabel3.setText("INICIAR SESIÓN");

        separador3.setForeground(new java.awt.Color(0, 0, 0));

        separador4.setForeground(new java.awt.Color(0, 0, 0));

        ingresarboton.setBackground(new java.awt.Color(2, 53, 54));
        ingresarboton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        ingresarboton.setForeground(new java.awt.Color(255, 231, 194));
        ingresarboton.setText("Ingresar");
        ingresarboton.setBorder(null);
        ingresarboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarbotoningresarbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarbotoningresarbotonMouseExited(evt);
            }
        });
        ingresarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarbotoningresarbotonActionPerformed(evt);
            }
        });

        salirboton.setBackground(new java.awt.Color(2, 53, 54));
        salirboton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        salirboton.setForeground(new java.awt.Color(255, 231, 194));
        salirboton.setText("Salir");
        salirboton.setBorder(null);
        salirboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirbotonsalirbotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirbotonsalirbotonMouseExited(evt);
            }
        });
        salirboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbotonsalirbotonActionPerformed(evt);
            }
        });

        verpassword.setBackground(new java.awt.Color(255, 255, 255));
        verpassword.setForeground(new java.awt.Color(75, 81, 249));
        verpassword.setBorder(null);
        verpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verpasswordverpasswordActionPerformed(evt);
            }
        });

        advertencialabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        advertencialabel.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout login1Layout = new javax.swing.GroupLayout(login1);
        login1.setLayout(login1Layout);
        login1Layout.setHorizontalGroup(
            login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login1Layout.createSequentialGroup()
                        .addGroup(login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usuariocampo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contrasenalabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuariolabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))
                    .addGroup(login1Layout.createSequentialGroup()
                        .addGroup(login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(login1Layout.createSequentialGroup()
                                .addGroup(login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(separador4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordcampo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(verpassword))
                            .addComponent(advertencialabel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))))
            .addGroup(login1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        login1Layout.setVerticalGroup(
            login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuariolabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuariocampo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasenalabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(login1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(verpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordcampo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(advertencialabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ingresarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/rgzd.png"))); // NOI18N

        javax.swing.GroupLayout loginbaseLayout = new javax.swing.GroupLayout(loginbase);
        loginbase.setLayout(loginbaseLayout);
        loginbaseLayout.setHorizontalGroup(
            loginbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginbaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginbaseLayout.setVerticalGroup(
            loginbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(login1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(loginbase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int hexbgEnt = Integer.parseInt("ffe7c2", 16);
        int hexfgEnt = Integer.parseInt("023536", 16);
        int hexfgExt = Integer.parseInt("ffe7c2", 16);
        int hexbgExt = Integer.parseInt("023536", 16);
        
    private void ingresarbotoningresarbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarbotoningresarbotonMouseEntered
        ingresarboton.setBackground(new Color(hexbgEnt));
        ingresarboton.setForeground(new Color(hexfgEnt));
    }//GEN-LAST:event_ingresarbotoningresarbotonMouseEntered

    private void ingresarbotoningresarbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarbotoningresarbotonMouseExited
        ingresarboton.setBackground(new Color(hexbgExt));
        ingresarboton.setForeground(new Color(hexfgExt));
    }//GEN-LAST:event_ingresarbotoningresarbotonMouseExited

    private void ingresarbotoningresarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarbotoningresarbotonActionPerformed
        char[] passw=passwordcampo.getPassword();
        String password=new String(passw);
        user=usuariocampo.getText();
        
        if(user.equals("") || password.equals("")){
            advertencialabel.setText("LLene campos obligatorios.");
        }
        else{
             ManejoArchivo validacion = new ManejoArchivo();
             boolean existe = false;
             boolean passwordV = false;
             String admin;
             
                try {  //Aqui se verifica el usuario
                   existe = validacion.verificarCampo(user, 0, 0);
                } catch (FileNotFoundException ex) {
                   JOptionPane.showMessageDialog(null, "Error");
                }
        
           if(existe){ // si existe..
                 try { //ver contraseña
                     passwordV = validacion.verificarCampo(password, 1, 0);
                 } catch (FileNotFoundException ex) {
                     JOptionPane.showMessageDialog(null, "Error");
                 }
                 
                 if (passwordV){ 
                     String tipoUsuario = "";
                     try { 
                         tipoUsuario = validacion.lecturaUsuario(2, user); 
                     } catch (FileNotFoundException ex) {
                         JOptionPane.showMessageDialog(null, "Error al leer el tipo de usuario");
                         return;
                     }
                     PrincipalMenu menu = new PrincipalMenu(tipoUsuario);
                     menu.setVisible(true);
                     this.setVisible(false);
                 }
                 else{
                     advertencialabel.setText("Contraseña Incorrecta.");
                 }
                
           } else{
            advertencialabel.setText("El usuario ingresado no existe.");
           }
       }   
    }//GEN-LAST:event_ingresarbotoningresarbotonActionPerformed

    private void salirbotonsalirbotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbotonsalirbotonMouseEntered
        salirboton.setBackground(new Color(hexbgEnt));
        salirboton.setForeground(new Color(hexfgEnt));
    }//GEN-LAST:event_salirbotonsalirbotonMouseEntered

    private void salirbotonsalirbotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirbotonsalirbotonMouseExited
        salirboton.setBackground(new Color(hexbgExt));
        salirboton.setForeground(new Color(hexfgExt));
    }//GEN-LAST:event_salirbotonsalirbotonMouseExited

    private void salirbotonsalirbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbotonsalirbotonActionPerformed
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro que desea salir del sistema?",
            "Salir",
            javax.swing.JOptionPane.YES_NO_OPTION);

    if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);
    } 
    }//GEN-LAST:event_salirbotonsalirbotonActionPerformed

    private void verpasswordverpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verpasswordverpasswordActionPerformed
        if (verpassword.isSelected()){
            passwordcampo.setEchoChar((char)0);
        }
        else
        passwordcampo.setEchoChar('•');
    }//GEN-LAST:event_verpasswordverpasswordActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertencialabel;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel contrasenalabel1;
    private javax.swing.JButton ingresarboton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel login1;
    private javax.swing.JPanel loginbase;
    private javax.swing.JPasswordField passwordcampo;
    private javax.swing.JButton salirboton;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JTextField usuariocampo;
    private javax.swing.JLabel usuariolabel1;
    private javax.swing.JCheckBox verpassword;
    // End of variables declaration//GEN-END:variables
}
