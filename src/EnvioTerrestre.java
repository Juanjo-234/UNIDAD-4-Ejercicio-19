public class EnvioTerrestre extends MetodoEnvio{
    private double factor_peso = 2.5;
    private double factor_distacia = 1.2;

    public EnvioTerrestre(double tarifaBase){
        super(tarifaBase);
    }

    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        return tarifaBase + (pesoKg * factor_peso) + (distanciaKm *  factor_distacia);
    }
}
