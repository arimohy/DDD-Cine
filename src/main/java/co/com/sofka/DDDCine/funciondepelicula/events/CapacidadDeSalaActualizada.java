package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.Capacidad;
import co.com.sofka.DDDCine.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CapacidadDeSalaActualizada extends DomainEvent {
    public CapacidadDeSalaActualizada(SalaId entityId, Capacidad capacidad) {
        super();
    }
}
