import java.util.Scanner;

class Tender {
    double cost;
    String company;

    void getData(Scanner sc) {
        System.out.print("Enter company name: ");
        company = sc.next();
        System.out.print("Enter cost: ");
        cost = sc.nextDouble();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender t[] = new Tender[5];
        double minCost = Double.MAX_VALUE;
        String minCompany = "";

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("\nEnter details for tender " + (i + 1));
            t[i].getData(sc);

            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].company;
            }
        }

        System.out.println("\nCompany with minimum cost: " + minCompany);
        sc.close();
    }
}
