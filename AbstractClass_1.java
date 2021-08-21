abstract class Car {

  int price;
  String model;
  abstract void ShowDetails();

} 


class BMW extends Car {
   

    BMW(int price, String model){
        this.price = price;
        this.model = model;
    }

    @Override
    void ShowDetails() {
        System.out.println( " Model:" + model + " " + this.getClass() +  " price is " + price + " INR");
    }

}

class Audi extends Car{

    Audi(int price, String model){
        this.price = price;
        this.model = model;
    }

    @Override
    void ShowDetails(){
        System.out.println( " Model:" + model + " " + this.getClass() +  " price is " + price + " INR");
    }

}
class RunAbstractClassDemo {
    public static void main(String[] args) {

        BMW b = new BMW(5550000, "S");
        b.ShowDetails();

        Audi a = new Audi(7555000, "A6");
        a.ShowDetails();
        
    }
}