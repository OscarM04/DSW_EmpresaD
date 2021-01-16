package mercadeoucab.mappers;

import mercadeoucab.dtos.DtoUsuario;
import mercadeoucab.entidades.Usuario;
import mercadeoucab.excepciones.PruebaExcepcion;


public class MapperUsuario
{

    public static Usuario mapDtoToEntity(DtoUsuario dtoUsuario )
    {
        Usuario usuario = new Usuario(dtoUsuario.get_id());

        usuario.set_nombre( dtoUsuario.getNombre());
        usuario.set_apellido( dtoUsuario.getApellido() );
        usuario.set_correo( dtoUsuario.getCorreo() );
        usuario.set_password( dtoUsuario.getPassword());
        return usuario;
    }

    public static DtoUsuario mapEntityToDto( Usuario usuario ) throws PruebaExcepcion
    {
        final DtoUsuario dtoUsuario = new DtoUsuario();

        dtoUsuario.setId( usuario.get_id());
        dtoUsuario.setNombre( usuario.get_nombre());
        dtoUsuario.setApellido( usuario.get_apellido());
        dtoUsuario.setCorreo( usuario.get_correo());
        dtoUsuario.setPassword( usuario.get_password());

        return dtoUsuario;
    }
}