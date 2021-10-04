package co.com.sofka.DDDCine.domain.funciondepelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Capacidad implements ValueObject<String> {
    private final String value;
    public Capacidad(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("la fecha no puede estar vacia");
        }
    }
    @Override
    public String value() {
        return value();
    }
}
