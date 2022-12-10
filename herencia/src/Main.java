public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNombre("Ramón");
    cliente.setEdad(35);
    cliente.setTelefono(1233444);
    cliente.setCredito(1500);
    System.out.println("Soy " + cliente.getNombre() + " tengo " + cliente.getEdad() + " años, mi número de teléfono es: "  + cliente.getTelefono() + " y tengo " + cliente.getCredito() + " en créditos");
    Trabajador trabajador = new Trabajador();
    trabajador.setSalario(150000);
    System.out.println("Gano: " + trabajador.getSalario());
  }
}

class Persona {
  private String nombre;
  private int edad;
  private int telefono;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }


  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }
}

class Cliente extends Persona {
  private int credito;

  public int getCredito() {
    return credito;
  }

  public void setCredito(int credito) {
    this.credito = credito;
  }
}

class Trabajador extends Persona {
  private int salario;

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }
}
