/*Supongamos que se nos ha encargado el desarrollo de una aplicación que se encargue de gestionar la
reserva de billetes de avión en una agencia de viajes. Tras analizar el problema con nuestros clientes
hemos recopilado la siguiente lista de requisitos
*
* */
public class Categoria {
    private int idCategorias;
    private String nombre;

    public Categoria(int idCategorias, String nombre) {
        this.idCategorias = idCategorias;
        this.nombre = nombre;
    }
    public int  getIdCategoria(){
        return idCategorias;
    }
    public void setIdCategorias(int idCategorias){
        this.idCategorias=idCategorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
