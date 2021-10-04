package co.com.sofka.DDDCine.domain.funciondepelicula.commands;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.Hora;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.Command;

public class actualizarHoraDeHorario extends Command {
    private final HorarioId horarioId;
    private final Hora hora;

    public actualizarHoraDeHorario(HorarioId horarioId, Hora hora) {
        this.horarioId = horarioId;
        this.hora = hora;
    }

    public HorarioId getHorarioId() {
        return horarioId;
    }

    public Hora getHora() {
        return hora;
    }
}
