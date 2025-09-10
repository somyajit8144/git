package com.ecommerce.dao;

import com.ecommerce.model.DBConnection;
import com.ecommerce.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public static List<Product> getAllProducts() throws Exception {
        List<Product> list = new ArrayList<>();
        Connection con = DBConnection.getConnection();
        String sql = "SELECT * FROM products";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Product p = new Product();
            p.setId(rs.getInt("id"));
            p.setName(rs.getString("name"));
            p.setPrice(rs.getDouble("price"));
            p.setDescription(rs.getString("description"));
            p.setStock(rs.getInt("stock"));
            list.add(p);
        }
        rs.close();
        ps.close();
        con.close();
        return list;
    }
}
