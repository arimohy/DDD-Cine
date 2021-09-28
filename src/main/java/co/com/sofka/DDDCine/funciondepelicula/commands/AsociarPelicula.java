package co.com.sofka.DDDCine.funciondepelicula.commands;

import co.com.sofka.DDDCine.pelicula.values.PeliculaId;

public class AsociarPelicula {
    private final PeliculaId peliculaId;

    public AsociarPelicula(PeliculaId peliculaId) {
        this.peliculaId = peliculaId;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }
}
