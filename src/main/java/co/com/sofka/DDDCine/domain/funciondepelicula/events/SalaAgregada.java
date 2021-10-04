package co.com.sofka.DDDCine.domain.funciondepelicula.events;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.Capacidad;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.NombreSala;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.DomainEvent;

public class SalaAgregada extends DomainEvent {
    private final SalaId salaId;
    private final NombreSala nombreSala;
    private final Capacidad capacidad;
    public SalaAgregada(SalaId entityId, NombreSala nombreSala, Capacidad capacidad) {
        super("sofka.funcionadepelicula.salagregada");
        this.salaId=entityId;
        this.nombreSala=nombreSala;
        this.capacidad=capacidad;
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
