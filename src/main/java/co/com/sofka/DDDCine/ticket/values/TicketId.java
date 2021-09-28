package co.com.sofka.DDDCine.ticket.values;

import co.com.sofka.domain.generic.Identity;

public class TicketId extends Identity {
    public TicketId(){

    }
    private  TicketId(String id){
        super(id);
    }
    public static TicketId of(String id){
        return new TicketId(id);
    }
}
