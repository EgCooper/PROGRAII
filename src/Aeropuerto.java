import javax.print.attribute.standard.Chromaticity;

/*Supongamos que se nos ha encargado el desarrollo de una aplicación que se encargue de gestionar la
reserva de billetes de avión en una agencia de viajes. Tras analizar el problema con nuestros clientes
hemos recopilado la siguiente lista de requisitos
*
* */
public class Aeropuerto {
    private String codigoaeropuerto;
    private String nombre;
    private Ciudad ciudad;

    public Aeropuerto(String codigoaeropuerto, String nombre, Ciudad ciudad) {
        this.codigoaeropuerto = codigoaeropuerto;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCodigoaeropuerto() {
        return codigoaeropuerto;
    }

    public void setCodigoaeropuerto(String codigoaeropuerto) {
        this.codigoaeropuerto = codigoaeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}




