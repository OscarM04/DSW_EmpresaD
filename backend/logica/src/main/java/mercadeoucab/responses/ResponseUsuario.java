package mercadeoucab.responses;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import mercadeoucab.dtos.DtoUsuario;

public class ResponseUsuario implements Serializable{
    public static Response GET(DtoUsuario usuarioDto){
        JsonObject data;
        JsonObject usuario;
        usuario = Json.createObjectBuilder()
                .add("_id", usuarioDto.get_id())
                .add("nombre", usuarioDto.getNombre())
                .add("apellido", usuarioDto.getApellido())
                .add("correo", usuarioDto.getCorreo())
                .build();
        data = Json.createObjectBuilder()
                .add("status", 200)
                .add("data", usuario)
                .build();
        return Response.status(Response.Status.OK)
                .entity(data)
                .build();
    }

    public static Response succes(String token){
        JsonObject data;
        data = Json.createObjectBuilder()
                .add("status", 200)
                .add("message", "Agregado exitosamente")
                .add("token", token)
                .build();
        return Response.status(Response.Status.OK)
                .entity(data)
                .build();
    }

    public static Response failure(String error){
        JsonObject data;
        data = Json.createObjectBuilder()
                .add("status", 400)
                .add("message", error)
                .build();
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(data)
                .build();
    }
}
