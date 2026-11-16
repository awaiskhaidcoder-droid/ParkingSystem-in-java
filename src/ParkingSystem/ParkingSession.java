package ParkingSystem;

public class ParkingSession {
    private int id;
    private int duration;
    private String status="unpaid";
    private String[] notes = {"Entered"};
    private Vehicle vehicle;
    private PymentReciept pyment;

    public ParkingSession(int id) {
        this.id = id;
        this.status = "unpaid";
        this.duration=0;





    }
   public ParkingSession(ParkingSession other) {
        this.id = other.id;
        this.status = other.status;
        this.vehicle = other.vehicle;
        this.duration = other.duration;
        this.notes = other.notes;
        if (other.pyment != null) {
            this.pyment = new PymentReciept(other.pyment);
        }

    }
   public ParkingSession(ParkingSession other, boolean deepcopy) {
        this.id = other.id;
        this.status = other.status;
        this.vehicle = other.vehicle;
        this.duration = other.duration;
        if (other.pyment != null) {
            this.pyment = new PymentReciept(other.pyment);
        }
        if (deepcopy) {
            this.notes = new String[other.notes.length];
            for (int i = 0; i < other.notes.length; i++) {
                this.notes[0] = "Deep=verified";
            }
        } else this.notes = other.notes;
    }
    public void setVehicle(Vehicle v) {
        this.vehicle = v;
    }

    public void setDuration(int time) {
        if (time >= 0 && !status.equalsIgnoreCase("paid")) {
            this.duration = time;
           pyment=new PymentReciept(vehicle, this);
        }


    }
    public int getDuration(){
        return duration;
    }

    public void setNotes(String note){

        this.notes[0]=note;
    }
    public void markPaid(){
        if(pyment.getPyment()!=0 && !status.equalsIgnoreCase("paid")){
            status="Paid";

        }
    }
    public void dispay(){
        System.out.print("Parking ID :"+id+" |    ");
        System.out.print("Duration "+getDuration()+" |    ");
        if(vehicle!=null) {
            System.out.print("Vehicle : " + vehicle.getType()+" |    ");
        }
        System.out.print("Status : "+status+" |    ");
        if(pyment !=null) {
            System.out.print("Amount : " + pyment.getPyment()+" |    ");
        }
        System.out.println("Note : ");
        for (int i = 0; i < notes.length; i++) {
            System.out.print(notes[i]+"  |  '");
        }

        System.out.println("");
    }
}

