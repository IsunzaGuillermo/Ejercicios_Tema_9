public class Persona {

    public int edad;
    public String nombre;
    public int telefono;

    public Persona(int edad, String nombre, int telefono) {
        super();
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public static class Cliente extends Persona {
        public int credito;

        public Cliente(int edad, String nombre, int telefono, int credito) {
            super(edad, nombre, telefono);
            this.credito = credito;
        }

    }

    public static class Trabajador extends Persona {
        public int salario;

        public Trabajador(int edad, String nombre, int telefono, int salario) {
            super(edad, nombre, telefono);
            this.salario = salario;
        };
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente(38, "José María", 55558888, 500000);
        System.out.println(cliente);

        Trabajador trabajador = new Trabajador(29, "María José", 88885555, 6000);
        System.out.println(trabajador);
    }

}//persona
