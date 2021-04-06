package kg.megacom;

import java.util.List;

public class Car {
   private String name;
   private int price;
   private Colors colors;
  private Types types;
  private List<String> owner;

    public Car(String name, int price, Colors colors, Types types, List<String> owner) {
        this.name = name;
        this.price = price;
        this.colors = colors;
        this.types = types;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", colors=" + colors +
                ", types=" + types +
                ", owner=" + owner +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public List<String> getOwner() {
        return owner;
    }

    public void setOwner(List<String> owner) {
        this.owner = owner;
    }
}

}
