package co.com.sofka.DDDCine.domain.funciondepelicula.commands;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.NombreSala;
import co.com.sofka.DDDCine.domain.funciondepelicula.values.SalaId;
import co.com.sofka.domain.generic.Command;

public class actualizarNombreDeSala extends Command {
    private final SalaId entityId;
    private final NombreSala nombreSala;

    public actualizarNombreDeSala(SalaId entityId, NombreSala nombreSala) {
        this.entityId = entityId;
        this.nombreSala = nombreSala;
    }

    public SalaId getEntityId() {
        return entityId;
    }

    public NombreSala getNombreSala() {
        return nombreSala;
    }
}
