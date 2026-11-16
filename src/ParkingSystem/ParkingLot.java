package ParkingSystem;

public class ParkingLot {
    private ParkingSession[] session;
    private int count;

   public ParkingLot(int size) {
        session = new ParkingSession[size];
        count = 0;
    }

    public void addSession(ParkingSession id) {
        if (count < session.length) {

            session[count] = id;
            count++;
        }

    }

    public void removeSession(ParkingSession id) {
        for (int i = 0; i < count; i++) {
            if(session[i]==id){
                for (int j = i; j < count-1; j++) {
                    session[j]=session[j+1] ;
                }
                session[count-i]=null;
                count--;
                break;
            }

        }

    }

}
