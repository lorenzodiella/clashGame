
package com.mycompany.progettoclash;

/**
 *
 * @author Lorenzo
 */
public class CPotenzia {
    
    
    
    public Casella selezionaEdificio(int riga,int col,Giocatore g){
       // Casella c=new Casella();
        return g.getVillaggio().getCasella(riga, col);
        
        
    }
    
    
}
