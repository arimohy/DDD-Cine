package co.com.sofka.DDDCine.funciondepelicula.events;

import co.com.sofka.DDDCine.funciondepelicula.Horario;
import co.com.sofka.DDDCine.funciondepelicula.Sala;
import co.com.sofka.domain.generic.DomainEvent;

public class FuncionDePeliculaCreada extends DomainEvent {
    public FuncionDePeliculaCreada(Sala sala, Horario horario) {
        super();
    }
}
