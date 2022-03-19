/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author ajink
 */
public class Meds {
    private String med;
    private int qty;

    public Meds(String med, int qty) {
        this.med = med;
        this.qty = qty;
    }
    
    

    public String getMed() {
        return med;
    }

    public void setMed(String med) {
        this.med = med;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    
    
    @Override
    public String toString() {
        return this.getMed();
    }
    
}
