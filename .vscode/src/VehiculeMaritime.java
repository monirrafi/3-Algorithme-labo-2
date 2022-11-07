public class VehiculeMaritime implements factoryVehicule {

    @Override
    public Vehicule produitVehicule(String typeVehicule) {
        if(typeVehicule.equalsIgnoreCase("bateau")){
            return new Bateau();
        }

        return null;
    }
    
}
