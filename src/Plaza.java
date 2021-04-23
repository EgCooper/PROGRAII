/*Supongamos que se nos ha encargado el desarrollo de una aplicación que se encargue de gestionar la
reserva de billetes de avión en una agencia de viajes. Tras analizar el problema con nuestros clientes
hemos recopilado la siguiente lista de requisitos
*
* */
public class Plaza {
    private int idPlaza;
    private Vuelo Vuelo;
    private Categoria categoria;
    private int numerodeplazas;
    private Double tarifa;

    public Plaza(int idPlaza, Vuelo vuelo, Categoria categoria, int numerodeplazas, Double tarifa) {
        this.idPlaza = idPlaza;
        Vuelo = vuelo;
        this.categoria = categoria;
        this.numerodeplazas = numerodeplazas;
        this.tarifa = tarifa;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public Vuelo getVuelo() {
        return Vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        Vuelo = vuelo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getNumerodeplazas() {
        return numerodeplazas;
    }

    public void setNumerodeplazas(int numerodeplazas) {
        this.numerodeplazas = numerodeplazas;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
}
