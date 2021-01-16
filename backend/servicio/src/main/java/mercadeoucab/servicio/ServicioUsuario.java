package mercadeoucab.servicio;

import mercadeoucab.accesodatos.DaoUsuario;
import mercadeoucab.dtos.DtoUsuario;
import mercadeoucab.entidades.Usuario;
import mercadeoucab.jwt.JWT;
import mercadeoucab.mappers.MapperUsuario;
import mercadeoucab.responses.ResponseUsuario;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path( "/usuarios" )
@Produces( MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON )
public class ServicioUsuario extends AplicacionBase{

    /**
     * Name: registrarUsuario
     * Description: Crea el usuario en el sistema
     *
     * @param dtoUsuario Usuario a ser creado
     * @return retorna status 200 en caso de exito con mensaje
     *      o status 400 con mensaje de error
     */
    @POST
    @Path("/")
    public Response registrarUsuario(DtoUsuario dtoUsuario){
        Response resultado = null;
        try{
            verifyParams( dtoUsuario);
            DaoUsuario dao = new DaoUsuario();
            Usuario usuario = MapperUsuario.mapDtoToEntity( dtoUsuario);
            Usuario resul = dao.insert( usuario);
            resultado = ResponseUsuario.succes(
                    JWT.createToken( String.valueOf( resul.get_id()))
            );
        }catch (Exception e) {
            String problema = e.getMessage();
            resultado = ResponseUsuario.failure(problema);
        }
        return resultado;
    }

    /**
     * Name: consulta
     * Description: Metodo que obtiene el token del header de la peticion
     * devuelve la consulta realizada
     *
     * @param token Token JWT
     */
    @GET
    @Path("/{id}")
    public Response consulta(@HeaderParam("Authorization") String token, @PathParam("id") Long id){
        Response resultado = null;
        try {
            validateCredentials(token);
            DaoUsuario dao = new DaoUsuario();
            Usuario resul = dao.find(id, Usuario.class);
            resultado = ResponseUsuario.GET(
                    MapperUsuario.mapEntityToDto(resul)
            );
        }catch (Exception e) {
            String problema = e.getMessage();
            resultado = ResponseUsuario.failure(problema);
        }
        return resultado;
    }

}