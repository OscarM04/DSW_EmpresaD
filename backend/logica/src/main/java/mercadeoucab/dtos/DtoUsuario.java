package mercadeoucab.dtos;

import javax.persistence.Column;
import java.util.List;

public class DtoUsuario extends DtoBase{

    private String nombre;
    private String apellido;
    private String correo;
    private String password;
    private String token;

    public DtoUsuario(){}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DtoUsuario(long id) throws Exception {super(id);}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return this.apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
