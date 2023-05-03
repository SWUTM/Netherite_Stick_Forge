package net.swutm.netheritestick.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.netheritestick.netheritestick;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, netheritestick.MOD_ID);

    private static Object ModTiers;
    public static final RegistryObject<Item> WOOD_SWORD = ITEMS.register("wood_sword",
            () -> new SwordItem(Tiers.WOOD, 3,-2.4f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> WOOD_PICKAXE = ITEMS.register("wood_pickaxe",
            () -> new PickaxeItem(Tiers.WOOD, 1, -2.8f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> WOOD_SHOVEL = ITEMS.register("wood_shovel",
            () -> new ShovelItem(Tiers.WOOD, 1.5f, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> WOOD_AXE = ITEMS.register("wood_axe",
            () -> new AxeItem(Tiers.WOOD, 6, -3.2f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> WOOD_HOE = ITEMS.register("wood_hoe",
            () -> new HoeItem(Tiers.WOOD, 0, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> STONE_SWORD = ITEMS.register("stone_sword",
            () -> new SwordItem(Tiers.STONE, 4,-2.4f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> STONE_PICKAXE = ITEMS.register("stone_pickaxe",
            () -> new PickaxeItem(Tiers.STONE, 2, -2.8f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STONE_SHOVEL = ITEMS.register("stone_shovel",
            () -> new ShovelItem(Tiers.STONE, 2.5f, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STONE_AXE = ITEMS.register("stone_axe",
            () -> new AxeItem(Tiers.STONE, 8, -3.2f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> STONE_HOE = ITEMS.register("stone_hoe",
            () -> new HoeItem(Tiers.STONE, 0, -2f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> IRON_SWORD = ITEMS.register("iron_sword",
            () -> new SwordItem(Tiers.IRON, 5,-2.4f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> IRON_PICKAXE = ITEMS.register("iron_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 3, -2.8f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> IRON_SHOVEL = ITEMS.register("iron_shovel",
            () -> new ShovelItem(Tiers.IRON, 3.5f, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> IRON_AXE = ITEMS.register("iron_axe",
            () -> new AxeItem(Tiers.IRON, 8, -3.1f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> IRON_HOE = ITEMS.register("iron_hoe",
            () -> new HoeItem(Tiers.IRON, 0, -1f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> GOLD_SWORD = ITEMS.register("gold_sword",
            () -> new SwordItem(Tiers.GOLD, 3,-2.4f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> GOLD_PICKAXE = ITEMS.register("gold_pickaxe",
            () -> new PickaxeItem(Tiers.GOLD, 1, -2.8f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GOLD_SHOVEL = ITEMS.register("gold_shovel",
            () -> new ShovelItem(Tiers.GOLD, 1.5f, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GOLD_AXE = ITEMS.register("gold_axe",
            () -> new AxeItem(Tiers.GOLD, 6, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> GOLD_HOE = ITEMS.register("gold_hoe",
            () -> new HoeItem(Tiers.GOLD, 0, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> DIAMOND_SWORD = ITEMS.register("diamond_sword",
            () -> new SwordItem(Tiers.DIAMOND, 6,-2.4f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> DIAMOND_PICKAXE = ITEMS.register("diamond_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 4, -2.8f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_SHOVEL = ITEMS.register("diamond_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 4.5f, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_AXE = ITEMS.register("diamond_axe",
            () -> new AxeItem(Tiers.DIAMOND, 8, -3f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> DIAMOND_HOE = ITEMS.register("diamond_hoe",
            () -> new HoeItem(Tiers.DIAMOND, 0, 0f,
                    new Item.Properties().fireResistant().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> NETHERITE_STICK = ITEMS.register("netherite_stick",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NETHERITE_NUGGEST = ITEMS.register("netherite_nuggest",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow",
            () -> new BowItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(384).fireResistant()));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}

}
