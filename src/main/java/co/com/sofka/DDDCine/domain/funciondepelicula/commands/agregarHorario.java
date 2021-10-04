package co.com.sofka.DDDCine.domain.funciondepelicula.commands;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.Fecha;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.Hora;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.Command;

public class agregarHorario extends Command {
    private final HorarioId horarioId;
    private final Hora hora;
    private  final Fecha fecha;

    public agregarHorario(HorarioId horarioId, Hora hora, Fecha fecha) {
        this.horarioId = horarioId;
        this.hora = hora;
        this.fecha = fecha;
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
