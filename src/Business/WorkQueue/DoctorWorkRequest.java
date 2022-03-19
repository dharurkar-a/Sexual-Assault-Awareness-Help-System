/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author patel
 */
public class DoctorWorkRequest extends WorkRequest{
    
    HelpSeekerWorkRequest HelpSeekerWorkRequest;
    LabAssistanceWorkRequest LabAssistanceWorkRequest;
    PharmacistWorkRequest PharmacistWorkRequest;
    private String docsign;

    public HelpSeekerWorkRequest getHelpSeekerWorkRequest() {
        return HelpSeekerWorkRequest;
    }

    public void setHelpSeekerWorkRequest(HelpSeekerWorkRequest HelpSeekerWorkRequest) {
        this.HelpSeekerWorkRequest = HelpSeekerWorkRequest;
    }

    public String getDocsign() {
        return docsign;
    }

    public void setDocsign(String docsign) {
        this.docsign = docsign;
    }

    public LabAssistanceWorkRequest getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public void setLabAssistanceWorkRequest(LabAssistanceWorkRequest LabAssistanceWorkRequest) {
        this.LabAssistanceWorkRequest = LabAssistanceWorkRequest;
    }

    public PharmacistWorkRequest getPharmacistWorkRequest() {
        return PharmacistWorkRequest;
    }

    public void setPharmacistWorkRequest(PharmacistWorkRequest PharmacistWorkRequest) {
        this.PharmacistWorkRequest = PharmacistWorkRequest;
    }
    
    
    
    
    
    
    
    

}
