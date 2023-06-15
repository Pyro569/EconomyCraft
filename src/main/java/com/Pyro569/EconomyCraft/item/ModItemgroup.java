package com.Pyro569.EconomyCraft.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemgroup {
    public static final ItemGroup ECONOMYCRAFT = new ItemGroup("economycraftTab") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DOLLARBILL.get());
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.DOLLARBILL.get());
        }
    };
}
