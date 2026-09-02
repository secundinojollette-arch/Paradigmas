class Vehiculo {
protected String modelo;
    protected int anio;
    protected double velocidad;

    public Vehiculo(String modelo, int anio) {
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = 0; // inicia en 0
    }
    public void acelerar(double incremento) {
        velocidad += incremento;
    }
    public void frenar(double decremento) {
        velocidad = Math.max(0, velocidad - decremento);
    }
    public String obtenerModelo() {
        return modelo;
    }
    public void mostrarDetalles() {
        System.out.println("Modelo: " + modelo + ", Anio: " + anio + ", Velocidad: " + velocidad + " km/h");
    }
}
 class Auto extends Vehiculo{
    protected int puertas;

    public Auto(String modelo, int anio, int puertas) {
        super(modelo, anio);
        this.puertas = puertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Puertas: " + puertas);
    }
}
 class Camion extends Vehiculo {
    protected double cargaMaxima;

    public Camion(String modelo, int anio, double cargaMaxima) {
        super(modelo, anio);
        this.cargaMaxima = cargaMaxima;
    }

    public void cargar(double peso) {
        System.out.println("Cargando " + peso + " kg en el camion...");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Carga maxima: " + cargaMaxima + " kg");
    }
}
 class AutoDeportivo extends Auto {
    protected double velocidadMaxima;

    public AutoDeportivo(String modelo, int anio, int puertas, double velocidadMaxima) {
        super(modelo, anio, puertas);
        this.velocidadMaxima = velocidadMaxima;
    }

    public void turbo() {
        System.out.println("Turbo");
        velocidad = Math.min(velocidad + 50, velocidadMaxima);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Velocidad maxima: " + velocidadMaxima + " km/h");
    }
}
 class Moto extends Vehiculo {
    protected boolean tieneSidecar;

    public Moto(String modelo, int anio, boolean tieneSidecar) {
        super(modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }

    public void agregarSidecar() {
        tieneSidecar = true;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}

public class Vehiculos {
     public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[4];

        vehiculos[0] = new Auto("Sedaan", 2020, 4);
        vehiculos[1] = new Moto("Harley", 2018, false);
        vehiculos[2] = new Camion("Volvo", 2015, 12000);
        vehiculos[3] = new AutoDeportivo("Ferrari", 2022, 2, 350);
       
        for (Vehiculo v : vehiculos) {
            v.acelerar(30); 
            v.mostrarDetalles();          
        }
        AutoDeportivo ferrari = (AutoDeportivo) vehiculos[3];
        ferrari.turbo();
        ferrari.mostrarDetalles();
    }
}
