package co.com.sofka.DDDCine.domain.funciondepelicula.commands;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.Capacidad;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.Command;

public class actualizarCapacidadDeSala extends Command {
    private final SalaId entityId;
    private final Capacidad capacidad;

    public actualizarCapacidadDeSala(SalaId entityId, Capacidad capacidad) {
        this.entityId = entityId;
        this.capacidad = capacidad;
    }

    public SalaId getEntityId() {
        return entityId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
