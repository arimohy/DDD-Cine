package co.com.sofka.DDDCine.domain.ticket.values;

import co.com.sofka.domain.generic.Identity;

public class ReciboDePagoId extends Identity {
    public ReciboDePagoId(){

    }
    private  ReciboDePagoId(String id){
        super(id);
    }
    public static ReciboDePagoId of(String id){
        return new ReciboDePagoId(id);
    }

}
