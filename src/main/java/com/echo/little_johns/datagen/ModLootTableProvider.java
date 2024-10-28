package com.echo.little_johns.datagen;

import com.echo.little_johns.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        addDrop(ModBlocks.CHANDELIER);
        addDrop(ModBlocks.WHITE_CHANDELIER);
        addDrop(ModBlocks.LIGHT_GRAY_CHANDELIER);
        addDrop(ModBlocks.GRAY_CHANDELIER);
        addDrop(ModBlocks.BLACK_CHANDELIER);
        addDrop(ModBlocks.BROWN_CHANDELIER);
        addDrop(ModBlocks.RED_CHANDELIER);
        addDrop(ModBlocks.ORANGE_CHANDELIER);
        addDrop(ModBlocks.YELLOW_CHANDELIER);
        addDrop(ModBlocks.LIME_CHANDELIER);
        addDrop(ModBlocks.GREEN_CHANDELIER);
        addDrop(ModBlocks.CYAN_CHANDELIER);
        addDrop(ModBlocks.LIGHT_BLUE_CHANDELIER);
        addDrop(ModBlocks.BLUE_CHANDELIER);
        addDrop(ModBlocks.PURPLE_CHANDELIER);
        addDrop(ModBlocks.MAGENTA_CHANDELIER);
        addDrop(ModBlocks.PINK_CHANDELIER);


        addDrop(ModBlocks.OAK_TABLE_SAW);
        addDrop(ModBlocks.SPRUCE_TABLE_SAW);
        addDrop(ModBlocks.BIRCH_TABLE_SAW);
        addDrop(ModBlocks.JUNGLE_TABLE_SAW);
        addDrop(ModBlocks.ACACIA_TABLE_SAW);
        addDrop(ModBlocks.DARK_OAK_TABLE_SAW);
        addDrop(ModBlocks.MANGROVE_TABLE_SAW);
        addDrop(ModBlocks.CHERRY_TABLE_SAW);
        addDrop(ModBlocks.PALE_OAK_TABLE_SAW);
        addDrop(ModBlocks.BAMBOO_TABLE_SAW);
        addDrop(ModBlocks.CRIMSON_TABLE_SAW);
        addDrop(ModBlocks.WARPED_TABLE_SAW);

        addDrop(ModBlocks.GRAND_CHAIN);
        addDrop(ModBlocks.COLOSSAL_CHAIN);
        addDrop(ModBlocks.GOLDEN_CHAIN);
        addDrop(ModBlocks.GOLDEN_GRAND_CHAIN);
        addDrop(ModBlocks.GOLDEN_COLOSSAL_CHAIN);

        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK);
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_STAIRS);
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_SLAB, slabDrops(ModBlocks.GALVANIZED_SQUARE_STEEL_SLAB));
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM);
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));

        addDrop(ModBlocks.OAK_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.SPRUCE_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.BIRCH_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.JUNGLE_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ACACIA_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.DARK_OAK_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.MANGROVE_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.CHERRY_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.PALE_OAK_WOOD_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.BAMBOO_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.CRIMSON_HYPHAE_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.WARPED_HYPHAE_FRAMEWORK, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));

        addDrop(ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_PALE_OAK_WOOD_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));

        addDrop(ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_PALE_OAK_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));


        addDrop(ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_CHERRY_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_PALE_OAK_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_AZALEA_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));

        addDrop(ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithSilkTouchOrShearsCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_NETHER_WART_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_WARPED_WART_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_MOSS_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_PALE_MOSS_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createWithoutSilkTouchCondition()));
        addDrop(ModBlocks.ECO_FRIENDLY_GRASS_VENEERS, (Block block) -> this.multifaceGrowthDrops((Block)block, this.createSilkTouchCondition()));



        addDrop(ModBlocks.OAK_LEAF_HEDGE, block -> this.oakLeavesDrops(block, Blocks.OAK_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.SPRUCE_LEAF_HEDGE, block -> this.leavesDrops(block, Blocks.SPRUCE_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.BIRCH_LEAF_HEDGE, block -> this.leavesDrops(block, Blocks.BIRCH_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.JUNGLE_LEAF_HEDGE, block -> this.leavesDrops(block, Blocks.JUNGLE_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.ACACIA_LEAF_HEDGE, block -> this.leavesDrops(block, Blocks.ACACIA_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.DARK_OAK_LEAF_HEDGE, block -> this.oakLeavesDrops(block, Blocks.DARK_OAK_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.MANGROVE_LEAF_HEDGE, block -> this.mangroveLeavesDrops(block));
        addDrop(ModBlocks.CHERRY_LEAF_HEDGE, block -> this.leavesDrops(block, Blocks.CHERRY_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.PALE_OAK_LEAF_HEDGE, block -> this.oakLeavesDrops(block, Blocks.PALE_OAK_SAPLING, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.AZALEA_LEAF_HEDGE, block -> this.leavesDrops(block, Blocks.AZALEA, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.FLOWERING_AZALEA_LEAF_HEDGE, block -> this.leavesDrops(block, Blocks.FLOWERING_AZALEA, SAPLING_DROP_CHANCE));

        addDrop(ModBlocks.BAMBOO_LEAF_HEDGE, block -> this.leavesDrops(block, Blocks.BAMBOO, SAPLING_DROP_CHANCE));
        addDrop(ModBlocks.NETHER_WART_HEDGE);
        addDrop(ModBlocks.WARPED_WART_HEDGE);
        addDrop(ModBlocks.MOSS_HEDGE);
        addDrop(ModBlocks.PALE_MOSS_HEDGE);


        addDrop(ModBlocks.BAMBOO_LEAVES, block -> this.leavesDrops(block, Blocks.BAMBOO, SAPLING_DROP_CHANCE));



        addDrop(ModBlocks.OAK_WOOD_WALL);
        addDrop(ModBlocks.SPRUCE_WOOD_WALL);
        addDrop(ModBlocks.BIRCH_WOOD_WALL);
        addDrop(ModBlocks.JUNGLE_WOOD_WALL);
        addDrop(ModBlocks.ACACIA_WOOD_WALL);
        addDrop(ModBlocks.DARK_OAK_WOOD_WALL);
        addDrop(ModBlocks.MANGROVE_WOOD_WALL);
        addDrop(ModBlocks.CHERRY_WOOD_WALL);
        addDrop(ModBlocks.PALE_OAK_WOOD_WALL);
        addDrop(ModBlocks.BAMBOO_STEM_WALL);
        addDrop(ModBlocks.CRIMSON_HYPHAE_WALL);
        addDrop(ModBlocks.WARPED_HYPHAE_WALL);

        addDrop(ModBlocks.OAK_PLANK_WALL);
        addDrop(ModBlocks.SPRUCE_PLANK_WALL);
        addDrop(ModBlocks.BIRCH_PLANK_WALL);
        addDrop(ModBlocks.JUNGLE_PLANK_WALL);
        addDrop(ModBlocks.ACACIA_PLANK_WALL);
        addDrop(ModBlocks.DARK_OAK_PLANK_WALL);
        addDrop(ModBlocks.MANGROVE_PLANK_WALL);
        addDrop(ModBlocks.CHERRY_PLANK_WALL);
        addDrop(ModBlocks.PALE_OAK_PLANK_WALL);
        addDrop(ModBlocks.BAMBOO_PLANK_WALL);
        addDrop(ModBlocks.CRIMSON_PLANK_WALL);
        addDrop(ModBlocks.WARPED_PLANK_WALL);


        addDrop(ModBlocks.OAK_WOOD_FENCE);
        addDrop(ModBlocks.SPRUCE_WOOD_FENCE);
        addDrop(ModBlocks.BIRCH_WOOD_FENCE);
        addDrop(ModBlocks.JUNGLE_WOOD_FENCE);
        addDrop(ModBlocks.ACACIA_WOOD_FENCE);
        addDrop(ModBlocks.DARK_OAK_WOOD_FENCE);
        addDrop(ModBlocks.MANGROVE_WOOD_FENCE);
        addDrop(ModBlocks.CHERRY_WOOD_FENCE);
        addDrop(ModBlocks.PALE_OAK_WOOD_FENCE);
        addDrop(ModBlocks.BAMBOO_STEM_FENCE);
        addDrop(ModBlocks.CRIMSON_HYPHAE_FENCE);
        addDrop(ModBlocks.WARPED_HYPHAE_FENCE); 
        
        addDrop(ModBlocks.OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.SPRUCE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.BIRCH_WOOD_FENCE_GATE);
        addDrop(ModBlocks.JUNGLE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.ACACIA_WOOD_FENCE_GATE);
        addDrop(ModBlocks.DARK_OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.MANGROVE_WOOD_FENCE_GATE);
        addDrop(ModBlocks.CHERRY_WOOD_FENCE_GATE);
        addDrop(ModBlocks.PALE_OAK_WOOD_FENCE_GATE);
        addDrop(ModBlocks.BAMBOO_STEM_FENCE_GATE);
        addDrop(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE);
        addDrop(ModBlocks.WARPED_HYPHAE_FENCE_GATE);
        
        
        addDrop(ModBlocks.OAK_WOOD_STAIRS);
        addDrop(ModBlocks.SPRUCE_WOOD_STAIRS);
        addDrop(ModBlocks.BIRCH_WOOD_STAIRS);
        addDrop(ModBlocks.JUNGLE_WOOD_STAIRS);
        addDrop(ModBlocks.ACACIA_WOOD_STAIRS);
        addDrop(ModBlocks.DARK_OAK_WOOD_STAIRS);
        addDrop(ModBlocks.MANGROVE_WOOD_STAIRS);
        addDrop(ModBlocks.CHERRY_WOOD_STAIRS);
        addDrop(ModBlocks.PALE_OAK_WOOD_STAIRS);
        addDrop(ModBlocks.BAMBOO_STEM_STAIRS);
        addDrop(ModBlocks.CRIMSON_HYPHAE_STAIRS);
        addDrop(ModBlocks.WARPED_HYPHAE_STAIRS);

        addDrop(ModBlocks.OAK_WOOD_SLAB, slabDrops(ModBlocks.OAK_WOOD_SLAB));
        addDrop(ModBlocks.SPRUCE_WOOD_SLAB, slabDrops(ModBlocks.SPRUCE_WOOD_SLAB));
        addDrop(ModBlocks.BIRCH_WOOD_SLAB, slabDrops(ModBlocks.BIRCH_WOOD_SLAB));
        addDrop(ModBlocks.JUNGLE_WOOD_SLAB, slabDrops(ModBlocks.JUNGLE_WOOD_SLAB));
        addDrop(ModBlocks.ACACIA_WOOD_SLAB, slabDrops(ModBlocks.ACACIA_WOOD_SLAB));
        addDrop(ModBlocks.DARK_OAK_WOOD_SLAB, slabDrops(ModBlocks.DARK_OAK_WOOD_SLAB));
        addDrop(ModBlocks.MANGROVE_WOOD_SLAB, slabDrops(ModBlocks.MANGROVE_WOOD_SLAB));
        addDrop(ModBlocks.CHERRY_WOOD_SLAB, slabDrops(ModBlocks.CHERRY_WOOD_SLAB));
        addDrop(ModBlocks.PALE_OAK_WOOD_SLAB, slabDrops(ModBlocks.PALE_OAK_WOOD_SLAB));
        addDrop(ModBlocks.BAMBOO_STEM_SLAB, slabDrops(ModBlocks.BAMBOO_STEM_SLAB));
        addDrop(ModBlocks.CRIMSON_HYPHAE_SLAB, slabDrops(ModBlocks.CRIMSON_HYPHAE_SLAB));
        addDrop(ModBlocks.WARPED_HYPHAE_STAIRS, slabDrops(ModBlocks.WARPED_HYPHAE_SLAB));



    }

}
