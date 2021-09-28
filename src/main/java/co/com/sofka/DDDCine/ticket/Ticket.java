package co.com.sofka.DDDCine.ticket;

import co.com.sofka.DDDCine.funciondepelicula.values.*;
import co.com.sofka.DDDCine.generics.value.Email;
import co.com.sofka.DDDCine.generics.value.Nombre;
import co.com.sofka.DDDCine.ticket.events.*;
import co.com.sofka.DDDCine.ticket.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Ticket extends AggregateEvent<TicketId> {
    protected FuncionDePeliculaId funcionDePeliculaId;
    protected Vendedor vendedor;
    protected Cliente cliente;
    protected ReciboDePago reciboDePago;

    public Ticket(TicketId entityId,Vendedor vendedor,Cliente cliente,ReciboDePago reciboDePago) {
        super(entityId);
        appendChange(new TicketCreado(vendedor,cliente,reciboDePago)).apply();

    }
    private Ticket(TicketId entityId){
        super(entityId);
        subscribe(new TicketChange(this));
    }
    public static Ticket from(TicketId ticketId, List<DomainEvent> events){
        var ticket=new Ticket(ticketId);
        events.forEach(ticket::applyEvent);
        return ticket;
    }
    public void AsociarFuncionDePelicula(FuncionDePeliculaId funcionDePeliculaId){
        appendChange(new FuncionDePeliculaAsociada(funcionDePeliculaId)).apply();
    }
    public void agregarCliente(ClienteId clienteId, Nombre nombre, Email email){
        Objects.requireNonNull(clienteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new ClienteAgregado(clienteId,nombre,email)).apply();
    }
    public void actualizarNombreDeCliente(ClienteId clienteId,Nombre nombre){
        appendChange(new NombreDeClienteActualizado(clienteId,nombre)).apply();
    }
    public void actualizarEmailDeCliente(ClienteId clienteId,Email email){
        appendChange(new EmailDeClienteActualizado(clienteId,email)).apply();
    }
    public void agregarVendedor(VendedorId vendedorId, Nombre nombre, Email email){
        Objects.requireNonNull(vendedorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new VendedorAgregado(vendedorId,nombre,email)).apply();
    }
    public void actualizarNombreDeVendedor(VendedorId vendedorId,Nombre nombre){
        appendChange(new NombreDeVendedorActualizado(vendedorId,nombre)).apply();
    }
    public void actualizarEmailDeVendedor(VendedorId vendedorId,Email email){
        appendChange(new EmailDeVendedorActualizado(vendedorId,email)).apply();
    }
    public void agregarReciboDePago(ReciboDePagoId reciboDePagoId, TipodePago tipodePago, Precio precio){
        Objects.requireNonNull(reciboDePagoId);
        Objects.requireNonNull(tipodePago);
        Objects.requireNonNull(precio);
        appendChange(new ReciboDePagoAgregado(reciboDePagoId,tipodePago,precio)).apply();
    }
    public void actualizarTipoDeReciboDePago(ReciboDePago reciboDePago,TipodePago tipodePago){
        appendChange(new TipoDeReciboDePagoActualizado(reciboDePago,tipodePago)).apply();
    }
    public void actualizarPrecioDeReciboDePago(ReciboDePago reciboDePago,Precio precio){
        appendChange(new PrecioDeReciboDePagoActualizado(reciboDePago,precio)).apply();
    }
    public Cliente cliente(){return cliente;}
    public Vendedor vendedor(){return vendedor;}
    public ReciboDePago reciboDePago(){return reciboDePago;}
}
