public class VehiculeAerien implements factoryVehicule {

    @Override
    public Vehicule produitVehicule(String typeVehicule) {
        if(typeVehicule.equalsIgnoreCase("avion")){
            return new Avion();
        }

        return null;
    }
    
}
