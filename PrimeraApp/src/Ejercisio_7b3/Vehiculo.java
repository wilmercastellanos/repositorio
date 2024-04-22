
package Ejercisio_7b3;

/**
 *
 * @author Wilmer Felipe Castellanos Salazar

* Crear una clase llamada Vehículo con los atributos privados

• String matricula
• int velocidadMaxima (indica los km/h máximos)
• int velocidadActual (indica los km/h actuales) • double peso
• boolean marchaAtras (boolean, que indica el sentido hacia donde avanza el vehículo)
Implementa los métodos necesarios para acceder a estos atributos de manera pública (getters y setters).
La clase dispondrá de un constructor que necesitará como parámetros los valores iniciales para todos
sus atributos.
• Crear método público void cambioSentido(), que invierte el valor de marchaAtras. No se puede
cambiar de marcha si no se encuentra el coche parado (velocidad actual 0).
• Crear métodos públicos void acelerar(int cuanto) y void frenar(int cuanto), que cambian la
velocidad actual (incrementa o decremento dependiendo del sentido de la marcha), dentro de los
limites del vehículo (que tiene una velocidad máxima, si va hacia adelante, y que no puede circular
a mas de 60 km/h hacia atrás) y que no puede tener velocidad negativa, (salvo que esté en sentido
hacia atrás)
• Crear método público int multar(), que pone una multa si el coche circula a más de 120 km/h. El
método devuelve un valor int, el importe de la multa, que será 0 si no se ha multado al vehículo, y si
no, el importe de la multa (que será el doble del peso del coche)
• Crear un método público boolean esIgual(Vehiculo vehiculo) que sirva para comparar dos
vehículos, de manera que devuelva true o false dependiendo de si son iguales o no (se consideran
iguales si el valor de todos sus atributos es el mismo). El método recibirá como argumento un objeto
de la clase Vehículo.
• Crear un método público void copia(Vehiculo vehiculo) que copiará los atributos de un vehículo
en otro. El método recibirá como parámetro un objeto de la clase Vehículo del cual se copiarán sus
valores.
Crear una clase aparte con el método main para probar las funcionalidades de la clase Vehículo.
*/

public class Vehiculo {
     private String matricula;
    private int velocidadMaxima;
    private int velocidadActual;
    private double peso;
    private boolean marchaAtras;

    public Vehiculo(String matricula, int velocidadMaxima, int velocidadActual, double peso, boolean marchaAtras) {
        this.matricula = matricula;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.peso = peso;
        this.marchaAtras = marchaAtras;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMarchaAtras() {
        return marchaAtras;
    }

    public void cambioSentido() {
        if (velocidadActual == 0) {
            marchaAtras = !marchaAtras;
        }
    }

    public void acelerar(int cuanto) {
        if (!marchaAtras) {
            velocidadActual = Math.min(velocidadActual + cuanto, velocidadMaxima);
        } else {
            velocidadActual = Math.max(velocidadActual - cuanto, -60);
        }
    }

    public void frenar(int cuanto) {
        if (!marchaAtras) {
            velocidadActual = Math.max(velocidadActual - cuanto, 0);
        } else {
            velocidadActual = Math.min(velocidadActual + cuanto, 0);
        }
    }


    public int multar() {
        if (velocidadActual > 120) {
            return (int) (peso * 2);
        }
        return 0;
    }


    public boolean esIgual(Vehiculo vehiculo) {
        return matricula.equals(vehiculo.matricula) &&
                velocidadMaxima == vehiculo.velocidadMaxima &&
                velocidadActual == vehiculo.velocidadActual &&
                peso == vehiculo.peso &&
                marchaAtras == vehiculo.marchaAtras;
    }


    public void copia(Vehiculo vehiculo) {
        this.matricula = vehiculo.matricula;
        this.velocidadMaxima = vehiculo.velocidadMaxima;
        this.velocidadActual = vehiculo.velocidadActual;
        this.peso = vehiculo.peso;
        this.marchaAtras = vehiculo.marchaAtras;
    }
}

