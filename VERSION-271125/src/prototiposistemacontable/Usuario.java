package prototiposistemacontable;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String user;
    private String password;
    private int tipo;
    
    public Usuario (String nombre, String ape, String us, String pw, int tp){
        this.nombre=nombre;
        this.apellidos=ape;
        this.password=pw;
        this.user=us;
        this.tipo=tp;
    }
    
    public String nombre (){
        return nombre;
    }
    public String apellidos (){
        return apellidos;
    }
    public String password (){
        return password;
    }
    public String usuario (){
        return user;
    }
    public int tipoUsuario (){
        return tipo;
    }
}
