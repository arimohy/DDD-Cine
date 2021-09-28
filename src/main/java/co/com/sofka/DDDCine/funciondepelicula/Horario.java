package co.com.sofka.DDDCine.funciondepelicula;

import co.com.sofka.DDDCine.funciondepelicula.values.Capacidad;
import co.com.sofka.DDDCine.funciondepelicula.values.Fecha;
import co.com.sofka.DDDCine.funciondepelicula.values.Hora;
import co.com.sofka.DDDCine.funciondepelicula.values.HorarioId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Horario extends Entity<HorarioId> {
    private Hora hora;
    private Fecha fecha;

    public Horario(HorarioId entityId, Hora hora, Fecha fecha) {
        super(entityId);
        this.hora = hora;
        this.fecha = fecha;
    }

    public Hora Hora() {
        return hora;
    }

    public Fecha Fecha() {
        return fecha;
    }
    public void actualizarHoraDeHorario(Hora hora){

        this.hora= Objects.requireNonNull(hora);
    }
    public void actualizarFechaDeHorario(Fecha fecha){

        this.fecha= Objects.requireNonNull(fecha);
    }
}
