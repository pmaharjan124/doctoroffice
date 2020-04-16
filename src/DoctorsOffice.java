import java.util.Scanner;
public class DoctorsOffice {
    public static void main (String[] args)
    { String patientName = "Stacey Manson";
    boolean hasInsurance = false;
        double bodyTemprature = 102.2;
    int numVisits = 5;
    String nextAppointment = "April 20, 2020";
    int coPay = 20;

        System.out.println("Patient Details: ");
        System.out.println("Name: "+patientName);
        System.out.println( "Patient has insurance: "+hasInsurance);
        System.out.println( "Body temprature: " +bodyTemprature);
        System.out.println("Number of visits: " +numVisits);
        System.out.println( "Your next appointment is on " +nextAppointment);
        System.out.println("Your copay is $" +coPay);

}
}
