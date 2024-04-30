package net.brian.testingmod.datagen;

import net.brian.testingmod.TestingModMinecraft;
import net.brian.testingmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TestingModMinecraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpelItem(ModItems.SAPPHIRE);
        simpelItem(ModItems.RAW_SAPPHIRE);

        simpelItem(ModItems.METAL_DETECTOR);
        simpelItem(ModItems.PINE_CONE);
        simpelItem(ModItems.STRAWBERRY);
    }

    private ItemModelBuilder simpelItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TestingModMinecraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
