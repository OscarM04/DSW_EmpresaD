package mercadeoucab.entidades;


import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "usuario" )
public class Usuario extends EntidadBase {

    @Column(name = "nombre")
    private String _nombre;

    @Column(name = "apellido")
    private String _apellido;

    @Column(name = "password")
    private String _password;

    @Column(name = "correo")
    private String _correo;

    @Column(name = "token")
    private String _token;


    public Usuario(long id) {
        super(id);
    }

    public Usuario() {
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String get_apellido() {
        return _apellido;
    }

    public void set_apellido(String _apellido) {
        this._apellido = _apellido;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_correo() {
        return _correo;
    }

    public void set_correo(String _correo) {
        this._correo = _correo;
    }

    public String get_token() {
        return _token;
    }

    public void set_token(String _token) {
        this._token = _token;
    }
}