import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {

        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println("Zoo name: " + zooName);
        System.out.println("Number of cages: " + nbrCages);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the zoo: ");
        zooName = scanner.nextLine();

        while (zooName.trim().isEmpty()) {
            System.out.print("The zoo name cannot be empty. Enter again: ");
            zooName = scanner.nextLine();
        }

        System.out.print("Enter the number of cages: ");

        while (!scanner.hasNextInt()) {
            System.out.print("Enter a number: ");
            scanner.next();
        }

        nbrCages = scanner.nextInt();

        while (nbrCages <= 0) {
            System.out.print("The number of cages must be positive. Enter again: ");
            nbrCages = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Zoo name: " + zooName);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println();

        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);

        Animal[] animals = new Animal[25];

        animals[0] = lion;
        animals[1] = elephant;

        Zoo myZoo = new Zoo(animals, zooName, "Tunis", nbrCages);
        System.out.println();
        myZoo.displayZoo();
        System.out.println();
        //tests
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println();
        //q9
        System.out.println(lion);
        System.out.println(elephant);

        scanner.close();
    }
}