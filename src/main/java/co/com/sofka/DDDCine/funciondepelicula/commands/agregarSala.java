package co.com.sofka.DDDCine.funciondepelicula.commands;

import co.com.sofka.DDDCine.funciondepelicula.values.Capacidad;
import co.com.sofka.DDDCine.funciondepelicula.values.NombreSala;
import co.com.sofka.DDDCine.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.Command;

public class agregarSala extends Command {
    private final SalaId salaId;
    private final NombreSala nombreSala;
    private final Capacidad capacidad;

    public agregarSala(SalaId salaId, NombreSala nombreSala, Capacidad capacidad) {
        this.salaId = salaId;
        this.nombreSala = nombreSala;
        this.capacidad = capacidad;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public NombreSala getNombreSala() {
        return nombreSala;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
