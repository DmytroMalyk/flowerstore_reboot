package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.edu.ucu.apps.demo.flower.Item;
import ua.edu.ucu.apps.demo.flower.decorators.PaperDecorator;

class PaperDecoratorTest {
    private Item item;

    @BeforeEach
    void setUp() {
        item = new Item() {
            @Override
            public double getPrice() {
                return 15;
            }

            @Override
            public String getDescription() {
                return "Basic item";
            }
        };
    }

    @Test
    void testGetPrice() {
        Item decoratedItem = new PaperDecorator();
        ((PaperDecorator) decoratedItem).item = item;
        assertEquals(28, decoratedItem.getPrice(), 0.01);
    }

    @Test
    void testGetDescription() {
        Item decoratedItem = new PaperDecorator();
        ((PaperDecorator) decoratedItem).item = item;
        assertEquals("Basic item\nWrapped in paper", decoratedItem.getDescription());
    }
}