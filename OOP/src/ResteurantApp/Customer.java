package ResteurantApp;

public class Customer extends User  {
    private int discountCoupons; 
    private int userID;

    public Customer(String name, String surname, int phoneNumber, String email, String type, int discountCoupon, int ID) {
        super(name, surname, phoneNumber, email, type);
        this.discountCoupons = discountCoupon;
        this.userID = ID;
    }

    public int getDiscountCoupons() {
        return discountCoupons;
    }
    public void setDiscountCoupons(int discountCoupons) {
        this.discountCoupons = discountCoupons;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
}
