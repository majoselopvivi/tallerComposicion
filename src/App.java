public class App {
    public static void main(String[] args) throws Exception {
        Vuelo vuelo = new Vuelo("AV9401", "Bogotá", "Medellin", 5);
        vuelo.mostrarInfo();

        System.out.println();
        vuelo.enbarcar("A1");
        vuelo.enbarcar("A3");
        vuelo.enbarcar("A5");
        vuelo.enbarcar("A1");

        System.out.println();
        vuelo.mostrarAsientos();

        System.out.println();
        vuelo.desembarcar("A3");
        vuelo.mostrarAsientos();
    }
}
