package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    //nothing gets saved

    public Product(){

    }

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }
    public Long getId(){
        return id;
    }

    public String getName(){
        return  name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
