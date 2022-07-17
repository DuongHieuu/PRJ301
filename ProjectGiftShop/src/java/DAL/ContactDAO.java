/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contact;

/**
 *
 * @author dthie
 */
public class ContactDAO extends BaseDAO<Object>{
    public void insertContact(Contact con) {
        try {
            String sql = "INSERT INTO Contact(firstname,lastname,[email],[phone],[message],contactdate) \n"
                    + "VALUES (?,?,?,?,?,GETDATE());";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, con.getFirstName());
            statement.setString(2, con.getLastName());
            statement.setString(3, con.getEmail());
            statement.setString(4, con.getPhone());
            statement.setString(5, con.getMessage());

            statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ContactDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
