package co.com.sofka.DDDCine.pelicula.events;

import co.com.sofka.DDDCine.pelicula.values.Idioma;
import co.com.sofka.DDDCine.pelicula.values.NombrePelicula;
import co.com.sofka.domain.generic.DomainEvent;

public class IdiomadePeliculaActualizada extends DomainEvent {
    private final Idioma idioma;
    public IdiomadePeliculaActualizada(Idioma idioma) {
        super("sofka.pelicula.idiomadepeliculaactualizada");
        this.idioma=idioma;
    }

    public Idioma getIdioma() {
        return idioma;
    }
}
