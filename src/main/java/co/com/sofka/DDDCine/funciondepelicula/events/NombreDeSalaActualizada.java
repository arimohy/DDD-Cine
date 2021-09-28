package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.values.NombreSala;
import co.com.sofka.DDDCine.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeSalaActualizada extends DomainEvent {
    private SalaId salaId;
    private NombreSala nombreSala;
    public NombreDeSalaActualizada(SalaId entityId, NombreSala nombreSala) {
        super("sofka.funciondepelicula.nomnredesalaactualizada");
        this.salaId=entityId;
        this.nombreSala=nombreSala;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public NombreSala getNombreSala() {
        return nombreSala;
    }
}
