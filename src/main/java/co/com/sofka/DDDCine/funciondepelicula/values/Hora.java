package co.com.sofka.DDDCine.funciondepelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Hora implements ValueObject<String> {
    private final String value;
    public Hora(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("la nombre de sala no puede estar vacia");
        }
    }
    public String value() {
        return value;
    }
}
