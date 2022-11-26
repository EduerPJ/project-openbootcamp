public class Main {
  public static void main(String[] args) {
    int result = sum(1050, 1, 69);

    Coche miCoche = new Coche();
    miCoche.addDoor();
    System.out.println(miCoche.numberDoors);
  }

  protected static int sum(int a, int b, int c) {
    int result = a + b + c;
    return result;
  }

  static class Coche {
    public  int numberDoors;

    public void addDoor() {
      this.numberDoors++;
    }
  }
}
