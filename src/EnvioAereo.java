public class EnvioAereo extends MetodoEnvio{

private double factor_peso = 6.0;
private double factor_distancia = 3.5;
private double cargo_combustible = 50.0;

public EnvioAereo(double tarifaBase){
    super(tarifaBase);
}


    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        return tarifaBase + (pesoKg * factor_peso) + (distanciaKm * factor_distancia) + cargo_combustible;
    }
}
