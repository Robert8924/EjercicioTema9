public class Main {
    public static void main(String[] args) {
    Cliente cliente = new  Cliente();
    cliente.credito = 300.9;
    cliente.edad= 20;
    cliente.Nombre= "Robert";
    cliente.Telefono="12345678";
        System.out.println(cliente.credito);
        System.out.println(cliente.edad);
        System.out.println(cliente.Nombre);
        System.out.println(cliente.Telefono);

    Trabajador trabajador = new Trabajador();
       trabajador.salario = 300.9;
        trabajador.edad= 25;
        trabajador.Nombre= "Robert";
        trabajador.Telefono="12345678";
        System.out.println(trabajador.salario);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.Nombre);
        System.out.println(trabajador.Telefono);

    }
}

class Persona{
    int edad;
    String Nombre;
    String Telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends  Persona{
    double salario;
}