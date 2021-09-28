package co.com.sofka.DDDCine.pelicula.events;

import co.com.sofka.DDDCine.pelicula.values.AutorId;
import co.com.sofka.DDDCine.pelicula.values.GeneroId;
import co.com.sofka.DDDCine.pelicula.values.NombreGenero;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeGeneroActualizada extends DomainEvent {
    private final GeneroId generoId;
    private final NombreGenero nombreGenero;
    public NombreDeGeneroActualizada(GeneroId entityId, NombreGenero nombre) {
        super("sofka.pelicula.nombredegeneroactualizada");
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
