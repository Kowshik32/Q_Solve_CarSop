public class Salesman extends Car_Shop{
    private int salesmanId;
    private String name;
    private String phone;
    private String address;
    private String nationalId;
    private double basicSalary;

    public void x()
    {
        System.out.println("\nSalesman Information:");
        System.out.println("______________________________________");
    }

    public Salesman(int salesmanId, String name, String phone, String address, String nationalId, double basicSalary) {
        this.salesmanId = salesmanId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.nationalId = nationalId;
        this.basicSalary = basicSalary;
    }

    public int getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(int salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateCommission(double carPrice) {
        return carPrice * 0.01;
    }
}