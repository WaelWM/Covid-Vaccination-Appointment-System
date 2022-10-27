/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usr
 */
public class User {
    private String txtFirst;
    private String txtLast;
    private String txtUserID;
    private String txtPass;
    private String txtPhone;
    private String txtEmail;
    private String txtAddress;
    private String txtIC;
    private String Citizen;
    private String Birthdate;
    
    public User(String txtUserID, String txtFirst, String txtLast, String txtPass, String txtPhone, String txtEmail, String Birthdate, String Citizen, String txtIC, String txtAddress) {
        this.txtUserID = txtUserID;
        this.txtFirst = txtFirst;
        this.txtLast = txtLast;
        this.txtPass = txtPass;
        this.txtEmail = txtEmail;
        this.txtPhone = txtPhone;
        this.Birthdate = Birthdate;
        this.Citizen = Citizen;
        this.txtIC = txtIC;
        this.txtAddress = txtAddress;
        
    }
    
    public String gettxtFirst() {
        return txtFirst;
    }
    
    public void settxtFirst(String txtFirst){
        this.txtFirst = txtFirst;
    }    
    
        public String gettxtLast() {
        return txtLast;
    }
    
    public void settxtLast(String txtLast){
        this.txtLast = txtLast;
    }
    
    public String gettxtUserID() {
        return txtUserID;
    }
    
    public void settxtUserID(String txtUserID){
        this.txtUserID = txtUserID;
    }
    
    public String gettxtPass(){
        return txtPass;
    }
    
    public void settxtPass(String txtPass){
        this.txtPass = txtPass;
    }
    
    public String gettxtEmail() {
        return txtEmail;
    }

    public void settxtEmail(String txtEmail) {
        this.txtEmail = txtEmail;
    }
    
    public String gettxtPhone() {
        return txtPhone;
    }

    public void settxtPhone(String txtPhone) {
        this.txtPhone = txtPhone;
    }
    
    public String gettxtAddress() {
        return txtAddress;
    }
    
    public void settxtAddress(String txtAddress){
        this.txtAddress = txtAddress;        
    }    
    
    public String gettxtIC() {
        return txtIC;
    }
    
    public void settxtIC(String txtIC){
        this.txtIC = txtIC;        
    }

    public String getCitizen() {
        return Citizen;
    }
    
    public void setCitizen(String citizen){
        this.Citizen = citizen;        
    }        
    
    public String getBirthdate() {
        return Birthdate;
    }
    
    public void setBirthdate(String Birthdate){
        this.Birthdate = Birthdate;        
    }         
}
