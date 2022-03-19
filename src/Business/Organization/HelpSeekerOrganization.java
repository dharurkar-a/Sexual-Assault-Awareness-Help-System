/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HelpSeekerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ajinkya
 */
public class HelpSeekerOrganization extends Organization{

    public HelpSeekerOrganization() {
        super(Organization.Type.HelpSeeker.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HelpSeekerRole());
        return roles;
    }
     
}