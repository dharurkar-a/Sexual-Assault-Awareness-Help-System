/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Encounter.CounsellorEncounter;
import Business.Encounter.HelpProviderEncounter;
import java.util.ArrayList;

/**
 *
 * @author Ankita Dharurkar
 */
public class CounsellarWorkRequest extends WorkRequest{
    HelpSeekerWorkRequest HelpSeekerWorkRequest;
    ArrayList<CounsellorEncounter> ConslrEncounter = new ArrayList<CounsellorEncounter>();

    public HelpSeekerWorkRequest getHelpSeekerWorkRequest() {
        return HelpSeekerWorkRequest;
    }

    public void setHelpSeekerWorkRequest(HelpSeekerWorkRequest HelpSeekerWorkRequest) {
        this.HelpSeekerWorkRequest = HelpSeekerWorkRequest;
    }

    public ArrayList<CounsellorEncounter> getConslrEncounter() {
        return ConslrEncounter;
    }

    public void setConslrEncounter(ArrayList<CounsellorEncounter> ConslrEncounter) {
        this.ConslrEncounter = ConslrEncounter;
    }

    
    
}
