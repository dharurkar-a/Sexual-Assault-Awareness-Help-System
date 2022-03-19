/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Encounter.HelpProviderEncounter;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class HelpProviderWorkRequest extends WorkRequest {
    HelpSeekerWorkRequest HelpSeekerWorkRequest;
    ArrayList<HelpProviderEncounter> HPEncounter = new ArrayList<HelpProviderEncounter>();

    public HelpSeekerWorkRequest getHelpSeekerWorkRequest() {
        return HelpSeekerWorkRequest;
    }

    public void setHelpSeekerWorkRequest(HelpSeekerWorkRequest HelpSeekerWorkRequest) {
        this.HelpSeekerWorkRequest = HelpSeekerWorkRequest;
    }

    public ArrayList<HelpProviderEncounter> getHPEncounter() {
        return HPEncounter;
    }

    public void setHPEncounter(ArrayList<HelpProviderEncounter> HPEncounter) {
        this.HPEncounter = HPEncounter;
    }
    
}
