
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import javax.faces.model.SelectItem;

@Named(value = "cashierBean")
@SessionScoped
public class CashierBean implements Serializable {
    protected String name = null;
    private Date shipDate = new Date();
    private String[] newsletters;
    
    private List<SelectItem> listaAnimales; 
    
    public void init() {
        listaAnimales = new ArrayList<SelectItem>();
        listaAnimales.add(new SelectItem(1, "Duke's Quarterly"));
        listaAnimales.add(new SelectItem(2, "Duke's Quarterly"));
        listaAnimales.add(new SelectItem(3, "Duke's Quarterly"));
        listaAnimales.add(new SelectItem(4, "Duke's Quarterly"));
        listaAnimales.add(new SelectItem(5, "Duke's Quarterly"));
    }

    public List<SelectItem> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<SelectItem> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }
    
    
    
    private static final SelectItem[] newsletterItems = {
        new SelectItem("Duke's Quarterly"),
        new SelectItem("Innovator's Almanac"),
        new SelectItem("Duke's Diet and Exercise Journal"),
        new SelectItem("Random Ramblings")
    };

    public static SelectItem[] getNewsletterItems() {
        return newsletterItems;
    }
    
     

    public String[] getNewsletters() {
        return newsletters;
    }

    public void setNewsletters(String[] newsletters) {
        this.newsletters = newsletters;
    }
      
    
    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
   // public CashierBean() {
   // }
    
}
