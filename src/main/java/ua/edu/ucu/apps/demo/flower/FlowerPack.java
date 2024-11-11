package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.demo.flowerStore.model.Flower;

@Getter
@Setter
@NoArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flowerCopy, int quantity) {
        this.flower = new Flower(flowerCopy);
        this.quantity = quantity;

    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
