package com.echo.little_johns.data.client;

import com.echo.little_johns.LittleJohns;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModels extends Models {

    public static final Model TEMPLATE_WALL_POST = block("template_wall_post", "_post", TextureKey.WALL);
    public static final Model TEMPLATE_WALL_SIDE = block("template_wall_side", "_side", TextureKey.WALL);
    public static final Model TEMPLATE_WALL_SIDE_TALL = block("template_wall_side_tall", "_side_tall", TextureKey.WALL);
    public static final Model WALL_INVENTORY = block("wall_inventory", "_inventory", TextureKey.WALL);


    private static Model make(TextureKey... requiredTextureKeys) {
        return new Model(Optional.empty(), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(LittleJohns.MOD_ID + "/models/" + "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }


    private static Model item(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(LittleJohns.MOD_ID + "/models/" + "item/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static Model block(String parent, String variant, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of(LittleJohns.MOD_ID + "/models/" + "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
