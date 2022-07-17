/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Order;

/**
 *
 * @author dthie
 */
public class OrderDAO extends BaseDAO<Object> {

    public int getLastIdOfOrder() {
        int lastOrderId = 0;
        try {
            String sql = "Select TOP 1 orderid From [Order]\n"
                    + "Order By orderid Desc";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                lastOrderId = rs.getInt("orderid");
                return lastOrderId;
            }

        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lastOrderId;
    }

    public void insertOrder(Order o) {
        try {
            String sql = "INSERT INTO [Order](custid,accountidorder,orderdate) VALUES (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, o.getCustid());

            if (o.getAccountorderid() == 0) {
                statement.setString(2, null);
            } else {
                statement.setInt(2, o.getAccountorderid());

            }
            statement.setDate(3, o.getOrderDate());

            statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        OrderDAO od = new OrderDAO();
        Date today = new Date(System.currentTimeMillis());

        Order o = new Order(1, 2, 0, today);
        int lastid = od.getLastIdOfOrder();
        System.out.println(lastid);
    }
}
