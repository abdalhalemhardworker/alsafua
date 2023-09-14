package Repos;

import App.DBConfig;
import Entities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductRepo {

    public static boolean add_new(Product prodcut) {
        Connection conn = DBConfig.get_connection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO products "
                    + "(product_name, soil_type) "
                    + "values (?, ?);");
            stmt.setString(1, prodcut.getName());
            stmt.setString(2, prodcut.getSoileType());
            
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImporterRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static List<Product> get_all() {
        Connection conn = DBConfig.get_connection();
        List<Product> products = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT id, product_name, soil_type FROM products;");
            ResultSet result = stmt.getResultSet();
            while (result.next()) {
                int id = result.getInt(1);
                String productName = result.getString(2);
                String productSoilType = result.getString(3);

                products.add(new Product(id, productName, productSoilType));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImporterRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return products;
    }

    public static boolean update_one(int productId, Product newProduct) {
        if (productId == -1) {
            return false;
        }

        Connection conn = DBConfig.get_connection();

        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE products "
                    + "SET product_name=?, soil_type=? "
                    + "WHERE id=? ;");

            stmt.setString(1, newProduct.getName());
            stmt.setString(2, newProduct.getSoileType());
            stmt.setInt(3, productId);

            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImporterRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean delete_one(int productId) {
        if (productId == -1) {
            return false;
        }
        Connection conn = DBConfig.get_connection();
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM products WHERE id=?");
            stmt.setInt(1, productId);
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImporterRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
