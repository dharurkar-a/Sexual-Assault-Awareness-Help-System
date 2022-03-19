/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author patel
 */
public class PharmacistWorkRequest extends WorkRequest{
    
    DoctorWorkRequest DoctorWorkRequest;
    private ArrayList<Meds> medicines = new ArrayList<Meds>();

    public DoctorWorkRequest getDoctorWorkRequest() {
        return DoctorWorkRequest;
    }

    public void setDoctorWorkRequest(DoctorWorkRequest DoctorWorkRequest) {
        this.DoctorWorkRequest = DoctorWorkRequest;
    }

    public ArrayList<Meds> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Meds> medicines) {
        this.medicines = medicines;
    }
    
    
    
    
    

}
