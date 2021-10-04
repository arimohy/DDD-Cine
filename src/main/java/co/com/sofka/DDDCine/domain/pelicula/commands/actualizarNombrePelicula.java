package co.com.sofka.DDDCine.domain.pelicula.commands;

import co.com.sofka.DDDCine.domain.pelicula.values.NombrePelicula;
import co.com.sofka.DDDCine.domain.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.Command;

public class actualizarNombrePelicula extends Command {
    private final PeliculaId peliculaId;
    private final NombrePelicula nombrePelicula;

    public actualizarNombrePelicula(PeliculaId peliculaId, NombrePelicula nombrePelicula) {
        this.peliculaId = peliculaId;
        this.nombrePelicula = nombrePelicula;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public NombrePelicula getNombrePelicula() {
        return nombrePelicula;
    }
}
