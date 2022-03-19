/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HelpSeekerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.HelpSeeker.HelpSeekerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ajinkya
 */
public class HelpSeekerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new HelpSeekerJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
    
    
}
