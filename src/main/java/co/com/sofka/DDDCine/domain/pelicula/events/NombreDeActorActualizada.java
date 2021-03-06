package co.com.sofka.DDDCine.domain.pelicula.events;

import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.pelicula.values.ActorId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeActorActualizada extends DomainEvent {
    private final ActorId actorId;
    private final Nombre nombre;

    public NombreDeActorActualizada(ActorId actorId, Nombre nombre) {
        super("sofka.pelicula.nombredeactoractualiada");
        this.actorId = actorId;
        this.nombre = nombre;
    }

    public ActorId getActorId() {
        return actorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
