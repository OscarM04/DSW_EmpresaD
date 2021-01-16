
import mercadeoucab.dtos.DtoUsuario;
import mercadeoucab.servicio.ServicioUsuario;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Response;

public class ServicioUsuarioTest {

    @Test
    public void registrarUsuarioTest(){
        ServicioUsuario servicio = new ServicioUsuario();
        DtoUsuario dtoUsuario = new DtoUsuario();
        dtoUsuario.setNombre( "Yefferson");
        dtoUsuario.setApellido( "Soteldo");
        dtoUsuario.setCorreo( "soteldios@gmail.com");
        dtoUsuario.setPassword("123");
        Response resultado = servicio.registrarUsuario( dtoUsuario);
        Assert.assertEquals(
                Response.Status.OK.getStatusCode(),
                resultado.getStatus()
        );
    }

    @Test
    public void consultarUsuarioTest(){
        ServicioUsuario servicio = new ServicioUsuario();
        Response resultado = servicio.consulta(
                "eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJ1Y2FiLmRzdyIsInN1YiI6IjEwIiwiZXhwIjoxNjEwNzc1MzAxLCJuYmYiOjE2MTA3NjY2NjEsImlhdCI6MTYxMDc2NjY2MSwianRpIjoiYjc5YjI3YmQtNjEyNS00YzFhLWJhNDUtODFjYTZmZmVkZGM3In0.YV_amHqdxjb2JPKs_AovYSgxWQ0r_Pu11oVr_LewxPlSC_tRXCkpXbsoAHoqJG4m6newHHNKfSgL9KBJKzppLA",
                (long)2);
        Assert.assertEquals(
                Response.Status.OK.getStatusCode(),
                resultado.getStatus()
        );
    }
}
