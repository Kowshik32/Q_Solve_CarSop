public abstract class Car  {
    private String carType;
    private String model;
    private String company;
    private double price;
    private int engineCC;
    private int manufacturingYear;
    private int registrationYear;
     public abstract void x();
    public Car(String carType, String model, String company, double price, int engineCC, int manufacturingYear, int registrationYear) {
        this.carType = carType;
        this.model = model;
        this.company = company;
        this.price = price;
        this.engineCC = engineCC;
        this.manufacturingYear = manufacturingYear;
        this.registrationYear = registrationYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public int getRegistrationYear() {
        return registrationYear;
    }

    public void setRegistrationYear(int registrationYear) {
        this.registrationYear = registrationYear;
    }

}



