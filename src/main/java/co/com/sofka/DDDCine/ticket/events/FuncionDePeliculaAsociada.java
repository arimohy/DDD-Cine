package co.com.sofka.DDDCine.ticket.events;

import co.com.sofka.DDDCine.funciondepelicula.values.FuncionDePeliculaId;
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
