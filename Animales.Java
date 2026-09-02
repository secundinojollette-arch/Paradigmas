public class Animales {

    // Clase abstracta base
    static abstract class Animal {
        public abstract void hacerSonido();// Metodo abstracto para hacer sonido 
        public abstract void moverse(); // Métodp abstracto para hacer movimiento 
    }

    // Subclases internas, donde perro hereda de animal y define sus comportamientos
    static class Perro extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("El perro dice: ¡Guau!");
        }
        @Override
        public void moverse() {
            System.out.println("El perro corre alegremente.");
        }
    }
// Subclase Gato que hereda de animal

    static class Gato extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("El gato dice: ¡Miau!");
        }
        @Override
        public void moverse() {
            System.out.println("El gato camina sigilosamente.");
        }
    }
// Subclase Pajaro que hereda de animal
    static class Pajaro extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("El pájaro dice: ¡Pío!");
        }
        @Override
        public void moverse() {
            System.out.println("El pájaro vuela por el cielo.");
        }
    }
// Subclase Vaca que hereda de animal
    static class Vaca extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("La vaca dice: ¡Muuu!");
        }
        @Override
        public void moverse() {
            System.out.println("La vaca camina lentamente por el campo.");
        }
    }
// Subclase Serpiente que hereda de animal
    static class Serpiente extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("La serpiente dice: ¡Sssss!");
        }
        @Override
        public void moverse() {
            System.out.println("La serpiente se desliza por el suelo.");
        }
    }
// Subclase Lobo que hereda de animal
    static class Lobo extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("El lobo dice: ¡Auuuu!");
        }
        @Override
        public void moverse() {
            System.out.println("El lobo corre.");
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Se crea un arreglo con diferentes tipos
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Pajaro(),
            new Vaca(),
            new Serpiente(),
            new Lobo()
        };
     // Recorremos el arreglo y ejecutamos los métodos de cada animal
        for (Animal a : animales) {
            a.hacerSonido(); // Cada animal muestra su sonido
            a.moverse(); // Cada animal muestra cómo se mueve
            System.out.println(); // Imprime una línea en blanco
        }
    }
}
