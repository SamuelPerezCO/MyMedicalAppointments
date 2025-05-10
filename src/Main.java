import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahi Salgado" , "Pediatria");
        myDoctor.addAvailableAppointment(new Date() , "4pm");
        myDoctor.addAvailableAppointment(new Date() , "10am");
        myDoctor.addAvailableAppointment(new Date() , "1 pm");

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + "  " + aA.getTime());
        }

        Patient patient = new Patient("Alejandra" , "alejandra@email.com");
        System.out.println(patient);

    }

}