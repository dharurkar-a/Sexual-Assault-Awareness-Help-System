/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ForensicOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Lab.LabAssistantJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Ajinkya
 */
public class LabAsstRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new LabAssistantJPanel(userProcessContainer, account, organization,enterprise,business,network);
    }
    
    
}
