package Entities;

public class Importer {

    private int id = -1;
    private String companyName;
    private String countryName;

    public Importer() {
    }

    public Importer(int id, String companyName, String countryName) {
        setId(id);
        setCompanyName(companyName);
        setCountryName(countryName);
    }

    public Importer(String companyName, String countryName) {
        setCompanyName(companyName);
        setCountryName(countryName);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return String.format("company_name %s, country_name %s", getCompanyName(), getCountryName());
    }

    public Object[] get_jTable_row() {
        return new Object[]{getId(), getCompanyName(), getCountryName()};
    }
}
