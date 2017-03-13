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
public class Nurse extends Users{
      private String Speciality;
   public Nurse(){
       super();
       this.Speciality = "";
   }
   public Nurse(String UName, int UAge,String UGender, String Nrspec){
       super(UName,UAge,UGender);
       this.Speciality = Nrspec;
   }
   public void setSpec(String patprob){
       this.Speciality = patprob;
   }
   public String getpatprob(){
       return this.Speciality;
   }
    @Override
    public String toString()
    {
        return super.toString()+"\nDisease: "+this.Speciality+"\n";
    }
}
