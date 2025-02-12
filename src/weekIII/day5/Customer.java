package weekIII.day5;

public class Customer implements Comparable<Customer>{
    public int orderId;
    public String name;
    public int price;

    public Customer(String name, int price, int orderId) {
        this.name = name;
        this.price = price;
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "orderId= " + orderId + ", name='" + name + ", price=" + price ;
    }
    public int compareTo(Customer o) {
        return (Integer)orderId -(o.orderId);
    }
}
