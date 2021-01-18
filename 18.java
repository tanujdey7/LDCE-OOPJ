/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class Vehicle {
    String vehicle_type = "Petrol";

    void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}

class Car extends Vehicle {
    String model_type = "Sedan";
    String company_name = "Suzuki";

    void display() {
        super.display();
        System.out.println("Company Name: " + company_name);
        System.out.println("Model Type: " + model_type);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}