/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author S525796
 */
@Named(value = "searchbean")
@SessionScoped
public class searchbean implements Serializable {

    /**
     * Creates a new instance of searchbean
     */
    public searchbean() {
    }
    
}
