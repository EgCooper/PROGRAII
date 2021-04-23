import com.sun.management.VMOption;

import java.util.Date;
import java.util.List;
import java.util.Locale;

/*Supongamos que se nos ha encargado el desarrollo de una aplicación que se encargue de gestionar la
reserva de billetes de avión en una agencia de viajes. Tras analizar el problema con nuestros clientes
hemos recopilado la siguiente lista de requisitos
*
* */
public class Billete {
     private int idBillete;
    private Date FechaEmision;
    private double Preciototal;
    private Cliente Cliente;
    private Ciudad origen;
    private Ciudad destino;
    private Categoria categoria;
    private List <Vuelo> vuelos;

    public Billete(int idBillete, Date fechaEmision, double preciototal, Cliente cliente, Ciudad origen, Ciudad destino, Categoria categoria, List<Vuelo> vuelos) {
        this.idBillete = idBillete;
        FechaEmision = fechaEmision;
        Preciototal = preciototal;
        Cliente = cliente;
        this.origen = origen;
        this.destino = destino;
        this.categoria = categoria;
        this.vuelos = vuelos;
    }

    public int getIdBillete() {
        return idBillete;
    }

    public void setIdBillete(int idBillete) {
        this.idBillete = idBillete;
    }

    public Date getFechaEmision() {
        return FechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        FechaEmision = fechaEmision;
    }

    public double getPreciototal() {
        return Preciototal;
    }

    public void setPreciototal(double preciototal) {
        Preciototal = preciototal;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
