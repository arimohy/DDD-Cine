package co.com.sofka.DDDCine.funciondepelicula;

import co.com.sofka.DDDCine.funciondepelicula.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class FuncionDePeliculaChange extends EventChange {
    public FuncionDePeliculaChange(FuncionDePelicula funcionDePelicula) {

        apply((FuncionDePeliculaCreada event)->{
            funcionDePelicula.sala= event.getSala();
            funcionDePelicula.horario=event.getHorario();
        });
        apply((SalaAgregada event)->{
            funcionDePelicula.sala= new Sala(event.getSalaId(),event.getNombreSala(),event.getCapacidad());
        });
        apply((HorarioAgregado event)->{
            funcionDePelicula.horario= new Horario(event.getHorarioId(),event.getHora(), event.getFecha());
        });
        apply((NombreDeSalaActualizada event)->{
            funcionDePelicula.sala.actualizarNombreSala(event.getNombreSala());
        });
        apply((CapacidadDeSalaActualizada event)->{
            funcionDePelicula.sala.actualizarCapacidadSala(event.getCapacidad());
        });
        apply((FechaDeHorarioActualizada event)->{
            funcionDePelicula.horario.actualizarFechaDeHorario(event.getFecha());
        });
        apply((HoraDeHorarioActualizada event)->{
            funcionDePelicula.horario.actualizarHoraDeHorario(event.getHora());
        });

        apply((PeliculaAsociada event)->{
            funcionDePelicula.peliculaId=event.getPeliculaId();
        });


    }
}
