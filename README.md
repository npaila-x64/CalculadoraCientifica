# CalculadoraCientifica
## Integrantes del grupo :
- Nicolás Paila
- Jorge Quidel
- David Millar
## Planteamiento del problema: 
Se debe crear una calculadora con cinco funciones: 

1- Calcular las 4 operaciones aritméticas básicas entre 2 números, el mayor de 2 números,  menor de 2 números, potencia de un número elevado a un segundo número y calcular un cierto porcentaje de un numero.

2- Calcular las soluciones x1 y x2 de una ecuación cuadrática de la forma: Ax2 + Bx + C = 0

3- Calcular perímetros, áreas y volúmenes según corresponda de las siguientes figuras geométricas: cuadrado, rectángulo, círculo, esfera, cubo y cono

4- Calcular la solución (x,y) de un sistema de 2 ecuaciones y 2 incógnitas, de la forma: 

Ax + By = C

Dx + Ey = F

5- Calcular la ecuación de una recta de la forma: Y = mX + b, dados 2 puntos de la recta (x1,y1) (x2,y2) 

Frente a esto, se plantearon las siguientes preguntas, y se respondieron.

.¿Qué pasa si se intenta ingresar como divisor un CERO?

-Al usar entradas de tipo double, el programa interpreta un resultado infinitamente 
grande si el dividendo es positivo (Infinity), infinitamente pequeño si el dividendo 
es negativo (Infinity) e indefinido si el dividendo también es cero (NaN).


2.¿Qué pasa si base y exponente de la potencia son CERO?

-Usando la librería Math y la función Math.pow(), devuelve como resultado 1.

3.¿Qué pasa si se intenta ingresar una variable de entrada no numérica?

-El programa lanza una excepción del tipo InputMismatchException.
