Resolución del ejercicio N°19 de la unidad 4 de programación 2.
El programa simula un sistema de cálculo de tarifas y cotización de envíos logísticos aplicando los principios de la Programación Orientada a Objetos (POO). Su propósito principal es demostrar el uso de clases abstractas, herencia y polimorfismo para calcular de manera unificada el costo de envíos mediante diferentes medios de transporte (terrestre, aéreo y ecológico/bicicleta o sostenible), cada uno con sus propias reglas tarifarias, tarifas base y factores multiplicadores basados en el peso y la distancia, procesados centralmente por un sistema de gestión.

Clases y Componentes Utilizados
MetodoEnvio (Clase Abstracta)

Propósito: Actúa como la plantilla base para cualquier modalidad de envío. Define atributos comunes como la tarifa base o factores generales, y declara el método abstracto double calcularTarifa(double pesoKg, double distanciaKm), obligando a las clases hijas a implementar su propia lógica matemática de costeo.

EnvioTerrestre (Clase Concreta / Hija)

Propósito: Modela el envío por transporte terrestre (camión/auto). Sobrescribe el método de cálculo aplicando un factor multiplicador estándar por kilómetro y peso, ideal para cargas medianas y pesadas de media distancia.

EnvioAereo (Clase Concreta / Hija)

Propósito: Modela el envío por transporte aéreo. Implementa su propia lógica incorporando un costo superior por velocidad y restricciones de peso, aplicando recargos más altos por distancia y carga prioritaria.

EnvioEcologico (Clase Concreta / Hija)

Propósito: Modela un servicio de envío ecológico o de última milla sostenible (por ejemplo, mensajería en bicicleta o vehículos eléctricos urbanos). Aplica una tarifa reducida o con bonificaciones por sostenibilidad, ponderando de forma distinta el peso y la distancia en zonas urbanas.

SistemaTarifario (Clase Coordinadora)

Propósito: Funciona como el cotizador central del servicio logístico. Contiene un método que recibe cualquier objeto de tipo MetodoEnvio junto con los datos del paquete (peso y distancia) para procesar y devolver el presupuesto estimado de manera completamente polimórfica, sin conocer la subclase específica que está evaluando.
<img width="731" height="525" alt="Captura de pantalla 2026-10-29 154223" src="https://github.com/user-attachments/assets/5a44adeb-3eea-4efa-9a90-e980461f7be2" />
