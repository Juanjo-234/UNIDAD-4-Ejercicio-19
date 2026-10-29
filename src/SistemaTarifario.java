import java.util.List;

public class SistemaTarifario {
    public void mostrarPresupuesto(MetodoEnvio envio, double pesoKg, double distanciaKm) {
        double costoFinal = envio.calcularTarifa(pesoKg, distanciaKm);

        System.out.println("--------------------------------------------------");
        System.out.println("Método de Envío: " + envio.getClass().getSimpleName());
        System.out.printf("Tarifa Base:     $%.2f\n", envio.getTarifaBase());
        System.out.printf("Costo Estimado:  $%.2f\n", costoFinal);
        System.out.println("--------------------------------------------------");
    }

    public void evaluarPaqueteMasivo(List<MetodoEnvio> metodos, double pesoKg, double distanciaKm) {
        System.out.println("==================================================");
        System.out.printf("  COMPARATIVA DE PRESUPUESTOS (Paquete: %.1f kg, Distancia: %.1f km)\n", pesoKg, distanciaKm);
        System.out.println("==================================================\n");

        for (MetodoEnvio metodo : metodos) {
            mostrarPresupuesto(metodo, pesoKg, distanciaKm);
        }
    }
}
