package co.com.sofka.DDDCine.domain.pelicula.values;

import co.com.sofka.domain.generic.Identity;

public class ActorId extends Identity {
    public ActorId(){

    }
    public ActorId(String id){
        super(id);
    }
    public static ActorId of(String id){
        return new ActorId(id);
    }
}
