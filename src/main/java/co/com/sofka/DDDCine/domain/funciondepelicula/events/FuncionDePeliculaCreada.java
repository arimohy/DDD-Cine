package co.com.sofka.DDDCine.domain.funciondepelicula.events;

import co.com.sofka.DDDCine.domain.funciondepelicula.Horario;
import co.com.sofka.DDDCine.domain.funciondepelicula.Sala;
import co.com.sofka.domain.generic.DomainEvent;

public class FuncionDePeliculaCreada extends DomainEvent {
    private final Sala sala;
    private final   Horario horario;
    public FuncionDePeliculaCreada(Sala sala, Horario horario) {
        super("sofka.funciondepelicula.funcionde peliculacreada");
        this.sala=sala;
        this.horario=horario;
    }

    public Sala getSala() {
        return sala;
    }

    public Horario getHorario() {
        return horario;
    }
}
