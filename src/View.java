/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usr
 */
public class View {
    private String txtVaccineID, cbxVaccineName, cbxVaccinationCenter, txtStock;
    
    
    public String getVaccineID(){
        return txtVaccineID;
    }
    
    public void setVaccineID(String txtVaccineID){
        this.txtVaccineID = txtVaccineID;
    }
    
    public String getVaccineName(){
        return cbxVaccineName;
    }
    
    public void setVaccineName(String cbxVaccineName){
        this.cbxVaccineName = cbxVaccineName;
    }
    
    public String getVaccinationCenter(){
        return cbxVaccinationCenter;
    }
    
    public void setVaccinationCenter(String cbxVaccinationCenter){
        this.cbxVaccinationCenter = cbxVaccinationCenter;
    }
    
    public String getStock(){
        return txtStock;
    }
    
    public void setStock(String txtStock){
        this.txtStock= txtStock;
    }
}
