package Store;

public class Product implements IBuyable
{
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity) {
        setId(id);
        this.name = name;
        setQuantity(quantity);
    }

    public void setId(int id) {
        if (id > 0) {000000
            this.id = id;
        }
        else
        {
            throw new RuntimeException("Invalid id");
        }
    }

    public int getId() {
        return id;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0)
        {
            this.quantity = quantity;
        }
        else
        {
            throw new RuntimeException("Invalid quantity");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void buy(int quantity) {
        if (quantity > 0 && this.quantity > 0 && (this.quantity - quantity > 0))
        {
            this.quantity -= quantity;
            System.out.println("Success order");
        }
        else
        {
            System.out.println("Unsuccessful order");
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
