/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<HelpSeekerWorkRequest> HelpSeekerworkRequestList;
    private ArrayList<LawyerWorkRequest> LawyerworkRequestList;
    private ArrayList<HelpProviderWorkRequest> HPworkRequestList;
    private ArrayList<CounsellarWorkRequest> CounsellarworkRequestList;
    private ArrayList<DoctorWorkRequest> DoctorworkRequestList;
    private ArrayList<LabAssistanceWorkRequest> LabAssistanceWorkRequest;
    private ArrayList<PharmacistWorkRequest> PharmacistWorkRequest;
    
    public WorkQueue() {
        HelpSeekerworkRequestList = new ArrayList<HelpSeekerWorkRequest>();
        LawyerworkRequestList=new ArrayList<LawyerWorkRequest>();
        HPworkRequestList=new ArrayList<HelpProviderWorkRequest>();
        CounsellarworkRequestList = new ArrayList<CounsellarWorkRequest>();
        DoctorworkRequestList = new ArrayList<DoctorWorkRequest>();
        LabAssistanceWorkRequest = new ArrayList<LabAssistanceWorkRequest>();
        PharmacistWorkRequest = new ArrayList<PharmacistWorkRequest>();
    }

    public ArrayList<HelpSeekerWorkRequest> getHelpSeekerworkRequestList() {
        return HelpSeekerworkRequestList;
    }

    public ArrayList<LawyerWorkRequest> getLawyerworkRequestList() {
        return LawyerworkRequestList;
    }

    public ArrayList<HelpProviderWorkRequest> getHPworkRequestList() {
        return HPworkRequestList;
    }

    public ArrayList<CounsellarWorkRequest> getCounsellarworkRequestList() {
        return CounsellarworkRequestList;
    }

    public ArrayList<DoctorWorkRequest> getDoctorworkRequestList() {
        return DoctorworkRequestList;
    }

    public ArrayList<LabAssistanceWorkRequest> getLabAssistanceWorkRequest() {
        return LabAssistanceWorkRequest;
    }

    public ArrayList<PharmacistWorkRequest> getPharmacistWorkRequest() {
        return PharmacistWorkRequest;
    }

    public void setHelpSeekerworkRequestList(ArrayList<HelpSeekerWorkRequest> HelpSeekerworkRequestList) {
        this.HelpSeekerworkRequestList = HelpSeekerworkRequestList;
    }

    public void setLawyerworkRequestList(ArrayList<LawyerWorkRequest> LawyerworkRequestList) {
        this.LawyerworkRequestList = LawyerworkRequestList;
    }

    public void setHPworkRequestList(ArrayList<HelpProviderWorkRequest> HPworkRequestList) {
        this.HPworkRequestList = HPworkRequestList;
    }

    public void setCounsellarworkRequestList(ArrayList<CounsellarWorkRequest> CounsellarworkRequestList) {
        this.CounsellarworkRequestList = CounsellarworkRequestList;
    }

    public void setDoctorworkRequestList(ArrayList<DoctorWorkRequest> DoctorworkRequestList) {
        this.DoctorworkRequestList = DoctorworkRequestList;
    }

    public void setLabAssistanceWorkRequest(ArrayList<LabAssistanceWorkRequest> LabAssistanceWorkRequest) {
        this.LabAssistanceWorkRequest = LabAssistanceWorkRequest;
    }

    public void setPharmacistWorkRequest(ArrayList<PharmacistWorkRequest> PharmacistWorkRequest) {
        this.PharmacistWorkRequest = PharmacistWorkRequest;
    }
    
    public int getcountbytypesa(String type)
    {
        int count=0;
        
        for(HelpSeekerWorkRequest hp: HelpSeekerworkRequestList)
        {
            
            if(hp.getTypeofsa().equalsIgnoreCase(type))
            {
                count++;
            }
        }
        return count;
    }

    
}