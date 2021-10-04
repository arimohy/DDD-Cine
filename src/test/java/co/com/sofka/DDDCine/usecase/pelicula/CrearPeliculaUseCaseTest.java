package co.com.sofka.DDDCine.usecase.pelicula;

import co.com.sofka.DDDCine.domain.pelicula.Pelicula;
import co.com.sofka.DDDCine.domain.pelicula.commands.CrearPelicula;
import co.com.sofka.DDDCine.domain.pelicula.events.PeliculaCreada;
import co.com.sofka.DDDCine.domain.pelicula.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearPeliculaUseCaseTest {
    @Test
    void crearBibliotecaEscenarioExplicito(){
        //arrange
        var command=new CrearPelicula(
                PeliculaId.of(("xxxxx")),
                new NombrePelicula("Nombre"),
                new Idioma("Español"),
                new Duracion("5"),
                new Resumen("esta es una pelicula")


        );
        var useCase=new CrearPeliculaUseCase();
        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        Assertions.assertEquals(1,events.size());
        var event =(PeliculaCreada)events.get(0);
        Assertions.assertEquals("Nombre",event.getNombrePelicula().value());
        Assertions.assertEquals("Español",event.getIdioma().value());
        Assertions.assertEquals("5",event.getDuracion().value());
        Assertions.assertEquals("esta es una pelicula",event.getResumen().value());
    }

}