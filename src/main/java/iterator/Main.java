package iterator;

import java.util.Iterator;

import iterator.item.Item;
import iterator.item.ItemType;
import iterator.item.TreasureChest;
import lombok.extern.slf4j.Slf4j;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import static iterator.item.ItemType.ANY;
import static iterator.item.ItemType.POTION;
import static iterator.item.ItemType.RING;
import static iterator.item.ItemType.WEAPON;

/**
 * @author: rensiyu
 * @createTime: 2022/09/21
 */
@Slf4j
public class Main {
    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType itemType) {
        log.info("------------------------");
        log.info("Item Iterator for ItemType " + itemType + ": ");
        Iterator<Item> itemIterator = TREASURE_CHEST.iterator(itemType);
        while (itemIterator.hasNext()) {
            log.info(itemIterator.next().toString());
        }
    }


    /**
     * Program entry point.
     * @param args command line args
     */
    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(RING);
        demonstrateTreasureChestIteratorForType(POTION);
        demonstrateTreasureChestIteratorForType(WEAPON);
        demonstrateTreasureChestIteratorForType(ANY);
    }
}
