/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author dthie
 */
public class ProductDAO extends BaseDAO<Object>{
     public ArrayList<Product> get4NewProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sqlquery = "SELECT Top 4 [pid]\n"
                    + "      ,[productname]\n"
                    + "      ,[productimg]\n"
                    + "      ,[productprice]\n"
                    + "      ,[productnote]\n"
                    + "      ,[cid]\n"
                    + "  From Product Order By pid DESC ";

            PreparedStatement statement = connection.prepareStatement(sqlquery);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setPid(rs.getInt("pid"));
                p.setProductName(rs.getString("productname"));
                p.setProductImg(rs.getString("productimg"));
                p.setProductPrice(rs.getInt("productprice"));
                p.setProductNote(rs.getString("productnote"));
                p.setCid(rs.getInt("cid"));
                products.add(p);

            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }
}
