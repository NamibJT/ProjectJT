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
public class Hospital_Bills implements Bill {
    private double totalbill;
    private double registrationfee;
    private double hospitalfee;
    private double totalpaid;
    
    public Hospital_Bills(){
        this.registrationfee = 500.0;
        this.hospitalfee = 0.0;
        this.totalbill = 0.0;
        this.totalpaid = 0.0;
           
    }
    public Hospital_Bills(double regfee,double hosfee,double totpaid){
        this.hospitalfee = hosfee;
        this.registrationfee = regfee;
        this.totalpaid = totpaid;
    }
    public void sethospitalfee(double hosfee){
        this.hospitalfee = hosfee;
    }
    public double gethospitalfee(){
        return this.hospitalfee;
    }
    public void settotalpaid(double totpaid){
        this.totalpaid = totpaid;
    }
    public double gettotalpaid(){
        return this.totalpaid;
    }
    public double getregfee(){
        return this.registrationfee;
    }
    @Override        
    public double Registration_fee() {
        return this.registrationfee;
    }

    @Override
    public double Total_Bill() {
        return this.totalbill = this.hospitalfee + Registration_fee();
    }

    @Override
    public double Pending_Bill() {
        
        return this.totalbill  = (Total_Bill()) - this.totalpaid;
        
    }
    public String toString(){
        return"\nPatient owes :"+Pending_Bill();
    }
   
}
