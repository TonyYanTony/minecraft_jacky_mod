package name.minecraft_jacky_mod.item;

import name.minecraft_jacky_mod.MinecraftJackyMod;
import name.minecraft_jacky_mod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JACKY_INGOT = registerItem("jacky_ingot", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(JACKY_INGOT);
    }
    private static void addItemsToBuildingBlocksGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.JACKY_BLOCK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MinecraftJackyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinecraftJackyMod.LOGGER.info("Registering mod items for " + MinecraftJackyMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBuildingBlocksGroup);
    }
}
