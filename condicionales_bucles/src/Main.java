public class Main {
  public static void main(String[] args) {
    int numeroIf = -234;

    if (numeroIf > 0) {
      System.out.println("El número: " + numeroIf + " es positivo");
    } else if (numeroIf < 0) {
      System.out.println("El número: " + numeroIf + " es negativo");
    } else System.out.println("El número: " + numeroIf + " es cero");

    int numeroWhile = 0;

    while (numeroWhile < 3) {
      numeroWhile++;
      System.out.println(numeroWhile);
    }

    int numeroDoWhile = 1;
    do {
      System.out.println(numeroDoWhile);
      numeroDoWhile--;
    } while (numeroDoWhile > 0);

    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.println(numeroFor);
    }

    String estacion = "verano";

    switch (estacion) {
      case "invierno":
        System.out.println("La estación actual es: " + estacion);
        break;
      case "primavera":
        System.out.println("La estación actual es: " + estacion);
        break;
      case "otoño":
        System.out.println("La estación actual es: " + estacion);
        break;
      case "verano":
        System.out.println("La estación actual es: " + estacion);
        break;
      default:
        System.out.println("Sin estación");
    }
  }
}
