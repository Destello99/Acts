package shop;

import java.time.LocalDate;

public class MedicalShop {
    int productId;
    String name;
    LocalDate expDate;
    Category type;

    public MedicalShop(int productId, String name, LocalDate expDate, Category type) {
        this.productId = productId;
        this.name = name;
        this.expDate = expDate;
        this.type = type;
    }

    @Override
    public String toString() {
        return "MedicalShop{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", expDate=" + expDate +
                ", type=" + type +
                '}';
    }
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public Category getType() {
        return type;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    public void setType(Category type) {
        this.type = type;
    }
}
