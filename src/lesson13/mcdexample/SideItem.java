package lesson13.mcdexample;

public class SideItem extends FoodItem {
    // allow our customers to order fries without salt
    String comment;

    public SideItem(String code, double price) {
        super(code, price); 
        this.comment = "";
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}