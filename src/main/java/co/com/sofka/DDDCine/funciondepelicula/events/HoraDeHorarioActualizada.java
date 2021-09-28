package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.Hora;
import co.com.sofka.DDDCine.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class HoraDeHorarioActualizada extends DomainEvent {
    private final HorarioId horarioId;
    private final Hora hora;

    public HoraDeHorarioActualizada(HorarioId entityId, Hora hora) {
        super("sofka.funciondepelicula.horadehorarioactualiza");
        this.horarioId=entityId;
        this.hora=hora;
    }

    public HorarioId getHorarioId() {
        return horarioId;
    }

    public Hora getHora() {
        return hora;
    }
}
