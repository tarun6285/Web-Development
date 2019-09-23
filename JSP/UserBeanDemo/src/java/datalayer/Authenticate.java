/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datalayer;

import bean.LoginBean;

/**
 *
 * @author priyanka
 */
public class Authenticate {

    public String checkUser(LoginBean objBean) {
        String un = objBean.getTxtUserName();
        String pw = objBean.getTxtPassword();
        if (un.equals("admin") && pw.equals("admin")) {
            return "valid";
        } else {
            return "invalid";
        }
    }
}
