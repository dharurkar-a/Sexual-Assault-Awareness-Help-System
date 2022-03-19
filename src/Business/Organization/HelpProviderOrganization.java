/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HelpProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ajinkya
 */
public class HelpProviderOrganization extends Organization{

    public HelpProviderOrganization() {
        super(Organization.Type.HelpProvider.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HelpProviderRole());
        return roles;
    }
     
}