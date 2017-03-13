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
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Patient extends Users {
   private String disease;
   private double registration_fee;
   Scanner in = new Scanner(System.in);
   List <Patient> patientList = new ArrayList<>();
   Doctor doc;
   public Patient(){
       super();
       this.disease = "";
       this.registration_fee = 500;
   }
   public Patient(String UName, int UAge,String UGender, String patprob){
       super(UName,UAge,UGender);
       this.disease = patprob;
   }
   public void setpatprob(String patprob){
       this.disease = patprob;
   }
   public String getpatprob(){
       return this.disease;
   }
    Hospital_Bills Patient;
    public void setBill(){
        double hosfee = 0.0;
        boolean done = false;
        //Hospital fee exception
        while(!done){
            try{
                System.out.println("Enter the hospital fee");
                hosfee = in.nextDouble();
                done = true;
            }
            catch(InputMismatchException ex){
                //Clears the buffer
                in.nextLine();
                System.err.println("ERROR:Wrong input!!"+ex);
            }
        }
        double totpaid = 0;
        boolean dne = false;
        //Money paid by Patient exception
        while(!dne){
            try{
               System.out.println("Enter amount paid by Patient");
               totpaid = in.nextDouble();
               dne = true;
            }
            catch(InputMismatchException ex){
                //Clears the buffer
                in.nextLine();
                System.err.println("ERROR:Wrong input!!"+ex);
            }
        }
        if(totpaid <= 0){
            System.out.println("No money paid");
        }
        double regfee = this.registration_fee;
        
        Patient = new Hospital_Bills(regfee,hosfee,totpaid);
        
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nDisease: "+this.disease+"\n"+this.Patient.toString();
    }
}
  