package co.com.sofka.DDDCine.pelicula.events;

import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.pelicula.values.ActorId;
import co.com.sofka.DDDCine.pelicula.values.AutorId;
import co.com.sofka.domain.generic.DomainEvent;

public class AutorAgregado extends DomainEvent {
    private final AutorId autorId;
    private final Nombre nombre;

    public AutorAgregado(AutorId entityId, Nombre nombre) {
        super("sofka.pelicula.autoragregado");
        this.autorId=entityId;
        this.nombre=nombre;
    }

    public AutorId getAutorId() {
        return autorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
