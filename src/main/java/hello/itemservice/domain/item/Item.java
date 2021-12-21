package hello.itemservice.domain.item;

import lombok.Data;

@Data  // lombok의 데이터를 사용하는 것은 위험하다. 보통은 @getter, @setter 정도로 필요한 것만 선언해서 사용한다.
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
