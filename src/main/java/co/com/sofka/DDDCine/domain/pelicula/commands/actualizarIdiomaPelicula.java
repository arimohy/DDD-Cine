package co.com.sofka.DDDCine.domain.pelicula.commands;

import co.com.sofka.DDDCine.domain.pelicula.values.Idioma;
import co.com.sofka.DDDCine.domain.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.Command;

public class actualizarIdiomaPelicula extends Command {
    private final PeliculaId peliculaId;
    private final Idioma idioma;

    public actualizarIdiomaPelicula(PeliculaId peliculaId, Idioma idioma) {
        this.peliculaId = peliculaId;
        this.idioma = idioma;
    }

    public PeliculaId getPeliculaId() {
        return peliculaId;
    }

    public Idioma getIdioma() {
        return idioma;
    }
}
