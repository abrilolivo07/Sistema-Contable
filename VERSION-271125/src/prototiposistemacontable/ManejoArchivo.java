package prototiposistemacontable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ManejoArchivo {

    File archivo = new File("src/Usuarios.txt");
    File archivoCuentas = new File("src/Cuentas.txt");
    File archivoTransCont = new File ("src/CabeceraTransaccionContable.txt");
    
    void Escribir(File fileFichero,String cadena){
           BufferedWriter buff;

           try{
               if(!fileFichero.exists()){
                    fileFichero.createNewFile();
                 }

               buff = new BufferedWriter(new FileWriter(fileFichero,true));
               buff.write(cadena+"\r\n");
               buff.close();
            }
            catch(IOException e){
               System.out.println(e);
            }
    }
    
    void borrar (File Ffichero){
           try{
               if(Ffichero.exists()){
                    Ffichero.delete();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    
    public boolean verificarCampo ( String campo, int valorcampo, int accion) throws FileNotFoundException{
        
        try (BufferedReader buffer = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = buffer.readLine()) != null) { 
                 String[] partes = linea.split(";");
                 
                       String campoA = partes[valorcampo].trim();
                       
                       if(campoA.trim().equalsIgnoreCase(campo.trim())){
                          return accion!=1;
                       }
             } 
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "El usuario no existe" + ex);
        }
        return false;
    }
    
    public String lecturaUsuario (int acc, String campo) throws FileNotFoundException{
        
        if(!archivo.exists()){ 
        return ""; 
    }
    else{
        try (BufferedReader buffer = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = buffer.readLine()) != null) { 
                String[] partes = linea.split(";");
                
                String campoUsuario = partes[0].trim();
                
                if(campoUsuario.trim().equalsIgnoreCase(campo.trim())){
                    if(acc==1) {
                         return linea.trim();
                    } else if (acc==2) {
                         return partes[2].trim(); 
                    }
                }
             } 
          } 
        catch (IOException ex) {}
    }
    return "";
    }
    
    public void crearUsuario(String tipo, String usuario, String passw, String nombre, String apellidos, String mail) {
        
      try {
        FileWriter F1 = new FileWriter("src/Usuarios.txt", true);
        try (PrintWriter pw = new PrintWriter(F1)) {
            pw.println(usuario + ";" + passw + ";" + tipo + ";" + nombre + ";" + apellidos + ";" + mail + ";");
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al grabar Archivo " + ex);
    }
}

    public void modificarUsuario(String lineaAntigua, String nuevaLinea) {

        File fileNuevo = new File("src/Usuarios1.txt");
        File fileAntiguo = new File("src/Usuarios.txt");
        String cadenaAntigua = lineaAntigua.trim();
        String cadenaNueva = nuevaLinea.trim();
         
        BufferedReader buffer = null; 
    PrintWriter writer = null;

    try {
        if (fileAntiguo.exists()) {
            buffer = new BufferedReader(new FileReader(fileAntiguo));
            writer = new PrintWriter(new FileWriter(fileNuevo)); 
            
            String linea;

            while ((linea = buffer.readLine()) != null) { 
                String lineaLimpia = linea.trim(); 

                if (lineaLimpia.equalsIgnoreCase(cadenaAntigua)) { 
                    writer.println(cadenaNueva); 
                } else {
                    writer.println(linea);    
                }
            } 
            writer.close(); 
            buffer.close();
            if (fileAntiguo.delete()) {
                fileNuevo.renameTo(fileAntiguo);
            } else {
                 JOptionPane.showMessageDialog(null, "Error al eliminar el archivo original o renombrar el nuevo.");
            }
            
        } else {
            System.out.println("Fichero no Existe");
        }
    }
    catch (IOException e) {
        try {
            if (buffer != null) buffer.close();
            if (writer != null) writer.close();
        } catch (IOException ex) {
           
        }
        System.out.println(e);
        JOptionPane.showMessageDialog(null, "Error al procesar la modificación: " + e.getMessage());
    }
       
    }
    
    public String lecturaCuenta(String nroCuenta) {
    
    if (!archivoCuentas.exists()) {
        return "";
    }
    
    try (BufferedReader buffer = new BufferedReader(new FileReader(archivoCuentas))) {
        String linea;
        
        while ((linea = buffer.readLine()) != null) {
            String[] partes = linea.split(";");
            
            if (partes.length > 0) {
                String nroCuentaArchivo = partes[0].trim();
                
                if (nroCuentaArchivo.equalsIgnoreCase(nroCuenta.trim())) {
                    return linea.trim();
                }
            }
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo de Cuentas: " + ex.getMessage());
    }
    
    return "";
}
 
    public boolean lecturaCuenta(String cuenta, String tipo) {
    
    if (!archivoCuentas.exists()) {
        return false;
    }
    
    try (BufferedReader buffer = new BufferedReader(new FileReader(archivoCuentas))) {
        String linea;
        
        while ((linea = buffer.readLine()) != null) {
            String[] partes = linea.split(";");
            
            if (partes.length > 0) {
                String cuentaArchivo = partes[0].trim();
                String tipoArch = partes[1].trim();
                
                if (cuentaArchivo.equalsIgnoreCase(cuenta.trim())) {
                    if (tipoArch.equalsIgnoreCase(tipo.trim())) {
                        return true;
                    }
                }
            }
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo de Cuentas: " + ex.getMessage());
    }
    
    return false;
}    
    
    public String crearCuenta(String nroCta, String descripcion, String tipoCta, 
                         String nivelCta, String ctaPadre, String grupoCta) {
        
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dateF = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter timeF = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    String fechaCreacion = now.format(dateF);
    String horaCreacion = now.format(timeF);
    
    String nuevaLinea = nroCta.trim() + ";" + descripcion.trim() + ";" + tipoCta.trim() + ";" + nivelCta.trim() + ";" + ctaPadre.trim() + ";" + grupoCta.trim() + ";" + 
                        fechaCreacion + ";" + horaCreacion + ";" +  "0.0" + ";" +  "0.0" + ";" +  "0.0" + ";";
    
    try (PrintWriter pw = new PrintWriter(new FileWriter(archivoCuentas, true))) {
        pw.println(nuevaLinea);
        
        int respuesta = javax.swing.JOptionPane.showConfirmDialog(null, "¿Seguro que desea guardar los cambios?");
        if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Creado Correctamente.");
        return nuevaLinea;
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al grabar la Cuenta: " + ex.getMessage());
    }
    return "";
}
    

    public boolean modificarDocTrans(String lineaAntigua, String nuevaLinea, int a) {
    int respuesta = javax.swing.JOptionPane.showConfirmDialog(null, "¿Seguro que desea modificar y guardar los cambios?");

    if (respuesta != javax.swing.JOptionPane.YES_OPTION) {
        javax.swing.JOptionPane.showMessageDialog(null, "Modificación cancelada.");
        return false;
    }

    File fileNuevo= new File("src/CabeceraTransaccionContable.txt");
    File fileAntiguo= archivoTransCont;

    String cadenaAntigua = lineaAntigua.trim();
    String cadenaNueva = nuevaLinea.trim();

    BufferedReader buffer = null;
    PrintWriter writer = null;

    try {
        if (fileAntiguo.exists()) {
            buffer = new BufferedReader(new FileReader(fileAntiguo));
            writer = new PrintWriter(new FileWriter(fileNuevo));

            String linea;

            while ((linea = buffer.readLine()) != null) {
                String lineaLimpia = linea.trim();

                if (lineaLimpia.equalsIgnoreCase(cadenaAntigua)) {
                    writer.println(cadenaNueva);
                } else {
                    writer.println(linea);
                }
            }
            
            writer.close();
            buffer.close();

            if (fileAntiguo.delete()) {
                if (fileNuevo.renameTo(fileAntiguo)) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Guardado Correctamente.");
                    return true;
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Error: Se borró el archivo original, pero falló el renombrado del nuevo.");
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Error al eliminar el archivo original. La modificación no se aplicó.");
            }

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "El archivo de Cuentas no existe.");
        }
    }
    catch (IOException e) {
        try {
            if (buffer != null) 
                buffer.close();
            if (writer != null) 
                writer.close();
        } catch (IOException ex) {
        }
        javax.swing.JOptionPane.showMessageDialog(null, "Error al procesar la modificación de Cuenta: " + e.getMessage());
       }
        return false;
    }

    public String modificarDoc(String lineaAntigua, String nuevaLinea) {
    int respuesta = javax.swing.JOptionPane.showConfirmDialog(
            null, 
            "¿Seguro que desea modificar y guardar los cambios?"
    );

    if (respuesta != javax.swing.JOptionPane.YES_OPTION) {
        javax.swing.JOptionPane.showMessageDialog(null, "Modificación cancelada.");
        return "";
    }

    File fileNuevo = new File("src/Cuentas1.txt");
    File fileAntiguo = archivoCuentas;

    String cadenaAntigua = lineaAntigua.trim();
    String cadenaNueva = nuevaLinea.trim();

    BufferedReader buffer = null;
    PrintWriter writer = null;

    try {
        if (fileAntiguo.exists()) {

            buffer = new BufferedReader(new FileReader(fileAntiguo));
            writer = new PrintWriter(new FileWriter(fileNuevo));

            String linea;
            int cont = 0;
            boolean modificada = false;

            while ((linea = buffer.readLine()) != null) {

                String lineaLimpia = linea.trim();

                // Si no se ha modificado y esta es la línea objetivo:
                if (!modificada && lineaLimpia.equalsIgnoreCase(cadenaAntigua)) {
                    writer.println(cadenaNueva);
                    modificada = true;
                    // cont se queda como está → ya indica la posición exacta
                } else {
                    writer.println(linea); // SE DEBE escribir la línea original SIEMPRE
                    if (!modificada) cont++; // Solo cuenta antes de llegar a la línea modificada
                }
            }

            writer.close();
            buffer.close();

            if (fileAntiguo.delete()) {
                if (fileNuevo.renameTo(fileAntiguo)) {

                    javax.swing.JOptionPane.showMessageDialog(null, "Guardado correctamente.");

                    // cont = posición correcta
                    return cont + "|" + cadenaNueva;
                } else {
                    javax.swing.JOptionPane.showMessageDialog(
                        null, 
                        "Error: Se borró el archivo original, pero falló el renombrado del nuevo."
                    );
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(
                    null,
                    "Error al eliminar el archivo original. La modificación NO se aplicó."
                );
            }

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "El archivo de Cuentas no existe.");
        }
    } catch (IOException e) {
        try { if (buffer != null) 
            buffer.close(); } catch (IOException ex) {}
        if (writer != null)
            writer.close();

        javax.swing.JOptionPane.showMessageDialog(
            null,
            "Error al procesar la modificación de Cuenta: " + e.getMessage()
        );
    }

    return "";
}
    
    public String busquedaDocTrans (String no_, int valor){
        if (!archivoTransCont.exists()) {
        return "";
    }
    
    try (BufferedReader buffer = new BufferedReader(new FileReader(archivoTransCont))) {
        String linea;
        
        while ((linea = buffer.readLine()) != null) {
            String[] partes = linea.split(";");
            
            if (partes.length > 0 && partes[0].equals(no_)) {
                return linea.trim();
            }
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo CabeceraTransaccionContable: " + ex.getMessage());
    }
    
    return "";
       }   
    
    public boolean busquedaNoDocTrans (String no_){
    try (BufferedReader buffer = new BufferedReader(new FileReader(archivoTransCont))) {
        String linea;
        
        while ((linea = buffer.readLine()) != null) {
            String[] partes = linea.split(";");
            
            if (partes.length > 0) {
                String nroDocArchivo = partes[0].trim();
                
                if (nroDocArchivo.equalsIgnoreCase(no_.trim())) {
                    return true;
                }
            }
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo CabeceraTransaccionContable: " + ex.getMessage());
    }
    
    return false;
       }   
    
    public boolean crearTransaccion (String no, String tipo, String cuenta, String monto, String autor){
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dateF = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
            String fechaCreacion = now.format(dateF);
            String nuevaLinea = no.trim() + ";" + tipo.trim() + ";" + cuenta.trim() + ";" + monto.trim() + ";" + fechaCreacion + ";" + autor + ";";
    
            try (PrintWriter pw = new PrintWriter(new FileWriter(archivoTransCont, true))) {
                pw.println(nuevaLinea);
        
                int respuesta = javax.swing.JOptionPane.showConfirmDialog(null, "¿Seguro que desea guardar los cambios?");
                 if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
                       JOptionPane.showMessageDialog(null, "Creado Correctamente.");
                       return true;
                 }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al grabar la Cuenta: " + ex.getMessage());
            }
      return false;
    }
}