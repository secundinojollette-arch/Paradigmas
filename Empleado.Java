
abstract class Empleado {
    private String nombre;
    private String cedula;
    protected double sueldoBase;
    private int id;
    private static int totalEmpleados = 0;
    private static int proximoId = 1000;

    public Empleado(String nombre, String cedula, double sueldoBase) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldoBase = sueldoBase;
        proximoId++;
        this.id = proximoId;
        totalEmpleados++;
    }
    public abstract double calcularSueldo();

    public abstract String obtenerDetalles();

    public static int obtenerTotalEmpleados() {
        return totalEmpleados;
    }

    public static void mostrarEstadisticas(double totalNomina) {
        System.out.println("Total empleados: " + totalEmpleados);
        System.out.println("Total nómina: $" + totalNomina);
    }

    public int getId() {
         return id; 
        }
    public String getNombre() { 
        return nombre; 
    }
    public double getSueldoBase() { 
        return sueldoBase;
     }
}
class Obrero extends Empleado {
    public Obrero(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase(); // 0% bonificación
    }

    @Override
    public String obtenerDetalles() {
        return "[" + getId() + "] " + getNombre() + " - Obrero - $" + calcularSueldo();
    }
}

class Supervisor extends Empleado {
    public Supervisor(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() * 1.15; // 15% bonificación
    }

    @Override
    public String obtenerDetalles() {
        return "[" + getId() + "] " + getNombre() + " - Supervisor - $" + calcularSueldo();
    }
}

// Subclase Gerente
class Gerente extends Empleado {
    public Gerente(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() * 1.25; // 25% bonificación
    }

    @Override
    public String obtenerDetalles() {
        return "[" + getId() + "] " + getNombre() + " - Gerente - $" + calcularSueldo();
    }
}


public class Empleado {
    
    public static void main(String[] args) {
    
        Empleado[] empleados = {
            new Gerente("Laura", "C001", 4000),
            new Gerente("Roberto", "C002", 4500),
            new Supervisor("Ana", "C003", 2500),
            new Supervisor("Pedro", "C004", 2700),
            new Obrero("Carlos", "C005", 1500),
            new Obrero("María", "C006", 1600),
            new Obrero("Juan", "C007", 1550),
            new Obrero("Sofía", "C008", 1580)
        };

        double totalNomina = 0;
        for (Empleado e : empleados) {
            System.out.println(e.obtenerDetalles());
            totalNomina += e.calcularSueldo();
        }
        System.out.println("Total: $" + totalNomina);
        Empleado.mostrarEstadisticas(totalNomina);
    }
}
