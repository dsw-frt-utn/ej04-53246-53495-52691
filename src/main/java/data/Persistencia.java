package data;

import domain.*;
import java.util.ArrayList;
import java.util.Optional;

public class Persistencia {

    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static ArrayList<Responsable> responsables = new ArrayList<>();
    private static ArrayList<Sucursal> sucursales = new ArrayList<>();
    private static ArrayList<Marca> marcas = new ArrayList<>();

    private static void inicializarResponsables() {
        Responsable r1 = new Responsable("gonzalez axel", "43962946", "3813311342");
        Responsable r2 = new Responsable("Veliz lautaro", "43241233", "3813211231");
        Responsable r3 = new Responsable(" Albornoz martina", "40324354", "3813221434");
        responsables.add(r1);
        responsables.add(r2);
        responsables.add(r3);

    }

    private static void inicializarSucursales() {
        Sucursal s1 = new Sucursal("SUC01", "jose manuel avellaneda", "alderetes", responsables.get(0));
        Sucursal s2 = new Sucursal("SUC02", "laprida 100", "leales", responsables.get(1));
        Sucursal s3 = new Sucursal("SUC03", "25 de mayo", "florida", responsables.get(2));

        sucursales.add(s1);
        sucursales.add(s2);
        sucursales.add(s3);
    }

    private static void inicializarMarcas() {
        marcas.add(new Marca("peugeot"));
        marcas.add(new Marca("Ford"));
        marcas.add(new Marca("chevrolet"));
        marcas.add(new Marca("Renault"));
    }

    private static void inicializarVehiculos() {
        Sucursal s1 = sucursales.get(0);
        Sucursal s2 = sucursales.get(1);
        Sucursal s3 = sucursales.get(2);

        Marca m1 = marcas.get(0);
        Marca m2 = marcas.get(1);
        Marca m3 = marcas.get(2);
        Marca m4 = marcas.get(3);
//        
//        
    }

    public static ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public static Optional<Vehiculo> getVehiculo(String patente) {
        return vehiculos.stream()
                .filter(v -> v.getPatente().equals(patente))
                .findFirst();
    }

    public static ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public static ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public static void inicializar() {
        inicializarResponsables();
        inicializarSucursales();
        inicializarMarcas();
    }

    public static void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }
}
