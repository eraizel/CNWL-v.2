package Amazon;

import javax.swing.JOptionPane;

/**
 *
 * @author eraizel
 */
class Book extends Products{
    private String bAuthor;
    private String bISBN;
    private int bNumberPages;
    
    public Book(int pID, String pName, double pCost, int pYearPub, 
            String pPubHouse, String bAuthor, String bISBN, int bNumberPages) {
        super(pID, pName, pCost, pYearPub, pPubHouse); // sent to parent class
        
        this.bAuthor = bAuthor;
        this.bISBN = bISBN;
        this.bNumberPages = bNumberPages;
    
        
    
    }

    

    

    //setters for Books
    public void setBookAuthor(String bAuthor){
        if (!bAuthor.equals(""))
        this.bAuthor=bAuthor;
        else {
            JOptionPane.showMessageDialog(null, "The name of the Author\n"
                + "cannot be empty!");
        }
        
    }
    public void setBookISBN(String bISBN){
        this.bISBN=bISBN;
    }
    public void setNumberPages(int bNumberPages, int check){
        
        if (check>10){
        this.bNumberPages=bNumberPages;
        }
        else{
        JOptionPane.showMessageDialog(null, "Please enter a valid number of pages\n"
                + "must be greater than 10 pages");
        }
    }
    
    // getters for Books
    public String getBookAuthor(){
        return bAuthor;
    }
    public String getBookISBN(){
        return bISBN;
    }
    public int getNumberPages(){
        return bNumberPages;
    }
    
}    
   