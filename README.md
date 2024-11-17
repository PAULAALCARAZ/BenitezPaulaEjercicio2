# Proyecto: Tablero de Ajedrez Personalizado ⬛⬜⬛⬜♟️

Este proyecto es una implementación de un **tablero de ajedrez personalizado** en Java. Permite al usuario crear su propio tablero con un patrón de su elección, 
seleccionar el tamaño de las casillas y generar un tablero con bordes y casillas alternadas (blancas y negras).

## Características

- **Personalización del patrón:** El usuario puede elegir un carácter para utilizarlo como patrón en el tablero (por ejemplo, `*`, `#`, etc.).
- **Tamaño de las casillas:** El usuario puede definir el tamaño de cada casilla del tablero, con un rango entre 1 y 15.
- **Tablero de 8x8:** El tablero generado es de 8x8, como un tablero de ajedrez clásico, pero con casillas personalizables.
- **Control de errores:** Si el usuario ingresa un valor incorrecto para el tamaño de las casillas (letras o números fuera del rango), el programa le pedirá que lo intente nuevamente.

## Requisitos

- Java 8 o superior instalado en tu máquina.

## Instrucciones

 Sigue las instrucciones en la consola para personalizar el tablero:
    - Se te pedirá que ingreses un carácter para usar como patrón.
    - Luego, ingresarás el tamaño de las casillas (entre 1 y 15).
    - El programa generará un tablero de ajedrez personalizado basado en tus elecciones.

## Ejemplo de Impresión

```text
Hola! Vamos a crear tu tablero personalizado. Introduce el caracter que quieres usar como patron.
* 
Ahora introduce el tamaño que quieres para la casilla (El valor debe estar entre 1 y 15): 
5
+-----+-----+-----+-----+-----+-----+-----+-----+
|*****|     |*****|     |*****|     |*****|     |
|*****|     |*****|     |*****|     |*****|     |
|*****|     |*****|     |*****|     |*****|     |
+-----+-----+-----+-----+-----+-----+-----+-----+
...
