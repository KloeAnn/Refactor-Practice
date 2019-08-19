package gildedRose;

import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void test_updateQuality_when_item_name_is_Test_and_sellin_is_0_and_quality_is_1(){
        Item item=new Item("Test",0,1);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=-1;
        int expectedQuality=0;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }



    @Test
    public void test_updateQuality_when_item_name_is_Test_and_sellin_is_0_and_quality_is_0(){
        Item item=new Item("Test",0,0);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=-1;
        int expectedQuality=0;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }

    @Test
    public void test_updateQuality_when_item_name_is_Test_and_sellin_is_2_and_quality_is_1(){
        Item item=new Item("Test",2,1);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=1;
        int expectedQuality=0;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }

    @Test
    public void test_updateQuality_when_item_name_is_Test_and_sellin_is_0_and_quality_is_2(){
        Item item=new Item("Test",0,2);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=-1;
        int expectedQuality=0;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }



    @Test
    public void test_updateQuality_when_item_name_is_Sulfuras_Hand_of_Ragnaros_and_sellin_is_0_and_quality_is_1(){
        Item item=new Item("Sulfuras, Hand of Ragnaros",0,1);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=0;
        int expectedQuality=1;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }

    @Test
    public void test_updateQuality_when_item_name_is_Sulfuras_Hand_of_Ragnaros_and_sellin_under_0_and_quality_is_1(){
        Item item=new Item("Sulfuras, Hand of Ragnaros",-1,1);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=-1;
        int expectedQuality=1;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }


    @Test
    public void test_updateQuality_when_item_name_is_Aged_Brie_and_sellin_is_0_and_quality_is_50(){
        Item item=new Item("Aged Brie",0,50);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=-1;
        int expectedQuality=50;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }

    @Test
    public void test_updateQuality_when_item_name_is_Aged_Brie_and_sellin_is_0_and_quality_is_1(){
        Item item=new Item("Aged Brie",0,1);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=-1;
        int expectedQuality=3;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }

    @Test
    public void test_updateQuality_when_item_name_is_Aged_Brie_and_sellin_is_1_and_quality_is_1(){
        Item item=new Item("Aged Brie",1,1);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=0;
        int expectedQuality=2;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }

    @Test
    public void test_updateQuality_when_item_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellin_is_1_and_quality_is_50(){
        Item item=new Item("Backstage passes to a TAFKAL80ETC concert",1,50);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=0;
        int expectedQuality=50;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }

    @Test
    public void test_updateQuality_when_item_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellin_is_10_and_quality_is_49(){
        Item item=new Item("Backstage passes to a TAFKAL80ETC concert",10,49);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=9;
        int expectedQuality=50;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }

    @Test
    public void test_updateQuality_when_item_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellin_is_11_and_quality_is_48(){
        Item item=new Item("Backstage passes to a TAFKAL80ETC concert",11,48);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=10;
        int expectedQuality=49;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }


    @Test
    public void test_updateQuality_when_item_name_is_Backstage_passes_to_a_TAFKAL80ETC_concert_and_sellin_is_0_and_quality_is_48(){
        Item item=new Item("Backstage passes to a TAFKAL80ETC concert",0,48);
        Item[]items={item};
        GildedRose gildedRose=new GildedRose(items);

        gildedRose.updateQuality();

        int actualSellIn=gildedRose.items[0].sellIn;
        int actualQuality=gildedRose.items[0].quality;

        int expectedSellIn=-1;
        int expectedQuality=0;

        assertEquals(expectedQuality,actualQuality);
        assertEquals(expectedSellIn,actualSellIn);
    }
}