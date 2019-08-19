package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateItemSellIn(Item item){
        if(!item.name.equals("Sulfuras, Hand of Ragnaros")){
            item.sellIn --;
        }
    }

    public void updateBackstageQuality(Item item){
        if (item.sellIn < 11&&item.quality < 50) {
            item.quality ++;
        }
        if (item.sellIn < 6&&item.quality < 50) {
            item.quality ++;
        }
    }

    public void addQuality(Item item){
        if (item.quality < 50)
            item.quality ++;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0&&(!items[i].name.equals("Sulfuras, Hand of Ragnaros"))) {
                        items[i].quality  --;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality ++;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        updateBackstageQuality(items[i]);
                    }
                }
            }

            updateItemSellIn(items[i]);

            if (items[i].sellIn < 0) {
                if (items[i].name.equals("Aged Brie")) {
                    addQuality(items[i]);
                } else
                if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        items[i].quality = 0;
                } else if (items[i].quality > 0&&!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            items[i].quality --;
                }
                }
            }
        }
    }
