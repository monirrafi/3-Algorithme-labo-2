public class VehiculeTerreste implements factoryVehicule {

    @Override
    public Vehicule produitVehicule(String typeVehicule) {
        if(typeVehicule.equalsIgnoreCase("auto")){
            return new Auto();
        }
        if(typeVehicule.equalsIgnoreCase("moto")){
            return new Moto();
        }
        if(typeVehicule.equalsIgnoreCase("bicyclette")){
            return new Bicyclette();
        }
        if(typeVehicule.equalsIgnoreCase("camion")){
            return new Camion();
        }

        return null;
    }

    
}