package gildedRose;

public class SulfurasStrategy extends AbstractItemStrategy{
    @Override
    protected void updateItemQuality(Item item){
        item.quality --;
    }
}
