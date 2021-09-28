package co.com.sofka.DDDCine.ticket.commands;

import co.com.sofka.DDDCine.funciondepelicula.values.FuncionDePeliculaId;
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
