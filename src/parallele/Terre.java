package parallele;import java.math.BigInteger;

public class Terre {
    private BigInteger pop,age;
    private static parallele.Terre instance=null;
    private Terre(){
        pop = new BigInteger("7800000000");age=new BigInteger("4543000000");
    }
    public static parallele.Terre getInstance(){
        if (parallele.Terre.instance == null) {
            synchronized (parallele.Terre.class) {
                if (parallele.Terre.instance == null) {
                    parallele.Terre.instance = new parallele.Terre();
                }
            }
        }
        return instance;
    }
    public void afficher(){
        System.out.println("L'age de la terre est "+age);
        System.out.println("La population actuelle de la terre est de "+pop);
    }
    public void modifier(BigInteger pop){
        this.pop=new BigInteger(pop.toString());
    }
}
