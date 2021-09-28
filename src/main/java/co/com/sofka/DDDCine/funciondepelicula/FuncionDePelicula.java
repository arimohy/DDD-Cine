package co.com.sofka.DDDCine.funciondepelicula;

import co.com.sofka.DDDCine.funciondepelicula.events.*;
import co.com.sofka.DDDCine.funciondepelicula.values.*;

import co.com.sofka.DDDCine.pelicula.values.PeliculaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class FuncionDePelicula extends AggregateEvent<FuncionDePeliculaId> {
    protected PeliculaId peliculaId;
    protected Sala sala;
    protected Horario horario;

    public FuncionDePelicula(FuncionDePeliculaId entityId,Sala sala,Horario horario) {
        super(entityId);
        appendChange(new FuncionDePeliculaCreada(sala,horario)).apply();

    }
    private FuncionDePelicula(FuncionDePeliculaId entityId){
        super(entityId);
        subscribe(new FuncionDePeliculaChange(this));
    }
    public static FuncionDePelicula from(FuncionDePeliculaId funcionDePeliculaId, List<DomainEvent> events){
        var funcionDePelicula=new FuncionDePelicula(funcionDePeliculaId);
        events.forEach(funcionDePelicula::applyEvent);
        return funcionDePelicula;
    }
    public void AsociarPelicula(PeliculaId peliculaId){
        appendChange(new PeliculaAsociada(peliculaId)).apply();
    }
    public void agregarSala(SalaId entityId, NombreSala nombreSala, Capacidad capacidad){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombreSala);
        Objects.requireNonNull(capacidad);
        appendChange(new SalaAgregada(entityId,nombreSala,capacidad)).apply();
    }
    public void actualizarNombreDeSala(SalaId entityId,NombreSala nombreSala){
        appendChange(new NombreDeSalaActualizada(entityId,nombreSala)).apply();
    }
    public void actualizarCapacidadDeSala(SalaId entityId,Capacidad capacidad){
        appendChange(new CapacidadDeSalaActualizada(entityId,capacidad)).apply();
    }
    public void agregarHorario(HorarioId entityId, Hora hora, Fecha fecha){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(hora);
        Objects.requireNonNull(fecha);
        appendChange(new HorarioAgregado(entityId,hora,fecha)).apply();
    }
    public void actualizarHoraDeHorario(HorarioId entityId,Hora hora){
        appendChange(new HoraDeHorarioActualizada(entityId,hora)).apply();
    }
    public void actualizarFechaDeHorario(HorarioId entityId,Fecha fecha){
        appendChange(new FechaDeHorarioActualizada(entityId,fecha)).apply();
    }
    public Sala sala(){return sala;}
    public Horario horario(){return horario;}


}
