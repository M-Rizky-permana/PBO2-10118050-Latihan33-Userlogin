/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33;

/**
 *
 * @author rizky
 */
public class User {
    public String username;
    public String password;
    private boolean statusAkun;

    public boolean isStatusAkun() {
        return statusAkun;
    }

    public void setStatusAkun(boolean statusAkun) {
        this.statusAkun = statusAkun;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
