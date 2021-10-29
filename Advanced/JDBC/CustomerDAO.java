package JDBC;

import JDBC.domain.Customer;

import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerDAO {
    public int addCustomer(Customer c) {
        
        Connection conn = DBConnection.getConnect();
        String sql = "insert into customer(custId, custName, address) values(?,?,?)";
        int count = 0;

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, c.getCustId());
            pst.setString(2, c.getCustName());
            pst.setString(3, c.getAddress());

            count = pst.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    public Customer findCustomerById(int cid) {

        Connection conn = DBConnection.getConnect();
        String sql = "select * from customer where custId = ?";
        Customer c = new Customer();

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, cid);
            ResultSet resSet = pst.executeQuery();

            if (resSet.next()) {
                c.setCustId(cid);
                c.setCustName(resSet.getString("custName"));
                c.setAddress(resSet.getString("address"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return c;
    }

    public List<Customer> readAllCustomers() {

        Connection conn = DBConnection.getConnect();
        String sql = "select * from customer";
        ArrayList <Customer> custList = new ArrayList <Customer>();

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet resSet = pst.executeQuery();

            while (resSet.next()) {
                Customer c = new Customer();
                c.setCustId(resSet.getInt("custId"));
                c.setCustName(resSet.getString("custName"));
                c.setAddress(resSet.getString("address"));
                custList.add(c);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return custList;
    }

    public int updateAddress(int cid, String newAddress) {
        
        Connection conn = DBConnection.getConnect();
        String sql = "update customer set address = ? where custid = ?";
        int count = 0;

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, newAddress);
            pst.setInt(2, cid);

            count = pst.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    public List<Customer> searchByAddress(String address){
        
        Connection conn = DBConnection.getConnect();
        String sql = "select * from customer where address = ?";
        ArrayList <Customer> custList = new ArrayList <Customer>();

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, address);
            ResultSet resSet = pst.executeQuery();

            while (resSet.next()) {
                Customer c = new Customer();
                c.setCustId(resSet.getInt("custId"));
                c.setCustName(resSet.getString("custName"));
                c.setAddress(address);
                custList.add(c);
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return custList;
    }

}