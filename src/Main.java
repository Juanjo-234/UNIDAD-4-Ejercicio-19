//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<MetodoEnvio> opcionesEnvio = new ArrayList<>();

    opcionesEnvio.add(new EnvioTerrestre(100.0));
    opcionesEnvio.add(new EnvioAereo(250.0));
    opcionesEnvio.add(new EnvioEcologico(80.0));

    SistemaTarifario sistema = new SistemaTarifario();


    double pesoPaquete = 12.5;
    double distanciaRecorrido = 450.0;

    sistema.evaluarPaqueteMasivo(opcionesEnvio, pesoPaquete, distanciaRecorrido);

}

