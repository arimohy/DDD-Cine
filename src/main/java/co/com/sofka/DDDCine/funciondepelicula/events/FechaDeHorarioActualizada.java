package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.Fecha;
import co.com.sofka.DDDCine.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaDeHorarioActualizada extends DomainEvent {
    public FechaDeHorarioActualizada(HorarioId entityId, Fecha fecha) {
        super();
    }
}
