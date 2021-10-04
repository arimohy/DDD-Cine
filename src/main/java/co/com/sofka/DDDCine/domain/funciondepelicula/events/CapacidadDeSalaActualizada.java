package co.com.sofka.DDDCine.domain.funciondepelicula.events;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.Capacidad;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.DomainEvent;

public class CapacidadDeSalaActualizada extends DomainEvent {
    private final SalaId salaId;
    private  final Capacidad capacidad;
    public CapacidadDeSalaActualizada(SalaId entityId, Capacidad capacidad) {
        super("sofka.funciondepelicula.capacidadde salaactualizada");
        this.salaId=entityId;
        this.capacidad=capacidad;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
