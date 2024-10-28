package com.echo.little_johns.block;

import com.echo.little_johns.LittleJohns;
import com.echo.little_johns.block.custom.*;
import com.echo.little_johns.item.ModItems;
import com.echo.little_johns.sound.ModBlockSoundGroup;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.function.Function;

public class ModBlocks {
    // TABLE SAWS
    public static final Block OAK_TABLE_SAW = registerBlockWithItem("oak_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD).nonOpaque()).getLeft();
    public static final Block SPRUCE_TABLE_SAW = registerBlockWithItem("spruce_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD).nonOpaque()).getLeft();
    public static final Block BIRCH_TABLE_SAW = registerBlockWithItem("birch_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD).nonOpaque()).getLeft();
    public static final Block JUNGLE_TABLE_SAW = registerBlockWithItem("jungle_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD).nonOpaque()).getLeft();
    public static final Block ACACIA_TABLE_SAW = registerBlockWithItem("acacia_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD).nonOpaque()).getLeft();
    public static final Block DARK_OAK_TABLE_SAW = registerBlockWithItem("dark_oak_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD).nonOpaque()).getLeft();
    public static final Block MANGROVE_TABLE_SAW = registerBlockWithItem("mangrove_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).nonOpaque()).getLeft();
    public static final Block CHERRY_TABLE_SAW = registerBlockWithItem("cherry_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).nonOpaque()).getLeft();
    public static final Block PALE_OAK_TABLE_SAW = registerBlockWithItem("pale_oak_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD).nonOpaque()).getLeft();
    public static final Block BAMBOO_TABLE_SAW = registerBlockWithItem("bamboo_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).nonOpaque()).getLeft();
    public static final Block CRIMSON_TABLE_SAW = registerBlockWithItem("crimson_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).nonOpaque()).getLeft();
    public static final Block WARPED_TABLE_SAW = registerBlockWithItem("warped_table_saw", TableSawBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).nonOpaque()).getLeft();




    // GALVANIZED SQUARE STEEL
    public static final Block GALVANIZED_SQUARE_STEEL_BLOCK = registerBlockWithItem("galvanized_square_steel_block", Block::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)).getLeft();
    public static final Block GALVANIZED_SQUARE_STEEL_STAIRS = registerBlockWithItem("galvanized_square_steel_stairs", (settings) -> new StairsBlock(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)).getLeft();
    public static final Block GALVANIZED_SQUARE_STEEL_SLAB = registerBlockWithItem("galvanized_square_steel_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERITE)).getLeft();
    public static final Block GALVANIZED_SQUARE_STEEL_BEAM = registerBlockWithItem("galvanized_square_steel_beam", BeamBlock::new, AbstractBlock.Settings.copy(Blocks.CHAIN).nonOpaque().sounds(BlockSoundGroup.NETHERITE)).getLeft();
    public static final Block GALVANIZED_SQUARE_STEEL = registerBlockWithItem("galvanized_square_steel", GalvanizedSquareSteelBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()).getLeft();
    public static final Block GALVANIZED_SQUARE_STEEL_GRATE = registerBlockWithItem("galvanized_square_steel_grate", GalvanizedSquareSteelBlock::new, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque()).getLeft();



    // WOOD FRAMEWORK
    public static final Block OAK_WOOD_FRAMEWORK = registerBlockWithItem("oak_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD).nonOpaque()).getLeft();
    public static final Block SPRUCE_WOOD_FRAMEWORK = registerBlockWithItem("spruce_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD).nonOpaque()).getLeft();
    public static final Block BIRCH_WOOD_FRAMEWORK = registerBlockWithItem("birch_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD).nonOpaque()).getLeft();
    public static final Block JUNGLE_WOOD_FRAMEWORK = registerBlockWithItem("jungle_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD).nonOpaque()).getLeft();
    public static final Block ACACIA_WOOD_FRAMEWORK = registerBlockWithItem("acacia_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD).nonOpaque()).getLeft();
    public static final Block DARK_OAK_WOOD_FRAMEWORK = registerBlockWithItem("dark_oak_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD).nonOpaque()).getLeft();
    public static final Block MANGROVE_WOOD_FRAMEWORK = registerBlockWithItem("mangrove_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).nonOpaque()).getLeft();
    public static final Block CHERRY_WOOD_FRAMEWORK = registerBlockWithItem("cherry_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).nonOpaque()).getLeft();
    public static final Block PALE_OAK_WOOD_FRAMEWORK = registerBlockWithItem("pale_oak_wood_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD).nonOpaque()).getLeft();
    public static final Block BAMBOO_FRAMEWORK = registerBlockWithItem("bamboo_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).nonOpaque()).getLeft();
    public static final Block CRIMSON_HYPHAE_FRAMEWORK = registerBlockWithItem("crimson_hyphae_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).nonOpaque()).getLeft();
    public static final Block WARPED_HYPHAE_FRAMEWORK = registerBlockWithItem("warped_hyphae_framework", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).nonOpaque()).getLeft();


    // WOOD PLANK VENEERS
    public static final Block ECO_FRIENDLY_OAK_PLANK_VENEERS = registerBlockWithItem("eco_friendly_oak_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_SPRUCE_PLANK_VENEERS = registerBlockWithItem("eco_friendly_spruce_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_BIRCH_PLANK_VENEERS = registerBlockWithItem("eco_friendly_birch_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_JUNGLE_PLANK_VENEERS = registerBlockWithItem("eco_friendly_jungle_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_ACACIA_PLANK_VENEERS = registerBlockWithItem("eco_friendly_acacia_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS = registerBlockWithItem("eco_friendly_dark_oak_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_MANGROVE_PLANK_VENEERS = registerBlockWithItem("eco_friendly_mangrove_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_CHERRY_PLANK_VENEERS = registerBlockWithItem("eco_friendly_cherry_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_PALE_OAK_PLANK_VENEERS = registerBlockWithItem("eco_friendly_pale_oak_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_BAMBOO_PLANK_VENEERS = registerBlockWithItem("eco_friendly_bamboo_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_CRIMSON_PLANK_VENEERS = registerBlockWithItem("eco_friendly_crimson_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_WARPED_PLANK_VENEERS = registerBlockWithItem("eco_friendly_warped_plank_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS).nonOpaque()).getLeft();


    // WOOD LOG VENEERS
    public static final Block ECO_FRIENDLY_OAK_WOOD_VENEERS = registerBlockWithItem("eco_friendly_oak_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_SPRUCE_WOOD_VENEERS = registerBlockWithItem("eco_friendly_spruce_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_BIRCH_WOOD_VENEERS = registerBlockWithItem("eco_friendly_birch_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_JUNGLE_WOOD_VENEERS = registerBlockWithItem("eco_friendly_jungle_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_ACACIA_WOOD_VENEERS = registerBlockWithItem("eco_friendly_acacia_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS = registerBlockWithItem("eco_friendly_dark_oak_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_MANGROVE_WOOD_VENEERS = registerBlockWithItem("eco_friendly_mangrove_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_CHERRY_WOOD_VENEERS = registerBlockWithItem("eco_friendly_cherry_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_PALE_OAK_WOOD_VENEERS = registerBlockWithItem("eco_friendly_pale_oak_wood_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_BAMBOO_VENEERS = registerBlockWithItem("eco_friendly_bamboo_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS = registerBlockWithItem("eco_friendly_crimson_hyphae_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_WARPED_HYPHAE_VENEERS = registerBlockWithItem("eco_friendly_warped_hyphae_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).nonOpaque()).getLeft();


    // LEAF VENEERS
    public static final Block ECO_FRIENDLY_OAK_LEAF_VENEERS = registerBlockWithItem("eco_friendly_oak_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_SPRUCE_LEAF_VENEERS = registerBlockWithItem("eco_friendly_spruce_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_BIRCH_LEAF_VENEERS = registerBlockWithItem("eco_friendly_birch_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_JUNGLE_LEAF_VENEERS = registerBlockWithItem("eco_friendly_jungle_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_ACACIA_LEAF_VENEERS = registerBlockWithItem("eco_friendly_acacia_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS = registerBlockWithItem("eco_friendly_dark_oak_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_MANGROVE_LEAF_VENEERS = registerBlockWithItem("eco_friendly_mangrove_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_CHERRY_LEAF_VENEERS = registerBlockWithItem("eco_friendly_cherry_leaf_veneers", EcoFriendlyCherryLeafVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_PALE_OAK_LEAF_VENEERS = registerBlockWithItem("eco_friendly_pale_oak_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_AZALEA_LEAF_VENEERS = registerBlockWithItem("eco_friendly_azalea_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS = registerBlockWithItem("eco_friendly_flowering_azalea_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.FLOWERING_AZALEA_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_BAMBOO_LEAF_VENEERS = registerBlockWithItem("eco_friendly_bamboo_leaf_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_LEAVES).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_NETHER_WART_VENEERS = registerBlockWithItem("eco_friendly_nether_wart_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_WARPED_WART_VENEERS = registerBlockWithItem("eco_friendly_warped_wart_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK).nonOpaque()).getLeft();


    // OTHER VENEERS
    public static final Block ECO_FRIENDLY_MOSS_VENEERS = registerBlockWithItem("eco_friendly_moss_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_PALE_MOSS_VENEERS = registerBlockWithItem("eco_friendly_pale_moss_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_MOSS_BLOCK).nonOpaque()).getLeft();
    public static final Block ECO_FRIENDLY_GRASS_VENEERS = registerBlockWithItem("eco_friendly_grass_veneers", EcoFriendlyWoodVeneersBlock::new, AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).nonOpaque()).getLeft();


    // FENCES
    public static final Block OAK_WOOD_FENCE = registerBlockWithItem("oak_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD)).getLeft();
    public static final Block SPRUCE_WOOD_FENCE = registerBlockWithItem("spruce_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)).getLeft();
    public static final Block BIRCH_WOOD_FENCE = registerBlockWithItem("birch_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)).getLeft();
    public static final Block JUNGLE_WOOD_FENCE = registerBlockWithItem("jungle_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)).getLeft();
    public static final Block ACACIA_WOOD_FENCE = registerBlockWithItem("acacia_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)).getLeft();
    public static final Block DARK_OAK_WOOD_FENCE = registerBlockWithItem("dark_oak_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)).getLeft();
    public static final Block MANGROVE_WOOD_FENCE = registerBlockWithItem("mangrove_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)).getLeft();
    public static final Block CHERRY_WOOD_FENCE = registerBlockWithItem("cherry_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)).getLeft();
    public static final Block PALE_OAK_WOOD_FENCE = registerBlockWithItem("pale_oak_wood_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD)).getLeft();
    public static final Block BAMBOO_STEM_FENCE = registerBlockWithItem("bamboo_stem_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)).getLeft();
    public static final Block CRIMSON_HYPHAE_FENCE = registerBlockWithItem("crimson_hyphae_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)).getLeft();
    public static final Block WARPED_HYPHAE_FENCE = registerBlockWithItem("warped_hyphae_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)).getLeft();

    // FENCE GATES
    public static final Block OAK_WOOD_FENCE_GATE = registerBlockWithItem("oak_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_WOOD)).getLeft();
    public static final Block SPRUCE_WOOD_FENCE_GATE = registerBlockWithItem("spruce_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.SPRUCE, settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)).getLeft();
    public static final Block BIRCH_WOOD_FENCE_GATE = registerBlockWithItem("birch_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.BIRCH, settings), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)).getLeft();
    public static final Block JUNGLE_WOOD_FENCE_GATE = registerBlockWithItem("jungle_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.JUNGLE, settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)).getLeft();
    public static final Block ACACIA_WOOD_FENCE_GATE = registerBlockWithItem("acacia_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.ACACIA, settings), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)).getLeft();
    public static final Block DARK_OAK_WOOD_FENCE_GATE = registerBlockWithItem("dark_oak_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.DARK_OAK, settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)).getLeft();
    public static final Block MANGROVE_WOOD_FENCE_GATE = registerBlockWithItem("mangrove_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.MANGROVE, settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)).getLeft();
    public static final Block CHERRY_WOOD_FENCE_GATE = registerBlockWithItem("cherry_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.CHERRY, settings), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)).getLeft();
    public static final Block PALE_OAK_WOOD_FENCE_GATE = registerBlockWithItem("pale_oak_wood_fence_gate", (settings) -> new FenceGateBlock(WoodType.PALE_OAK, settings), AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD)).getLeft();
    public static final Block BAMBOO_STEM_FENCE_GATE = registerBlockWithItem("bamboo_stem_fence_gate", (settings) -> new FenceGateBlock(WoodType.BAMBOO, settings), AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)).getLeft();
    public static final Block CRIMSON_HYPHAE_FENCE_GATE = registerBlockWithItem("crimson_hyphae_fence_gate", (settings) -> new FenceGateBlock(WoodType.CRIMSON, settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)).getLeft();
    public static final Block WARPED_HYPHAE_FENCE_GATE = registerBlockWithItem("warped_hyphae_fence_gate", (settings) -> new FenceGateBlock(WoodType.WARPED, settings), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)).getLeft();



    // WALLS
    public static final Block OAK_WOOD_WALL = registerBlockWithItem("oak_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD)).getLeft();
    public static final Block SPRUCE_WOOD_WALL = registerBlockWithItem("spruce_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)).getLeft();
    public static final Block BIRCH_WOOD_WALL = registerBlockWithItem("birch_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)).getLeft();
    public static final Block JUNGLE_WOOD_WALL = registerBlockWithItem("jungle_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)).getLeft();
    public static final Block ACACIA_WOOD_WALL = registerBlockWithItem("acacia_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)).getLeft();
    public static final Block DARK_OAK_WOOD_WALL = registerBlockWithItem("dark_oak_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)).getLeft();
    public static final Block MANGROVE_WOOD_WALL = registerBlockWithItem("mangrove_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)).getLeft();
    public static final Block CHERRY_WOOD_WALL = registerBlockWithItem("cherry_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)).getLeft();
    public static final Block PALE_OAK_WOOD_WALL = registerBlockWithItem("pale_oak_wood_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD)).getLeft();
    public static final Block BAMBOO_STEM_WALL = registerBlockWithItem("bamboo_stem_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)).getLeft();
    public static final Block CRIMSON_HYPHAE_WALL = registerBlockWithItem("crimson_hyphae_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)).getLeft();
    public static final Block WARPED_HYPHAE_WALL = registerBlockWithItem("warped_hyphae_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)).getLeft();


    public static final Block OAK_PLANK_WALL = registerBlockWithItem("oak_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)).getLeft();
    public static final Block SPRUCE_PLANK_WALL = registerBlockWithItem("spruce_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)).getLeft();
    public static final Block BIRCH_PLANK_WALL = registerBlockWithItem("birch_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)).getLeft();
    public static final Block JUNGLE_PLANK_WALL = registerBlockWithItem("jungle_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)).getLeft();
    public static final Block ACACIA_PLANK_WALL = registerBlockWithItem("acacia_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)).getLeft();
    public static final Block DARK_OAK_PLANK_WALL = registerBlockWithItem("dark_oak_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)).getLeft();
    public static final Block MANGROVE_PLANK_WALL = registerBlockWithItem("mangrove_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)).getLeft();
    public static final Block CHERRY_PLANK_WALL = registerBlockWithItem("cherry_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)).getLeft();
    public static final Block PALE_OAK_PLANK_WALL = registerBlockWithItem("pale_oak_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_PLANKS)).getLeft();
    public static final Block BAMBOO_PLANK_WALL = registerBlockWithItem("bamboo_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)).getLeft();
    public static final Block CRIMSON_PLANK_WALL = registerBlockWithItem("crimson_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)).getLeft();
    public static final Block WARPED_PLANK_WALL = registerBlockWithItem("warped_plank_wall", WallBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)).getLeft();


    // SLABS
    public static final Block OAK_WOOD_SLAB = registerBlockWithItem("oak_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD)).getLeft();
    public static final Block SPRUCE_WOOD_SLAB = registerBlockWithItem("spruce_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)).getLeft();
    public static final Block BIRCH_WOOD_SLAB = registerBlockWithItem("birch_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)).getLeft();
    public static final Block JUNGLE_WOOD_SLAB = registerBlockWithItem("jungle_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)).getLeft();
    public static final Block ACACIA_WOOD_SLAB = registerBlockWithItem("acacia_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)).getLeft();
    public static final Block DARK_OAK_WOOD_SLAB = registerBlockWithItem("dark_oak_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)).getLeft();
    public static final Block MANGROVE_WOOD_SLAB = registerBlockWithItem("mangrove_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)).getLeft();
    public static final Block CHERRY_WOOD_SLAB = registerBlockWithItem("cherry_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)).getLeft();
    public static final Block PALE_OAK_WOOD_SLAB = registerBlockWithItem("pale_oak_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD)).getLeft();
    public static final Block BAMBOO_STEM_SLAB = registerBlockWithItem("bamboo_wood_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)).getLeft();
    public static final Block CRIMSON_HYPHAE_SLAB = registerBlockWithItem("crimson_hyphae_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)).getLeft();
    public static final Block WARPED_HYPHAE_SLAB = registerBlockWithItem("warped_hyphae_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)).getLeft();

    // STAIRS
    public static final Block OAK_WOOD_STAIRS = registerBlockWithItem("oak_wood_stairs", (settings) -> new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OAK_WOOD)).getLeft();
    public static final Block SPRUCE_WOOD_STAIRS = registerBlockWithItem("spruce_wood_stairs", (settings) -> new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)).getLeft();
    public static final Block BIRCH_WOOD_STAIRS = registerBlockWithItem("birch_wood_stairs", (settings) -> new StairsBlock(Blocks.BIRCH_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)).getLeft();
    public static final Block JUNGLE_WOOD_STAIRS = registerBlockWithItem("jungle_wood_stairs", (settings) -> new StairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)).getLeft();
    public static final Block ACACIA_WOOD_STAIRS = registerBlockWithItem("acacia_wood_stairs", (settings) -> new StairsBlock(Blocks.ACACIA_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)).getLeft();
    public static final Block DARK_OAK_WOOD_STAIRS = registerBlockWithItem("dark_oak_wood_stairs", (settings) -> new StairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)).getLeft();
    public static final Block MANGROVE_WOOD_STAIRS = registerBlockWithItem("mangrove_wood_stairs", (settings) -> new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)).getLeft();
    public static final Block CHERRY_WOOD_STAIRS = registerBlockWithItem("cherry_wood_stairs", (settings) -> new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)).getLeft();
    public static final Block PALE_OAK_WOOD_STAIRS = registerBlockWithItem("pale_oak_wood_stairs", (settings) -> new StairsBlock(Blocks.PALE_OAK_WOOD.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.PALE_OAK_WOOD)).getLeft();
    public static final Block BAMBOO_STEM_STAIRS = registerBlockWithItem("bamboo_wood_stairs", (settings) -> new StairsBlock(Blocks.BAMBOO_BLOCK.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)).getLeft();
    public static final Block CRIMSON_HYPHAE_STAIRS = registerBlockWithItem("crimson_hyphae_stairs", (settings) -> new StairsBlock(Blocks.CRIMSON_HYPHAE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)).getLeft();
    public static final Block WARPED_HYPHAE_STAIRS = registerBlockWithItem("warped_hyphae_stairs", (settings) -> new StairsBlock(Blocks.WARPED_HYPHAE.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)).getLeft();



    // CHAINS
    public static final Block GRAND_CHAIN = registerBlockWithItem("grand_chain", GrandChainBlock::new, AbstractBlock.Settings.copy(Blocks.CHAIN).strength(6.0f, 7.0f).nonOpaque().sounds(ModBlockSoundGroup.GRAND_CHAIN)).getLeft();
    public static final Block COLOSSAL_CHAIN = registerBlockWithItem("colossal_chain", ColossalChainBlock::new, AbstractBlock.Settings.copy(Blocks.CHAIN).strength(8.0f, 10.0f).nonOpaque().sounds(ModBlockSoundGroup.COLOSSAL_CHAIN)).getLeft();

    public static final Block GOLDEN_CHAIN = registerBlockWithItem("golden_chain", ChainBlock::new, AbstractBlock.Settings.copy(Blocks.CHAIN).strength(5.f, 6.0f).nonOpaque()).getLeft();
    public static final Block GOLDEN_GRAND_CHAIN = registerBlockWithItem("golden_grand_chain", GrandChainBlock::new, AbstractBlock.Settings.copy(Blocks.CHAIN).strength(6.0f, 7.0f).nonOpaque().sounds(ModBlockSoundGroup.GRAND_CHAIN)).getLeft();
    public static final Block GOLDEN_COLOSSAL_CHAIN = registerBlockWithItem("golden_colossal_chain", ColossalChainBlock::new, AbstractBlock.Settings.copy(Blocks.CHAIN).strength(8.0f, 10.0f).nonOpaque().sounds(ModBlockSoundGroup.COLOSSAL_CHAIN)).getLeft();




    // CHANDELIERS
    public static final Block CHANDELIER = registerBlockWithItem("chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.PALE_YELLOW)).getLeft();
    public static final Block WHITE_CHANDELIER = registerBlockWithItem("white_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.WHITE_GRAY)).getLeft();
    public static final Block LIGHT_GRAY_CHANDELIER = registerBlockWithItem("light_gray_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.LIGHT_GRAY)).getLeft();
    public static final Block GRAY_CHANDELIER = registerBlockWithItem("gray_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.GRAY)).getLeft();
    public static final Block BLACK_CHANDELIER = registerBlockWithItem("black_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.BLACK)).getLeft();
    public static final Block BROWN_CHANDELIER = registerBlockWithItem("brown_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.BROWN)).getLeft();
    public static final Block RED_CHANDELIER = registerBlockWithItem("red_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.RED)).getLeft();
    public static final Block ORANGE_CHANDELIER = registerBlockWithItem("orange_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.ORANGE)).getLeft();
    public static final Block YELLOW_CHANDELIER = registerBlockWithItem("yellow_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.YELLOW)).getLeft();
    public static final Block LIME_CHANDELIER = registerBlockWithItem("lime_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.LIME)).getLeft();
    public static final Block GREEN_CHANDELIER = registerBlockWithItem("green_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.GREEN)).getLeft();
    public static final Block CYAN_CHANDELIER = registerBlockWithItem("cyan_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.CYAN)).getLeft();
    public static final Block LIGHT_BLUE_CHANDELIER = registerBlockWithItem("light_blue_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.LIGHT_BLUE)).getLeft();
    public static final Block BLUE_CHANDELIER = registerBlockWithItem("blue_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.BLUE)).getLeft();
    public static final Block PURPLE_CHANDELIER = registerBlockWithItem("purple_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.PURPLE)).getLeft();
    public static final Block MAGENTA_CHANDELIER = registerBlockWithItem("magenta_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.MAGENTA)).getLeft();
    public static final Block PINK_CHANDELIER = registerBlockWithItem("pink_chandelier", (settings) -> ModBlocks.createChandelierBlock(settings, MapColor.PINK)).getLeft();



    private static Block createChandelierBlock(AbstractBlock.Settings settings, MapColor color) {
        return new ChandelierBlock(settings.solid().requiresTool().mapColor(color).nonOpaque().strength(5.0f, 6.0f).sounds(BlockSoundGroup.CHAIN).luminance(ChandelierBlock.STATE_TO_LUMINANCE).pistonBehavior(PistonBehavior.DESTROY));
    }




    // ----------------- //
    public static <T extends Block> Pair<T, BlockItem> registerBlockWithItem(String name, Function<AbstractBlock.Settings, T> factory) {
        return registerBlockWithItem(name, factory, AbstractBlock.Settings.create());
    }
    public static <T extends Block> Pair<T, BlockItem> registerBlockWithItem(String name, Function<AbstractBlock.Settings, T> factory, AbstractBlock.Settings settings) {
        return registerBlockWithItem(Identifier.of(LittleJohns.MOD_ID, name), factory, settings);
    }
    public static <T extends Block> Pair<T, BlockItem> registerBlockWithItem(Identifier identifier, Function<AbstractBlock.Settings, T> factory) {
        return registerBlockWithItem(identifier, factory, AbstractBlock.Settings.create());
    }
    public static <T extends Block> Pair<T, BlockItem> registerBlockWithItem(Identifier identifier, Function<AbstractBlock.Settings, T> factory, AbstractBlock.Settings settings) {
        T block = registerBlock(identifier, factory, settings);

        return new Pair<>(block, ModItems.registerItem(identifier, (itemSettings) -> new BlockItem(block, itemSettings.useBlockPrefixedTranslationKey())));
    }


    public static <T extends Block> T registerBlock(String name, Function<AbstractBlock.Settings, T> factory) {
        return registerBlock(name, factory, AbstractBlock.Settings.create());
    }
    public static <T extends Block> T registerBlock(String name, Function<AbstractBlock.Settings, T> factory, AbstractBlock.Settings settings) {
        return registerBlock(Identifier.of(LittleJohns.MOD_ID, name), factory, settings);
    }
    public static <T extends Block> T registerBlock(Identifier identifier, Function<AbstractBlock.Settings, T> factory) {
        return registerBlock(identifier, factory, AbstractBlock.Settings.create());
    }
    public static <T extends Block> T registerBlock(Identifier identifier, Function<AbstractBlock.Settings, T> factory, AbstractBlock.Settings settings) {
        return Registry.register(
                Registries.BLOCK,
                identifier,
                factory.apply(settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, identifier)))
        );
    }


    public static void registerModBlocks() {
        LittleJohns.LOGGER.info("Registering ModBlocks for " + LittleJohns.MOD_ID);
    }
}
