import ParkingSystem.*;


public class Main {
     static void main(String[] args) {

        ParkingSession session1=new ParkingSession(302);
        Vehicle vehicle1=new Vehicle("LEA-301","car");
        session1.setVehicle(vehicle1);
       // session1.dispay();
        session1.setDuration(6);
        //session1.dispay();
        //session1.markPaid();
       // session1.dispay();
        session1.setDuration(5);
       // session1.dispay();
       ParkingSession  session2= new ParkingSession(session1);
      // session2.dispay();
       session2.setDuration(7);
       session2.setNotes("shallow=verified");
      // session1.dispay();//
         // session2.dispay();
       ParkingSession session3=new ParkingSession(session1,true);
       session3.setNotes("Deep-Entered");
       session1.markPaid();
       session1.dispay();
       session1.setDuration(10);
       session1.dispay();
     //  session1.dispay();
       //session2.dispay();
       //session3.dispay();



    }
}