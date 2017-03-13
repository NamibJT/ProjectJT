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
public class Users {
     private String Name;
    private int Age;
    private String  Gender;
    
    public Users() {
    this.Name = "";
        this.Gender = "";
        this.Age = 0;
    }    
    public Users (String UName, int UAge,String UGender)
    {
        this.Name = UName;
        this.Gender = UGender;
        this.Age = UAge;
    }   
    public void setUName(String UName){
        this.Name = UName;
    }
    public String getUName(){
        return this.Name;
    }
    public void setUAge(int UAge){
        this.Age = UAge;
    }
    public int getAge(){
        return this.Age;
    }
    public void setUGender(String UGender){
        this.Gender = UGender;
    }
    public String getUGender(){
        return this.Name;
    }
   
    @Override
    public String toString()
    {
        return "Name: "+this.Name+
                "\nAge: "+this.Age+
                "\nGender: "+this.Gender +"\n";
    }
}
