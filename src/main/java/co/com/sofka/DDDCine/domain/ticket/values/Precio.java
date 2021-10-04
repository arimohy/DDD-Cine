package co.com.sofka.DDDCine.domain.ticket.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Precio implements ValueObject<String> {
    private final String value;

    public Precio(String value){
        this.value= Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El precio no puede estar vacio");
        }
    }
    public String value() {
        return value;
    }
}
