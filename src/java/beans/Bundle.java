
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "bundle")
@SessionScoped
public class Bundle implements Serializable {
    private boolean receiveEmails = false;

    public boolean isReceiveEmails() {
        return receiveEmails;
    }

    public void setReceiveEmails(boolean receiveEmails) {
        this.receiveEmails = receiveEmails;
    }
    
    
    
    public Bundle() {
    }
    
}
