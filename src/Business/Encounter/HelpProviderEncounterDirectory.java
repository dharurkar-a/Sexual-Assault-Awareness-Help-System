/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Encounter;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author patel
 */
public class HelpProviderEncounterDirectory {
    
    private ArrayList<HelpProviderEncounter> HPEncounters;
    private HashMap<String,ArrayList<HelpProviderEncounter>> HPEncounterDirectory;
    
    public HelpProviderEncounterDirectory()
    {
       HPEncounterDirectory=new HashMap<String,ArrayList<HelpProviderEncounter>>();
       HPEncounters=new ArrayList<HelpProviderEncounter>();
    }

    public ArrayList<HelpProviderEncounter> getHPEncounters() {
        return HPEncounters;
    }

    public HashMap<String, ArrayList<HelpProviderEncounter>> getHPEncounterDirectory() {
        return HPEncounterDirectory;
    }
    
}
