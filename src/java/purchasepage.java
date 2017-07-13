/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Map;
import javax.faces.context.FacesContext;

/**
 *
 * @author S525796
 */
@Named(value = "purchasepage")
@SessionScoped
public class purchasepage implements Serializable {

    String albumname;
    String src;
    String searchstring;

    public String getSearchstring() {
        return searchstring;
    }

    public void setSearchstring(String searchstring) {
        this.searchstring = searchstring;
    }

    public String getAlbumname() {
        return albumname;
    }

    public void setAlbumname(String albumname) {
        this.albumname = albumname;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * Creates a new instance of purchasepage
     */
    public purchasepage() {
    }

    public String result(String a, String b) {
        src = a;
        albumname = b;
        return "purchase";
    }

    public String search() {
        if (searchstring != null) {

            if (searchstring.equalsIgnoreCase("justin bieber")) {
                albumname = "Justin Biber My World 2.0";
                src = "justin biber.jpg";
                return "purchase";
            } else if (searchstring.equalsIgnoreCase("blank space")) {
                albumname = "Blank Space";
                src = "blank space.png";
                return "purchase";
            } else {
                return "abc";
            }
        } else {
            return "";
        }
    }
//     public String showResult(){
//      FacesContext fc = FacesContext.getCurrentInstance();
//      Map<String,String> params = 
//      fc.getExternalContext().getRequestParameterMap();
//      src =  params.get("src");
//      albumname =  params.get("albumname");
//      return "purchase";
//   }

}
