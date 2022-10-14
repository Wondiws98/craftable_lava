package net.wondiws98.craftablelava.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wondiws98.craftablelava.CraftableLavaMain;

public class LavaCrucible {

    public static final Item CRUCIBLE = registerItem("stone_bucket",
            new Item(new FabricItemSettings().maxCount(1).group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CraftableLavaMain.MOD_ID, name), item);
    }

    public static void registerLavaCrucible() {
        CraftableLavaMain.LOGGER.debug("Turning on the smelter... (registering craftablelava's item)");
    }
}
