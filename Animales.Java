public class Animales {

    // Clase abstracta base
    static abstract class Animal {
        public abstract void hacerSonido();
        public abstract void moverse();
    }

    // Subclases internas
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

    static class Oveja extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("La oveja dice: ¡Beeee!");
        }
        @Override
        public void moverse() {
            System.out.println("La oveja se mueve en grupo.");
        }
    }

    static class Lobo extends Animal {
        @Override
        public void hacerSonido() {
            System.out.println("El lobo dice: ¡Auuuu!");
        }
        @Override
        public void moverse() {
            System.out.println("El lobo se desplaza sigilosamente.");
        }
    }

    // Método principal
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Pajaro(),
            new Vaca(),
            new Oveja(),
            new Lobo()
        };

        for (Animal a : animales) {
            a.hacerSonido();
            a.moverse();
            System.out.println("--------------------");
        }
    }
}
