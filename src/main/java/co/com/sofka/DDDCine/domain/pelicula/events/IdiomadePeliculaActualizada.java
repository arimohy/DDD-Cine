package co.com.sofka.DDDCine.domain.pelicula.events;

import co.com.sofka.DDDCine.domain.pelicula.values.Idioma;
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
