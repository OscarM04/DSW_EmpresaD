package mercadeoucab.entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Date;

@MappedSuperclass
public class EntidadBase implements Serializable
{

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private long _id;


    public void set_id(long _id) {
        this._id = _id;
    }



    public EntidadBase(long _id, Date modificado_el) {
        this._id = _id;
    }

    public EntidadBase(long id )
    {
        _id = id;
    }

    public EntidadBase()
    {
    }

    public long get_id()
    {
        return _id;
    }

}
