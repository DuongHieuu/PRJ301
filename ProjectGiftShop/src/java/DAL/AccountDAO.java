/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author dthie
 */
public class AccountDAO extends BaseDAO<Object> {
     public Account getAccounts(String user,String pass) {
        try {
            String sqlquery = "Select aid,username,[password],isAdmin From Account \n"
                    + "Where username = ? and [password] = ?";

            PreparedStatement statement = connection.prepareStatement(sqlquery);
            statement.setString(1, user);
            statement.setString(2, pass);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setAid(rs.getInt("aid"));
                a.setUser(rs.getString("username"));
                a.setPass(rs.getString("password"));
                a.setIsAdmin(rs.getBoolean("isAdmin"));
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Account checkAccountsExist(String user) {
        try {
            String sqlquery = "Select aid,username,[password],isAdmin From Account \n"
                    + "Where username = ?";

            PreparedStatement statement = connection.prepareStatement(sqlquery);
            statement.setString(1, user);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setAid(rs.getInt("aid"));
                a.setUser(rs.getString("username"));
                a.setPass(rs.getString("password"));
                a.setIsAdmin(rs.getBoolean("isAdmin"));
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
