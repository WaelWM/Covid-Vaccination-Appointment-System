/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usr
 */
public class Appoint {
    private String txtID;
    private String txtPhone;
    private String txtEmail;
    private String txtAddress;
    private String txtAppdate;
    private String txtVaccine;
    private String txtVaccen;
    
    public Appoint(String txtID, String txtPhone, String txtEmail, String txtAddress, String txtAppDate, String txtVaccine, String txtVaccen) {
        this.txtID = txtID;
        this.txtPhone = txtPhone;
        this.txtEmail = txtEmail;
        this.txtAddress = txtAddress;
        this.txtAppdate = txtAppDate;
        this.txtVaccine = txtVaccine;
        this.txtVaccen = txtVaccen;
        
    }
    
    public String gettxtID() {
        return txtID;
    }
    
    public void settxtID(String txtID){
        this.txtID = txtID;
    }    
    
        public String gettxtPhone() {
        return txtPhone;
    }
        
    public void settxtPhone(String txtPhone){
        this.txtPhone = txtPhone;
    }    
    
    public String gettxtEmail() {
        return txtEmail;
    }
    
    public void settxtEmail(String txtEmail){
        this.txtEmail = txtEmail;
    }
    
    public String gettxtAddress() {
        return txtAddress;
    }
    
    public void settxtAddress(String txtAddress){
        this.txtAddress = txtAddress;
    }
    
    public String gettxtAppdate(){
        return txtAppdate;
    }
    
    public void settxtAppdate(String txtAppDate){
        this.txtAppdate = txtAppDate;
    }
    
    public String gettxtVaccine() {
        return txtVaccine;
    }

    public void settxtVaccine(String txtVaccine) {
        this.txtVaccine = txtVaccine;
    }
    
    public String gettxtVaccen() {
        return txtVaccen;
    }

    public void settxtVaccen(String txtVaccen) {
        this.txtVaccen = txtVaccen;
    }
   
}
