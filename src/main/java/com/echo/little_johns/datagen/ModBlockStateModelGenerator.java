package com.echo.little_johns.datagen;

import com.echo.little_johns.data.client.ModModels;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ModBlockStateModelGenerator extends BlockStateModelGenerator {
    public ModBlockStateModelGenerator(Consumer<BlockStateSupplier> blockStateCollector, BiConsumer<Identifier, Supplier<JsonElement>> modelCollector, Consumer<Item> simpleItemModelExemptionCollector) {
        super(blockStateCollector, modelCollector, simpleItemModelExemptionCollector);
        this.blockStateCollector = blockStateCollector;
        this.modelCollector = modelCollector;
        //this.simpleItemModelExemptionCollector = simpleItemModelExemptionCollector;
    }

    public final Consumer<BlockStateSupplier> blockStateCollector;
    public final BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;

    final Map<Block, TexturedModel> texturedModels = ImmutableMap.<Block, TexturedModel>builder()
            .put(Blocks.SANDSTONE, TexturedModel.SIDE_TOP_BOTTOM_WALL.get(Blocks.SANDSTONE))
            .put(Blocks.RED_SANDSTONE, TexturedModel.SIDE_TOP_BOTTOM_WALL.get(Blocks.RED_SANDSTONE))
            .put(Blocks.SMOOTH_SANDSTONE, TexturedModel.getCubeAll(TextureMap.getSubId(Blocks.SANDSTONE, "_top")))
            .put(Blocks.SMOOTH_RED_SANDSTONE, TexturedModel.getCubeAll(TextureMap.getSubId(Blocks.RED_SANDSTONE, "_top")))
            .put(
                    Blocks.CUT_SANDSTONE,
                    TexturedModel.CUBE_COLUMN.get(Blocks.SANDSTONE).textures(textureMap -> textureMap.put(TextureKey.SIDE, TextureMap.getId(Blocks.CUT_SANDSTONE)))
            )
            .put(
                    Blocks.CUT_RED_SANDSTONE,
                    TexturedModel.CUBE_COLUMN.get(Blocks.RED_SANDSTONE).textures(textureMap -> textureMap.put(TextureKey.SIDE, TextureMap.getId(Blocks.CUT_RED_SANDSTONE)))
            )
            .put(Blocks.QUARTZ_BLOCK, TexturedModel.CUBE_COLUMN.get(Blocks.QUARTZ_BLOCK))
            .put(Blocks.SMOOTH_QUARTZ, TexturedModel.getCubeAll(TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_bottom")))
            .put(Blocks.BLACKSTONE, TexturedModel.SIDE_END_WALL.get(Blocks.BLACKSTONE))
            .put(Blocks.DEEPSLATE, TexturedModel.SIDE_END_WALL.get(Blocks.DEEPSLATE))
            .put(
                    Blocks.CHISELED_QUARTZ_BLOCK,
                    TexturedModel.CUBE_COLUMN
                            .get(Blocks.CHISELED_QUARTZ_BLOCK)
                            .textures(textureMap -> textureMap.put(TextureKey.SIDE, TextureMap.getId(Blocks.CHISELED_QUARTZ_BLOCK)))
            )
            .put(Blocks.CHISELED_SANDSTONE, TexturedModel.CUBE_COLUMN.get(Blocks.CHISELED_SANDSTONE).textures(textures -> {
                textures.put(TextureKey.END, TextureMap.getSubId(Blocks.SANDSTONE, "_top"));
                textures.put(TextureKey.SIDE, TextureMap.getId(Blocks.CHISELED_SANDSTONE));
            }))
            .put(Blocks.CHISELED_RED_SANDSTONE, TexturedModel.CUBE_COLUMN.get(Blocks.CHISELED_RED_SANDSTONE).textures(textures -> {
                textures.put(TextureKey.END, TextureMap.getSubId(Blocks.RED_SANDSTONE, "_top"));
                textures.put(TextureKey.SIDE, TextureMap.getId(Blocks.CHISELED_RED_SANDSTONE));
            }))
            .put(Blocks.CHISELED_TUFF_BRICKS, TexturedModel.SIDE_END_WALL.get(Blocks.CHISELED_TUFF_BRICKS))
            .put(Blocks.CHISELED_TUFF, TexturedModel.SIDE_END_WALL.get(Blocks.CHISELED_TUFF))
            .build();


/*

    public static final BlockTexturePool registerModCubeAllModelTexturePool(Block block) {
        TexturedModel texturedModel = (TexturedModel)this.texturedModels.getOrDefault(block, TexturedModel.CUBE_ALL.get(block));
        return new ModBlockTexturePool(texturedModel.getTextures()).base(block, texturedModel.getModel());

    }


 */






    public class ModBlockTexturePool extends BlockTexturePool {
        private final TextureMap textures;


        public ModBlockTexturePool(TextureMap textures) {
            super(textures);
            this.textures = textures;
        }



        public void registerParentedItemModel(Block block, Identifier parentModelId) {
            ModBlockStateModelGenerator.this.modelCollector.accept(ModelIds.getItemModelId(block.asItem()), new SimpleModelSupplier(parentModelId));
        }




        public BlockStateModelGenerator.BlockTexturePool leafWall(Block wallBlock) {
            Identifier identifier = ModModels.TEMPLATE_WALL_POST.upload(wallBlock, this.textures, ModBlockStateModelGenerator.this.modelCollector);
            Identifier identifier2 = ModModels.TEMPLATE_WALL_SIDE.upload(wallBlock, this.textures, ModBlockStateModelGenerator.this.modelCollector);
            Identifier identifier3 = ModModels.TEMPLATE_WALL_SIDE_TALL.upload(wallBlock, this.textures, ModBlockStateModelGenerator.this.modelCollector);
            ModBlockStateModelGenerator.this.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wallBlock, identifier, identifier2, identifier3));
            Identifier identifier4 = ModModels.WALL_INVENTORY.upload(wallBlock, this.textures, ModBlockStateModelGenerator.this.modelCollector);
            this.registerParentedItemModel(wallBlock, identifier4);
            return this;
        }


    }


}
