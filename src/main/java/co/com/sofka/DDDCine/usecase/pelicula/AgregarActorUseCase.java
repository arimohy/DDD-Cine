package co.com.sofka.DDDCine.usecase.pelicula;

import co.com.sofka.DDDCine.domain.pelicula.Pelicula;
import co.com.sofka.DDDCine.domain.pelicula.commands.AgregarActor;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarActorUseCase extends UseCase<RequestCommand<AgregarActor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarActor> agregarActorRequestCommand) {
        var command = agregarActorRequestCommand.getCommand();
        var pelicula = Pelicula.from(command.getPeliculaId(), retrieveEvents(command.getActorId().value()));
        pelicula.agregarActor(command.getActorId(), command.getNombre());
        emit().onResponse(new ResponseEvents(pelicula.getUncommittedChanges()));
    }
}
