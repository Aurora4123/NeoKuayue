package willow.train.kuayue.initial.panel;

import com.simibubi.create.foundation.utility.Couple;
import kasuga.lib.registrations.common.BlockReg;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import willow.train.kuayue.block.panels.FullShapeDirectionalBlock;
import willow.train.kuayue.block.panels.TrainHingePanelBlock;
import willow.train.kuayue.block.panels.TrainPanelBlock;
import willow.train.kuayue.block.panels.base.TrainPanelProperties;
import willow.train.kuayue.block.panels.door.CustomRenderedDoorBlock;
import willow.train.kuayue.block.panels.end_face.CustomRenderedEndfaceBlock;
import willow.train.kuayue.block.panels.slab.HingeSlabBlock;
import willow.train.kuayue.block.panels.slab.TrainSlabBlock;
import willow.train.kuayue.block.panels.window.TrainUnOpenableSmallWindowBlock;
import willow.train.kuayue.block.panels.window.TrainUnOpenableWindowBlock;
import willow.train.kuayue.initial.AllElements;
import willow.train.kuayue.initial.registration.PanelRegistration;
import willow.train.kuayue.initial.registration.SlabRegistration;

public class I11GPanel {

    public static final PanelRegistration<CustomRenderedDoorBlock> DOOR_CABIN_DF11G =
            new PanelRegistration<CustomRenderedDoorBlock>("door_cabin_df11g")
                    .block(p -> new CustomRenderedDoorBlock(p,
                            Couple.create(
                                    AllElements.testRegistry.asResource("df11g/door/door_cabin_bottom_df11g_right"),
                                    AllElements.testRegistry.asResource("df11g/door/door_cabin_upper_df11g_right")
                            ), Couple.create(
                            AllElements.testRegistry.asResource("df11g/door/door_cabin_bottom_df11g_left"),
                            AllElements.testRegistry.asResource("df11g/door/door_cabin_upper_df11g_left")
                    ), new Vec3(-.25, 0, 0), RenderShape.MODEL, false
                    ))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .tab(AllElements.neoKuayueLocoTab)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<CustomRenderedDoorBlock> DOOR_EQUIP_ROOM_DF11G =
            new PanelRegistration<CustomRenderedDoorBlock>("door_equip_room_df11g")
                    .block(p -> new CustomRenderedDoorBlock(p,
                            Couple.create(
                                    AllElements.testRegistry.asResource("df11g/door/door_equip_room_bottom_df11g_right"),
                                    AllElements.testRegistry.asResource("df11g/door/door_equip_room_upper_df11g_right")
                            ), Couple.create(
                            AllElements.testRegistry.asResource("df11g/door/door_equip_room_bottom_df11g_left"),
                            AllElements.testRegistry.asResource("df11g/door/door_equip_room_upper_df11g_left")
                    ), new Vec3(-.1875, 0, 0), RenderShape.MODEL, false
                    ))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .tab(AllElements.neoKuayueLocoTab)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<CustomRenderedEndfaceBlock> END_FACE_DF11G =
            new PanelRegistration<CustomRenderedEndfaceBlock>("end_face_df11g")
                    .block(properties ->
                            new CustomRenderedEndfaceBlock(
                                    properties, TrainPanelProperties.DoorType.NO_DOOR,
                                    null,
                                    null,
                                    "df11g/df11g_end_face"
                            )
                    ).materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<TrainPanelBlock> PANEL_CR_DF11G =
            new PanelRegistration<TrainPanelBlock>("panel_cr_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(-1, 0), new Vec2(2, 1)))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> PANEL_GENERAL_DF11G =
            new PanelRegistration<TrainPanelBlock>("panel_general_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0, 0), new Vec2(1, 1)))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> PANEL_KUAYUE_DF11G =
            new PanelRegistration<TrainPanelBlock>("panel_kuayue_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(-1, 0), new Vec2(2, 1)))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainHingePanelBlock> PANEL_MIDDLE_FRONT_DF11G =
            new PanelRegistration<TrainHingePanelBlock>("panel_middle_front_df11g")
                    .block(p -> new TrainHingePanelBlock(p, new Vec2(0, 0), new Vec2(1, 1)))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainHingePanelBlock> PANEL_MIDDLE_FRONT_DF11G_2 =
            new PanelRegistration<TrainHingePanelBlock>("panel_middle_front_df11g_2")
                    .block(p -> new TrainHingePanelBlock(p, new Vec2(0, 0), new Vec2(1, 2)))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> PANEL_MIDDLE_GENERAL_DF11G =
            new PanelRegistration<TrainPanelBlock>("panel_middle_general_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0, 0), new Vec2(1, 1)))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> PANEL_MIDDLE_SHADES_DF11G =
            new PanelRegistration<TrainPanelBlock>("panel_middle_shades_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0, 0), new Vec2(1, 1)))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> PANEL_SHADES_DF11G =
            new PanelRegistration<TrainPanelBlock>("panel_shades_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0, 0), new Vec2(1, 1)))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainUnOpenableSmallWindowBlock> WINDOW_MIDDLE_DF11G =
            new PanelRegistration<TrainUnOpenableSmallWindowBlock>("window_middle_df11g")
                    .block(TrainUnOpenableSmallWindowBlock::new)
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);

    public static final SlabRegistration<HingeSlabBlock> CARPORT_DF11G =
            new SlabRegistration<HingeSlabBlock>("carport_df11g")
                    .block(p -> new HingeSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final SlabRegistration<HingeSlabBlock> CARPORT_DF11G_2 =
            new SlabRegistration<HingeSlabBlock>("carport_df11g_2")
                    .block(p -> new HingeSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final SlabRegistration<TrainSlabBlock> CARPORT_GENERAL_DF11G =
            new SlabRegistration<TrainSlabBlock>("carport_general_df11g")
                    .block(p -> new TrainSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final SlabRegistration<TrainSlabBlock> CARPORT_KUAYUE_DF11G =
            new SlabRegistration<TrainSlabBlock>("carport_kuayue_df11g")
                    .block(p -> new TrainSlabBlock(p, true, -1, 2))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final SlabRegistration<TrainSlabBlock> CARPORT_LOUVER_DF11G =
            new SlabRegistration<TrainSlabBlock>("carport_louver_df11g")
                    .block(p -> new TrainSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final SlabRegistration<TrainSlabBlock> CARPORT_LOUVER_DF11G_2 =
            new SlabRegistration<TrainSlabBlock>("carport_louver_df11g_2")
                    .block(p -> new TrainSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final SlabRegistration<TrainSlabBlock> CARPORT_LOUVER_DF11G_3 =
            new SlabRegistration<TrainSlabBlock>("carport_louver_df11g_3")
                    .block(p -> new TrainSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);

    public static final BlockReg<FullShapeDirectionalBlock> COWCATCHER_DF11G =
            new BlockReg<FullShapeDirectionalBlock>("cowcatcher_df11g")
                    .blockType(FullShapeDirectionalBlock::new)
                    .material(Material.METAL).materialColor(MaterialColor.COLOR_BLACK)
                    .addProperty(properties -> properties.strength(1.5f, 3f))
                    .addProperty(BlockBehaviour.Properties::requiresCorrectToolForDrops)
                    .defaultBlockItem()
                    .addProperty(BlockBehaviour.Properties::noOcclusion)
                    .tabTo(AllElements.neoKuayueLocoTab)
                    .submit(AllElements.testRegistry);

    public static final BlockReg<FullShapeDirectionalBlock> HEAD_DF11G_2 =
            new BlockReg<FullShapeDirectionalBlock>("head_df11g_2")
                    .blockType(FullShapeDirectionalBlock::new)
                    .material(Material.METAL).materialColor(MaterialColor.COLOR_BLACK)
                    .addProperty(BlockBehaviour.Properties::noOcclusion)
                    .addProperty(properties -> properties.strength(1.5f, 3f))
                    .addProperty(BlockBehaviour.Properties::requiresCorrectToolForDrops)
                    .defaultBlockItem()
                    .tabTo(AllElements.neoKuayueLocoTab)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<TrainPanelBlock> PANEL_TOP_DF11G =
            new PanelRegistration<TrainPanelBlock>("panel_top_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<TrainPanelBlock> PANEL_BOTTOM_DF11G =
            new PanelRegistration<TrainPanelBlock>("panel_bottom_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);
    public static final SlabRegistration<TrainSlabBlock> FLOOR_DF11G =
            new SlabRegistration<TrainSlabBlock>("floor_df11g")
                    .block(p -> new TrainSlabBlock(p, false))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_BLACK)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> WINDOW_EQUIP_ROOM_DF11G_1 =
            new PanelRegistration<TrainPanelBlock>("window_equip_room_df11g_1")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,2)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);

    public static final SlabRegistration<TrainSlabBlock> DF11G_CARPORT_KUA =
            new SlabRegistration<TrainSlabBlock>("df11g_carport_kua")
                    .block(p -> new TrainSlabBlock(p, true ))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<TrainPanelBlock> WINDOW_EQUIP_ROOM_DF11G_2 =
            new PanelRegistration<TrainPanelBlock>("window_equip_room_df11g_2")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> ROAD_SIGN_DF11G =
                    new PanelRegistration<TrainPanelBlock>("road_sign_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(-1,0),new Vec2(2,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> WINDOW_PR_DF11G =
            new PanelRegistration<TrainPanelBlock>("window_pr_df11g")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> LOUVER_EQUIP_ROOM_DF11G_2_TOP =
            new PanelRegistration<TrainPanelBlock>("louver_equip_room_df11g_2_top")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> LOUVER_EQUIP_ROOM_DF11G_2_BOTTOM =
            new PanelRegistration<TrainPanelBlock>("louver_equip_room_df11g_2_bottom")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);
    public static final PanelRegistration<TrainPanelBlock> LOUVER_EQUIP_ROOM_DF11G_1 =
            new PanelRegistration<TrainPanelBlock>("louver_equip_room_df11g_1")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)

                    .submit(AllElements.testRegistry);

    public static final SlabRegistration<TrainSlabBlock> DF11G_CARPORT_YUE =
            new SlabRegistration<TrainSlabBlock>("df11g_carport_yue")
                    .block(p -> new TrainSlabBlock(p, true))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<TrainPanelBlock> DF11G_PANEL_BOTTOM_BLIND =
            new PanelRegistration<TrainPanelBlock>("df11g_panel_bottom_blind")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<TrainPanelBlock> DF11G_PANEL_UPPER_BLIND =
            new PanelRegistration<TrainPanelBlock>("df11g_panel_upper_blind")
                    .block(p -> new TrainPanelBlock(p, new Vec2(0,0),new Vec2(1,1)))
                    .materialAndColor(Material.METAL,MaterialColor.COLOR_BLUE)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f,3f)
                    .submit(AllElements.testRegistry);


    public static final PanelRegistration<TrainUnOpenableWindowBlock> DF11G_PANEL_BOTTOM_COOLING_BLIND =
            new PanelRegistration<TrainUnOpenableWindowBlock>("df11g_panel_bottom_cooling_blind")
                    .block(p -> new TrainUnOpenableWindowBlock(p, 2))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);


    public static final BlockReg<FullShapeDirectionalBlock> DF11G_TANK =
            new BlockReg<FullShapeDirectionalBlock>("df11g_tank")
                    .blockType(FullShapeDirectionalBlock::new)
                    .material(Material.METAL).materialColor(MaterialColor.COLOR_BLACK)
                    .addProperty(BlockBehaviour.Properties::noOcclusion)
                    .defaultBlockItem()
                    .tabTo(AllElements.neoKuayueLocoTab)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<TrainUnOpenableWindowBlock> DF11G_WINDOWS_PH_EH =
            new PanelRegistration<TrainUnOpenableWindowBlock>("df11g_windows_ph_eh")
                    .block(p -> new TrainUnOpenableWindowBlock(p, 2))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);

    public static final PanelRegistration<TrainUnOpenableWindowBlock> DF11G_PANEL_UPPER_COOLING_BLIND =
            new PanelRegistration<TrainUnOpenableWindowBlock>("df11g_panel_upper_cooling_blind")
                    .block(p -> new TrainUnOpenableWindowBlock(p, 2))
                    .materialAndColor(Material.METAL, MaterialColor.COLOR_GREEN)
                    .tab(AllElements.neoKuayueLocoTab)
                    .noOcclusion().strengthAndTool(1.5f, 3f)
                    .submit(AllElements.testRegistry);

    public static void invoke(){}


}
