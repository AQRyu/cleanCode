package app.classOrganization;

import java.util.LinkedList;

/**
 * Tight coupling
 * Van de xay ra khi ta muon thay doi cau truc du lieu tu LinkedList sang ArrayList
 * Ta gan nhu phai thay doi toan bo du lieu : 
 * - truong du lieu LinkedList -> ArrayList 
 * - parameters trong cac function
 * - du lieu tra ve (vi ArrayList khong co cac function fetFirst va getLast)
 */
public class TightCoupling {
    // Tight coupling
    LinkedList<String> tightCouplingList = new LinkedList<>();

    public String getFirstString1(LinkedList<String> list){
        return list.getFirst();
    }
    
    public String getLastString1(LinkedList<String> list){
        return list.getLast();
    }
}