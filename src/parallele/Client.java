package parallele;

import java.math.BigInteger;

public class Client {
    public static void main(String[] args) {
        parallele.Terre t1= parallele.Terre.getInstance();
        parallele.Terre t2= parallele.Terre.getInstance();
        t1.afficher();
        BigInteger newpop=new BigInteger("800000000000");
        t2.modifier(newpop);
        t2.afficher();

    }

}
