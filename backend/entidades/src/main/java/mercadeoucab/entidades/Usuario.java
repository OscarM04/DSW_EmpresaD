package mercadeoucab.entidades;


import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "usuario" )
@NamedQueries({
        @NamedQuery(
                name = "obtenerUsuarioPorCorreo",
                query = "select u from Usuario u where u.correo = :correo"
        )
})
public class Usuario extends EntidadBase {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "password")
    private String password;

    @Column(name = "correo")
    private String correo;


    public Usuario(long id) {
        super(id);
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}