package co.com.sofka.DDDCine.domain.funciondepelicula.events;

import co.com.sofka.DDDCine.domain.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.DomainEvent;

public class PeliculaAsociada extends DomainEvent {
    private final PeliculaId peliculaId;
    public PeliculaAsociada(PeliculaId peliculaId) {
        super("sofka.funcionpelicula.peliculasociada");
        this.peliculaId=peliculaId;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }
}
