/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Encounter.LawyerEncounter;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class LawyerWorkRequest extends WorkRequest{
    HelpSeekerWorkRequest HelpSeekerWorkRequest;
    ArrayList<LawyerEncounter> LEncounter = new ArrayList<LawyerEncounter>();

    public HelpSeekerWorkRequest getHelpSeekerWorkRequest() {
        return HelpSeekerWorkRequest;
    }

    public void setHelpSeekerWorkRequest(HelpSeekerWorkRequest HelpSeekerWorkRequest) {
        this.HelpSeekerWorkRequest = HelpSeekerWorkRequest;
    }

    public ArrayList<LawyerEncounter> getLEncounter() {
        return LEncounter;
    }

    public void setLEncounter(ArrayList<LawyerEncounter> LEncounter) {
        this.LEncounter = LEncounter;
    }
    
    
}

