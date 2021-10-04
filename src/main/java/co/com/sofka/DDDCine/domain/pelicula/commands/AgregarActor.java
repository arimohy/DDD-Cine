package co.com.sofka.DDDCine.domain.pelicula.commands;

import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.pelicula.values.ActorId;
import co.com.sofka.DDDCine.domain.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.Command;

public class AgregarActor extends Command {
    private final PeliculaId peliculaId;
    private final ActorId actorId;
    private final Nombre nombre;

    public AgregarActor(PeliculaId peliculaId, ActorId actorId,final Nombre nombre) {
        this.peliculaId = peliculaId;
        this.actorId = actorId;
        this.nombre = nombre;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public ActorId getActorId() {
        return actorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
