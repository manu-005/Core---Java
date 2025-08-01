public class PoliticianRunner {
    public static void main(String[] args) {

        Politician p1 = new Politician("John Doe");
        System.out.println("Politician Name: " + p1.name);

        Politician p2 = new Politician("Democratic", true);
        System.out.println("Politician Party: " + p2.party);

        Politician p3 = new Politician(15);
        System.out.println("Years in Service: " + p3.years);

        Politician p4 = new Politician("Chief Minister", 2023);
        System.out.println("Position: " + p4.position + ", Elected Year: " + p4.electedYear);
    }
}
