/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amazon;

/**
 *
 * @author eraizel
 */
public class Order {
    private int oID;
    private String cName;
    private String cAddress;
    private int cPhoneNumber;
    private String cEmail;
    
public Order(int oID, String cName, String cAddress, int cPhoneNumber, String cEmail){
        
        this.oID = oID;
        this.cName = cName;
        this.cAddress = cAddress;
        this.cPhoneNumber = cPhoneNumber;
        this.cEmail = cEmail;
}    
//ol[x] = new order;
    //Products [] plist = new Products();

public void setOrderID(int oID){
        this.oID=oID;   
    }
    public void setClientName(String cName){
        this.cName=cName;
    }
    public void setClientAddress(String cAddress){
        this.cAddress=cAddress;
    }
    public void setClientPhoneNumber(int cPhoneNumber){
        this.cPhoneNumber=cPhoneNumber;
    }
    public void setClientEmail(String cEmail){
        this.cEmail=cEmail;
    }
    
    // Products Getters
    public int getOrderID(){
        return oID;   
    }
    public String getClientName(){
         return cName;
    }
    public String getClientAddress(){
        return cAddress;
    }
    public int getClientPhoneNumber(){
        return cPhoneNumber;
    }
    public String getClientEmail(){
        return cEmail;
    }
    
}
