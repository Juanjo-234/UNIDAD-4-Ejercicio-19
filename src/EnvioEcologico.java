public class EnvioEcologico extends MetodoEnvio{

private double factor_peso = 1.5;
private double factor_distacia = 0.8;
private double descuentoSustentable = 15.0;

public EnvioEcologico(double tarifaBase){
    super(tarifaBase);
}




    @Override
    public double calcularTarifa(double pesoKg, double distanciaKm) {
        double calculo = tarifaBase + (pesoKg * factor_peso) + (distanciaKm * factor_distacia) - descuentoSustentable;
        return Math.max(calculo, 0.0);
    }
}
