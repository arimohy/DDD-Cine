package co.com.sofka.DDDCine.usecase.pelicula;

import co.com.sofka.DDDCine.domain.generics.value.Nombre;
import co.com.sofka.DDDCine.domain.pelicula.commands.AgregarActor;
import co.com.sofka.DDDCine.domain.pelicula.events.ActorAgregado;
import co.com.sofka.DDDCine.domain.pelicula.events.PeliculaCreada;
import co.com.sofka.DDDCine.domain.pelicula.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class AgregarActorUseCaseTest {
    private static final String idactor = "actor1";
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar un actor en una pelicula")
    void agregaractorEnPelicula() {
        //arrange
        var command = new AgregarActor(PeliculaId.of("xxxxx"),
                new ActorId(idactor),
                new Nombre("Yhomira")
        );
        var useCase = new AgregarActorUseCase();
        Mockito.when(repository.getEventsBy(idactor)).thenReturn(EventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idactor)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var eventActorAgregado = (ActorAgregado) events.get(0);
        Assertions.assertEquals("Yhomira", eventActorAgregado.getNombre().value());
        Mockito.verify(repository).getEventsBy(idactor);
    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new PeliculaCreada(
                        new NombrePelicula("Nombre"),
                        new Idioma("Español"),
                        new Duracion("5"),
                        new Resumen("esta es una pelicula")
                )
        );
    }

}