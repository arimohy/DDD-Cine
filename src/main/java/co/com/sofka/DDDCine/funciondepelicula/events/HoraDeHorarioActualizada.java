package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.Hora;
import co.com.sofka.DDDCine.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class HoraDeHorarioActualizada extends DomainEvent {
    public HoraDeHorarioActualizada(HorarioId entityId, Hora hora) {
        super();
    }
}
