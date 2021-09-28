package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.NombreSala;
import co.com.sofka.DDDCine.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeSalaActualizada extends DomainEvent {
    public NombreDeSalaActualizada(SalaId entityId, NombreSala nombreSala) {
        super();
    }
}
