package co.com.sofka.DDDCine.domain.ticket;

import co.com.sofka.DDDCine.domain.ticket.events.*;
import co.com.sofka.domain.generic.EventChange;

public class TicketChange extends EventChange {
    public TicketChange(Ticket ticket) {

        apply((TicketCreado event)->{
            ticket.cliente= event.getCliente();
            ticket.vendedor=event.getVendedor();
            ticket.reciboDePago=event.getReciboDePago();
        });
        apply((ClienteAgregado event)->{
            ticket.cliente= new Cliente(event.getClienteId(),event.getNombre(),event.getEmail());
        });
        apply((VendedorAgregado event)->{
            ticket.vendedor= new Vendedor(event.getVendedorId(),event.getNombre(), event.getEmail());
        });
        apply((ReciboDePagoAgregado event)->{
            ticket.reciboDePago= new ReciboDePago(event.getReciboDePagoId(),event.getTipodePago(), event.getPrecio());
        });
        apply((EmailDeClienteActualizado event)->{
            ticket.cliente.actualizarEmail(event.getEmail());
        });
        apply((EmailDeVendedorActualizado event)->{
            ticket.vendedor.actualizarEmail(event.getEmail());
        });
        apply((NombreDeClienteActualizado event)->{
            ticket.cliente.actualizarNombre(event.getNombre());
        });
        apply((NombreDeVendedorActualizado event)->{
            ticket.vendedor.actualizarNombre(event.getNombre());
        });
        apply((PrecioDeReciboDePagoActualizado event)->{
            ticket.reciboDePago.actualizarPrecio(event.getPrecio());
        });
        apply((TipoDeReciboDePagoActualizado event)->{
            ticket.reciboDePago.actualizarTipodePago(event.getTipodePago());
        });

        apply((FuncionDePeliculaAsociada event)->{
            ticket.funcionDePeliculaId=event.getFuncionDePeliculaId();
        });


    }
}
