package co.com.sofka.DDDCine.domain.pelicula.events;

import co.com.sofka.DDDCine.domain.pelicula.values.GeneroId;
import co.com.sofka.DDDCine.domain.pelicula.values.NombreGenero;
import co.com.sofka.domain.generic.DomainEvent;

public class GeneroAgregado extends DomainEvent {
    private final GeneroId generoId;
    private final NombreGenero nombreGenero;
    public GeneroAgregado(GeneroId entityId, NombreGenero nombre) {
        super("sofka.pelicula.generoagregado");
        this.generoId=entityId;
        this.nombreGenero=nombre;
    }

    public GeneroId getGeneroId() {
        return generoId;
    }

    public NombreGenero getNombreGenero() {
        return nombreGenero;
    }
}
