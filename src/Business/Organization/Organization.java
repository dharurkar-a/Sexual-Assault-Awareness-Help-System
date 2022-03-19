/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Encounter.CounsellarEncounterDirectory;
import Business.Encounter.CounsellorEncounter;
import Business.Encounter.HelpProviderEncounterDirectory;
import Business.Encounter.LawyerEncounterDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private CounsellarEncounterDirectory counsellorencounterdir;
    private LawyerEncounterDirectory lawyerencounterdir;
    private HelpProviderEncounterDirectory HPencounterdir;
    
    public enum Type{
        HelpSeeker("HelpSeekerOrganization"),Hospital("HospitalOrganization"),Forensic("ForensicOrganization"),
        CounsellingDept("CounsellingDeptOrganization"), Legal("LegalOrganization"), CaseManager("CaseManagerOrganization"),
        HelpProvider("HelpProviderOrganization"),Pharmacy("PharmacyOrganization"),Delivery("DeliveryOrganization")
        ;
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        counsellorencounterdir=new CounsellarEncounterDirectory();
        lawyerencounterdir = new LawyerEncounterDirectory();
        HPencounterdir=new HelpProviderEncounterDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public HelpProviderEncounterDirectory getHPencounterdir() {
        return HPencounterdir;
    }

    public CounsellarEncounterDirectory getCounsellorencounterdir() {
        return counsellorencounterdir;
    }

    public LawyerEncounterDirectory getLawyerencounterdir() {
        return lawyerencounterdir;
    }
    
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
