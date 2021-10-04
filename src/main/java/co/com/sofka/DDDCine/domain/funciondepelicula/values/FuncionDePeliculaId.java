package co.com.sofka.DDDCine.domain.funciondepelicula.values;

import co.com.sofka.domain.generic.Identity;

public class FuncionDePeliculaId extends Identity {
    public FuncionDePeliculaId(){

    }
    private  FuncionDePeliculaId(String id){
        super(id);
    }
    public static FuncionDePeliculaId of(String id){
        return new FuncionDePeliculaId(id);
    }
}
