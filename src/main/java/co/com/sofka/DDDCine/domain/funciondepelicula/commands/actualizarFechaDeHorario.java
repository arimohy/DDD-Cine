package co.com.sofka.DDDCine.domain.funciondepelicula.commands;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.Fecha;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.HorarioId;

public class actualizarFechaDeHorario {
    private final HorarioId entityId;
    private final Fecha fecha;

    public actualizarFechaDeHorario(HorarioId entityId, Fecha fecha) {
        this.entityId = entityId;
        this.fecha = fecha;
    }

    public HorarioId getEntityId() {
        return entityId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
