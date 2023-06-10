public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "Abbc", "BMW", 100000, 1500, 2022, 2022) {
            @Override
            public void x() {

            }
        };

        Salesman salesman = new Salesman(101, "Rahim", "1234567890", "123 Main St", "ABC123", 5000);

        Customer customer = new Customer();
         customer.setNID("123456789");
         customer.setName("Kowshik Mozumder");
         customer.setPhone("01768095500");
         customer.setAddress("YKSG_2");
         customer.setProfession("Engineer");
         customer.setPurchasePrice(100000.00);
         customer.setPaymentMethod("Card");
        System.out.println("_______SWE Car Shop__________ ");
        double commission = salesman.calculateCommission(car.getPrice());
        System.out.println("Salesman's Commission: " + commission);
        double cashback = 0;
        if (customer.getPaymentMethod().equalsIgnoreCase("Card")) {
            cashback = customer.getPurchasePrice() * 0.05;
        }

        System.out.println("Customer's Cashback: " + cashback);
        Car_Shop c1 = new Car_Shop();
        c1.x();
        System.out.println("Car Type: " + car.getCarType());
        System.out.println("Model: " + car.getModel());
        System.out.println("Company: " + car.getCompany());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Engine CC: " + car.getEngineCC());
        System.out.println("Manufacturing Year: " + car.getManufacturingYear());
        System.out.println("Registration Year: " + car.getRegistrationYear());


        salesman.x();
        System.out.println("Salesman ID: " + salesman.getSalesmanId());
        System.out.println("Name: " + salesman.getName());
        System.out.println("Phone: " + salesman.getPhone());
        System.out.println("Address: " + salesman.getAddress());
        System.out.println("National ID: " + salesman.getNationalId());
        System.out.println("Basic Salary: " + salesman.getBasicSalary());


        customer.x();
        System.out.println("NID: " + customer.getNID());
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Profession: " + customer.getProfession());
        System.out.println("Purchase Price: " + customer.getPurchasePrice());
        System.out.println("Payment Method: " + customer.getPaymentMethod());
    }
}
