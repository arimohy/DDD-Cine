package co.com.sofka.DDDCine.usecase.pelicula;

import co.com.sofka.DDDCine.domain.pelicula.Pelicula;
import co.com.sofka.DDDCine.domain.pelicula.commands.CrearPelicula;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearPeliculaUseCase extends UseCase<RequestCommand<CrearPelicula>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPelicula> crearPeliculaRequestCommand) {
        var command=crearPeliculaRequestCommand.getCommand();

        var biblioteca=new Pelicula(
                command.getPeliculaId(),
                command.getNombrePelicula(),
                command.getIdioma(),
                command.getDuracion(),
                command.getResumen()
        );

        emit().onResponse(new ResponseEvents(biblioteca.getUncommittedChanges()));
    }
}
