import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Telefonos>listaDeTelefonos = new ArrayList<Telefonos>();
    static ArrayList<Laptops>listaDeLaptops = new ArrayList<Laptops>();

    public static void main(String[] args) {

        menuPrincipal();

    }

    static void agregarTelefonos(){

         Telefonos miDispositivo = new Telefonos();
        Laptops myDispositive = new Laptops();
        Scanner sn = new Scanner(System.in);

                    System.out.println("Ingrese el nombre del telefono: ");
                    miDispositivo.setNombre(sn.nextLine());
                    System.out.println("Ingrese el modelo del telefono");
                    miDispositivo.setModelo(sn.nextLine());
                    System.out.println("Ingrese el precio del telefono: ");
                    miDispositivo.setPrecioBase(sn.nextFloat());
                    System.out.println("Ingrese la cantidad de tarjestas sim disponibles: ");
                    miDispositivo.setCantidadTarjetaSIM(sn.nextInt());
                    sn.nextLine();
                    System.out.println("Ingrese la compania telefonica: ");
                    miDispositivo.setCompaniaTelefonica(sn.nextLine());

            listaDeTelefonos.add(miDispositivo);

    }

    static void agregarLaptops(){

        Laptops myDispositive = new Laptops();
        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la laptop: ");
        myDispositive.setNombre(sn.nextLine());
        System.out.println("Ingrese el modelo de la laptop");
        myDispositive.setModelo(sn.nextLine());
        System.out.println("Ingrese el precio de la laptop: ");
        myDispositive.setPrecioBase(sn.nextFloat());
        System.out.println("Ingrese la RAM disponible: ");
        myDispositive.setRAM(sn.nextInt());
        sn.nextLine();
        System.out.println("Ingrese la tarjeta grafica: ");
        myDispositive.setTarjetaGrafica(sn.nextLine());


        listaDeLaptops.add(myDispositive);

    }

    static void ListaDeArticulos(){
        mostrarLaptops();
        System.out.println("---------------------");
        mostrarTelefonos();
    }

    static void mostrarTelefonos(){
            System.out.println();
            for (int i = 0; i < listaDeTelefonos.size(); i++){
                Telefonos cell = listaDeTelefonos.get(i);
                cell.descripcion();
            }
            System.out.println("\n");

    }

    static void mostrarLaptops(){
        System.out.println();
        for (int i = 0; i < listaDeLaptops.size(); i++){
            Laptops pc = listaDeLaptops.get(i);
            pc.descripcion();
        }
        System.out.println("\n");

    }

    static void menuPrincipal(){
        Scanner sn = new Scanner(System.in);
        int option;
        do{
            System.out.println("Bienvenido!!");
            System.out.println("1. Agregar Telefonos");
            System.out.println("2. Agregar laptops Laptops");
            System.out.println("3. Mostrar Articulos");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");
            option = sn.nextInt();
            sn.nextLine();

            switch (option){
                case 1:
                    agregarTelefonos();
                    break;
                case 2:
                    agregarLaptops();
                    break;
                case 3:
                    ListaDeArticulos();
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    break;
            }

        }while(option != 4);
    }
}