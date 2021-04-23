/*Supongamos que se nos ha encargado el desarrollo de una aplicación que se encargue de gestionar la
reserva de billetes de avión en una agencia de viajes. Tras analizar el problema con nuestros clientes
hemos recopilado la siguiente lista de requisitos
*
* */
public class Cliente  {
    private int idCliente;
    private String nombre;
    private String PrimerApellido;
    private String SegundoApellido;

    public Cliente(int idCliente, String nombre, String primerApellido, String segundoApellido) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        PrimerApellido = primerApellido;
        SegundoApellido = segundoApellido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }
}


