package Store;

public class BetterProduct extends Product{
    public BetterProduct(int id, String name, int quantity) {
        super(id, name, quantity);
    }

    @Override
    public void buy(int quantity) {
        if (quantity > 0 && getQuantity() > 0 && (getQuantity() - quantity > 0))
        {
            setQuantity(getQuantity()-quantity);
            System.out.println("Success order");
        }
        else
        {
            throw new RuntimeException("Invalid Order");
        }
    }
}
