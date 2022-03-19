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
public class CounsellarEncounterDirectory {
    
    
    
    private ArrayList<CounsellorEncounter> Encounters;
    private HashMap<String,ArrayList<CounsellorEncounter>> EncounterDirectory;

    public CounsellarEncounterDirectory() {
       EncounterDirectory=new HashMap<String,ArrayList<CounsellorEncounter>>();
       Encounters=new ArrayList<CounsellorEncounter>();
    }

    public ArrayList<CounsellorEncounter> getEncounters() {
        return Encounters;
    }

    public HashMap<String, ArrayList<CounsellorEncounter>> getEncounterDirectory() {
        return EncounterDirectory;
    }
    
    
    
    
    
}
