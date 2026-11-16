package ParkingSystem;

public class PymentReciept {
    private Vehicle vehicle;
    private ParkingSession session;
   private double amount=0;
    PymentReciept( Vehicle vehicle,ParkingSession session) {

           calculate(session,vehicle);

    }
    public PymentReciept(PymentReciept other){
        this.vehicle=other.vehicle;
        this.session=other.session;
        this.amount=other.amount;

    }
    public double calculate(ParkingSession session,Vehicle vehicle){
        if(vehicle.getType().equalsIgnoreCase("Motorcycle")){
            amount= session.getDuration()*30;

        } else
        if(vehicle.getType().equalsIgnoreCase("car")){
            amount= session.getDuration()*60;
        }
        else
        if(vehicle.getType().equalsIgnoreCase("SUV")){
            amount= session.getDuration()*100;
        }
        if(amount!=0&& session.getDuration()>=6){
            amount+=200;
        }
        return amount;
    }

    public double getPyment(){
           return amount;

    }



}
