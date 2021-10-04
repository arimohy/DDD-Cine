package co.com.sofka.DDDCine.domain.funciondepelicula;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.Capacidad;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.NombreSala;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Sala extends Entity<SalaId> {
    private NombreSala nombreSala;
    private Capacidad capacidad;

    public Sala(SalaId entityId, NombreSala nombreSala, Capacidad capacidad) {
        super(entityId);
        this.nombreSala = nombreSala;
        this.capacidad = capacidad;
    }

    public NombreSala NombreSala() {
        return nombreSala;
    }

    public Capacidad Capacidad() {
        return capacidad;
    }
    public void actualizarNombreSala(NombreSala nombreSala){

        this.nombreSala= Objects.requireNonNull(nombreSala);
    }
    public void actualizarCapacidadSala(Capacidad capacidad){

        this.capacidad= Objects.requireNonNull(capacidad);
    }
}
