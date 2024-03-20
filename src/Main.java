public class Main {
    public static void main(String[] args) {

        /// Objects;
        Operational employee1 = new Operational("Carlos", 45432778);
        Management employee2 = new Management("Martin", "Recursos Humanos");
        Officer employee3 = new Officer("Mateo", 35764978, "Mañana");
        Techician employee4 = new Techician("Cristian", 53676176, "cristian123@gmail.com");

        /// examples;
        System.out.println("Operativo:");
        System.out.println(employee1.toString());
        System.out.println("---------------");

        System.out.println("Directivo:");
        System.out.println(employee2.toString());
        System.out.println("---------------");

        System.out.println("Oficial:");
        System.out.println(employee3.toString());
        System.out.println("---------------");

        System.out.println("Tecnico:");
        System.out.println(employee4.toString());

    }
}