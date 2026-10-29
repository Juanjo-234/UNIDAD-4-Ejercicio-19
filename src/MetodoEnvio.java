public abstract class MetodoEnvio {
protected double tarifaBase;

public MetodoEnvio(double tarifaBase){
    this.tarifaBase = tarifaBase;
}

    public double getTarifaBase() {
        return tarifaBase;
    }

    public abstract double calcularTarifa(double pesoKg, double distanciaKm);
}
