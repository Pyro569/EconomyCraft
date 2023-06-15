package com.Pyro569.EconomyCraft.item;

import com.Pyro569.EconomyCraft.EconomyCraft;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EconomyCraft.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> DOLLARBILL = ITEMS.register("dollarbill", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> PENNY = ITEMS.register("penny", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> DIME = ITEMS.register("dime", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> QUARTER = ITEMS.register("quarter", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> BRITISHPENNY = ITEMS.register("britishpenny", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> TWOPENCE = ITEMS.register("twopence", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> FIVEPENCE = ITEMS.register("fivepence", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> TENPENCE = ITEMS.register("tenpence", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> TWENTYPENCE = ITEMS.register("twentypence", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> FIFTYPENCE = ITEMS.register("fiftypence", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> POUND = ITEMS.register("pound", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
    public static final RegistryObject<Item> TWOPOUND = ITEMS.register("twopound", () -> new Item(new Item.Properties().group(ModItemgroup.ECONOMYCRAFT)));
}
