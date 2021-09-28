package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.Capacidad;
import co.com.sofka.DDDCine.funciondepelicula.values.NombreSala;
import co.com.sofka.DDDCine.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.DomainEvent;

public class SalaAgregada extends DomainEvent {
    public SalaAgregada(SalaId entityId, NombreSala nombreSala, Capacidad capacidad) {
        super();
    }
}
