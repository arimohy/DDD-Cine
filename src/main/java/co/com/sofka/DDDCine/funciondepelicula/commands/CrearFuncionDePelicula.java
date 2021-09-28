package co.com.sofka.DDDCine.funciondepelicula.commands;

import co.com.sofka.DDDCine.funciondepelicula.Horario;
import co.com.sofka.DDDCine.funciondepelicula.Sala;
import co.com.sofka.DDDCine.funciondepelicula.values.FuncionDePeliculaId;
import co.com.sofka.domain.generic.Command;

public class CrearFuncionDePelicula extends Command {
    private final FuncionDePeliculaId funcionDePeliculaId;
    private final Sala sala;
    private final Horario horario;

    public CrearFuncionDePelicula(FuncionDePeliculaId funcionDePeliculaId, Sala sala, Horario horario) {
        this.funcionDePeliculaId = funcionDePeliculaId;
        this.sala = sala;
        this.horario = horario;
    }

    public FuncionDePeliculaId getFuncionDePeliculaId() {
        return funcionDePeliculaId;
    }

    public Sala getSala() {
        return sala;
    }

    public Horario getHorario() {
        return horario;
    }
}
