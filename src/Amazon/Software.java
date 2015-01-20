package Amazon;


/**
 *
 * @author eraizel
 */
class Software extends Products {
    private int sHardDisc;
    private double sProcSpeed;
    private String sMinRequirements;
    

    public Software(int pID, String pName, double pCost, int pYearPub, 
            String pPubHouse, int sHardDisk, double sProcSpeed, 
            String sMinRequirements) {
        super(pID, pName, pCost, pYearPub, pPubHouse);
        
        this.sHardDisc = sHardDisk;
        this.sMinRequirements = sMinRequirements;
        this.sProcSpeed = sProcSpeed;
    }
    
    
    
    
    //setters 

    public void setSoftHardDisc(int sHardDisc) {
        this.sHardDisc = sHardDisc;
    }
    public void setSoftMinRequirements(String sMinRequirements) {
        this.sMinRequirements = sMinRequirements;
    }
    public void setSoftProcSpeed(double sProcSpeed) {
        this.sProcSpeed = sProcSpeed;
    }


    public int getSoftHardDisc(){
        return sHardDisc;
    }
    public String getSoftMinRequirements(){
        return sMinRequirements;
    }
    public double getSoftProcSpeed(){
        return sProcSpeed;
    }
    

}

    
    

