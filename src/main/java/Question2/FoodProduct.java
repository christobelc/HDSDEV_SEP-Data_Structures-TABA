package Question2;

public class FoodProduct implements Comparable<FoodProduct>{
    private String name;
    private double price;
    private int healthyEatingIndex;

    //constructor
    public FoodProduct(String name, double price, int healthyEatingIndex){
        this.name = name;
        this.price = price;
        this.healthyEatingIndex = healthyEatingIndex;
    }

    //---------getters and setter-----------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHealthyEatingIndex() {
        return healthyEatingIndex;
    }

    public void setHealthyEatingIndex(int healthyEatingIndex) {
        this.healthyEatingIndex = healthyEatingIndex;
    }

    //lets implement the  compareTo the healthy eating index method
    @Override
    public int compareTo(FoodProduct o) {
        if(this.healthyEatingIndex == o.getHealthyEatingIndex()){
            return 0;
        }
        if(this.healthyEatingIndex > o.getHealthyEatingIndex()){
            return 1;
        }else{
            return -1;
        }
    }
}
