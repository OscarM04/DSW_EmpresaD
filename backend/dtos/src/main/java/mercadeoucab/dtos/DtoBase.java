package mercadeoucab.dtos;

import mercadeoucab.excepciones.PruebaExcepcion;

import java.sql.Timestamp;

public class DtoBase
{
    private long _id;
    private int activo;
    private Timestamp creado_el;
    private Timestamp modificado_el;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public Timestamp getCreado_el() {
        return creado_el;
    }

    public void setCreado_el(Timestamp creado_el) {
        this.creado_el = creado_el;
    }

    public Timestamp getModificado_el() {
        return modificado_el;
    }

    public void setModificado_el(Timestamp modificado_el) {
        this.modificado_el = modificado_el;
    }

    public DtoBase(long id ) throws Exception
    {
        setId( id );
    }

    public DtoBase()
    {
    }

    public long getId()
    {
        return _id;
    }

    public void setId( long id ) throws PruebaExcepcion
    {
        if ( id >= 0 )
        {
            _id = id;
        }
        else
        {
            throw new PruebaExcepcion( );
        }
    }
}
