package co.com.sofka.DDDCine.pelicula.commands;

import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.pelicula.values.ActorId;
import co.com.sofka.DDDCine.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreDeActor extends Command {
    private final PeliculaId peliculaId;
    private final ActorId actorId;
    private final Nombre nombre;
    public actualizarNombreDeActor(PeliculaId peliculaId,ActorId entityId, Nombre nombre){
        this.peliculaId=peliculaId;
        this.actorId=entityId;
        this.nombre=nombre;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public ActorId getActorId() {
        return actorId;
    }

    public Nombre getnombre() {
        return nombre;
    }
}
