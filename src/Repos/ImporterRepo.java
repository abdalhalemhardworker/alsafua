package Repos;

import Entities.Importer;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import App.DBConfig;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImporterRepo {

    public static boolean add_new(Importer importer) {
        Connection conn = DBConfig.get_connection();
        try {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO importers (company_name, country_name) values (?, ?);");
            stmt.setString(1, importer.getCompanyName());
            stmt.setString(2, importer.getCountryName());
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImporterRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static List<Importer> get_all() {
        Connection conn = DBConfig.get_connection();
        List<Importer> importers = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT id, company_name, country_name FROM importers;");
            ResultSet result = stmt.getResultSet();
            while (result.next()) {
                int id = result.getInt(1);
                String companyName = result.getString(2);
                String countryName = result.getString(3);

                importers.add(new Importer(id, companyName, countryName));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImporterRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return importers;
    }

    public static boolean update_one(int importerId, Importer newImporter) {
        if (importerId == -1) {
            return false;
        }

        Connection conn = DBConfig.get_connection();

        try {
            PreparedStatement stmt = conn.prepareStatement("UPDATE importers "
                    + "SET company_name=?, country_name=? "
                    + "WHERE id=? ;");

            stmt.setString(1, newImporter.getCompanyName());
            stmt.setString(2, newImporter.getCountryName());
            stmt.setInt(3, importerId);

            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImporterRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean delete_one(int importerId) {
        if (importerId == -1) {
            return false;
        }
        Connection conn = DBConfig.get_connection();
        try {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM importers WHERE id=?");
            stmt.setInt(1, importerId);
            return stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ImporterRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
