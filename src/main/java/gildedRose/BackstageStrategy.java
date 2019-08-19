package gildedRose;

public class BackstageStrategy extends AbstractItemStrategy{
    public void updateBackstageQuality(Item item){
        if (item.sellIn < 11&&item.quality < 50) {
            item.quality ++;
        }
        if (item.sellIn < 6&&item.quality < 50) {
            item.quality ++;
        }
    }

    @Override
    protected void updateItemQuality(Item item){
        addQuality(item);
        updateBackstageQuality(item);
        item.quality = 0;
    }
}
