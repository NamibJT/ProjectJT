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
import java.util.*;
import java.util.ArrayList;
public class Hospital {
    Scanner input = new Scanner(System.in);
    Hospital_Bills bills = new Hospital_Bills();
    Doctor doctor = new Doctor();
    Patient patient = new Patient();
    Nurse nurse = new Nurse();
    
    List <Doctor> doctorList = new ArrayList<>();
    List <Patient> patientList = new ArrayList<>();
    List <Nurse> nurseList = new ArrayList<>();
    
    

  private String HospName, HospAddress, HospPO_box, HospTel, HospAcc_nr;
  public Hospital(){
      this.HospName = "St Marie";    this.HospAddress = "Windhoek, Roengen Street 13";
      this.HospPO_box = "PO Box 22403";  this.HospAcc_nr = "FNB Main Branch\nAccount Number: 874016889";
      this.HospTel = "+555000";
  }
  //Displays the Hospitals Information.
  public void HospInfo(){
  System.out.println(this.HospName+
            "\n"+this.HospAddress+
            "\n"+this.HospPO_box+
            "\n"+this.HospTel+"\n"+this.HospAcc_nr);
  }
  //Adds a doctor
  public void AddDoc(){
      boolean don = false;
      int Age = 0;
      System.out.print("Enter Doc Name :");
                     String Name = input.next();
            while(!don){
                try{
                System.out.print("Enter Docters Age :");
                Age = input.nextInt();
                don = true;
            }
                catch(InputMismatchException ex){
                //Clears the buffer
                input.nextLine();
                System.err.println("ERROR:Wrong input!!"+ex);
            }
            }
                     System.out.print("Enter Doc Gender :");
                     String Gender = input.next();
                     System.out.print("Enter Doc Speciality :");
                     String special = input.next();
                     //Passes information to constructor in Doctor class
                     doctor = new Doctor(Name, Age,Gender,special);
  }                 
  public void AddPat(){
      boolean dot = false;
      int Age = 0;
      System.out.print("Enter Patient Name :");
                     String Name = input.next();
            while(!dot){
                try{
                System.out.print("Enter Patient Age :");
                Age = input.nextInt();
                dot = true;
                }
                catch(InputMismatchException ex){
                //Clears the buffer
                input.nextLine();
                System.out.println("ERROR:Wrong input!!");
                }
            }
                     System.out.print("Enter Patient Gender :");
                     String Gender = input.next();
                     System.out.print("Enter Problem patient is experiencing :");
                     String patprob = input.next();
                     patient = new Patient(Name, Age,Gender,patprob);
                     doctor.addPatientsToDoctor(patient);// = new Doctor(patient);
                     
                     patient.setBill();
  }
  public void AddNurse(){
      boolean dod = false;
      int Age = 0;
      System.out.print("Enter Nurse Name :");
                     String Name = input.next();
            while(!dod){
                try{
                System.out.print("Enter Nurse Age :");
                Age = input.nextInt();
                dod = true;
            }
                catch(InputMismatchException ex){
                //Clears the buffer
                input.nextLine();
                System.err.println("ERROR:Wrong input!!"+ex);
            }
            }
                     System.out.print("Enter Nurse Gender :");
                     String Gender = input.next();
                     System.out.print("Enter Problem Nurse is experiencing :");
                     String patprob = input.next();
                     nurse = new Nurse(Name, Age,Gender,patprob);
  }
  
  public void addDoctor(Doctor o){
    doctorList.add(doctor);
  }
  public void addPatient(Patient o){
    patientList.add(patient);
  }

  public List<Doctor> showDoctors(){
    return doctorList;
  }
  public List<Patient> showPatients(){
    return patientList;
  }
  public List<Nurse> showNurse(){
      return nurseList;
  }

  public void assignDoctor(){
    for (Patient x: patientList)
    {      for (Doctor y: doctorList)
            {     if (x.getpatprob().equals("eye"))
                        {
                            if (y.getDocspeciality().equals("Opthalmologist"))
                                {
                                   System.out.println("\nDocter :"+y+"\nPatient :"+x);//y.addPatientsToDoctor(x);
                                   
                                }
                        }
            else if (x.getpatprob().equals("heart"))
            {
                if (y.getDocspeciality().equals("Surgeon"))
                    {
                       System.out.println("\nDocter :"+y+"\nPatient :"+x);//y.addPatientsToDoctor(x);
                    }
            }

            else if (x.getpatprob().equals("checkup"))
            {
                if (y.getDocspeciality().equals("GP"))
                    {
                       System.out.println("\nDocter :"+y+"\nPatient :"+x);//y.addPatientsToDoctor(x);
                    }
            }

            }
        }

  }
  public void remuser(){
      String nam;
      System.out.print("Enter the name you wish to remove :");
      nam = input.next();
      boolean get = false;
      int pos; 
      for (Patient x: patientList){
          if(x.getUName().equalsIgnoreCase(nam)){
              pos = patientList.indexOf(x.getUName().equalsIgnoreCase(nam));
              
              patientList.remove(pos);
              System.out.println(pos);
          }
          else if(x.getUName() == null ? nam != null : !x.getUName().equals(nam)){
          System.out.println("Name not fount please try again.");
      }
          
      }
  }
 public void countPat(){
    int count = 0;
    for(Patient x: patientList){
        count++;
    }
    System.out.println("\nNumber of patients are :"+count);
   }
}
