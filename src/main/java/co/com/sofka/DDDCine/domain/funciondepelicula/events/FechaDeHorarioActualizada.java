package co.com.sofka.DDDCine.domain.funciondepelicula.events;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.Fecha;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaDeHorarioActualizada extends DomainEvent {
    private final  HorarioId horarioId;
    private final Fecha fecha;
    public FechaDeHorarioActualizada(HorarioId entityId, Fecha fecha) {
        super("sofka.funcionDePelicula.");
        this.horarioId=entityId;
        this.fecha=fecha;
    }

    public HorarioId getHorarioId() {
        return horarioId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
