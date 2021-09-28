package co.com.sofka.DDDCine.pelicula.events;

import co.com.sofka.DDDCine.pelicula.values.NombrePelicula;
import co.com.sofka.DDDCine.pelicula.values.Resumen;
import co.com.sofka.domain.generic.DomainEvent;

public class ResumendePeliculaActualizada extends DomainEvent {
    private final Resumen resumen;
    public ResumendePeliculaActualizada(Resumen resumen) {
        super("sofka.pelicula.resumenpelicula.actualiada");
        this.resumen=resumen;
    }

    public Resumen getResumen() {
        return resumen;
    }
}
