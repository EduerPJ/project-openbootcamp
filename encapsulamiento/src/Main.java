public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.setNombre("Eduer");
    person.setEdad(32);
    person.setTelefono(123456789);
    System.out.println(person.getNombre());
    System.out.println(person.getEdad());
    System.out.println(person.getTelefono());
  }
}

class Person {
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
