package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.Fecha;
import co.com.sofka.DDDCine.funciondepelicula.values.Hora;
import co.com.sofka.DDDCine.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioAgregado extends DomainEvent {
    public HorarioAgregado(HorarioId entityId, Hora hora, Fecha fecha) {
        super();
    }
}
