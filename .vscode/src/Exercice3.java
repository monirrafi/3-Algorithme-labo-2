public class Exercice3 {
    public static void main(String[] args) {
        factoryVehicule vehu = VehiculeProducteur.getUsineVehicule("terrestre");
        Vehicule v1 = vehu.produitVehicule("bicyclette");
        v1.seDeplacer();
        Vehicule v2 = vehu.produitVehicule("moto");
        v2.seDeplacer();
        Vehicule v3 = vehu.produitVehicule("auto");
        v3.seDeplacer();
        Vehicule v4 = vehu.produitVehicule("camion");
        v4.seDeplacer();
        factoryVehicule vehu2 = VehiculeProducteur.getUsineVehicule("maritime");
        Vehicule v5 = vehu2.produitVehicule("bateau");
        v5.seDeplacer();
        factoryVehicule vehu3 = VehiculeProducteur.getUsineVehicule("aerien");
        Vehicule v6 = vehu3.produitVehicule("avion");
        v6.seDeplacer();

    }
    
}
