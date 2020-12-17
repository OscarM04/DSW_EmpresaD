import mercadeoucab.dtos.*;
import mercadeoucab.entidades.Marca;
import mercadeoucab.entidades.Solicitud;
import mercadeoucab.servicio.ServicioMarca;
import mercadeoucab.servicio.ServicioSolicitud;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

public class ServicioSolicitudTest {


    @Test
    public void registrarSolicitudTest() throws Exception {
        ServicioSolicitud servicio = new ServicioSolicitud();
        DtoSolicitud dtoSolicitud = new DtoSolicitud();
        dtoSolicitud.setEstado("solicitada");
        dtoSolicitud.setMarca( new DtoMarca(1));
        dtoSolicitud.setUsuario( new DtoUsuario( 1));
        List<DtoTipo> tipos = new ArrayList<>();
        tipos.add(new DtoTipo(1));
        dtoSolicitud.setTipos(tipos);
        List<DtoSubCategoria> subCategorias = new ArrayList<>();
        subCategorias.add(new DtoSubCategoria(1));
        dtoSolicitud.setSubCategorias(subCategorias);
        List<DtoPresentacion> presentacions = new ArrayList<>();
        presentacions.add(new DtoPresentacion(1));
        dtoSolicitud.setPresentaciones(presentacions);
        Response resultado = servicio.registrarSolicitud( dtoSolicitud);
        Assert.assertEquals(resultado.getStatus(), 200);
    }

    @Test
    public void actualizarSolicitudTest() throws Exception {
        ServicioSolicitud servicio = new ServicioSolicitud();
        DtoSolicitud dtoSolicitud = new DtoSolicitud(1);
        dtoSolicitud.setEstado("aceptada");
        Response resultado = servicio.actualizarSolicitud( dtoSolicitud.get_id(), dtoSolicitud);
        Assert.assertEquals(resultado.getStatus(), 200);
    }

    @Test
    public void eliminarSolicitudTest() throws Exception {
        ServicioSolicitud servicio = new ServicioSolicitud();
        DtoSolicitud dtoSolicitud = new DtoSolicitud(1);
        Response resultado = servicio.eliminarSolicitud( dtoSolicitud.get_id());
        Assert.assertEquals(resultado.getStatus(), 200);
    }

    @Test
    public void obtenerSolicitudTest() throws Exception {
        ServicioSolicitud servicio = new ServicioSolicitud();
        DtoSolicitud dtoSolicitud = new DtoSolicitud(1);
        Response resultado = servicio.obtenerSolicitud( dtoSolicitud.get_id());
        Assert.assertEquals(resultado.getStatus(), 200);
    }

    @Test
    public void listarSolicitudTest() throws Exception {
        ServicioSolicitud servicio = new ServicioSolicitud();
        Response resultado = servicio.listarSolicitud();
        Assert.assertEquals(resultado.getStatus(), 200);
    }

    @Test
    public void listarSolicitudEstadoTest() throws Exception{
        ServicioSolicitud servicio = new ServicioSolicitud();
        Response resultado = servicio.listarSolicitudEstado("solicitada");
        Assert.assertEquals(200, resultado.getStatus());
    }
}
