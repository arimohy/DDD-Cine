package co.com.sofka.DDDCine.domain.funciondepelicula.values;

import co.com.sofka.domain.generic.Identity;

public class HorarioId extends Identity {
    public HorarioId(){

    }
    private  HorarioId(String id){
        super(id);
    }
    public static HorarioId of(String id){
        return new HorarioId(id);
    }
}
