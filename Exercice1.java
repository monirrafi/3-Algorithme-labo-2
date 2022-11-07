
public class Exercice1 {
    public static int hanoi(int n, String depart, String intermediare, String arrivee) {
        int nbre_de_fois =0;
        if(n>0){
            nbre_de_fois +=  hanoi(n-1, depart, arrivee, intermediare);
            System.out.println("Deplacer le disque no " + n + " de position " + depart + " vers position " + arrivee);
            nbre_de_fois++;
            nbre_de_fois +=  hanoi(n-1, intermediare, depart, arrivee);
        }
        return nbre_de_fois;
    }
    public static void main(String[] args) {
        System.out.println(" le nomdre de fois pour tours de Hanoï à 3 est : " + hanoi(3,"A","B","C"));
        System.out.println(" le nomdre de fois pour tours de Hanoï à 5 est : " + hanoi(5,"A","B","C"));
        System.out.println(" le nomdre de fois pour tours de Hanoï à 15 est : " + hanoi(15,"A","B","C"));
        
    }

    
}