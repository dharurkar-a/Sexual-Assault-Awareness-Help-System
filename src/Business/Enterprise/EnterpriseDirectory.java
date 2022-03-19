/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.HelpSeeker){
            enterprise=new HelpSeekerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Health){
            enterprise=new HealthEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Legal){
            enterprise=new LegalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.NGO){
            enterprise=new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Pharmacy){
            enterprise=new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public Enterprise searchEnterprisebyname(String Name){
        for(Enterprise etp: enterpriseList){
            if(Name.equalsIgnoreCase(etp.getName())){
                return etp;
            }
        }
        return null; 
    }
    
    public Enterprise searchEnterprisebyType(Enterprise.EnterpriseType type){
        for(Enterprise etp : enterpriseList){
            if(type.equals(etp.getEnterpriseType())){
                return etp;
            }
        }
        return null;
    }
       
}
