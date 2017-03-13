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
import java.util.*;
import java.util.ArrayList;
public class Doctor extends Users {
    private String  doctorSpeciality;
    private String  doctorStatus;
    public ArrayList<Patient> doctorPatientList= new ArrayList<Patient>();
    public Doctor(){
        super();
        this.doctorSpeciality = "";
    }
    public Doctor(String UName, int UAge,String UGender,String docspec){
        super(UName,UAge,UGender);
        this.doctorSpeciality = docspec;
    }
    public Doctor(Patient o){
        this.doctorPatientList.add(o);
    }

    public List<Patient> getDoctorPatientList(){   
        return doctorPatientList;
    }

    public void addPatientsToDoctor(Patient o){
        doctorPatientList.add(o);
    }
    public void setDocspeciality(String docspec){
        this.doctorSpeciality = docspec;
    }
    public String getDocspeciality(){
        return doctorSpeciality;
    }
    @Override
    public String toString(){
        return (super.toString()+"\nDoctor Speciality: "+this.doctorSpeciality);
    }

}
