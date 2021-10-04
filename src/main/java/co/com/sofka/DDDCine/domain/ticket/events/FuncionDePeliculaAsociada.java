package co.com.sofka.DDDCine.domain.ticket.events;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.FuncionDePeliculaId;
import co.com.sofka.domain.generic.DomainEvent;

public class FuncionDePeliculaAsociada extends DomainEvent {
    private final FuncionDePeliculaId funcionDePeliculaId;
    public FuncionDePeliculaAsociada(FuncionDePeliculaId funcionDePeliculaId) {
        super("sofka.ticketfunciondepeliculaasociada");
        this.funcionDePeliculaId=funcionDePeliculaId;
    }

    public FuncionDePeliculaId getFuncionDePeliculaId() {
        return funcionDePeliculaId;
    }
}
