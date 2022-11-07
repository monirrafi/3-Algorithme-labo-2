public class VehiculeProducteur {
    public static factoryVehicule getUsineVehicule(String typeUsine) {
        if(typeUsine.equalsIgnoreCase("terrestre")){
            return new VehiculeTerreste();
        }
        if(typeUsine.equalsIgnoreCase("maritime")){
            return new VehiculeMaritime();
        }
        if(typeUsine.equalsIgnoreCase("aerien")){
            return new VehiculeAerien();
        }

        return null;

        
    }
}
