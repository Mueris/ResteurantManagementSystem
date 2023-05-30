package ResteurantApp;

public class Product {
    private String Category;
    private String Food;
    private int SpecialID;
    private int Price;
    private int Stock;
    private boolean IsOpenToOrder;

    public Product(String category, String food, int specialID, int price, int stock, boolean isOpenToOrder) {
        this.Category = category;
        this.Food = food;
        this.SpecialID = specialID;
        this.Price = price;
        this.Stock = stock;
        this.IsOpenToOrder = isOpenToOrder;
    }

    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public String getFood() {
        return Food;
    }
    public void setFood(String food) {
        Food = food;
    }
    public int getSpecialID() {
        return SpecialID;
    }
    public void setSpecialID(int specialID) {
        SpecialID = specialID;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int stock) {
        Stock = stock;
    }
    public boolean isIsOpenToOrder() {
        return IsOpenToOrder;
    }
    public void setIsOpenToOrder(boolean isOpenToOrder) {
        IsOpenToOrder = isOpenToOrder;
    }

}