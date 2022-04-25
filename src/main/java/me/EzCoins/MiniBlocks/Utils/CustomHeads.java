package me.EzCoins.MiniBlocks.Utils;

import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import lombok.Getter;
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;

public enum CustomHeads {

    MAIN_GROUP("879e54cbe87867d14b2fbdf3f1870894352048dfecd962846dea893b2154c85"),
    BLOCKS_GROUP("16bb9fb97ba87cb727cd0ff477f769370bea19ccbfafb581629cd5639f2fec2b"),


    STONE("8e140dc30e7bd57d0c5ff71a6818500434692f492479a5426aa231d7ad994d8a"),
    GRANITE("aeb3b12b8390b84be4ab908b514beab7e0e7e461a73a2ce4d4a655c625bd94c"),
    POLISHED_GRANITE("d006576fcbd55dba8d959a6961bbe69e390e1aa3fcba66b7b28d26bb029ecf3c"),
    DIORITE("13fa5265a336abde301a9d59af4783e82a10dad0817716ead2962ab7c6d3dff"),
    POLISHED_DIORITE("50965b2e9297f1ad534d2f0e22ed918ca3207c4f0b9c44372e509353218d6b8e"),
    ANDESITE("adb7bf059a62d27b1e1e2f34394f3f38ed8cda45471f6f4d5b47c3912d181135"),
    POLISHED_ANDESITE("cc58df2f005eda0ea185723f0d267a9144be3188beed83f84129572a7a463a39"),
    DEEPSLATE("98e6848077b5bef79bdae20e1ba77c35cd5c7d29db591e847bf30b80ac304a47"),
    COBBLED_DEEPSLATE("85f3e4e3d84842d7f4ba00a9edec39d8ae65738e755024d6ebfa1e2df698dea3"),
    POLISHED_DEEPSLATE("ed2bfb42bc21a80a2bbf7974a60ad85d7158ededb1de365084e872ca925de21e"),
    CALCITE("60c4713c2255917366624590626427e492571d05d8e2c5ee899bf61efaf2d6a0"),
    TUFF("d68b9c6131317cae798982bb000d9b44ba981a4bb0cf12164ec7d4d09b940c50"),
    DRIPSTONE_BLOCK("450ad731ce6dc21eb5eef6948bd2180a7a32fa1fe3851e47e3c00c6e246249a2"),
    GRASS_BLOCK("cf3d4459f30f532e9b73b0cc3c6f3a10c20b3e68f1af3f49d2efe124cafcd222"),
    DIRT("26440ab7c2821b6913e54905ba514cfabaf4d025618f328759b5906974c7e7cb"),
    COARSE_DIRT("d1b1aa03a1c1bdc7725d8f3a2f4274ac1dd188193e3200627a7f1ffe04a5c5b"),
    PODZOL("f707bc872e132d764bbee08cc084015529cae55fb9747471b9e593903ff9aee"),
    ROOTED_DIRT("1cd46b3587b20d8d7dc98a7c77a08d6187064720e9c138e1ac7c1d9601818874"),
    CRIMSON_NYLIUM("e1029ea47ca0e9440a0782878c84d61d928124c14dabd323c9fc609bad36a457"),
    WARPED_NYLIUM("61f91e77384704580704a9f4570ac54e4b36c1757c5adab65cc454e6fff2d3b0"),
    COBBLESTONE("e742885db6803ab3680ca50ac2b97b08bddc24e1ad3095da914677f524a6b1a6"),
    OAK_PLANKS("124ba19c23ba454741da2a142311aaf4a918fc2b68297bebc12594275f54c579"),
    SPRUCE_PLANKS("ac9a06abf52ea095cc46e4b9b2114e27cdb7fac96aba112ac4f7f3b249cca734"),
    BIRCH_PLANKS("9a708b6434a8c71b11aeddba3a745828135e31e8a8eb2fb8fb4502d8254bdda2"),
    JUNGLE_PLANKS("93da843bcdab0835e72bfb4f7e774473bb6ec5dc27ff717763c3f8ad528ba9a"),
    ACACIA_PLANKS("f9fa636124325a78df62619b44f76d187bc18386eb1acf467570c1f024794068"),
    DARK_OAK_PLANKS("652df42c0f4c23473ad2bc74c57afe601272e70f4457e7e23900918a959f2ab7"),
    CRIMSON_PLANKS("a2cd69a3e42564c0da4c2297943be23aa9ce1c756d8ba9e6eedd8f523218fde4"),
    WARPED_PLANKS("1bfc7918247d4e5b56b05dba0958ddf462c5e35d2fdcb0836486fdc6e8104122"),
    BEDROCK("c494a30a2799ebfbc8ad776b9387f3e9d1799bba8900013ac992db1fbad41ce7"),
    SAND("4f493dd806533d9d20e84953954365f4d369709cebc9ddef022d1fd40d86a68f"),
    RED_SAND("431be7ff98eebbdfd9ed8072ef88320d68158769f3aa18d6c4a64d0474618e52"),
    GRAVEL("7788b61fcd46cad9235cc32ac57a54f708110329447bb24c0877886e3f4907f1"),
    COAL_ORE("761c57974f102d3deb3c53d42fde909e9b39ccbc7f776e277575a02d51a1999e"),
    DEEPSLATE_COAL_ORE("acf94784d7c1dc6a93b413be52b54fa77b7a7258675e87021b34ed2bf751db21"),
    IRON_ORE("8385aaedd784faef8e8f6f782fa48d07c2fc2bbcf6fea1fbc9b9862d05d228c1"),
    DEEPSLATE_IRON_ORE("caecf8d5a21b3c9fc8ce5a566021f3a2b0d98652dbc5daee45f7c63647ed141a"),
    COPPER_ORE("1bc2e38db661ddb784cee3fd730046eabd568e53199312a60dcdf0af1a5535c7"),
    DEEPSLATE_COPPER_ORE("9d6c1db29a7f745bd789a2c29476bd13e7516376cb7f680bf66e17b2a54a0816"),
    GOLD_ORE("85b4abd4f07b6894607cbd870868f67e025c7fb552a1a57f56f77c044cca41ce"),
    DEEPSLATE_GOLD_ORE("80c9c5eb1bfcf99a0d8c6e822c500c9971036575f401175d4a0400ec32a3a1ac"),
    REDSTONE_ORE("632ccf7814539a61f8bfc15bcf111a39ad8ae163c36e44b6379415556475d72a"),
    DEEPSLATE_REDSTONE_ORE("6c361af96ac2c997745083844645279987aca65679046e5adba77fc5f4f281d0"),
    EMERALD_ORE("ba40baeb96fea1bd6ee064696cdb74ffd08a6f7c40617d462e4e2da8faaf73e5"),
    DEEPSLATE_EMERALD_ORE("11350e0a606965f2ef09491ba54ee137915de58a8a28ab130a53fa8f416b28d5"),
    LAPIS_LAZULI_ORE("51001b425111bfe0acff710a8b41ea95e3b936a85e5bb6517160bab587e8870f"),
    DEEPSLATE_LAPIS_LAZULI_ORE("bc5bf49febec955eb3b328ce1709f7bb9f469c27a7ff40d1306942c08f96250e"),
    DIAMOND_ORE("fb1c268efec8d7d88a1cb88c2bfa097fa57037942299f7d202159fc93cd3036d"),
    DEEPSLATE_DIAMOND_ORE("d9563fdc4acab6db324b21bc43b238fe465e530a6327e7eef11d2d0c4ea"),
    NETHER_GOLD_ORE("29543f27575003dd5c898eab7bfe4c3dbbe570648089f3b97403df7f6bf2c1cc"),
    NETHER_QUARTZ_ORE("f4d69c4cddf903fbcc5a8c67cc22e4d9324272d52a4796d6672435d101598985"),
    ANCIENT_DEBRIS("fb4731017e8ca2480e3dfa04f18923c385d5e3cafbc07d7d9e4973c826469078"),
    BLOCK_OF_COAL("d7f5766d2928dc0df1b3404c3bd073c9476d26c80573b0332e7cce73df15482a"),
    BLOCK_OF_RAW_IRON("447f2e39d96e5d04386473daf0eb0ae00b17fa015556c9ca39f8e2de8a2369f2"),
    BLOCK_OF_RAW_COPPER("9a122b312c037ccff1e52a593b6db264e1b4cc9649b4f763b65962f1a18c3284"),
    BLOCK_OF_RAW_GOLD("eaddff6916e6410df6b883158aeadace6b36733374be6bed1821e3e74c95d91b"),
    BLOCK_OF_AMETHYST("3f4876b6a5d6dd785e091fd134a21c91d0a9cac5a622e448b5ffcb65ef45278"),
    BUDDING_AMETHYST("53f90dffcb320cd6fd566e681c00cbafdc26c99a6b4f78a2db02f77f251a1ff1")







    ;
    @Getter
    private static final CustomHeads[] cachedValues = values();

    @Getter
    private final String ID;

    @ParametersAreNonnullByDefault
    CustomHeads(String ID) {
        this.ID = ID;
    }


    public ItemStack getPlayerHead() {
        return PlayerHead.getItemStack(PlayerSkin.fromHashCode(ID));
    }

}
