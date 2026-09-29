package Service;

import config.DbConfig;
import entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.sql.*;
import java.util.Scanner;

public class CustomerService {
    public void addCustomer(Customer customer) throws SQLException {
        Connection con = DbConfig.getConnction();
        PreparedStatement ps = con.prepareStatement("INSERT INTO customers(name, phone) VALUES (?,?)");

        // Fixed: Read values directly from the passed object
        ps.setString(1, customer.getName());
        ps.setString(2, customer.getPhone());

        ps.executeUpdate();
        ps.close();
        con.close();
        System.out.println("Customer added successfully to database!");
    }



    public List<Customer> getAllCustomer() throws SQLException{
        List<Customer> list = new ArrayList<>();
        Connection con = DbConfig.getConnction();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customers");
        while(rs.next()){
            list.add(new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("phone")));
        }
        return list;
    }

    public Customer getCustomerBasedOnNum(String number) throws SQLException{
        Customer customer = new Customer();
        Connection con = DbConfig.getConnction();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customers WHERE phone = " + number);
        while(rs.next()){
            customer = new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("phone"));
        }
        return list;
    }
}
