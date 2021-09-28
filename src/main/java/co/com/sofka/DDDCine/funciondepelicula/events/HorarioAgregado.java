package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.Fecha;
import co.com.sofka.DDDCine.funciondepelicula.values.Hora;
import co.com.sofka.DDDCine.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioAgregado extends DomainEvent {
    private final HorarioId horarioId;
    private final Hora hora;
    private final Fecha fecha;
    public HorarioAgregado(HorarioId entityId, Hora hora, Fecha fecha) {
        super("sofka.funciondepelicula");
        this.horarioId=entityId;
        this.hora=hora;
        this.fecha=fecha;
    }

    public HorarioId getHorarioId() {
        return horarioId;
    }

    public Hora getHora() {
        return hora;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
