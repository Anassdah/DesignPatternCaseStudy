import java.math.BigInteger;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int choix = 0;
        Terre t1=null;
        BigInteger population;
        Scanner clavier = new Scanner(System.in);
        while (choix != 4) {
            System.out.println("Cliquer 1 pour creer l'objet terre, 2 pour afficher les infos et 3 pour modifier, 4 pour quitter");
            choix = clavier.nextInt();
            switch (choix) {
                case 1:
                    t1 = Terre.getInstance();
                    break;
                case 2:
                    if (t1 == null) {
                        System.out.println("vous devez dabord creer l'objet terre");
                        break;
                    } else {
                        t1.afficher();
                        break;
                    }
                case 3:
                    if (t1== null) {
                        System.out.println("vous devez dabord creer l'objet terre");
                        break;
                    } else {
                        System.out.println("entrez la nouvelle valeurs de pop:");
                        population = clavier.nextBigInteger();
                        t1.modifier(population);
                    }
                case 4:
                    break;
                default:
                    System.out.println("veuillez choisir une option valable");
            }
        }
        System.out.println("Bonne journée");
    }
}
