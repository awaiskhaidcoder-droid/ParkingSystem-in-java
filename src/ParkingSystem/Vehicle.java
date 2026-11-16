package ParkingSystem;

public class Vehicle {
    private String registration;
    private String type;
    public Vehicle(String reg,String type){
        if(reg!=null && !reg.trim().isEmpty()){
            this.registration=reg;
        }
        if(type!=null){
         if (type.equalsIgnoreCase("Motorcycle") || type.equalsIgnoreCase("Car") || type.equalsIgnoreCase("SUV")){
            this.type=type;
       }
        }


    }


    public String getRegistration() {
        return registration;
    }

    public String getType() {
        return this.type;
    }

}
