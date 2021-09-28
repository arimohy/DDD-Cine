package co.com.sofka.DDDCine.pelicula.commands;


import co.com.sofka.DDDCine.pelicula.values.GeneroId;
import co.com.sofka.DDDCine.pelicula.values.NombreGenero;
import co.com.sofka.DDDCine.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.Command;

public class agregarGenero extends Command {
    private final PeliculaId peliculaId;
    private final GeneroId generoId;
    private final NombreGenero nombreGenero;

    public agregarGenero(PeliculaId peliculaId, GeneroId generoId, NombreGenero nombreGenero) {
        this.peliculaId = peliculaId;
        this.generoId = generoId;
        this.nombreGenero = nombreGenero;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public GeneroId getGeneroId() {
        return generoId;
    }

    public NombreGenero getNombreGenero() {
        return nombreGenero;
    }
}
