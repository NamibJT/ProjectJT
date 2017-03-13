/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp_tal;

/**
 *
 * @author JT
 */
import java.util.Scanner;
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Hospital hosp = new Hospital();
        
        System.out.println("==============_St Marie Private Hospital Manangement System_=================");
        char bsy;
        do{
        System.out.println("============_Press any key to continue_================"+
                "\n=================Press 'Y' for single Usage===============");
        bsy = input.next().charAt(0);
        Character.toUpperCase(bsy);
    System.out.println("Press 1 to add patient. "
            + "\nPress 2 to show patients."
            + "\nPress 3 to add Doctor. "
            + "\nPress 4 to show doctors."
            + "\nPress 5 to add Nurse."
            + "\nPress 6 to show Nurse."
            + "\nPress 7 Assign doctor to patients."
            + "\nPress 8 to show number of patients."
            + "\nPress 9 to remove a Patient."
            + "\nPress 10 to show Doctor and their patients. ");
         
        
        
        int choice = input.nextInt();
        switch (choice)
             {      
                    //Adds a patient and passes the information to the patientList.
            case 1: hosp.AddPat();
                    hosp.addPatient(null);
                    break;
                
            case 2: //Displays the patients that where created.
                    System.out.println(hosp.patientList);
                    break;
                
                    //Adds a docter and passes the information to the doctorList.
            case 3: hosp.AddDoc();
                    hosp.addDoctor(null);
                    break;
                
                    //Displays docters details including their speciality.
            case 4: System.out.println(hosp.doctorList);
                    break;
                
            case 5: hosp.AddNurse();
                    break;
                
            case 6: hosp.showNurse();
                    break;
                
                    //Assigns a docter to a patient
            case 7: hosp.assignDoctor();
                    hosp.doctor.addPatientsToDoctor(null);
                    break;
                
            case 8: hosp.countPat();
                    break;
                
                    //Removes a Patient from Hospital.
            case 9: hosp.remuser();
                    break;
                
                    //Show docters and their patients.
            case 10: hosp.assignDoctor();
                    //System.out.println("\nDoctor Name :"+hosp.doctor.getUName()+"\nSteciality :"+hosp.doctor.getDocspeciality()
                    //+"\n"+hosp.doctor.getDoctorPatientList());
                    break;
             }
     }while(bsy != 'Y');

    }
    
}
