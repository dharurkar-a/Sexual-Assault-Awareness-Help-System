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
public class HelpSeekerWorkRequest extends WorkRequest{
    
    private String nameofvictim;
    private String relation;
    private String typeofsa;
    private String location;
    private Date doi;
    private String moredetails;
    private String suspecttype;
    private String nameofsuspect;
    private String email;
    private DoctorWorkRequest doctorWorkRequest;
    private CounsellarWorkRequest counsellarWorkRequest;
    private LawyerWorkRequest lawyerWorkRequest;
    private HelpProviderWorkRequest hpWorkRequest;
    
    public String getRelation() {
        return relation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameofvictim() {
        return nameofvictim;
    }

   

    public void setNameofvictim(String nameofvictim) {
        this.nameofvictim = nameofvictim;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getTypeofsa() {
        return typeofsa;
    }

    public void setTypeofsa(String typeofsa) {
        this.typeofsa = typeofsa;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDoi() {
        return doi;
    }

    public void setDoi(Date doi) {
        this.doi = doi;
    }

    public String getMoredetails() {
        return moredetails;
    }

    public void setMoredetails(String moredetails) {
        this.moredetails = moredetails;
    }

    public String getSuspecttype() {
        return suspecttype;
    }

    public void setSuspecttype(String suspecttype) {
        this.suspecttype = suspecttype;
    }

    public String getNameofsuspect() {
        return nameofsuspect;
    }

    public void setNameofsuspect(String nameofsuspect) {
        this.nameofsuspect = nameofsuspect;
    }

    public DoctorWorkRequest getDoctorWorkRequest() {
        return doctorWorkRequest;
    }

    public void setDoctorWorkRequest(DoctorWorkRequest doctorWorkRequest) {
        this.doctorWorkRequest = doctorWorkRequest;
    }

    public CounsellarWorkRequest getCounsellarWorkRequest() {
        return counsellarWorkRequest;
    }

    public void setCounsellarWorkRequest(CounsellarWorkRequest counsellarWorkRequest) {
        this.counsellarWorkRequest = counsellarWorkRequest;
    }

    public LawyerWorkRequest getLawyerWorkRequest() {
        return lawyerWorkRequest;
    }

    public void setLawyerWorkRequest(LawyerWorkRequest lawyerWorkRequest) {
        this.lawyerWorkRequest = lawyerWorkRequest;
    }

    public HelpProviderWorkRequest getHpWorkRequest() {
        return hpWorkRequest;
    }

    public void setHpWorkRequest(HelpProviderWorkRequest hpWorkRequest) {
        this.hpWorkRequest = hpWorkRequest;
    }
  

}
