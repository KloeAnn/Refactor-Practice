package gildedRose;

public abstract class AbstractItemStrategy {
    public void addQuality(Item item){
        if (item.quality < 50)
            item.quality ++;
    }

    protected void updateItemSellIn(Item item){
        if(!item.name.equals("Sulfuras, Hand of Ragnaros")){
            item.sellIn --;
        }
    }

    protected abstract void updateItemQuality(Item item);
}
