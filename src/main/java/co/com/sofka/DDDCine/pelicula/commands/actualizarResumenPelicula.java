package co.com.sofka.DDDCine.pelicula.commands;

import co.com.sofka.DDDCine.pelicula.values.PeliculaId;
import co.com.sofka.DDDCine.pelicula.values.Resumen;
import co.com.sofka.domain.generic.Command;

public class actualizarResumenPelicula extends Command {
    private final PeliculaId peliculaId;
    private final Resumen resumen;

    public actualizarResumenPelicula(PeliculaId peliculaId, Resumen resumen) {
        this.peliculaId = peliculaId;
        this.resumen = resumen;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public Resumen getResumen() {
        return resumen;
    }
}
