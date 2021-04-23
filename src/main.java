import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class main {
    public static void main(String[] args){
        Cliente carlos = new Cliente(1,"Victor", "Pinto","Mora");
        Ciudad cochabamba= new Ciudad(1,"Cochabamba");
        Ciudad SantaCruz= new Ciudad(2,"SantaCruz");
        Ciudad Tarija= new Ciudad(3,"Tarija");

        Categoria turista= new Categoria(1,"Turista");

        Aeropuerto jorgeWillsterman = new Aeropuerto("JW", "Jorge Willsterman Camacho", cochabamba);
        Aeropuerto ViruViru = new Aeropuerto("VV", "ViruViru",SantaCruz);
        Aeropuerto Oriellea = new Aeropuerto("OL","Oril lea Plaza", Tarija);
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("BOA-158", Calendar.getInstance().getTime(), jorgeWillsterman, ViruViru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santacruztarija = new Vuelo("BOA-159", Calendar.getInstance().getTime(),  ViruViru,Oriellea);
        vuelos.add(santacruztarija);

        Billete billete = new Billete(1,Calendar.getInstance().getTime(),650.5,carlos,cochabamba,SantaCruz,turista,vuelos);
        System.out.println("Billete");
        System.out.println("======");
        System.out.println("Id: "+billete.getIdBillete());
        System.out.println("Fecha:" + billete.getFechaEmision());
        System.out.println("Precio: " + billete.getPreciototal());
        System.out.println("Cliente:" + billete.getCliente());
        System.out.println("origen:"+billete.getOrigen().getNombre());
        System.out.println("Destino:" +billete.getDestino().getNombre());
        System.out.println("Categoria:" +billete.getCategoria().getNombre());
        System.out.println("Vuelos");
        for (Vuelo vuelo:billete.getVuelos()) {
            System.out.println("Codigo Vuelo:" + vuelo.getCodigovuelo()+ "Salida:" + vuelo.getSalida()+"Origen: " + vuelo.getOrigen().getNombre()+"Destino:"+ vuelo.getDestino());

        }




    }
}
