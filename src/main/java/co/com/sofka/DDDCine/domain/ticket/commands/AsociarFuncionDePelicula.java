package co.com.sofka.DDDCine.domain.ticket.commands;

import co.com.sofka.DDDCine.domain.funciondepelicula.values.FuncionDePeliculaId;
import co.com.sofka.domain.generic.Command;

public class AsociarFuncionDePelicula extends Command {
    private final FuncionDePeliculaId funcionDePeliculaId;

    public AsociarFuncionDePelicula(FuncionDePeliculaId funcionDePeliculaId) {
        this.funcionDePeliculaId = funcionDePeliculaId;
    }

    public FuncionDePeliculaId getFuncionDePeliculaId() {
        return funcionDePeliculaId;
    }
}
