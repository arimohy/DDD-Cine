package co.com.sofka.DDDCine.funciondepelicula.values;

import co.com.sofka.DDDCine.pelicula.values.ActorId;
import co.com.sofka.domain.generic.Identity;

public class SalaId extends Identity {
    public SalaId(){

    }
    private  SalaId(String id){
        super(id);
    }
    public static SalaId of(String id){
        return new SalaId(id);
    }
}
