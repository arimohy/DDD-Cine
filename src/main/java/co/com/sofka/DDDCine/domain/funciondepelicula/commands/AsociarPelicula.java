package co.com.sofka.DDDCine.domain.funciondepelicula.commands;

import co.com.sofka.DDDCine.domain.pelicula.values.PeliculaId;

public class AsociarPelicula {
    private final PeliculaId peliculaId;

    public AsociarPelicula(PeliculaId peliculaId) {
        this.peliculaId = peliculaId;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }
}
