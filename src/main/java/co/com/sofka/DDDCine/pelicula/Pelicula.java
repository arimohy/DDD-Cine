package co.com.sofka.DDDCine.pelicula;

import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.pelicula.events.*;
import co.com.sofka.DDDCine.pelicula.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Pelicula extends AggregateEvent<PeliculaId> {
    protected NombrePelicula nombrePelicula;
    protected Set<Actor> actores;
    protected Set<Genero> generos;
    protected Set<Autor> autores;
    protected Idioma idioma;
    protected Duracion duracion;
    protected Resumen resumen;

    public Pelicula(PeliculaId entityId, NombrePelicula nombrePelicula, Idioma idioma, Duracion duracion,Resumen resumen) {
        super(entityId);
        appendChange(new PeliculaCreada(nombrePelicula,idioma,duracion,resumen)).apply();
    }
    private Pelicula(PeliculaId entityId){
        super(entityId);
        subscribe(new PeliculaChange(this));
    }
    public static Pelicula from(PeliculaId peliculaId, List<DomainEvent> events){
        var pelicula=new Pelicula(peliculaId);
        events.forEach(pelicula::applyEvent);
        return pelicula;
    }
    public void actualizarNombrePelicula(NombrePelicula nombre){
        appendChange(new NombredePeliculaActualizada(nombre));
    }
    public void actualizarIdiomaPelicula(Idioma idioma){
        appendChange(new IdiomadePeliculaActualizada(idioma));
    }
    public void actualizarResumenPelicula(Resumen resumen){
        appendChange(new ResumendePeliculaActualizada(resumen));
    }
    public void agregarActor(ActorId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new ActorAgregado(entityId,nombre)).apply();
    }
    public void actualizarNombreDeActor(ActorId entityId,Nombre nombre){
        appendChange(new NombreDeActorActualizada(entityId,nombre)).apply();
    }
    public void agregarAutor(AutorId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AutorAgregado(entityId,nombre)).apply();
    }
    public void actualizarNombreDeAutor(AutorId entityId,Nombre nombre){
        appendChange(new NombreDeAutorActualizada(entityId,nombre)).apply();
    }
    public void agregarGenero(GeneroId entityId, NombreGenero nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new GeneroAgregado(entityId,nombre)).apply();
    }
    public void actualizarNombreDeGenero(GeneroId entityId,NombreGenero nombre){
        appendChange(new NombreDeGeneroActualizada(entityId,nombre)).apply();
    }

    
    public Optional<Actor> getActorPorId(ActorId entityId){
        return actores()
                .stream()
                .filter(actor->actor.identity().equals(entityId))
                .findFirst();
    }
    public Optional<Autor> getAutorPorId(AutorId entityId){
        return autores()
                .stream()
                .filter(autor->autor.identity().equals(entityId))
                .findFirst();
    }
    public Optional<Genero> getGeneroPorId(GeneroId entityId){
        return generos()
                .stream()
                .filter(genero->genero.identity().equals(entityId))
                .findFirst();
    }
    public NombrePelicula nombrePelicula(){
        return nombrePelicula;
    }
    public Duracion duracion(){
        return duracion;
    }
    public Idioma idioma(){
        return idioma;
    }
    public Resumen resumen(){
        return resumen;
    }
    public Set<Actor> actores(){
        return actores;
    }
    public Set<Autor> autores(){
        return autores;
    }
    public Set<Genero> generos(){
        return generos;
    }
}
