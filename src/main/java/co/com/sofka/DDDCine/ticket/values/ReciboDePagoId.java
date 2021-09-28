package co.com.sofka.DDDCine.ticket.values;

import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class ReciboDePagoId extends Identity {
    public ReciboDePagoId(){

    }
    private  ReciboDePagoId(String id){
        super(id);
    }
    public static ReciboDePagoId of(String id){
        return new ReciboDePagoId(id);
    }

}
