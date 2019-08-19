package gildedRose;

import rentalstore.AbstractStatement;

public class AgedBrieStrategy extends AbstractItemStrategy {
    @Override
    protected void updateItemQuality(Item item){
        addQuality(item);
        if (item.sellIn < 0)
            addQuality(item);
    }
}
