### Programación II - Taller Patrones Estructurales

### Integrantes: 
* Jose Alberto Hernández León 
* Alejandra Ibarra Ortiz

## Pregunta 1. Identificación

### a. ¿Qué patrón de diseño utilizaría?

 Patrón Decorator (Decorador).

### b. ¿Por qué este patrón es más apropiado que crear una clase diferente para cada combinación?

Evita la explosión de clases provocada por la herencia rígida, donde se requeriría una subclase por cada combinación posible.
En su lugar, permite añadir o combinar responsabilidades a un objeto de forma dinámica y flexible en tiempo de ejecución.

## Pregunta 2. Identificación

### a. ¿Qué patrón de diseño utilizaría?

 Patrón Facade (Fachada).

### b. Explique en 2 o 3 líneas por qué considera que este patrón es apropiado.

 Es apropiado porque proporciona una interfaz única y simplificada que oculta la complejidad y la interacción de múltiples
subsistemas (Inventory, Payment, Shipping, Notification). De esta forma, desacopla el controlador de los subsistemas y facilita
 el mantenimiento del código.

## Pregunta 3. Identificación

### a. ¿Qué patrón de diseño estructural utilizaría?

 Patrón Proxy (Proxy de Protección).

### b. Explique brevemente por qué es adecuado para esta situación.

 Es adecuado porque implementa la misma interfaz que el servicio original, actuando como un intermediario transparente para el cliente.
Esto permite interceptar las peticiones y validar los permisos de acceso antes de delegar la operación al servicio real, sin modificar su código.

## Pregunta 4. Identificación

### a. ¿Qué patrón de diseño utilizaría?

 Patrón Adapter (Adaptador).

### b. Explique cuál es el problema que debe resolver el patrón.

 Debe resolver la incompatibilidad de interfaces entre el sistema existente, que espera utilizar PaymentProcessor con el método processPayment(),
y la biblioteca externa, que ofrece ExternalPaymentService con el método makeTransaction(). El adaptador permite conectar ambas interfaces sin modificar el servicio externo.

## Ejercicio práctico.

Pagos - Adapter

