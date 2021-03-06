package co.com.sofka.DDDCine.domain.ticket.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipodePago implements ValueObject<String> {
    private final String value;

    public TipodePago(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El tipo de pago  no puede estar vacio");
        }
    }



    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipodePago that = (TipodePago) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
