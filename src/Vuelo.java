import java.util.Date;
import java.util.List;

/*Supongamos que se nos ha encargado el desarrollo de una aplicación que se encargue de gestionar la
reserva de billetes de avión en una agencia de viajes. Tras analizar el problema con nuestros clientes
hemos recopilado la siguiente lista de requisitos
*
* */
public class Vuelo {
    private String codigovuelo;
    private Date salida;
    private List<Billete> Billetes;
    private Aeropuerto origen;
    private Aeropuerto destino;

    public Vuelo(String codigovuelo, Date salida, Aeropuerto origen, Aeropuerto destino) {
        this.codigovuelo = codigovuelo;
        this.salida = salida;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCodigovuelo() {
        return codigovuelo;
    }

    public void setCodigovuelo(String codigovuelo) {
        this.codigovuelo = codigovuelo;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public List<Billete> getBilletes() {
        return Billetes;
    }

    public void setBilletes(List<Billete> billetes) {
        Billetes = billetes;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }
}