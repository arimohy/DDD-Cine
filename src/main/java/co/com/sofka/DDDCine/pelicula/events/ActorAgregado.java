package co.com.sofka.DDDCine.pelicula.events;

import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.pelicula.values.ActorId;
import co.com.sofka.domain.generic.DomainEvent;

public class ActorAgregado extends DomainEvent {
    private final ActorId actorId;
    private final Nombre nombre;

    public ActorAgregado(ActorId entityId, Nombre nombre){
        super("sofka.pelicula.actoragregado");
        this.actorId=entityId;
        this.nombre=nombre;
    }

    public ActorId getActorId() {
        return actorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
