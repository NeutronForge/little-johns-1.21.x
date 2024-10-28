package com.echo.little_johns.datagen;


import com.echo.little_johns.block.ModBlocks;
import com.echo.little_johns.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {


        translationBuilder.add(ModBlocks.OAK_TABLE_SAW, "Oak Table Saw");
        translationBuilder.add(ModBlocks.SPRUCE_TABLE_SAW, "Spruce Table Saw");
        translationBuilder.add(ModBlocks.BIRCH_TABLE_SAW, "Birch Table Saw");
        translationBuilder.add(ModBlocks.JUNGLE_TABLE_SAW, "Jungle Table Saw");
        translationBuilder.add(ModBlocks.ACACIA_TABLE_SAW, "Acacia Table Saw");
        translationBuilder.add(ModBlocks.DARK_OAK_TABLE_SAW, "Dark Oak Table Saw");
        translationBuilder.add(ModBlocks.MANGROVE_TABLE_SAW, "Mangrove Table Saw");
        translationBuilder.add(ModBlocks.CHERRY_TABLE_SAW, "Cherry Table Saw");
        translationBuilder.add(ModBlocks.PALE_OAK_TABLE_SAW, "Pale Oak Table Saw");
        translationBuilder.add(ModBlocks.BAMBOO_TABLE_SAW, "Bamboo Table Saw");
        translationBuilder.add(ModBlocks.CRIMSON_TABLE_SAW, "Crimson Table Saw");
        translationBuilder.add(ModBlocks.WARPED_TABLE_SAW, "Warped Table Saw");



        translationBuilder.add(ModBlocks.ECO_FRIENDLY_OAK_WOOD_VENEERS,"Eco Friendly Oak Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_SPRUCE_WOOD_VENEERS,"Eco Friendly Spruce Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_BIRCH_WOOD_VENEERS,"Eco Friendly Birch Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_JUNGLE_WOOD_VENEERS,"Eco Friendly Jungle Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_ACACIA_WOOD_VENEERS,"Eco Friendly Acacia Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_WOOD_VENEERS,"Eco Friendly Dark Oak Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_MANGROVE_WOOD_VENEERS,"Eco Friendly Mangrove Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_CHERRY_WOOD_VENEERS,"Eco Friendly Cherry Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_PALE_OAK_WOOD_VENEERS,"Eco Friendly Pale Wood Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_BAMBOO_VENEERS,"Eco Friendly Bamboo Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_CRIMSON_HYPHAE_VENEERS,"Eco Friendly Crimson Hyphae Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_WARPED_HYPHAE_VENEERS,"Eco Friendly Warped Hyphae Veneers");


        translationBuilder.add(ModBlocks.ECO_FRIENDLY_OAK_PLANK_VENEERS,"Eco Friendly Oak Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_SPRUCE_PLANK_VENEERS,"Eco Friendly Spruce Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_BIRCH_PLANK_VENEERS,"Eco Friendly Birch Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_JUNGLE_PLANK_VENEERS,"Eco Friendly Jungle Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_ACACIA_PLANK_VENEERS,"Eco Friendly Acacia Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_PLANK_VENEERS,"Eco Friendly Dark Oak Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_MANGROVE_PLANK_VENEERS,"Eco Friendly Mangrove Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_CHERRY_PLANK_VENEERS,"Eco Friendly Cherry Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_PALE_OAK_PLANK_VENEERS,"Eco Friendly Pale Oak Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_BAMBOO_PLANK_VENEERS,"Eco Friendly Bamboo Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_CRIMSON_PLANK_VENEERS,"Eco Friendly Crimson Plank Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_WARPED_PLANK_VENEERS,"Eco Friendly Warped Plank Veneers");


        translationBuilder.add(ModBlocks.OAK_WOOD_FRAMEWORK,"Oak Wood Framework");
        translationBuilder.add(ModBlocks.SPRUCE_WOOD_FRAMEWORK,"Spruce Wood Framework");
        translationBuilder.add(ModBlocks.BIRCH_WOOD_FRAMEWORK,"Birch Wood Framework");
        translationBuilder.add(ModBlocks.JUNGLE_WOOD_FRAMEWORK,"Jungle Wood Framework");
        translationBuilder.add(ModBlocks.ACACIA_WOOD_FRAMEWORK,"Acacia Wood Framework");
        translationBuilder.add(ModBlocks.DARK_OAK_WOOD_FRAMEWORK,"Dark Oak Wood Framework");
        translationBuilder.add(ModBlocks.MANGROVE_WOOD_FRAMEWORK,"Mangrove Wood Framework");
        translationBuilder.add(ModBlocks.CHERRY_WOOD_FRAMEWORK,"Cherry Wood Framework");
        translationBuilder.add(ModBlocks.PALE_OAK_WOOD_FRAMEWORK,"Pale Oak Wood Framework");
        translationBuilder.add(ModBlocks.BAMBOO_FRAMEWORK,"Bamboo Framework");
        translationBuilder.add(ModBlocks.CRIMSON_HYPHAE_FRAMEWORK,"Crimson Hyphae Framework");
        translationBuilder.add(ModBlocks.WARPED_HYPHAE_FRAMEWORK,"Warped Hyphae Framework");



        translationBuilder.add(ModBlocks.ECO_FRIENDLY_OAK_LEAF_VENEERS,"Eco Friendly Oak Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_SPRUCE_LEAF_VENEERS,"Eco Friendly Spruce Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_BIRCH_LEAF_VENEERS,"Eco Friendly Birch Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_JUNGLE_LEAF_VENEERS,"Eco Friendly Jungle Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_ACACIA_LEAF_VENEERS,"Eco Friendly Acacia Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_DARK_OAK_LEAF_VENEERS,"Eco Friendly Dark Oak Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_MANGROVE_LEAF_VENEERS,"Eco Friendly Mangrove Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_CHERRY_LEAF_VENEERS,"Eco Friendly Cherry Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_PALE_OAK_LEAF_VENEERS,"Eco Friendly Pale Oak Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_AZALEA_LEAF_VENEERS,"Eco Friendly Azalea Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_FLOWERING_AZALEA_LEAF_VENEERS,"Eco Friendly Flowering Azalea Leaf Veneers");

        translationBuilder.add(ModBlocks.ECO_FRIENDLY_BAMBOO_LEAF_VENEERS, "Eco Friendly Bamboo Leaf Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_NETHER_WART_VENEERS, "Eco Friendly Nether Wart Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_WARPED_WART_VENEERS, "Eco Friendly Warped Wart Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_MOSS_VENEERS, "Eco Friendly Moss Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_PALE_MOSS_VENEERS, "Eco Friendly Pale Moss Veneers");
        translationBuilder.add(ModBlocks.ECO_FRIENDLY_GRASS_VENEERS, "Eco Friendly Grass Veneers");



        translationBuilder.add(ModBlocks.OAK_LEAF_HEDGE,"Oak Leaf Hedge");
        translationBuilder.add(ModBlocks.SPRUCE_LEAF_HEDGE,"Spruce Leaf Hedge");
        translationBuilder.add(ModBlocks.BIRCH_LEAF_HEDGE,"Birch Leaf Hedge");
        translationBuilder.add(ModBlocks.JUNGLE_LEAF_HEDGE,"Jungle Leaf Hedge");
        translationBuilder.add(ModBlocks.ACACIA_LEAF_HEDGE,"Acacia Leaf Hedge");
        translationBuilder.add(ModBlocks.DARK_OAK_LEAF_HEDGE,"Dark Oak Leaf Hedge");
        translationBuilder.add(ModBlocks.MANGROVE_LEAF_HEDGE,"Mangrove Leaf Hedge");
        translationBuilder.add(ModBlocks.CHERRY_LEAF_HEDGE,"Cherry Leaf Hedge");
        translationBuilder.add(ModBlocks.PALE_OAK_LEAF_HEDGE,"Pale Oak Leaf Hedge");
        translationBuilder.add(ModBlocks.AZALEA_LEAF_HEDGE,"Azalea Leaf Hedge");
        translationBuilder.add(ModBlocks.FLOWERING_AZALEA_LEAF_HEDGE,"Flowering Azalea Leaf Hedge");

        translationBuilder.add(ModBlocks.BAMBOO_LEAF_HEDGE, "Bamboo Leaf Hedge");
        translationBuilder.add(ModBlocks.NETHER_WART_HEDGE, "Nether Wart Hedge");
        translationBuilder.add(ModBlocks.WARPED_WART_HEDGE, "Warped Wart Hedge");
        translationBuilder.add(ModBlocks.MOSS_HEDGE, "Moss Hedge");
        translationBuilder.add(ModBlocks.PALE_MOSS_HEDGE, "Pale Moss Hedge");



        translationBuilder.add(ModBlocks.BAMBOO_LEAVES, "Bamboo Leaves");




        translationBuilder.add(ModBlocks.OAK_WOOD_WALL,"Oak Wood Wall");
        translationBuilder.add(ModBlocks.SPRUCE_WOOD_WALL,"Spruce Wood Wall");
        translationBuilder.add(ModBlocks.BIRCH_WOOD_WALL,"Birch Wood Wall");
        translationBuilder.add(ModBlocks.JUNGLE_WOOD_WALL,"Jungle Wood Wall");
        translationBuilder.add(ModBlocks.ACACIA_WOOD_WALL,"Acacia Wood Wall");
        translationBuilder.add(ModBlocks.DARK_OAK_WOOD_WALL,"Dark Oak Wood Wall");
        translationBuilder.add(ModBlocks.MANGROVE_WOOD_WALL,"Mangrove Wood Wall");
        translationBuilder.add(ModBlocks.CHERRY_WOOD_WALL,"Cherry Wood Wall");
        translationBuilder.add(ModBlocks.PALE_OAK_WOOD_WALL,"Pale Oak Wood Wall");
        translationBuilder.add(ModBlocks.BAMBOO_STEM_WALL,"Bamboo Wall");
        translationBuilder.add(ModBlocks.CRIMSON_HYPHAE_WALL,"Crimson Hyphae Wall");
        translationBuilder.add(ModBlocks.WARPED_HYPHAE_WALL,"Warped Hyphae Wall");


        translationBuilder.add(ModBlocks.OAK_PLANK_WALL,"Oak Plank Wall");
        translationBuilder.add(ModBlocks.SPRUCE_PLANK_WALL,"Spruce Plank Wall");
        translationBuilder.add(ModBlocks.BIRCH_PLANK_WALL,"Birch Plank Wall");
        translationBuilder.add(ModBlocks.JUNGLE_PLANK_WALL,"Jungle Plank Wall");
        translationBuilder.add(ModBlocks.ACACIA_PLANK_WALL,"Acacia Plank Wall");
        translationBuilder.add(ModBlocks.DARK_OAK_PLANK_WALL,"Dark Oak Plank Wall");
        translationBuilder.add(ModBlocks.MANGROVE_PLANK_WALL,"Mangrove Plank Wall");
        translationBuilder.add(ModBlocks.CHERRY_PLANK_WALL,"Cherry Plank Wall");
        translationBuilder.add(ModBlocks.PALE_OAK_PLANK_WALL,"Pale Oak Plank Wall");
        translationBuilder.add(ModBlocks.BAMBOO_PLANK_WALL,"Bamboo Plank Wall");
        translationBuilder.add(ModBlocks.CRIMSON_PLANK_WALL,"Crimson Plank Wall");
        translationBuilder.add(ModBlocks.WARPED_PLANK_WALL,"Warped Plank Wall");



        translationBuilder.add(ModBlocks.OAK_WOOD_FENCE,"Oak Wood Fence");
        translationBuilder.add(ModBlocks.SPRUCE_WOOD_FENCE,"Spruce Wood Fence");
        translationBuilder.add(ModBlocks.BIRCH_WOOD_FENCE,"Birch Wood Fence");
        translationBuilder.add(ModBlocks.JUNGLE_WOOD_FENCE,"Jungle Wood Fence");
        translationBuilder.add(ModBlocks.ACACIA_WOOD_FENCE,"Acacia Wood Fence");
        translationBuilder.add(ModBlocks.DARK_OAK_WOOD_FENCE,"Dark Oak Wood Fence");
        translationBuilder.add(ModBlocks.MANGROVE_WOOD_FENCE,"Mangrove Wood Fence");
        translationBuilder.add(ModBlocks.CHERRY_WOOD_FENCE,"Cherry Wood Fence");
        translationBuilder.add(ModBlocks.PALE_OAK_WOOD_FENCE,"Pale Oak Wood Fence");
        translationBuilder.add(ModBlocks.BAMBOO_STEM_FENCE,"Bamboo Fence");
        translationBuilder.add(ModBlocks.CRIMSON_HYPHAE_FENCE,"Crimson Hyphae Fence");
        translationBuilder.add(ModBlocks.WARPED_HYPHAE_FENCE,"Warped Hyphae Fence");


        translationBuilder.add(ModBlocks.OAK_WOOD_FENCE_GATE,"Oak Wood Fence Gate");
        translationBuilder.add(ModBlocks.SPRUCE_WOOD_FENCE_GATE,"Spruce Wood Fence Gate");
        translationBuilder.add(ModBlocks.BIRCH_WOOD_FENCE_GATE,"Birch Wood Fence Gate");
        translationBuilder.add(ModBlocks.JUNGLE_WOOD_FENCE_GATE,"Jungle Wood Fence Gate");
        translationBuilder.add(ModBlocks.ACACIA_WOOD_FENCE_GATE,"Acacia Wood Fence Gate");
        translationBuilder.add(ModBlocks.DARK_OAK_WOOD_FENCE_GATE,"Dark Oak Wood Fence Gate");
        translationBuilder.add(ModBlocks.MANGROVE_WOOD_FENCE_GATE,"Mangrove Wood Fence Gate");
        translationBuilder.add(ModBlocks.CHERRY_WOOD_FENCE_GATE,"Cherry Wood Fence Gate");
        translationBuilder.add(ModBlocks.PALE_OAK_WOOD_FENCE_GATE,"Pale Oak Wood Fence Gate");
        translationBuilder.add(ModBlocks.BAMBOO_STEM_FENCE_GATE,"Bamboo Fence Gate");
        translationBuilder.add(ModBlocks.CRIMSON_HYPHAE_FENCE_GATE,"Crimson Hyphae Fence Gate");
        translationBuilder.add(ModBlocks.WARPED_HYPHAE_FENCE_GATE,"Warped Hyphae Fence Gate");


        translationBuilder.add(ModBlocks.OAK_WOOD_STAIRS,"Oak Wood Stairs");
        translationBuilder.add(ModBlocks.SPRUCE_WOOD_STAIRS,"Spruce Wood Stairs");
        translationBuilder.add(ModBlocks.BIRCH_WOOD_STAIRS,"Birch Wood Stairs");
        translationBuilder.add(ModBlocks.JUNGLE_WOOD_STAIRS,"Jungle Wood Stairs");
        translationBuilder.add(ModBlocks.ACACIA_WOOD_STAIRS,"Acacia Wood Stairs");
        translationBuilder.add(ModBlocks.DARK_OAK_WOOD_STAIRS,"Dark Oak Wood Stairs");
        translationBuilder.add(ModBlocks.MANGROVE_WOOD_STAIRS,"Mangrove Wood Stairs");
        translationBuilder.add(ModBlocks.CHERRY_WOOD_STAIRS,"Cherry Wood Stairs");
        translationBuilder.add(ModBlocks.PALE_OAK_WOOD_STAIRS,"Pale Oak Wood Stairs");
        translationBuilder.add(ModBlocks.BAMBOO_STEM_STAIRS,"Bamboo Stairs");
        translationBuilder.add(ModBlocks.CRIMSON_HYPHAE_STAIRS,"Crimson Hyphae Stairs");
        translationBuilder.add(ModBlocks.WARPED_HYPHAE_STAIRS,"Warped Hyphae Stairs");

        translationBuilder.add(ModBlocks.OAK_WOOD_SLAB,"Oak Wood Slab");
        translationBuilder.add(ModBlocks.SPRUCE_WOOD_SLAB,"Spruce Wood Slab");
        translationBuilder.add(ModBlocks.BIRCH_WOOD_SLAB,"Birch Wood Slab");
        translationBuilder.add(ModBlocks.JUNGLE_WOOD_SLAB,"Jungle Wood Slab");
        translationBuilder.add(ModBlocks.ACACIA_WOOD_SLAB,"Acacia Wood Slab");
        translationBuilder.add(ModBlocks.DARK_OAK_WOOD_SLAB,"Dark Oak Wood Slab");
        translationBuilder.add(ModBlocks.MANGROVE_WOOD_SLAB,"Mangrove Wood Slab");
        translationBuilder.add(ModBlocks.CHERRY_WOOD_SLAB,"Cherry Wood Slab");
        translationBuilder.add(ModBlocks.PALE_OAK_WOOD_SLAB,"Pale Oak Wood Slab");
        translationBuilder.add(ModBlocks.BAMBOO_STEM_SLAB,"Bamboo Slab");
        translationBuilder.add(ModBlocks.CRIMSON_HYPHAE_SLAB,"Crimson Hyphae Slab");
        translationBuilder.add(ModBlocks.WARPED_HYPHAE_SLAB,"Warped Hyphae Slab");


        translationBuilder.add(ModBlocks.CHANDELIER, "Chandelier");
        translationBuilder.add(ModBlocks.WHITE_CHANDELIER, "White Chandelier");
        translationBuilder.add(ModBlocks.LIGHT_GRAY_CHANDELIER, "Light Gray Chandelier");
        translationBuilder.add(ModBlocks.GRAY_CHANDELIER, "Gray Chandelier");
        translationBuilder.add(ModBlocks.BLACK_CHANDELIER, "Black Chandelier");
        translationBuilder.add(ModBlocks.BROWN_CHANDELIER, "Brown Chandelier");
        translationBuilder.add(ModBlocks.RED_CHANDELIER, "Red Chandelier");
        translationBuilder.add(ModBlocks.ORANGE_CHANDELIER, "Orange Chandelier");
        translationBuilder.add(ModBlocks.YELLOW_CHANDELIER, "Yellow Chandelier");
        translationBuilder.add(ModBlocks.LIME_CHANDELIER, "Lime Chandelier");
        translationBuilder.add(ModBlocks.GREEN_CHANDELIER, "Green Chandelier");
        translationBuilder.add(ModBlocks.CYAN_CHANDELIER, "Cyan Chandelier");
        translationBuilder.add(ModBlocks.LIGHT_BLUE_CHANDELIER, "Light Blue Chandelier");
        translationBuilder.add(ModBlocks.BLUE_CHANDELIER, "Blue Chandelier");
        translationBuilder.add(ModBlocks.PURPLE_CHANDELIER, "Purple Chandelier");
        translationBuilder.add(ModBlocks.MAGENTA_CHANDELIER, "Magenta Chandelier");
        translationBuilder.add(ModBlocks.PINK_CHANDELIER, "Pink Chandelier");


        translationBuilder.add(ModBlocks.GALVANIZED_SQUARE_STEEL_BLOCK, "Galvanized Square Steel Block");
        translationBuilder.add(ModBlocks.GALVANIZED_SQUARE_STEEL_STAIRS, "Galvanized Square Steel Stairs");
        translationBuilder.add(ModBlocks.GALVANIZED_SQUARE_STEEL_SLAB, "Galvanized Square Steel Slab");
        translationBuilder.add(ModBlocks.GALVANIZED_SQUARE_STEEL_BEAM, "Galvanized Square Steel Beam");
        translationBuilder.add(ModBlocks.GALVANIZED_SQUARE_STEEL, "Galvanized Square Steel");
        translationBuilder.add(ModBlocks.GALVANIZED_SQUARE_STEEL_GRATE, "Galvanized Square Steel Grate");


        translationBuilder.add(ModBlocks.GRAND_CHAIN, "Grand Chain");
        translationBuilder.add(ModBlocks.COLOSSAL_CHAIN, "Colossal Chain");
        translationBuilder.add(ModBlocks.GOLDEN_CHAIN, "Golden Chain");
        translationBuilder.add(ModBlocks.GOLDEN_GRAND_CHAIN, "Golden Grand Chain");
        translationBuilder.add(ModBlocks.GOLDEN_COLOSSAL_CHAIN, "Golden Colossal Chain");






        translationBuilder.add("container.little_johns.table_saw", "Table Saw");


        translationBuilder.add(ModItems.BORROWED_SCREWS, "Screws Borrowed From Aunt");

        translationBuilder.add(ModItems.MUSIC_DISC_MORSMORDRE, "Music Disc");
        translationBuilder.add("item.little_johns.music_disc_morsmordre.desc", "Crazy Donkey - Galvanized Square Steel Theme (Morsmordre)");
        translationBuilder.add("jukebox_song.little_johns.morsmordre", "Crazy Donkey - Morsmordre");
        translationBuilder.add("record.nowPlaying", "Now Playing: %s");

    }
}
