package domain;

public class VehiculoCombustible extends Vehiculo {
    private double kilometrosPorLitro;
    private double litrosExtra;
    private int año;

    public VehiculoCombustible(String patente, Marca marca, String modelo, int anio, double capacidadCarga,
                               Sucursal sucursal, double kilometrosPorLitro, double litrosExtra) {
        super(VehiculoTipo.COMBUSTIBLE, patente, marca, modelo, anio, capacidadCarga, sucursal);
        this.kilometrosPorLitro = kilometrosPorLitro;
        this.litrosExtra = litrosExtra;
        this.año = anio;
    }
    
     public double getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }
    
    public int getAño(){
        return año;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        double total = kilometros/kilometrosPorLitro;
        System.out.print("KIlometros vale: "+kilometros);
        if(2026-año > 5){
            total = total + ((kilometros/15)*litrosExtra) ;
    }
        return total;
    }
    
}