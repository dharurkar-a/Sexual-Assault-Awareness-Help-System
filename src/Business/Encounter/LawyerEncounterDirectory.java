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
 * @author Ankita Dharurkar
 */
public class LawyerEncounterDirectory {
    private ArrayList<LawyerEncounter> Encounters;
    private HashMap<String,ArrayList<LawyerEncounter>> EncounterDirectory;

    public LawyerEncounterDirectory() {
       EncounterDirectory=new HashMap<String,ArrayList<LawyerEncounter>>();
       Encounters=new ArrayList<LawyerEncounter>();
    }

    public ArrayList<LawyerEncounter> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<LawyerEncounter>> getEncounterDirectory() {
        return EncounterDirectory;
    }
    
}
