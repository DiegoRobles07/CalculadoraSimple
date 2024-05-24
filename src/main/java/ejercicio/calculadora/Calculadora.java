package ejercicio.calculadora;

public class Calculadora {

    public float sumar(float a, float b) {
        return a + b;
    }

    public float restar(float a, float b) {
        return a - b;
    }

    public float multiplicar(float a, float b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
