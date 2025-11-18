package hr.helmiaRebuilt.itemRegistry;

import hr.helmiaRebuilt.colorUtilities.colorUtilities;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static hr.helmiaRebuilt.helmiaRebuiltFinal.plugin;

public class customItemManager {
    private static final Map<String, ItemStack> customItems = new HashMap<>();

    //Constant Used for brewery items
    static NamespacedKey brewDataKey = new NamespacedKey("brewery", "brewdata");

    // Initialize custom items
    public static void initializeItems() {

        //Smithing

        //Flint Items
        ItemStack smithing_tools = new ItemStack(Material.FLINT);
        ItemMeta smithing_toolsMeta = smithing_tools.getItemMeta();
        smithing_toolsMeta.setCustomModelData(1);
        smithing_toolsMeta.setDisplayName(ChatColor.WHITE + "Smithing Tools");
        smithing_tools.setItemMeta(smithing_toolsMeta);
        customItems.put("smithing_tools", smithing_tools);

        ItemStack whetstone = new ItemStack(Material.FLINT);
        ItemMeta whetstoneMeta = whetstone.getItemMeta();
        whetstoneMeta.setCustomModelData(2);
        whetstoneMeta.setDisplayName(ChatColor.WHITE + "Whetstone");
        whetstone.setItemMeta(whetstoneMeta);
        customItems.put("whetstone", whetstone);

        ItemStack sharpening_kit = new ItemStack(Material.FLINT);
        ItemMeta sharpening_kitMeta = sharpening_kit.getItemMeta();
        sharpening_kitMeta.setCustomModelData(3);
        sharpening_kitMeta.setDisplayName(ChatColor.WHITE + "Sharpening Kit");
        sharpening_kit.setItemMeta(sharpening_kitMeta);
        customItems.put("sharpening_kit", sharpening_kit);

        ItemStack haft = new ItemStack(Material.FLINT);
        ItemMeta haftMeta = haft.getItemMeta();
        haftMeta.setCustomModelData(4);
        haftMeta.setDisplayName(ChatColor.WHITE + "Haft");
        haft.setItemMeta(haftMeta);
        customItems.put("haft", haft);

        ItemStack shaft = new ItemStack(Material.FLINT);
        ItemMeta shaftMeta = shaft.getItemMeta();
        shaftMeta.setCustomModelData(5);
        shaftMeta.setDisplayName(ChatColor.WHITE + "Shaft");
        shaft.setItemMeta(shaftMeta);
        customItems.put("shaft", shaft);

        ItemStack pole = new ItemStack(Material.FLINT);
        ItemMeta poleMeta = pole.getItemMeta();
        poleMeta.setCustomModelData(6);
        poleMeta.setDisplayName(ChatColor.WHITE + "Pole");
        pole.setItemMeta(poleMeta);
        customItems.put("pole", pole);

        ItemStack iron_blade = new ItemStack(Material.FLINT);
        ItemMeta iron_bladeMeta = iron_blade.getItemMeta();
        iron_bladeMeta.setCustomModelData(7);
        iron_bladeMeta.setDisplayName(ChatColor.WHITE + "Iron Blade");
        iron_blade.setItemMeta(iron_bladeMeta);
        customItems.put("iron_blade", iron_blade);

        ItemStack iron_blade_glowing = new ItemStack(Material.FLINT);
        ItemMeta iron_blade_glowingMeta = iron_blade_glowing.getItemMeta();
        iron_blade_glowingMeta.setCustomModelData(8);
        iron_blade_glowingMeta.setDisplayName(ChatColor.WHITE + "Glowing Iron Blade");
        iron_blade_glowing.setItemMeta(iron_blade_glowingMeta);
        customItems.put("iron_blade_glowing", iron_blade_glowing);

        ItemStack iron_blade_thin = new ItemStack(Material.FLINT);
        ItemMeta iron_blade_thinMeta = iron_blade_thin.getItemMeta();
        iron_blade_thinMeta.setCustomModelData(9);
        iron_blade_thinMeta.setDisplayName(ChatColor.WHITE + "Thin Iron Blade");
        iron_blade_thin.setItemMeta(iron_blade_thinMeta);
        customItems.put("iron_blade_thin", iron_blade_thin);

        ItemStack iron_blade_small = new ItemStack(Material.FLINT);
        ItemMeta iron_blade_smallMeta = iron_blade_small.getItemMeta();
        iron_blade_smallMeta.setCustomModelData(10);
        iron_blade_smallMeta.setDisplayName(ChatColor.WHITE + "Small Iron Blade");
        iron_blade_small.setItemMeta(iron_blade_smallMeta);
        customItems.put("iron_blade_small", iron_blade_small);

        ItemStack iron_blade_bitheryk = new ItemStack(Material.FLINT);
        ItemMeta iron_blade_bitherykMeta = iron_blade_bitheryk.getItemMeta();
        iron_blade_bitherykMeta.setCustomModelData(11);
        iron_blade_bitherykMeta.setDisplayName(ChatColor.WHITE + "Bitheryk Iron Blade");
        iron_blade_bitheryk.setItemMeta(iron_blade_bitherykMeta);
        customItems.put("iron_blade_bitheryk", iron_blade_bitheryk);

        ItemStack iron_blade_curved = new ItemStack(Material.FLINT);
        ItemMeta iron_blade_curvedMeta = iron_blade_curved.getItemMeta();
        iron_blade_curvedMeta.setCustomModelData(12);
        iron_blade_curvedMeta.setDisplayName(ChatColor.WHITE + "Curved Iron Blade");
        iron_blade_curved.setItemMeta(iron_blade_curvedMeta);
        customItems.put("iron_blade_curved", iron_blade_curved);

        ItemStack iron_axe_head = new ItemStack(Material.FLINT);
        ItemMeta iron_axe_headMeta = iron_axe_head.getItemMeta();
        iron_axe_headMeta.setCustomModelData(13);
        iron_axe_headMeta.setDisplayName(ChatColor.WHITE + "Iron Axe Head");
        iron_axe_head.setItemMeta(iron_axe_headMeta);
        customItems.put("iron_axe_head", iron_axe_head);

        ItemStack iron_voulge_head = new ItemStack(Material.FLINT);
        ItemMeta iron_voulge_headMeta = iron_voulge_head.getItemMeta();
        iron_voulge_headMeta.setCustomModelData(14);
        iron_voulge_headMeta.setDisplayName(ChatColor.WHITE + "Iron Voulge Head");
        iron_voulge_head.setItemMeta(iron_voulge_headMeta);
        customItems.put("iron_voulge_head", iron_voulge_head);

        ItemStack chains = new ItemStack(Material.FLINT);
        ItemMeta chainsMeta = chains.getItemMeta();
        chainsMeta.setCustomModelData(15);
        chainsMeta.setDisplayName(ChatColor.WHITE + "Chains");
        chains.setItemMeta(chainsMeta);
        customItems.put("chains", chains);

        ItemStack iron_bracing = new ItemStack(Material.FLINT);
        ItemMeta iron_bracingMeta = iron_bracing.getItemMeta();
        iron_bracingMeta.setCustomModelData(16);
        iron_bracingMeta.setDisplayName(ChatColor.WHITE + "Iron Bracing");
        iron_bracing.setItemMeta(iron_bracingMeta);
        customItems.put("iron_bracing", iron_bracing);

        ItemStack iron_gauntlets = new ItemStack(Material.FLINT);
        ItemMeta iron_gauntletsMeta = iron_gauntlets.getItemMeta();
        iron_gauntletsMeta.setCustomModelData(17);
        iron_gauntletsMeta.setDisplayName(ChatColor.WHITE + "Iron Gauntlets");
        iron_gauntlets.setItemMeta(iron_gauntletsMeta);
        customItems.put("iron_gauntlets", iron_gauntlets);

        ItemStack iron_visor = new ItemStack(Material.FLINT);
        ItemMeta iron_visorMeta = iron_visor.getItemMeta();
        iron_visorMeta.setCustomModelData(18);
        iron_visorMeta.setDisplayName(ChatColor.WHITE + "Iron Visor");
        iron_visor.setItemMeta(iron_visorMeta);
        customItems.put("iron_visor", iron_visor);

        ItemStack iron_visor_hounskull = new ItemStack(Material.FLINT);
        ItemMeta iron_visor_hounskullMeta = iron_visor_hounskull.getItemMeta();
        iron_visor_hounskullMeta.setCustomModelData(19);
        iron_visor_hounskullMeta.setDisplayName(ChatColor.WHITE + "Iron Hounskull Visor");
        iron_visor_hounskull.setItemMeta(iron_visor_hounskullMeta);
        customItems.put("iron_visor_hounskull", iron_visor_hounskull);

        //Iron Ingot Items
        ItemStack iron_ingot = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_ingotMeta = iron_ingot.getItemMeta();
        iron_ingotMeta.setCustomModelData(0);
        iron_ingotMeta.setDisplayName(ChatColor.WHITE + "Iron Ingot");
        iron_ingot.setItemMeta(iron_ingotMeta);
        customItems.put("iron_ingot", iron_ingot);

        ItemStack iron_ingot_glowing = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_ingot_glowingMeta = iron_ingot_glowing.getItemMeta();
        iron_ingot_glowingMeta.setCustomModelData(1);
        iron_ingot_glowingMeta.setDisplayName(ChatColor.WHITE + "Glowing Iron Ingot");
        iron_ingot_glowing.setItemMeta(iron_ingot_glowingMeta);
        customItems.put("iron_ingot_glowing", iron_ingot_glowing);

        ItemStack iron_stick = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_stickMeta = iron_stick.getItemMeta();
        iron_stickMeta.setCustomModelData(2);
        iron_stickMeta.setDisplayName(ChatColor.WHITE + "Iron Stick");
        iron_stick.setItemMeta(iron_stickMeta);
        customItems.put("iron_stick", iron_stick);

        ItemStack iron_stick_glowing = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_stick_glowingMeta = iron_stick_glowing.getItemMeta();
        iron_stick_glowingMeta.setCustomModelData(3);
        iron_stick_glowingMeta.setDisplayName(ChatColor.WHITE + "Glowing Iron Stick");
        iron_stick_glowing.setItemMeta(iron_stick_glowingMeta);
        customItems.put("iron_stick_glowing", iron_stick_glowing);

        ItemStack iron_strip = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_stripMeta = iron_strip.getItemMeta();
        iron_stripMeta.setCustomModelData(4);
        iron_stripMeta.setDisplayName(ChatColor.WHITE + "Iron Strip");
        iron_strip.setItemMeta(iron_stripMeta);
        customItems.put("iron_strip", iron_strip);

        ItemStack iron_strip_glowing = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_strip_glowingMeta = iron_strip_glowing.getItemMeta();
        iron_strip_glowingMeta.setCustomModelData(5);
        iron_strip_glowingMeta.setDisplayName(ChatColor.WHITE + "Glowing Iron Strip");
        iron_strip_glowing.setItemMeta(iron_strip_glowingMeta);
        customItems.put("iron_strip_glowing", iron_strip_glowing);

        ItemStack iron_rod = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_rodMeta = iron_rod.getItemMeta();
        iron_rodMeta.setCustomModelData(6);
        iron_rodMeta.setDisplayName(ChatColor.WHITE + "Iron Rod");
        iron_rod.setItemMeta(iron_rodMeta);
        customItems.put("iron_rod", iron_rod);

        ItemStack iron_rod_glowing = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_rod_glowingMeta = iron_rod_glowing.getItemMeta();
        iron_rod_glowingMeta.setCustomModelData(7);
        iron_rod_glowingMeta.setDisplayName(ChatColor.WHITE + "Glowing Iron Rod");
        iron_rod_glowing.setItemMeta(iron_rod_glowingMeta);
        customItems.put("iron_rod_glowing", iron_rod_glowing);

        ItemStack iron_rod_thin = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_rod_thinMeta = iron_rod_thin.getItemMeta();
        iron_rod_thinMeta.setCustomModelData(8);
        iron_rod_thinMeta.setDisplayName(ChatColor.WHITE + "Thin Iron Rod");
        iron_rod_thin.setItemMeta(iron_rod_thinMeta);
        customItems.put("iron_rod_thin", iron_rod_thin);

        ItemStack iron_plate = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_plateMeta = iron_plate.getItemMeta();
        iron_plateMeta.setCustomModelData(9);
        iron_plateMeta.setDisplayName(ChatColor.WHITE + "Iron Plate");
        iron_plate.setItemMeta(iron_plateMeta);
        customItems.put("iron_plate", iron_plate);

        ItemStack iron_plate_glowing = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_plate_glowingMeta = iron_plate_glowing.getItemMeta();
        iron_plate_glowingMeta.setCustomModelData(10);
        iron_plate_glowingMeta.setDisplayName(ChatColor.WHITE + "Glowing Iron Plate");
        iron_plate_glowing.setItemMeta(iron_plate_glowingMeta);
        customItems.put("iron_plate_glowing", iron_plate_glowing);

        ItemStack iron_plate_large = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_plate_largeMeta = iron_plate_large.getItemMeta();
        iron_plate_largeMeta.setCustomModelData(11);
        iron_plate_largeMeta.setDisplayName(ChatColor.WHITE + "Large Iron Plate");
        iron_plate_large.setItemMeta(iron_plate_largeMeta);
        customItems.put("iron_plate_large", iron_plate_large);

        ItemStack iron_plate_large_glowing = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_plate_large_glowingMeta = iron_plate_large_glowing.getItemMeta();
        iron_plate_large_glowingMeta.setCustomModelData(12);
        iron_plate_large_glowingMeta.setDisplayName(ChatColor.WHITE + "Glowing Large Iron Plate");
        iron_plate_large_glowing.setItemMeta(iron_plate_large_glowingMeta);
        customItems.put("iron_plate_large_glowing", iron_plate_large_glowing);

        ItemStack iron_armour_plate = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_armour_plateMeta = iron_armour_plate.getItemMeta();
        iron_armour_plateMeta.setCustomModelData(13);
        iron_armour_plateMeta.setDisplayName(ChatColor.WHITE + "Iron Armour Plate");
        iron_armour_plate.setItemMeta(iron_armour_plateMeta);
        customItems.put("iron_armour_plate", iron_armour_plate);

        ItemStack iron_armour_plate_glowing = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_armour_plate_glowingMeta = iron_armour_plate_glowing.getItemMeta();
        iron_armour_plate_glowingMeta.setCustomModelData(14);
        iron_armour_plate_glowingMeta.setDisplayName(ChatColor.WHITE + "Iron Armour Plate");
        iron_armour_plate_glowing.setItemMeta(iron_armour_plate_glowingMeta);
        customItems.put("iron_armour_plate_glowing", iron_armour_plate_glowing);

        ItemStack iron_coil = new ItemStack(Material.IRON_INGOT);
        ItemMeta iron_coilMeta = iron_coil.getItemMeta();
        iron_coilMeta.setCustomModelData(15);
        iron_coilMeta.setDisplayName(ChatColor.WHITE + "Iron Coil");
        iron_coil.setItemMeta(iron_coilMeta);
        customItems.put("iron_coil", iron_coil);

        ItemStack chainmail = new ItemStack(Material.IRON_INGOT);
        ItemMeta chainmailMeta = chainmail.getItemMeta();
        chainmailMeta.setCustomModelData(16);
        chainmailMeta.setDisplayName(ChatColor.WHITE + "Chainmail");
        chainmail.setItemMeta(chainmailMeta);
        customItems.put("chainmail", chainmail);

        ItemStack reinforced_chainmail = new ItemStack(Material.IRON_INGOT);
        ItemMeta reinforced_chainmailMeta = reinforced_chainmail.getItemMeta();
        reinforced_chainmailMeta.setCustomModelData(17);
        reinforced_chainmailMeta.setDisplayName(ChatColor.WHITE + "Reinforced Chainmail");
        reinforced_chainmail.setItemMeta(reinforced_chainmailMeta);
        customItems.put("reinforced_chainmail", reinforced_chainmail);

        //Clay Items
        ItemStack iron_bloom = new ItemStack(Material.CLAY_BALL);
        ItemMeta iron_bloomMeta = iron_bloom.getItemMeta();
        iron_bloomMeta.setCustomModelData(1);
        iron_bloomMeta.setDisplayName(ChatColor.WHITE + "Iron Bloom");
        iron_bloom.setItemMeta(iron_bloomMeta);
        customItems.put("iron_bloom", iron_bloom);

        ItemStack iron_ingot_slaggy = new ItemStack(Material.CLAY_BALL);
        ItemMeta iron_ingot_slaggyMeta = iron_ingot_slaggy.getItemMeta();
        iron_ingot_slaggyMeta.setCustomModelData(2);
        iron_ingot_slaggyMeta.setDisplayName(ChatColor.WHITE + "Slaggy Iron Ingot");
        iron_ingot_slaggy.setItemMeta(iron_ingot_slaggyMeta);
        customItems.put("iron_ingot_slaggy", iron_ingot_slaggy);

        ItemStack steel_bloom = new ItemStack(Material.CLAY_BALL);
        ItemMeta steel_bloomMeta = steel_bloom.getItemMeta();
        steel_bloomMeta.setCustomModelData(3);
        steel_bloomMeta.setDisplayName(ChatColor.WHITE + "Steel Bloom");
        steel_bloom.setItemMeta(steel_bloomMeta);
        customItems.put("steel_bloom", steel_bloom);

        ItemStack steel_ingot_slaggy = new ItemStack(Material.CLAY_BALL);
        ItemMeta steel_ingot_slaggyMeta = steel_ingot_slaggy.getItemMeta();
        steel_ingot_slaggyMeta.setCustomModelData(4);
        steel_ingot_slaggyMeta.setDisplayName(ChatColor.WHITE + "Slaggy Steel Ingot");
        steel_ingot_slaggy.setItemMeta(steel_ingot_slaggyMeta);
        customItems.put("steel_ingot_slaggy", steel_ingot_slaggy);

        ItemStack steel_ingot_impure = new ItemStack(Material.CLAY_BALL);
        ItemMeta steel_ingot_impureMeta = steel_ingot_impure.getItemMeta();
        steel_ingot_impureMeta.setCustomModelData(5);
        steel_ingot_impureMeta.setDisplayName(ChatColor.WHITE + "Impure Steel Ingot");
        steel_ingot_impure.setItemMeta(steel_ingot_impureMeta);
        customItems.put("steel_ingot_impure", steel_ingot_impure);

        ItemStack steel_ingot_impure_glowing = new ItemStack(Material.CLAY_BALL);
        ItemMeta steel_ingot_impure_glowingMeta = steel_ingot_impure_glowing.getItemMeta();
        steel_ingot_impure_glowingMeta.setCustomModelData(6);
        steel_ingot_impure_glowingMeta.setDisplayName(ChatColor.WHITE + "Glowing Impure Steel Ingot");
        steel_ingot_impure_glowing.setItemMeta(steel_ingot_impure_glowingMeta);
        customItems.put("steel_ingot_impure_glowing", steel_ingot_impure_glowing);

        //Food

        //Apple Items
        ItemStack rayyenara = new ItemStack(Material.APPLE);
        ItemMeta rayyenaraMeta = rayyenara.getItemMeta();
        rayyenaraMeta.setCustomModelData(1);
        rayyenaraMeta.setDisplayName(ChatColor.WHITE + "Rayyenara");
        List<String> rayyenaraLore = new ArrayList<>();
        rayyenaraLore.add(ChatColor.GRAY + "Food");
        rayyenaraLore.add(null);
        rayyenaraMeta.setLore(rayyenaraLore);
        NamespacedKey codenameKey = new NamespacedKey(plugin, "hrData_codename");
        NamespacedKey typeKey = new NamespacedKey(plugin, "hrData_type");
        rayyenaraMeta.getPersistentDataContainer().set(codenameKey, PersistentDataType.STRING, "rayyenara");
        rayyenaraMeta.getPersistentDataContainer().set(typeKey, PersistentDataType.STRING, "food");
        rayyenara.setItemMeta(rayyenaraMeta);
        customItems.put("rayyenara", rayyenara);

        ItemStack honeyjuice = new ItemStack(Material.APPLE);
        ItemMeta honeyjuiceMeta = honeyjuice.getItemMeta();
        honeyjuiceMeta.setCustomModelData(2);
        honeyjuiceMeta.setDisplayName(ChatColor.WHITE + "Honeyjuice");
        honeyjuice.setItemMeta(honeyjuiceMeta);
        customItems.put("honeyjuice", honeyjuice);

        ItemStack sourmouth = new ItemStack(Material.APPLE);
        ItemMeta sourmouthMeta = sourmouth.getItemMeta();
        sourmouthMeta.setCustomModelData(3);
        sourmouthMeta.setDisplayName(ChatColor.WHITE + "Sourmouth");
        sourmouth.setItemMeta(sourmouthMeta);
        customItems.put("sourmouth", sourmouth);

        ItemStack northmans_heart = new ItemStack(Material.APPLE);
        ItemMeta northmans_heartMeta = northmans_heart.getItemMeta();
        northmans_heartMeta.setCustomModelData(4);
        northmans_heartMeta.setDisplayName(ChatColor.WHITE + "Northman's Heart");
        northmans_heart.setItemMeta(northmans_heartMeta);
        customItems.put("northmans_heart", northmans_heart);

        ItemStack imyltaes = new ItemStack(Material.APPLE);
        ItemMeta imyltaesMeta = imyltaes.getItemMeta();
        imyltaesMeta.setCustomModelData(5);
        imyltaesMeta.setDisplayName(ChatColor.WHITE + "Imyltaes");
        imyltaes.setItemMeta(imyltaesMeta);
        customItems.put("imyltaes", imyltaes);

        //Dried Kelp Items
        ItemStack garlic = new ItemStack(Material.DRIED_KELP);
        ItemMeta garlicMeta = garlic.getItemMeta();
        garlicMeta.setCustomModelData(1);
        garlicMeta.setDisplayName(ChatColor.WHITE + "Garlic");
        garlic.setItemMeta(garlicMeta);
        customItems.put("garlic", garlic);

        ItemStack lettuce = new ItemStack(Material.DRIED_KELP);
        ItemMeta lettuceMeta = lettuce.getItemMeta();
        lettuceMeta.setCustomModelData(2);
        lettuceMeta.setDisplayName(ChatColor.WHITE + "Lettuce");
        lettuce.setItemMeta(lettuceMeta);
        customItems.put("lettuce", lettuce);

        ItemStack cauliflower = new ItemStack(Material.DRIED_KELP);
        ItemMeta cauliflowerMeta = cauliflower.getItemMeta();
        cauliflowerMeta.setCustomModelData(3);
        cauliflowerMeta.setDisplayName(ChatColor.WHITE + "Cauliflower");
        cauliflower.setItemMeta(cauliflowerMeta);
        customItems.put("cauliflower", cauliflower);

        ItemStack leek = new ItemStack(Material.DRIED_KELP);
        ItemMeta leekMeta = leek.getItemMeta();
        leekMeta.setCustomModelData(4);
        leekMeta.setDisplayName(ChatColor.WHITE + "Leek");
        leek.setItemMeta(leekMeta);
        customItems.put("leek", leek);

        ItemStack pomegranate = new ItemStack(Material.DRIED_KELP);
        ItemMeta pomegranateMeta = pomegranate.getItemMeta();
        pomegranateMeta.setCustomModelData(5);
        pomegranateMeta.setDisplayName(ChatColor.WHITE + "Pomegranate");
        pomegranate.setItemMeta(pomegranateMeta);
        customItems.put("pomegranate", pomegranate);

        ItemStack hazelnut = new ItemStack(Material.DRIED_KELP);
        ItemMeta hazelnutMeta = hazelnut.getItemMeta();
        hazelnutMeta.setCustomModelData(6);
        hazelnutMeta.setDisplayName(ChatColor.WHITE + "Hazelnut");
        hazelnut.setItemMeta(hazelnutMeta);
        customItems.put("hazelnut", hazelnut);

        ItemStack radish = new ItemStack(Material.DRIED_KELP);
        ItemMeta radishMeta = radish.getItemMeta();
        radishMeta.setCustomModelData(7);
        radishMeta.setDisplayName(ChatColor.WHITE + "Radish");
        radish.setItemMeta(radishMeta);
        customItems.put("radish", radish);

        //Sweet Berries Items
        ItemStack hvaekan_berries = new ItemStack(Material.SWEET_BERRIES);
        ItemMeta hvaekan_berriesMeta = hvaekan_berries.getItemMeta();
        hvaekan_berriesMeta.setCustomModelData(1);
        hvaekan_berriesMeta.setDisplayName(ChatColor.WHITE + "Hvaekan Berries");
        hvaekan_berries.setItemMeta(hvaekan_berriesMeta);
        customItems.put("hvaekan_berries", hvaekan_berries);

        ItemStack green_grapes = new ItemStack(Material.SWEET_BERRIES);
        ItemMeta green_grapesMeta = green_grapes.getItemMeta();
        green_grapesMeta.setCustomModelData(2);
        green_grapesMeta.setDisplayName(ChatColor.WHITE + "Green Grapes");
        green_grapes.setItemMeta(green_grapesMeta);
        customItems.put("green_grapes", green_grapes);

        ItemStack blackberries = new ItemStack(Material.SWEET_BERRIES);
        ItemMeta blackberriesMeta = blackberries.getItemMeta();
        blackberriesMeta.setCustomModelData(3);
        blackberriesMeta.setDisplayName(ChatColor.WHITE + "Blackberries");
        blackberries.setItemMeta(blackberriesMeta);
        customItems.put("blackberries", blackberries);

        //Wheat Items
        ItemStack wheat = new ItemStack(Material.WHEAT);
        ItemMeta wheatMeta = wheat.getItemMeta();
        wheatMeta.setCustomModelData(0);
        wheatMeta.setDisplayName(ChatColor.WHITE + "Wheat");
        wheat.setItemMeta(wheatMeta);
        customItems.put("wheat", wheat);

        //Potato Items
        ItemStack potato = new ItemStack(Material.POTATO);
        ItemMeta potatoMeta = potato.getItemMeta();
        potatoMeta.setCustomModelData(0);
        potatoMeta.setDisplayName(ChatColor.WHITE + "Potato");
        potato.setItemMeta(potatoMeta);
        customItems.put("potato", potato);

        //Carrot Items
        ItemStack carrot = new ItemStack(Material.CARROT);
        ItemMeta carrotMeta = carrot.getItemMeta();
        carrotMeta.setCustomModelData(0);
        carrotMeta.setDisplayName(ChatColor.WHITE + "Carrot");
        carrot.setItemMeta(carrotMeta);
        customItems.put("carrot", carrot);

        ItemStack jaesyhvaernae_meat = new ItemStack(Material.CARROT);
        ItemMeta jaesyhvaernae_meatMeta = jaesyhvaernae_meat.getItemMeta();
        jaesyhvaernae_meatMeta.setCustomModelData(1);
        jaesyhvaernae_meatMeta.setDisplayName(ChatColor.WHITE + "Meat Jaesyhvaernae");
        jaesyhvaernae_meat.setItemMeta(jaesyhvaernae_meatMeta);
        customItems.put("jaesyhvaernae_meat", jaesyhvaernae_meat);

        ItemStack jaesyhvaernae_cheese = new ItemStack(Material.CARROT);
        ItemMeta jaesyhvaernae_cheeseMeta = jaesyhvaernae_cheese.getItemMeta();
        jaesyhvaernae_cheeseMeta.setCustomModelData(2);
        jaesyhvaernae_cheeseMeta.setDisplayName(ChatColor.WHITE + "Cheese Jaesyhvaernae");
        jaesyhvaernae_cheese.setItemMeta(jaesyhvaernae_cheeseMeta);
        customItems.put("jaesyhvaernae_cheese", jaesyhvaernae_cheese);

        ItemStack hazelnut_fritters = new ItemStack(Material.CARROT);
        ItemMeta hazelnut_frittersMeta = hazelnut_fritters.getItemMeta();
        hazelnut_frittersMeta.setCustomModelData(3);
        hazelnut_frittersMeta.setDisplayName(ChatColor.WHITE + "Hazelnut Fritters");
        hazelnut_fritters.setItemMeta(hazelnut_frittersMeta);
        customItems.put("hazelnut_fritters", hazelnut_fritters);

        //Pumpkin Items
        ItemStack pumpkin = new ItemStack(Material.PUMPKIN);
        ItemMeta pumpkinMeta = pumpkin.getItemMeta();
        pumpkinMeta.setCustomModelData(0);
        pumpkinMeta.setDisplayName(ChatColor.WHITE + "Pumpkin");
        pumpkin.setItemMeta(pumpkinMeta);
        customItems.put("pumpkin", pumpkin);

        //Fern Items
        ItemStack nettle = new ItemStack(Material.FERN);
        ItemMeta nettleMeta = nettle.getItemMeta();
        nettleMeta.setCustomModelData(1);
        nettleMeta.setDisplayName(ChatColor.WHITE + "Nettle");
        nettle.setItemMeta(nettleMeta);
        customItems.put("nettle", nettle);

        ItemStack northern_sage = new ItemStack(Material.FERN);
        ItemMeta northern_sageMeta = northern_sage.getItemMeta();
        northern_sageMeta.setCustomModelData(2);
        northern_sageMeta.setDisplayName(ChatColor.WHITE + "Northern Sage");
        northern_sage.setItemMeta(northern_sageMeta);
        customItems.put("northern_sage", northern_sage);

        ItemStack kaelons_tongue = new ItemStack(Material.FERN);
        ItemMeta kaelons_tongueMeta = kaelons_tongue.getItemMeta();
        kaelons_tongueMeta.setCustomModelData(3);
        kaelons_tongueMeta.setDisplayName(ChatColor.WHITE + "Kaelon's Tongue");
        kaelons_tongue.setItemMeta(kaelons_tongueMeta);
        customItems.put("kaelons_tongue", kaelons_tongue);

        ItemStack everdew = new ItemStack(Material.FERN);
        ItemMeta everdewMeta = everdew.getItemMeta();
        everdewMeta.setCustomModelData(4);
        everdewMeta.setDisplayName(ChatColor.WHITE + "Everdew");
        everdew.setItemMeta(everdewMeta);
        customItems.put("everdew", everdew);

        //Beetroot Items
        ItemStack beetroot = new ItemStack(Material.BEETROOT);
        ItemMeta beetrootMeta = beetroot.getItemMeta();
        beetrootMeta.setCustomModelData(0);
        beetrootMeta.setDisplayName(ChatColor.WHITE + "Beetroot");
        beetroot.setItemMeta(beetrootMeta);
        customItems.put("beetroot", beetroot);

        //Brown Mushroom Items
        ItemStack brown_mushroom = new ItemStack(Material.BROWN_MUSHROOM);
        ItemMeta brown_mushroomMeta = brown_mushroom.getItemMeta();
        brown_mushroomMeta.setCustomModelData(0);
        brown_mushroomMeta.setDisplayName(ChatColor.WHITE + "Brown Mushroom");
        brown_mushroom.setItemMeta(brown_mushroomMeta);
        customItems.put("brown_mushroom", brown_mushroom);

        //Red Mushroom Items
        ItemStack red_mushroom = new ItemStack(Material.RED_MUSHROOM);
        ItemMeta red_mushroomMeta = red_mushroom.getItemMeta();
        red_mushroomMeta.setCustomModelData(0);
        red_mushroomMeta.setDisplayName(ChatColor.WHITE + "Red Mushroom");
        red_mushroom.setItemMeta(red_mushroomMeta);
        customItems.put("red_mushroom", red_mushroom);

        //Flowers
        ItemStack poppy = new ItemStack(Material.POPPY);
        ItemMeta poppyMeta = poppy.getItemMeta();
        poppyMeta.setCustomModelData(0);
        poppyMeta.setDisplayName(ChatColor.WHITE + "Poppy");
        poppy.setItemMeta(poppyMeta);
        customItems.put("poppy", poppy);

        ItemStack rose_bush = new ItemStack(Material.ROSE_BUSH);
        ItemMeta rose_bushMeta = rose_bush.getItemMeta();
        rose_bushMeta.setCustomModelData(0);
        rose_bushMeta.setDisplayName(ChatColor.WHITE + "Rose Bush");
        rose_bush.setItemMeta(rose_bushMeta);
        customItems.put("rose_bush", rose_bush);

        ItemStack dandelion = new ItemStack(Material.DANDELION);
        ItemMeta dandelionMeta = dandelion.getItemMeta();
        dandelionMeta.setCustomModelData(0);
        dandelionMeta.setDisplayName(ChatColor.WHITE + "Dandelion");
        dandelion.setItemMeta(dandelionMeta);
        customItems.put("dandelion", dandelion);

        ItemStack sunflower = new ItemStack(Material.SUNFLOWER);
        ItemMeta sunflowerMeta = sunflower.getItemMeta();
        sunflowerMeta.setCustomModelData(0);
        sunflowerMeta.setDisplayName(ChatColor.WHITE + "Sunflower");
        sunflower.setItemMeta(sunflowerMeta);
        customItems.put("sunflower", sunflower);

        ItemStack cornflower = new ItemStack(Material.CORNFLOWER);
        ItemMeta cornflowerMeta = cornflower.getItemMeta();
        cornflowerMeta.setCustomModelData(0);
        cornflowerMeta.setDisplayName(ChatColor.WHITE + "Cornflower");
        cornflower.setItemMeta(cornflowerMeta);
        customItems.put("cornflower", cornflower);

        ItemStack oxeye_daisy = new ItemStack(Material.OXEYE_DAISY);
        ItemMeta oxeye_daisyMeta = oxeye_daisy.getItemMeta();
        oxeye_daisyMeta.setCustomModelData(0);
        oxeye_daisyMeta.setDisplayName(ChatColor.WHITE + "Oxeye Daisy");
        oxeye_daisy.setItemMeta(oxeye_daisyMeta);
        customItems.put("oxeye_daisy", oxeye_daisy);

        ItemStack azure_bluet = new ItemStack(Material.AZURE_BLUET);
        ItemMeta azure_bluetMeta = azure_bluet.getItemMeta();
        azure_bluetMeta.setCustomModelData(0);
        azure_bluetMeta.setDisplayName(ChatColor.WHITE + "Azure Bluet");
        azure_bluet.setItemMeta(azure_bluetMeta);
        customItems.put("azure_bluet", azure_bluet);

        ItemStack red_tulip = new ItemStack(Material.RED_TULIP);
        ItemMeta red_tulipMeta = red_tulip.getItemMeta();
        red_tulipMeta.setCustomModelData(0);
        red_tulipMeta.setDisplayName(ChatColor.WHITE + "Red Tulip");
        red_tulip.setItemMeta(red_tulipMeta);
        customItems.put("red_tulip", red_tulip);

        ItemStack lilac = new ItemStack(Material.LILAC);
        ItemMeta lilacMeta = lilac.getItemMeta();
        lilacMeta.setCustomModelData(0);
        lilacMeta.setDisplayName(ChatColor.WHITE + "Lilac");
        lilac.setItemMeta(lilacMeta);
        customItems.put("lilac", lilac);

        ItemStack peony = new ItemStack(Material.PEONY);
        ItemMeta peonyMeta = peony.getItemMeta();
        peonyMeta.setCustomModelData(0);
        peonyMeta.setDisplayName(ChatColor.WHITE + "Peony");
        peony.setItemMeta(peonyMeta);
        customItems.put("peony", peony);

        ItemStack orange_tulip = new ItemStack(Material.ORANGE_TULIP);
        ItemMeta orange_tulipMeta = orange_tulip.getItemMeta();
        orange_tulipMeta.setCustomModelData(0);
        orange_tulipMeta.setDisplayName(ChatColor.WHITE + "Orange Tulip");
        orange_tulip.setItemMeta(orange_tulipMeta);
        customItems.put("orange_tulip", orange_tulip);

        ItemStack allium = new ItemStack(Material.ALLIUM);
        ItemMeta alliumMeta = allium.getItemMeta();
        alliumMeta.setCustomModelData(0);
        alliumMeta.setDisplayName(ChatColor.WHITE + "Allium");
        allium.setItemMeta(alliumMeta);
        customItems.put("allium", allium);

        ItemStack pink_tulip = new ItemStack(Material.PINK_TULIP);
        ItemMeta pink_tulipMeta = pink_tulip.getItemMeta();
        pink_tulipMeta.setCustomModelData(0);
        pink_tulipMeta.setDisplayName(ChatColor.WHITE + "Pink Tulip");
        pink_tulip.setItemMeta(pink_tulipMeta);
        customItems.put("pink_tulip", pink_tulip);

        ItemStack white_tulip = new ItemStack(Material.WHITE_TULIP);
        ItemMeta white_tulipMeta = white_tulip.getItemMeta();
        white_tulipMeta.setCustomModelData(0);
        white_tulipMeta.setDisplayName(ChatColor.WHITE + "White Tulip");
        white_tulip.setItemMeta(white_tulipMeta);
        customItems.put("white_tulip", white_tulip);

        ItemStack lily_of_the_valley = new ItemStack(Material.LILY_OF_THE_VALLEY);
        ItemMeta lily_of_the_valleyMeta = lily_of_the_valley.getItemMeta();
        lily_of_the_valleyMeta.setCustomModelData(0);
        lily_of_the_valleyMeta.setDisplayName(ChatColor.WHITE + "Lily of the Valley");
        lily_of_the_valley.setItemMeta(lily_of_the_valleyMeta);
        customItems.put("lily_of_the_valley", lily_of_the_valley);

        ItemStack blue_orchid = new ItemStack(Material.BLUE_ORCHID);
        ItemMeta blue_orchidMeta = blue_orchid.getItemMeta();
        blue_orchidMeta.setCustomModelData(0);
        blue_orchidMeta.setDisplayName(ChatColor.WHITE + "Blue Orchid");
        blue_orchid.setItemMeta(blue_orchidMeta);
        customItems.put("blue_orchid", blue_orchid);

        ItemStack wither_rose = new ItemStack(Material.WITHER_ROSE);
        ItemMeta wither_roseMeta = wither_rose.getItemMeta();
        wither_roseMeta.setCustomModelData(0);
        wither_roseMeta.setDisplayName(ChatColor.WHITE + "Wither Rose");
        wither_rose.setItemMeta(wither_roseMeta);
        customItems.put("wither_rose", wither_rose);

        ItemStack torchflower = new ItemStack(Material.TORCHFLOWER);
        ItemMeta torchflowerMeta = torchflower.getItemMeta();
        torchflowerMeta.setCustomModelData(0);
        torchflowerMeta.setDisplayName(ChatColor.WHITE + "Torchflower");
        torchflower.setItemMeta(torchflowerMeta);
        customItems.put("torchflower", torchflower);

        //Brined Meats
        ItemStack salted_cod = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta salted_codMeta = salted_cod.getItemMeta();
        salted_codMeta.setCustomModelData(1);
        salted_codMeta.setDisplayName(ChatColor.WHITE + "Brined Fish");
        salted_cod.setItemMeta(salted_codMeta);
        customItems.put("salted_cod", salted_cod);

        ItemStack salted_chicken = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta salted_chickenMeta = salted_chicken.getItemMeta();
        salted_chickenMeta.setCustomModelData(2);
        salted_chickenMeta.setDisplayName(ChatColor.WHITE + "Brined Chicken");
        salted_chicken.setItemMeta(salted_chickenMeta);
        customItems.put("salted_chicken", salted_chicken);

        ItemStack salted_hare = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta salted_hareMeta = salted_hare.getItemMeta();
        salted_hareMeta.setCustomModelData(3);
        salted_hareMeta.setDisplayName(ChatColor.WHITE + "Brined Hare");
        salted_hare.setItemMeta(salted_hareMeta);
        customItems.put("salted_hare", salted_hare);

        ItemStack salted_pork = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta salted_porkMeta = salted_pork.getItemMeta();
        salted_porkMeta.setCustomModelData(4);
        salted_porkMeta.setDisplayName(ChatColor.WHITE + "Salted Pork");
        salted_pork.setItemMeta(salted_porkMeta);
        customItems.put("salted_pork", salted_pork);

        ItemStack salted_mutton = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta salted_muttonMeta = salted_mutton.getItemMeta();
        salted_muttonMeta.setCustomModelData(5);
        salted_muttonMeta.setDisplayName(ChatColor.WHITE + "Salted Mutton");
        salted_mutton.setItemMeta(salted_muttonMeta);
        customItems.put("salted_mutton", salted_mutton);

        ItemStack salted_beef = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta salted_beefMeta = salted_beef.getItemMeta();
        salted_beefMeta.setCustomModelData(6);
        salted_beefMeta.setDisplayName(ChatColor.WHITE + "Salted Beef");
        salted_beef.setItemMeta(salted_beefMeta);
        customItems.put("salted_beef", salted_beef);

        ItemStack salted_venison = new ItemStack(Material.ROTTEN_FLESH);
        ItemMeta salted_venisonMeta = salted_venison.getItemMeta();
        salted_venisonMeta.setCustomModelData(7);
        salted_venisonMeta.setDisplayName(ChatColor.WHITE + "Salted Venison");
        salted_venison.setItemMeta(salted_venisonMeta);
        customItems.put("salted_venison", salted_venison);

        //Raw Meats
        ItemStack cod = new ItemStack(Material.COD);
        ItemMeta codMeta = cod.getItemMeta();
        codMeta.setCustomModelData(0);
        codMeta.setDisplayName(ChatColor.WHITE + "Raw Cod");
        cod.setItemMeta(codMeta);
        customItems.put("cod", cod);

        ItemStack chicken = new ItemStack(Material.CHICKEN);
        ItemMeta chickenMeta = chicken.getItemMeta();
        chickenMeta.setCustomModelData(0);
        chickenMeta.setDisplayName(ChatColor.WHITE + "Raw Chicken");
        chicken.setItemMeta(chickenMeta);
        customItems.put("chicken", chicken);

        ItemStack rabbit = new ItemStack(Material.RABBIT);
        ItemMeta rabbitMeta = rabbit.getItemMeta();
        rabbitMeta.setCustomModelData(0);
        rabbitMeta.setDisplayName(ChatColor.WHITE + "Raw Hare");
        rabbit.setItemMeta(rabbitMeta);
        customItems.put("rabbit", rabbit);

        ItemStack porkchop = new ItemStack(Material.PORKCHOP);
        ItemMeta porkchopMeta = porkchop.getItemMeta();
        porkchopMeta.setCustomModelData(0);
        porkchopMeta.setDisplayName(ChatColor.WHITE + "Raw Pork");
        porkchop.setItemMeta(porkchopMeta);
        customItems.put("porkchop", porkchop);

        ItemStack mutton = new ItemStack(Material.MUTTON);
        ItemMeta muttonMeta = mutton.getItemMeta();
        muttonMeta.setCustomModelData(0);
        muttonMeta.setDisplayName(ChatColor.WHITE + "Raw Mutton");
        mutton.setItemMeta(muttonMeta);
        customItems.put("mutton", mutton);

        ItemStack beef = new ItemStack(Material.BEEF);
        ItemMeta beefMeta = beef.getItemMeta();
        beefMeta.setCustomModelData(0);
        beefMeta.setDisplayName(ChatColor.WHITE + "Raw Beef");
        beef.setItemMeta(beefMeta);
        customItems.put("beef", beef);

        ItemStack venison = new ItemStack(Material.BEEF);
        ItemMeta venisonMeta = venison.getItemMeta();
        venisonMeta.setCustomModelData(1);
        venisonMeta.setDisplayName(ChatColor.WHITE + "Raw Venison");
        venison.setItemMeta(venisonMeta);
        customItems.put("venison", venison);

        //Seasoned Meats
        ItemStack seasoned_cod = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta seasoned_codMeta = seasoned_cod.getItemMeta();
        seasoned_codMeta.setCustomModelData(1);
        seasoned_codMeta.setDisplayName(ChatColor.WHITE + "Seasoned Raw Cod");
        seasoned_cod.setItemMeta(seasoned_codMeta);
        customItems.put("seasoned_cod", seasoned_cod);

        ItemStack seasoned_chicken = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta seasoned_chickenMeta = seasoned_chicken.getItemMeta();
        seasoned_chickenMeta.setCustomModelData(2);
        seasoned_chickenMeta.setDisplayName(ChatColor.WHITE + "Seasoned Raw Chicken");
        seasoned_chicken.setItemMeta(seasoned_chickenMeta);
        customItems.put("seasoned_chicken", seasoned_chicken);

        ItemStack seasoned_hare = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta seasoned_hareMeta = seasoned_hare.getItemMeta();
        seasoned_hareMeta.setCustomModelData(3);
        seasoned_hareMeta.setDisplayName(ChatColor.WHITE + "Seasoned Raw Hare");
        seasoned_hare.setItemMeta(seasoned_hareMeta);
        customItems.put("seasoned_hare", seasoned_hare);

        ItemStack seasoned_pork = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta seasoned_porkMeta = seasoned_pork.getItemMeta();
        seasoned_porkMeta.setCustomModelData(4);
        seasoned_porkMeta.setDisplayName(ChatColor.WHITE + "Seasoned Raw Pork");
        seasoned_pork.setItemMeta(seasoned_porkMeta);
        customItems.put("seasoned_pork", seasoned_pork);

        ItemStack seasoned_mutton = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta seasoned_muttonMeta = seasoned_mutton.getItemMeta();
        seasoned_muttonMeta.setCustomModelData(5);
        seasoned_muttonMeta.setDisplayName(ChatColor.WHITE + "Seasoned Raw Mutton");
        seasoned_mutton.setItemMeta(seasoned_muttonMeta);
        customItems.put("seasoned_mutton", seasoned_mutton);

        ItemStack seasoned_beef = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta seasoned_beefMeta = seasoned_beef.getItemMeta();
        seasoned_beefMeta.setCustomModelData(6);
        seasoned_beefMeta.setDisplayName(ChatColor.WHITE + "Seasoned Raw Beef");
        seasoned_beef.setItemMeta(seasoned_beefMeta);
        customItems.put("seasoned_beef", seasoned_beef);

        ItemStack seasoned_venison = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta seasoned_venisonMeta = seasoned_venison.getItemMeta();
        seasoned_venisonMeta.setCustomModelData(7);
        seasoned_venisonMeta.setDisplayName(ChatColor.WHITE + "Seasoned Raw Venison");
        seasoned_venison.setItemMeta(seasoned_venisonMeta);
        customItems.put("seasoned_venison", seasoned_venison);

        //Cooked Meats
        ItemStack cooked_cod = new ItemStack(Material.COOKED_COD);
        ItemMeta cooked_codMeta = cooked_cod.getItemMeta();
        cooked_codMeta.setCustomModelData(0);
        cooked_codMeta.setDisplayName(ChatColor.WHITE + "Smoked Cod");
        cooked_cod.setItemMeta(cooked_codMeta);
        customItems.put("cooked_cod", cooked_cod);

        ItemStack cooked_chicken = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta cooked_chickenMeta = cooked_chicken.getItemMeta();
        cooked_chickenMeta.setCustomModelData(0);
        cooked_chickenMeta.setDisplayName(ChatColor.WHITE + "Braised Chicken");
        cooked_chicken.setItemMeta(cooked_chickenMeta);
        customItems.put("cooked_chicken", cooked_chicken);

        ItemStack cooked_rabbit = new ItemStack(Material.COOKED_RABBIT);
        ItemMeta cooked_rabbitMeta = cooked_rabbit.getItemMeta();
        cooked_rabbitMeta.setCustomModelData(0);
        cooked_rabbitMeta.setDisplayName(ChatColor.WHITE + "Braised Hare");
        cooked_rabbit.setItemMeta(cooked_rabbitMeta);
        customItems.put("cooked_rabbit", cooked_rabbit);

        ItemStack cooked_porkchop = new ItemStack(Material.COOKED_PORKCHOP);
        ItemMeta cooked_porkchopMeta = cooked_porkchop.getItemMeta();
        cooked_porkchopMeta.setCustomModelData(0);
        cooked_porkchopMeta.setDisplayName(ChatColor.WHITE + "Cooked Pork");
        cooked_porkchop.setItemMeta(cooked_porkchopMeta);
        customItems.put("cooked_porkchop", cooked_porkchop);

        ItemStack cooked_mutton = new ItemStack(Material.COOKED_MUTTON);
        ItemMeta cooked_muttonMeta = cooked_mutton.getItemMeta();
        cooked_muttonMeta.setCustomModelData(0);
        cooked_muttonMeta.setDisplayName(ChatColor.WHITE + "Braised Mutton");
        cooked_mutton.setItemMeta(cooked_muttonMeta);
        customItems.put("cooked_mutton", cooked_mutton);

        ItemStack cooked_beef = new ItemStack(Material.COOKED_BEEF);
        ItemMeta cooked_beefMeta = cooked_beef.getItemMeta();
        cooked_beefMeta.setCustomModelData(0);
        cooked_beefMeta.setDisplayName(ChatColor.WHITE + "Braised Beef");
        cooked_beef.setItemMeta(cooked_beefMeta);
        customItems.put("cooked_beef", cooked_beef);

        ItemStack cooked_venison = new ItemStack(Material.COOKED_BEEF);
        ItemMeta cooked_venisonMeta = cooked_venison.getItemMeta();
        cooked_venisonMeta.setCustomModelData(1);
        cooked_venisonMeta.setDisplayName(ChatColor.WHITE + "Smoked Venison");
        cooked_venison.setItemMeta(cooked_venisonMeta);
        customItems.put("cooked_venison", cooked_venison);

        //Misc Food
        ItemStack gaelkrys = new ItemStack(Material.COOKED_BEEF);
        ItemMeta gaelkrysMeta = gaelkrys.getItemMeta();
        gaelkrysMeta.setCustomModelData(2);
        gaelkrysMeta.setDisplayName(ChatColor.WHITE + "Gaelkrys");
        gaelkrys.setItemMeta(gaelkrysMeta);
        customItems.put("gaelkrys", gaelkrys);

        ItemStack fish_n_chips = new ItemStack(Material.COOKED_BEEF);
        ItemMeta fish_n_chipsMeta = fish_n_chips.getItemMeta();
        fish_n_chipsMeta.setCustomModelData(3);
        fish_n_chipsMeta.setDisplayName(ChatColor.WHITE + "Klerk Fish 'n' Chips");
        fish_n_chips.setItemMeta(fish_n_chipsMeta);
        customItems.put("fish_n_chips", fish_n_chips);

        ItemStack devils_wings = new ItemStack(Material.COOKED_BEEF);
        ItemMeta devils_wingsMeta = devils_wings.getItemMeta();
        devils_wingsMeta.setCustomModelData(4);
        devils_wingsMeta.setDisplayName(ChatColor.WHITE + "Devil's Wings");
        devils_wings.setItemMeta(devils_wingsMeta);
        customItems.put("devils_wings", devils_wings);

        ItemStack honey_glazed_steak = new ItemStack(Material.COOKED_BEEF);
        ItemMeta honey_glazed_steakMeta = honey_glazed_steak.getItemMeta();
        honey_glazed_steakMeta.setCustomModelData(5);
        honey_glazed_steakMeta.setDisplayName(ChatColor.WHITE + "Honey Glazed Steak");
        honey_glazed_steak.setItemMeta(honey_glazed_steakMeta);
        customItems.put("honey_glazed_steak", honey_glazed_steak);

        ItemStack dried_apples = new ItemStack(Material.COOKIE);
        ItemMeta dried_applesMeta = dried_apples.getItemMeta();
        dried_applesMeta.setCustomModelData(1);
        dried_applesMeta.setDisplayName(ChatColor.WHITE + "Dried Apples");
        dried_apples.setItemMeta(dried_applesMeta);
        customItems.put("dried_apples", dried_apples);

        ItemStack dried_grapes = new ItemStack(Material.COOKIE);
        ItemMeta dried_grapesMeta = dried_grapes.getItemMeta();
        dried_grapesMeta.setCustomModelData(2);
        dried_grapesMeta.setDisplayName(ChatColor.WHITE + "Raisins");
        dried_grapes.setItemMeta(dried_grapesMeta);
        customItems.put("dried_grapes", dried_grapes);

        ItemStack dried_mushrooms = new ItemStack(Material.COOKIE);
        ItemMeta dried_mushroomsMeta = dried_mushrooms.getItemMeta();
        dried_mushroomsMeta.setCustomModelData(3);
        dried_mushroomsMeta.setDisplayName(ChatColor.WHITE + "Dried Mushrooms");
        dried_mushrooms.setItemMeta(dried_mushroomsMeta);
        customItems.put("dried_mushrooms", dried_mushrooms);

        ItemStack dried_cheese = new ItemStack(Material.COOKIE);
        ItemMeta dried_cheeseMeta = dried_cheese.getItemMeta();
        dried_cheeseMeta.setCustomModelData(4);
        dried_cheeseMeta.setDisplayName(ChatColor.WHITE + "Dried Cheese");
        dried_cheese.setItemMeta(dried_cheeseMeta);
        customItems.put("dried_cheese", dried_cheese);

        ItemStack dried_meat = new ItemStack(Material.COOKIE);
        ItemMeta dried_meatMeta = dried_meat.getItemMeta();
        dried_meatMeta.setCustomModelData(5);
        dried_meatMeta.setDisplayName(ChatColor.WHITE + "Dried Meat");
        dried_meat.setItemMeta(dried_meatMeta);
        customItems.put("dried_meat", dried_meat);

        ItemStack salami_halond = new ItemStack(Material.COOKED_MUTTON);
        ItemMeta salami_halondMeta = salami_halond.getItemMeta();
        salami_halondMeta.setCustomModelData(1);
        salami_halondMeta.setDisplayName(ChatColor.WHITE + "Halondian Salami");
        salami_halond.setItemMeta(salami_halondMeta);
        customItems.put("salami_halond", salami_halond);

        ItemStack salami_myllet = new ItemStack(Material.COOKED_PORKCHOP);
        ItemMeta salami_mylletMeta = salami_myllet.getItemMeta();
        salami_mylletMeta.setCustomModelData(1);
        salami_mylletMeta.setDisplayName(ChatColor.WHITE + "Myllet Salami");
        salami_myllet.setItemMeta(salami_mylletMeta);
        customItems.put("salami_myllet", salami_myllet);

        ItemStack hard_cheese = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta hard_cheeseMeta = hard_cheese.getItemMeta();
        hard_cheeseMeta.setCustomModelData(1);
        hard_cheeseMeta.setDisplayName(ChatColor.WHITE + "Hard Cheese");
        hard_cheese.setItemMeta(hard_cheeseMeta);
        customItems.put("hard_cheese", hard_cheese);

        ItemStack soft_cheese = new ItemStack(Material.COOKED_CHICKEN);
        ItemMeta soft_cheeseMeta = soft_cheese.getItemMeta();
        soft_cheeseMeta.setCustomModelData(2);
        soft_cheeseMeta.setDisplayName(ChatColor.WHITE + "Soft Cheese");
        soft_cheese.setItemMeta(soft_cheeseMeta);
        customItems.put("soft_cheese", soft_cheese);

        ItemStack meat_pie = new ItemStack(Material.PUMPKIN_PIE);
        ItemMeta meat_pieMeta = meat_pie.getItemMeta();
        meat_pieMeta.setCustomModelData(1);
        meat_pieMeta.setDisplayName(ChatColor.WHITE + "Meat Pie");
        meat_pie.setItemMeta(meat_pieMeta);
        customItems.put("meat_pie", meat_pie);

        ItemStack frumenty = new ItemStack(Material.SALMON);
        ItemMeta frumentyMeta = frumenty.getItemMeta();
        frumentyMeta.setCustomModelData(1);
        frumentyMeta.setDisplayName(ChatColor.WHITE + "Frumenty");
        frumenty.setItemMeta(frumentyMeta);
        customItems.put("frumenty", frumenty);

        ItemStack fried_bread_with_cream = new ItemStack(Material.BREAD);
        ItemMeta fried_bread_with_creamMeta = fried_bread_with_cream.getItemMeta();
        fried_bread_with_creamMeta.setCustomModelData(4);
        fried_bread_with_creamMeta.setDisplayName(ChatColor.WHITE + "Fried Bread with Cream");
        fried_bread_with_cream.setItemMeta(fried_bread_with_creamMeta);
        customItems.put("fried_bread_with_cream", fried_bread_with_cream);

        ItemStack maegors_stew = new ItemStack(Material.RABBIT_STEW);
        ItemMeta maegors_stewMeta = maegors_stew.getItemMeta();
        maegors_stewMeta.setCustomModelData(1);
        maegors_stewMeta.setDisplayName(ChatColor.WHITE + "Fried Bread with Cream");
        maegors_stew.setItemMeta(maegors_stewMeta);
        customItems.put("maegors_stew", maegors_stew);

        ItemStack ryllenyan_vegetable_stew = new ItemStack(Material.MUSHROOM_STEW);
        ItemMeta ryllenyan_vegetable_stewMeta = ryllenyan_vegetable_stew.getItemMeta();
        ryllenyan_vegetable_stewMeta.setCustomModelData(1);
        ryllenyan_vegetable_stewMeta.setDisplayName(ChatColor.WHITE + "Ryllenyan Vegetable Stew");
        ryllenyan_vegetable_stew.setItemMeta(ryllenyan_vegetable_stewMeta);
        customItems.put("ryllenyan_vegetable_stew", ryllenyan_vegetable_stew);

        //Pastries
        ItemStack dough = new ItemStack(Material.POPPED_CHORUS_FRUIT);
        ItemMeta doughMeta = dough.getItemMeta();
        doughMeta.setCustomModelData(1);
        doughMeta.setDisplayName(ChatColor.WHITE + "Dough");
        dough.setItemMeta(doughMeta);
        customItems.put("dough", dough);

        ItemStack dough_pieces = new ItemStack(Material.POPPED_CHORUS_FRUIT);
        ItemMeta dough_piecesMeta = dough_pieces.getItemMeta();
        dough_piecesMeta.setCustomModelData(2);
        dough_piecesMeta.setDisplayName(ChatColor.WHITE + "Dough Pieces");
        dough_pieces.setItemMeta(dough_piecesMeta);
        customItems.put("dough_pieces", dough_pieces);

        ItemStack pastry_dough = new ItemStack(Material.POPPED_CHORUS_FRUIT);
        ItemMeta pastry_doughMeta = pastry_dough.getItemMeta();
        pastry_doughMeta.setCustomModelData(3);
        pastry_doughMeta.setDisplayName(ChatColor.WHITE + "Pastry Dough");
        pastry_dough.setItemMeta(pastry_doughMeta);
        customItems.put("pastry_dough", pastry_dough);

        ItemStack batter = new ItemStack(Material.POPPED_CHORUS_FRUIT);
        ItemMeta batterMeta = batter.getItemMeta();
        batterMeta.setCustomModelData(4);
        batterMeta.setDisplayName(ChatColor.WHITE + "Batter");
        batter.setItemMeta(batterMeta);
        customItems.put("batter", batter);

        ItemStack bread = new ItemStack(Material.BREAD);
        ItemMeta breadMeta = bread.getItemMeta();
        breadMeta.setCustomModelData(0);
        breadMeta.setDisplayName(ChatColor.WHITE + "Bread");
        bread.setItemMeta(breadMeta);
        customItems.put("bread", bread);

        ItemStack bread_roll = new ItemStack(Material.BREAD);
        ItemMeta bread_rollMeta = bread_roll.getItemMeta();
        bread_rollMeta.setCustomModelData(1);
        bread_rollMeta.setDisplayName(ChatColor.WHITE + "Bread Roll");
        bread_roll.setItemMeta(bread_rollMeta);
        customItems.put("bread_roll", bread_roll);

        ItemStack breadstick = new ItemStack(Material.BREAD);
        ItemMeta breadstickMeta = breadstick.getItemMeta();
        breadstickMeta.setCustomModelData(2);
        breadstickMeta.setDisplayName(ChatColor.WHITE + "Breadstick");
        breadstick.setItemMeta(breadstickMeta);
        customItems.put("breadstick", breadstick);

        ItemStack flatbread = new ItemStack(Material.BREAD);
        ItemMeta flatbreadMeta = flatbread.getItemMeta();
        flatbreadMeta.setCustomModelData(3);
        flatbreadMeta.setDisplayName(ChatColor.WHITE + "Flatbread");
        flatbread.setItemMeta(flatbreadMeta);
        customItems.put("flatbread", flatbread);

        ItemStack braided_bread_loaf = new ItemStack(Material.COOKED_SALMON);
        ItemMeta braided_bread_loafMeta = braided_bread_loaf.getItemMeta();
        braided_bread_loafMeta.setCustomModelData(1);
        braided_bread_loafMeta.setDisplayName(ChatColor.WHITE + "Braided Bread Loaf");
        braided_bread_loaf.setItemMeta(braided_bread_loafMeta);
        customItems.put("braided_bread_loaf", braided_bread_loaf);

        ItemStack filled_pastry = new ItemStack(Material.COOKED_SALMON);
        ItemMeta filled_pastryMeta = filled_pastry.getItemMeta();
        filled_pastryMeta.setCustomModelData(2);
        filled_pastryMeta.setDisplayName(ChatColor.WHITE + "Filled Pastry");
        filled_pastry.setItemMeta(filled_pastryMeta);
        customItems.put("filled_pastry", filled_pastry);

        ItemStack vhagaryan_loaf = new ItemStack(Material.COOKED_SALMON);
        ItemMeta vhagaryan_loafMeta = vhagaryan_loaf.getItemMeta();
        vhagaryan_loafMeta.setCustomModelData(3);
        vhagaryan_loafMeta.setDisplayName(ChatColor.WHITE + "Vhagaryan Loaf");
        vhagaryan_loaf.setItemMeta(vhagaryan_loafMeta);
        customItems.put("vhagaryan_loaf", vhagaryan_loaf);

        ItemStack salted_vaerymsal = new ItemStack(Material.COOKED_SALMON);
        ItemMeta salted_vaerymsalMeta = salted_vaerymsal.getItemMeta();
        salted_vaerymsalMeta.setCustomModelData(4);
        salted_vaerymsalMeta.setDisplayName(ChatColor.WHITE + "Salted Vaerymsal");
        salted_vaerymsal.setItemMeta(salted_vaerymsalMeta);
        customItems.put("salted_vaerymsal", salted_vaerymsal);

        ItemStack trebagor_herb_bread = new ItemStack(Material.COOKED_SALMON);
        ItemMeta trebagor_herb_breadMeta = trebagor_herb_bread.getItemMeta();
        trebagor_herb_breadMeta.setCustomModelData(5);
        trebagor_herb_breadMeta.setDisplayName(ChatColor.WHITE + "Trebagor Herb Bread");
        trebagor_herb_bread.setItemMeta(trebagor_herb_breadMeta);
        customItems.put("trebagor_herb_bread", trebagor_herb_bread);

        ItemStack doughnut = new ItemStack(Material.GOLDEN_CARROT);
        ItemMeta doughnutMeta = doughnut.getItemMeta();
        doughnutMeta.setCustomModelData(1);
        doughnutMeta.setDisplayName(ChatColor.WHITE + "Doughnut");
        doughnut.setItemMeta(doughnutMeta);
        customItems.put("doughnut", doughnut);

        ItemStack kastollian_sourdough_bread = new ItemStack(Material.GOLDEN_CARROT);
        ItemMeta kastollian_sourdough_breadMeta = kastollian_sourdough_bread.getItemMeta();
        kastollian_sourdough_breadMeta.setCustomModelData(2);
        kastollian_sourdough_breadMeta.setDisplayName(ChatColor.WHITE + "Kastollian Sourdough Bread");
        kastollian_sourdough_bread.setItemMeta(kastollian_sourdough_breadMeta);
        customItems.put("kastollian_sourdough_bread", kastollian_sourdough_bread);

        ItemStack honey_cheesecake = new ItemStack(Material.GOLDEN_CARROT);
        ItemMeta honey_cheesecakeMeta = honey_cheesecake.getItemMeta();
        honey_cheesecakeMeta.setCustomModelData(3);
        honey_cheesecakeMeta.setDisplayName(ChatColor.WHITE + "Honey Cheesecake");
        honey_cheesecake.setItemMeta(honey_cheesecakeMeta);
        customItems.put("honey_cheesecake", honey_cheesecake);

        ItemStack sweet_kettle = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta sweet_kettleMeta = sweet_kettle.getItemMeta();
        sweet_kettleMeta.setCustomModelData(1);
        sweet_kettleMeta.setDisplayName(ChatColor.WHITE + "Sweet Kettle");
        sweet_kettle.setItemMeta(sweet_kettleMeta);
        customItems.put("sweet_kettle", sweet_kettle);

        ItemStack custard_tart = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta custard_tartMeta = custard_tart.getItemMeta();
        custard_tartMeta.setCustomModelData(2);
        custard_tartMeta.setDisplayName(ChatColor.WHITE + "Custard Tart");
        custard_tart.setItemMeta(custard_tartMeta);
        customItems.put("custard_tart", custard_tart);

        ItemStack berry_cream_biscuit = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta berry_cream_biscuitMeta = berry_cream_biscuit.getItemMeta();
        berry_cream_biscuitMeta.setCustomModelData(3);
        berry_cream_biscuitMeta.setDisplayName(ChatColor.WHITE + "Berry Cream Biscuit");
        berry_cream_biscuit.setItemMeta(berry_cream_biscuitMeta);
        customItems.put("berry_cream_biscuit", berry_cream_biscuit);

        ItemStack cake = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta cakeMeta = cake.getItemMeta();
        cakeMeta.setCustomModelData(4);
        cakeMeta.setDisplayName(ChatColor.WHITE + "Cake");
        cake.setItemMeta(cakeMeta);
        customItems.put("cake", cake);

        //Spoiled Foods

        ItemStack spoiled_food = new ItemStack(Material.SPIDER_EYE);
        ItemMeta spoiled_foodMeta = spoiled_food.getItemMeta();
        spoiled_foodMeta.setCustomModelData(1);
        spoiled_foodMeta.setDisplayName(ChatColor.WHITE + "Spoiled Food");
        spoiled_food.setItemMeta(spoiled_foodMeta);
        customItems.put("spoiled_food", spoiled_food);

        ItemStack spoiled_vegetable = new ItemStack(Material.SPIDER_EYE);
        ItemMeta spoiled_vegetableMeta = spoiled_vegetable.getItemMeta();
        spoiled_vegetableMeta.setCustomModelData(2);
        spoiled_vegetableMeta.setDisplayName(ChatColor.WHITE + "Spoiled Vegetable");
        spoiled_vegetable.setItemMeta(spoiled_vegetableMeta);
        customItems.put("spoiled_vegetable", spoiled_vegetable);

        ItemStack spoiled_fruit = new ItemStack(Material.SPIDER_EYE);
        ItemMeta spoiled_fruitMeta = spoiled_fruit.getItemMeta();
        spoiled_fruitMeta.setCustomModelData(3);
        spoiled_fruitMeta.setDisplayName(ChatColor.WHITE + "Spoiled Fruit");
        spoiled_fruit.setItemMeta(spoiled_fruitMeta);
        customItems.put("spoiled_fruit", spoiled_fruit);

        ItemStack spoiled_meat = new ItemStack(Material.SPIDER_EYE);
        ItemMeta spoiled_meatMeta = spoiled_meat.getItemMeta();
        spoiled_meatMeta.setCustomModelData(4);
        spoiled_meatMeta.setDisplayName(ChatColor.WHITE + "Spoiled Meat");
        spoiled_meat.setItemMeta(spoiled_meatMeta);
        customItems.put("spoiled_meat", spoiled_meat);

        ItemStack spoiled_cheese = new ItemStack(Material.SPIDER_EYE);
        ItemMeta spoiled_cheeseMeta = spoiled_cheese.getItemMeta();
        spoiled_cheeseMeta.setCustomModelData(5);
        spoiled_cheeseMeta.setDisplayName(ChatColor.WHITE + "Spoiled Cheese");
        spoiled_cheese.setItemMeta(spoiled_cheeseMeta);
        customItems.put("spoiled_cheese", spoiled_cheese);

        ItemStack spoiled_bread = new ItemStack(Material.SPIDER_EYE);
        ItemMeta spoiled_breadMeta = spoiled_bread.getItemMeta();
        spoiled_breadMeta.setCustomModelData(6);
        spoiled_breadMeta.setDisplayName(ChatColor.WHITE + "Spoiled Bread");
        spoiled_bread.setItemMeta(spoiled_breadMeta);
        customItems.put("spoiled_bread", spoiled_bread);

        ItemStack spoiled_pastry = new ItemStack(Material.SPIDER_EYE);
        ItemMeta spoiled_pastryMeta = spoiled_pastry.getItemMeta();
        spoiled_pastryMeta.setCustomModelData(7);
        spoiled_pastryMeta.setDisplayName(ChatColor.WHITE + "Spoiled Pastry");
        spoiled_pastry.setItemMeta(spoiled_pastryMeta);
        customItems.put("spoiled_pastry", spoiled_pastry);

        ItemStack spoiled_soup = new ItemStack(Material.SUSPICIOUS_STEW);
        ItemMeta spoiled_soupMeta = spoiled_soup.getItemMeta();
        spoiled_soupMeta.setCustomModelData(1);
        spoiled_soupMeta.setDisplayName(ChatColor.WHITE + "Spoiled Soup");
        spoiled_soup.setItemMeta(spoiled_soupMeta);
        customItems.put("spoiled_soup", spoiled_soup);

        ItemStack spoiled_milk = new ItemStack(Material.MILK_BUCKET);
        ItemMeta spoiled_milkMeta = spoiled_milk.getItemMeta();
        spoiled_milkMeta.setCustomModelData(1);
        spoiled_milkMeta.setDisplayName(ChatColor.WHITE + "Spoiled Milk");
        spoiled_milk.setItemMeta(spoiled_milkMeta);
        customItems.put("spoiled_milk", spoiled_milk);

        //Drinks

        ItemStack wheatbeer_bitter = new ItemStack(Material.POTION);
        ItemMeta wheatbeer_bitterMeta = wheatbeer_bitter.getItemMeta();
        wheatbeer_bitterMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 9, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        wheatbeer_bitterMeta.setCustomModelData(1);
        wheatbeer_bitterMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        wheatbeer_bitterMeta.setDisplayName(colorUtilities.parseColors("&fWheatbeer"));
        List<String> wheatbeer_bitterLore = new ArrayList<>();
        wheatbeer_bitterLore.add(colorUtilities.parseColors("<#828296>Bitter"));
        wheatbeer_bitterLore.add(colorUtilities.parseColors("<#464651>&oJoyous Helmian Pastime"));
        wheatbeer_bitterLore.add("");
        wheatbeer_bitterLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        wheatbeer_bitterMeta.setLore(wheatbeer_bitterLore);
        wheatbeer_bitter.setItemMeta(wheatbeer_bitterMeta);
        customItems.put("wheatbeer_bitter", wheatbeer_bitter);

        ItemStack wheatbeer_overwhelming = new ItemStack(Material.POTION);
        ItemMeta wheatbeer_overwhelmingMeta = wheatbeer_overwhelming.getItemMeta();
        wheatbeer_overwhelmingMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 9, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        wheatbeer_overwhelmingMeta.setCustomModelData(1);
        wheatbeer_overwhelmingMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        wheatbeer_overwhelmingMeta.setDisplayName(colorUtilities.parseColors("&fWheatbeer"));
        List<String> wheatbeer_overwhelmingLore = new ArrayList<>();
        wheatbeer_overwhelmingLore.add(colorUtilities.parseColors("<#828296>Overwhelming"));
        wheatbeer_overwhelmingLore.add(colorUtilities.parseColors("<#464651>&oJoyous Helmian Pastime"));
        wheatbeer_overwhelmingLore.add("");
        wheatbeer_overwhelmingLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        wheatbeer_overwhelmingMeta.setLore(wheatbeer_overwhelmingLore);
        wheatbeer_overwhelming.setItemMeta(wheatbeer_overwhelmingMeta);
        customItems.put("wheatbeer_overwhelming", wheatbeer_overwhelming);

        ItemStack wheatbeer_light = new ItemStack(Material.POTION);
        ItemMeta wheatbeer_lightMeta = wheatbeer_light.getItemMeta();
        wheatbeer_lightMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 12, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        wheatbeer_lightMeta.setCustomModelData(1);
        wheatbeer_lightMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        wheatbeer_lightMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>Wheatbeer"));
        List<String> wheatbeer_lightLore = new ArrayList<>();
        wheatbeer_lightLore.add(colorUtilities.parseColors("<#828296>Light"));
        wheatbeer_lightLore.add(colorUtilities.parseColors("<#464651>&oJoyous Helmian Pastime"));
        wheatbeer_lightLore.add("");
        wheatbeer_lightLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        wheatbeer_lightMeta.setLore(wheatbeer_lightLore);
        wheatbeer_light.setItemMeta(wheatbeer_lightMeta);
        customItems.put("wheatbeer_light", wheatbeer_light);

        ItemStack wheatbeer_fine = new ItemStack(Material.POTION);
        ItemMeta wheatbeer_fineMeta = wheatbeer_fine.getItemMeta();
        wheatbeer_fineMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 12, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        wheatbeer_fineMeta.setCustomModelData(1);
        wheatbeer_fineMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        wheatbeer_fineMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>Wheatbeer"));
        List<String> wheatbeer_fineLore = new ArrayList<>();
        wheatbeer_fineLore.add(colorUtilities.parseColors("<#828296>Fine"));
        wheatbeer_fineLore.add(colorUtilities.parseColors("<#464651>&oJoyous Helmian Pastime"));
        wheatbeer_fineLore.add("");
        wheatbeer_fineLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        wheatbeer_fineMeta.setLore(wheatbeer_fineLore);
        wheatbeer_fine.setItemMeta(wheatbeer_fineMeta);
        customItems.put("wheatbeer_fine", wheatbeer_fine);

        ItemStack wheatbeer_smooth = new ItemStack(Material.POTION);
        ItemMeta wheatbeer_smoothMeta = wheatbeer_smooth.getItemMeta();
        wheatbeer_smoothMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        wheatbeer_smoothMeta.setCustomModelData(1);
        wheatbeer_smoothMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        wheatbeer_smoothMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lW<#BC8754>&lh<#C99552>&le<#D29A4D>&la<#D48B42>&lt<#D57B36>&lb<#CC773B>&le<#BD7749>&le<#AF7856>&lr"));
        List<String> wheatbeer_smoothLore = new ArrayList<>();
        wheatbeer_smoothLore.add(colorUtilities.parseColors("<#828296>Smooth"));
        wheatbeer_smoothLore.add(colorUtilities.parseColors("&l<#FBAA0E>&oJ<#FBB015>&oo<#FBB61C>&oy<#FBBC22>&oo<#FBC229>&ou<#FBC830>&os <#FBCE37>&oH<#FBD039>&oe<#FBD039>&ol<#FBD039>&om<#FBD039>&oi<#FBD039>&oa<#FBD039>&on <#FBCE37>&oP<#FBC830>&oa<#FBC229>&os<#FBBC22>&ot<#FBB61C>&oi<#FBB015>&om<#FBAA0E>&oe"));
        wheatbeer_smoothLore.add("");
        wheatbeer_smoothLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        wheatbeer_smoothMeta.setLore(wheatbeer_smoothLore);
        wheatbeer_smooth.setItemMeta(wheatbeer_smoothMeta);
        customItems.put("wheatbeer_smooth", wheatbeer_smooth);

        ItemStack wheatbeer_refreshing = new ItemStack(Material.POTION);
        ItemMeta wheatbeer_refreshingMeta = wheatbeer_refreshing.getItemMeta();
        wheatbeer_refreshingMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        wheatbeer_refreshingMeta.setCustomModelData(1);
        wheatbeer_refreshingMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        wheatbeer_refreshingMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lW<#BC8754>&lh<#C99552>&le<#D29A4D>&la<#D48B42>&lt<#D57B36>&lb<#CC773B>&le<#BD7749>&le<#AF7856>&lr"));
        List<String> wheatbeer_refreshingLore = new ArrayList<>();
        wheatbeer_refreshingLore.add(colorUtilities.parseColors("<#828296>Refreshing"));
        wheatbeer_refreshingLore.add(colorUtilities.parseColors("&l<#FBAA0E>&oJ<#FBB015>&oo<#FBB61C>&oy<#FBBC22>&oo<#FBC229>&ou<#FBC830>&os <#FBCE37>&oH<#FBD039>&oe<#FBD039>&ol<#FBD039>&om<#FBD039>&oi<#FBD039>&oa<#FBD039>&on <#FBCE37>&oP<#FBC830>&oa<#FBC229>&os<#FBBC22>&ot<#FBB61C>&oi<#FBB015>&om<#FBAA0E>&oe"));
        wheatbeer_refreshingLore.add("");
        wheatbeer_refreshingLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        wheatbeer_refreshingMeta.setLore(wheatbeer_refreshingLore);
        wheatbeer_refreshing.setItemMeta(wheatbeer_refreshingMeta);
        customItems.put("wheatbeer_refreshing", wheatbeer_refreshing);

        ItemStack wheatbeer_cold = new ItemStack(Material.POTION);
        ItemMeta wheatbeer_coldMeta = wheatbeer_cold.getItemMeta();
        wheatbeer_coldMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        wheatbeer_coldMeta.setCustomModelData(1);
        wheatbeer_coldMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        wheatbeer_coldMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lW<#BC8754>&lh<#C99552>&le<#D29A4D>&la<#D48B42>&lt<#D57B36>&lb<#CC773B>&le<#BD7749>&le<#AF7856>&lr"));
        List<String> wheatbeer_coldLore = new ArrayList<>();
        wheatbeer_coldLore.add(colorUtilities.parseColors("<#828296>Cold"));
        wheatbeer_coldLore.add(colorUtilities.parseColors("&l<#FBAA0E>&oJ<#FBB015>&oo<#FBB61C>&oy<#FBBC22>&oo<#FBC229>&ou<#FBC830>&os <#FBCE37>&oH<#FBD039>&oe<#FBD039>&ol<#FBD039>&om<#FBD039>&oi<#FBD039>&oa<#FBD039>&on <#FBCE37>&oP<#FBC830>&oa<#FBC229>&os<#FBBC22>&ot<#FBB61C>&oi<#FBB015>&om<#FBAA0E>&oe"));
        wheatbeer_coldLore.add("");
        wheatbeer_coldLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        wheatbeer_coldMeta.setLore(wheatbeer_coldLore);
        wheatbeer_cold.setItemMeta(wheatbeer_coldMeta);
        customItems.put("wheatbeer_cold", wheatbeer_cold);

        ItemStack aeryon_ale_bitter = new ItemStack(Material.POTION);
        ItemMeta aeryon_ale_bitterMeta = wheatbeer_bitter.getItemMeta();
        aeryon_ale_bitterMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 9, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        aeryon_ale_bitterMeta.setCustomModelData(2);
        aeryon_ale_bitterMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        aeryon_ale_bitterMeta.setDisplayName(colorUtilities.parseColors("&fAeryon Ale"));
        List<String> aeryon_ale_bitterLore = new ArrayList<>();
        aeryon_ale_bitterLore.add(colorUtilities.parseColors("<#828296>Bitter"));
        aeryon_ale_bitterLore.add("");
        aeryon_ale_bitterLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        aeryon_ale_bitterMeta.setLore(aeryon_ale_bitterLore);
        aeryon_ale_bitter.setItemMeta(aeryon_ale_bitterMeta);
        customItems.put("aeryon_ale_bitter", aeryon_ale_bitter);

        ItemStack aeryon_ale_acidic = new ItemStack(Material.POTION);
        ItemMeta aeryon_ale_acidicMeta = wheatbeer_bitter.getItemMeta();
        aeryon_ale_acidicMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 9, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        aeryon_ale_acidicMeta.setCustomModelData(2);
        aeryon_ale_acidicMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        aeryon_ale_acidicMeta.setDisplayName(colorUtilities.parseColors("&fAeryon Ale"));
        List<String> aeryon_ale_acidicLore = new ArrayList<>();
        aeryon_ale_acidicLore.add(colorUtilities.parseColors("<#828296>Acidic"));
        aeryon_ale_acidicLore.add("");
        aeryon_ale_acidicLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        aeryon_ale_acidicMeta.setLore(aeryon_ale_acidicLore);
        aeryon_ale_acidic.setItemMeta(aeryon_ale_acidicMeta);
        customItems.put("aeryon_ale_acidic", aeryon_ale_acidic);

        ItemStack aeryon_ale_fine = new ItemStack(Material.POTION);
        ItemMeta aeryon_ale_fineMeta = aeryon_ale_fine.getItemMeta();
        aeryon_ale_fineMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 12, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        aeryon_ale_fineMeta.setCustomModelData(2);
        aeryon_ale_fineMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        aeryon_ale_fineMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>Aeryon Ale"));
        List<String> aeryon_ale_fineLore = new ArrayList<>();
        aeryon_ale_fineLore.add(colorUtilities.parseColors("<#828296>Fine"));
        aeryon_ale_fineLore.add("");
        aeryon_ale_fineLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        aeryon_ale_fineMeta.setLore(aeryon_ale_fineLore);
        aeryon_ale_fine.setItemMeta(aeryon_ale_fineMeta);
        customItems.put("aeryon_ale_fine", aeryon_ale_fine);

        ItemStack aeryon_ale_hoppy = new ItemStack(Material.POTION);
        ItemMeta aeryon_ale_hoppyMeta = aeryon_ale_hoppy.getItemMeta();
        aeryon_ale_hoppyMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 12, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        aeryon_ale_hoppyMeta.setCustomModelData(2);
        aeryon_ale_hoppyMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        aeryon_ale_hoppyMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>Aeryon Ale"));
        List<String> aeryon_ale_hoppyLore = new ArrayList<>();
        aeryon_ale_hoppyLore.add(colorUtilities.parseColors("<#828296>Hoppy"));
        aeryon_ale_hoppyLore.add("");
        aeryon_ale_hoppyLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        aeryon_ale_hoppyMeta.setLore(aeryon_ale_hoppyLore);
        aeryon_ale_hoppy.setItemMeta(aeryon_ale_hoppyMeta);
        customItems.put("aeryon_ale_hoppy", aeryon_ale_hoppy);

        ItemStack aeryon_ale_crisp = new ItemStack(Material.POTION);
        ItemMeta aeryon_ale_crispMeta = aeryon_ale_crisp.getItemMeta();
        aeryon_ale_crispMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        aeryon_ale_crispMeta.setCustomModelData(2);
        aeryon_ale_crispMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        aeryon_ale_crispMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lA<#BC8754>&le<#C99552>&lr<#D29A4D>&ly<#D48B42>&lo<#D57B36>&ln <#CC773B>&lA<#BD7749>&ll<#AF7856>&le"));
        List<String> aeryon_ale_crispLore = new ArrayList<>();
        aeryon_ale_crispLore.add(colorUtilities.parseColors("<#828296>Crisp Taste"));
        aeryon_ale_crispLore.add("");
        aeryon_ale_crispLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        aeryon_ale_crispMeta.setLore(aeryon_ale_crispLore);
        aeryon_ale_crisp.setItemMeta(aeryon_ale_crispMeta);
        customItems.put("aeryon_ale_crisp", aeryon_ale_crisp);

        ItemStack aeryon_ale_refreshing = new ItemStack(Material.POTION);
        ItemMeta aeryon_ale_refreshingMeta = aeryon_ale_refreshing.getItemMeta();
        aeryon_ale_refreshingMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        aeryon_ale_refreshingMeta.setCustomModelData(2);
        aeryon_ale_refreshingMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        aeryon_ale_refreshingMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lA<#BC8754>&le<#C99552>&lr<#D29A4D>&ly<#D48B42>&lo<#D57B36>&ln <#CC773B>&lA<#BD7749>&ll<#AF7856>&le"));
        List<String> aeryon_ale_refreshingLore = new ArrayList<>();
        aeryon_ale_refreshingLore.add(colorUtilities.parseColors("<#828296>Refreshing"));
        aeryon_ale_refreshingLore.add("");
        aeryon_ale_refreshingLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        aeryon_ale_refreshingMeta.setLore(aeryon_ale_refreshingLore);
        aeryon_ale_refreshing.setItemMeta(aeryon_ale_refreshingMeta);
        customItems.put("aeryon_ale_refreshing", aeryon_ale_refreshing);

        ItemStack aeryon_ale_fruity = new ItemStack(Material.POTION);
        ItemMeta aeryon_ale_fruityMeta = aeryon_ale_refreshing.getItemMeta();
        aeryon_ale_fruityMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        aeryon_ale_fruityMeta.setCustomModelData(2);
        aeryon_ale_fruityMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        aeryon_ale_fruityMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lA<#BC8754>&le<#C99552>&lr<#D29A4D>&ly<#D48B42>&lo<#D57B36>&ln <#CC773B>&lA<#BD7749>&ll<#AF7856>&le"));
        List<String> aeryon_ale_fruityLore = new ArrayList<>();
        aeryon_ale_fruityLore.add(colorUtilities.parseColors("<#828296>Fruity"));
        aeryon_ale_fruityLore.add("");
        aeryon_ale_fruityLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        aeryon_ale_fruityMeta.setLore(aeryon_ale_fruityLore);
        aeryon_ale_fruity.setItemMeta(aeryon_ale_fruityMeta);
        customItems.put("aeryon_ale_fruity", aeryon_ale_fruity);

        ItemStack kastollian_wheatbeer_bitter = new ItemStack(Material.POTION);
        ItemMeta kastollian_wheatbeer_bitterMeta = kastollian_wheatbeer_bitter.getItemMeta();
        kastollian_wheatbeer_bitterMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 9, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        kastollian_wheatbeer_bitterMeta.setCustomModelData(3);
        kastollian_wheatbeer_bitterMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        kastollian_wheatbeer_bitterMeta.setDisplayName(colorUtilities.parseColors("&fKastollian Wheatbeer"));
        List<String> kastollian_wheatbeer_bitterLore = new ArrayList<>();
        kastollian_wheatbeer_bitterLore.add(colorUtilities.parseColors("<#828296>Bitter"));
        kastollian_wheatbeer_bitterLore.add(colorUtilities.parseColors("<#464651>&o\"Raise yer cups, lads!\""));
        kastollian_wheatbeer_bitterLore.add("");
        kastollian_wheatbeer_bitterLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        kastollian_wheatbeer_bitterMeta.setLore(kastollian_wheatbeer_bitterLore);
        kastollian_wheatbeer_bitter.setItemMeta(kastollian_wheatbeer_bitterMeta);
        customItems.put("kastollian_wheatbeer_bitter", kastollian_wheatbeer_bitter);

        ItemStack kastollian_wheatbeer_watery = new ItemStack(Material.POTION);
        ItemMeta kastollian_wheatbeer_wateryMeta = kastollian_wheatbeer_watery.getItemMeta();
        kastollian_wheatbeer_wateryMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 9, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        kastollian_wheatbeer_wateryMeta.setCustomModelData(3);
        kastollian_wheatbeer_wateryMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        kastollian_wheatbeer_wateryMeta.setDisplayName(colorUtilities.parseColors("&fKastollian Wheatbeer"));
        List<String> kastollian_wheatbeer_wateryLore = new ArrayList<>();
        kastollian_wheatbeer_wateryLore.add(colorUtilities.parseColors("<#828296>Watery"));
        kastollian_wheatbeer_wateryLore.add(colorUtilities.parseColors("<#464651>&o\"Raise yer cups, lads!\""));
        kastollian_wheatbeer_wateryLore.add("");
        kastollian_wheatbeer_wateryLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        kastollian_wheatbeer_wateryMeta.setLore(kastollian_wheatbeer_wateryLore);
        kastollian_wheatbeer_watery.setItemMeta(kastollian_wheatbeer_wateryMeta);
        customItems.put("kastollian_wheatbeer_watery", kastollian_wheatbeer_watery);

        ItemStack kastollian_wheatbeer_fresh = new ItemStack(Material.POTION);
        ItemMeta kastollian_wheatbeer_freshMeta = kastollian_wheatbeer_fresh.getItemMeta();
        kastollian_wheatbeer_freshMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 12, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        kastollian_wheatbeer_freshMeta.setCustomModelData(3);
        kastollian_wheatbeer_freshMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        kastollian_wheatbeer_freshMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>Kastollian Wheatbeer"));
        List<String> kastollian_wheatbeer_freshLore = new ArrayList<>();
        kastollian_wheatbeer_freshLore.add(colorUtilities.parseColors("<#828296>Fresh"));
        kastollian_wheatbeer_freshLore.add(colorUtilities.parseColors("<#464651>&o\"Raise yer cups, lads!\""));
        kastollian_wheatbeer_freshLore.add("");
        kastollian_wheatbeer_freshLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        kastollian_wheatbeer_freshMeta.setLore(kastollian_wheatbeer_freshLore);
        kastollian_wheatbeer_fresh.setItemMeta(kastollian_wheatbeer_freshMeta);
        customItems.put("kastollian_wheatbeer_fresh", kastollian_wheatbeer_fresh);

        ItemStack kastollian_wheatbeer_hearty = new ItemStack(Material.POTION);
        ItemMeta kastollian_wheatbeer_heartyMeta = kastollian_wheatbeer_hearty.getItemMeta();
        kastollian_wheatbeer_heartyMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 12, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        kastollian_wheatbeer_heartyMeta.setCustomModelData(3);
        kastollian_wheatbeer_heartyMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        kastollian_wheatbeer_heartyMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>Kastollian Wheatbeer"));
        List<String> kastollian_wheatbeer_heartyLore = new ArrayList<>();
        kastollian_wheatbeer_heartyLore.add(colorUtilities.parseColors("<#828296>Hearty"));
        kastollian_wheatbeer_heartyLore.add(colorUtilities.parseColors("<#464651>&o\"Raise yer cups, lads!\""));
        kastollian_wheatbeer_heartyLore.add("");
        kastollian_wheatbeer_heartyLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        kastollian_wheatbeer_heartyMeta.setLore(kastollian_wheatbeer_heartyLore);
        kastollian_wheatbeer_hearty.setItemMeta(kastollian_wheatbeer_heartyMeta);
        customItems.put("kastollian_wheatbeer_hearty", kastollian_wheatbeer_hearty);

        ItemStack kastollian_wheatbeer_herbal = new ItemStack(Material.POTION);
        ItemMeta kastollian_wheatbeer_herbalMeta = kastollian_wheatbeer_herbal.getItemMeta();
        kastollian_wheatbeer_herbalMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        kastollian_wheatbeer_herbalMeta.setCustomModelData(3);
        kastollian_wheatbeer_herbalMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        kastollian_wheatbeer_herbalMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lK<#B57F55>&la<#BB8554>&ls<#C18C54>&lt<#C69253>&lo<#CC9952>&ll<#D29F51>&ll<#D3984C>&li<#D39147>&la<#D48B42>&ln <#D4843C>&lW<#D57D37>&lh<#D57632>&le<#CF7638>&la<#C8773E>&lt<#C27744>&lb<#BC774A>&le<#B57850>&le<#AF7856>&lr"));
        List<String> kastollian_wheatbeer_herbalLore = new ArrayList<>();
        kastollian_wheatbeer_herbalLore.add(colorUtilities.parseColors("<#828296>Herbal"));
        kastollian_wheatbeer_herbalLore.add(colorUtilities.parseColors("<#8F4DFB>&o\"<#834DFB>&oR<#774CFB>&oa<#6B4CFB>&oi<#5F4BFB>&os<#534BFB>&oe <#474AFB>&oy<#4B4AFB>&oe<#574BFB>&or <#634BFB>&oc<#6F4CFB>&ou<#7B4CFB>&op<#874DFB>&os<#9552EF>&o, <#A661C9>&ol<#B76FA4>&oa<#C87E7E>&od<#D98D59>&os<#EA9B33>&o!<#FBAA0E>&o\""));
        kastollian_wheatbeer_herbalLore.add("");
        kastollian_wheatbeer_herbalLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        kastollian_wheatbeer_herbalMeta.setLore(kastollian_wheatbeer_herbalLore);
        kastollian_wheatbeer_herbal.setItemMeta(kastollian_wheatbeer_herbalMeta);
        customItems.put("kastollian_wheatbeer_herbal", kastollian_wheatbeer_herbal);

        ItemStack kastollian_wheatbeer_rich = new ItemStack(Material.POTION);
        ItemMeta kastollian_wheatbeer_richMeta = kastollian_wheatbeer_rich.getItemMeta();
        kastollian_wheatbeer_richMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        kastollian_wheatbeer_richMeta.setCustomModelData(3);
        kastollian_wheatbeer_richMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        kastollian_wheatbeer_richMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lK<#B57F55>&la<#BB8554>&ls<#C18C54>&lt<#C69253>&lo<#CC9952>&ll<#D29F51>&ll<#D3984C>&li<#D39147>&la<#D48B42>&ln <#D4843C>&lW<#D57D37>&lh<#D57632>&le<#CF7638>&la<#C8773E>&lt<#C27744>&lb<#BC774A>&le<#B57850>&le<#AF7856>&lr"));
        List<String> kastollian_wheatbeer_richLore = new ArrayList<>();
        kastollian_wheatbeer_richLore.add(colorUtilities.parseColors("<#828296>Rich "));
        kastollian_wheatbeer_richLore.add(colorUtilities.parseColors("<#8F4DFB>&o\"<#834DFB>&oR<#774CFB>&oa<#6B4CFB>&oi<#5F4BFB>&os<#534BFB>&oe <#474AFB>&oy<#4B4AFB>&oe<#574BFB>&or <#634BFB>&oc<#6F4CFB>&ou<#7B4CFB>&op<#874DFB>&os<#9552EF>&o, <#A661C9>&ol<#B76FA4>&oa<#C87E7E>&od<#D98D59>&os<#EA9B33>&o!<#FBAA0E>&o\""));
        kastollian_wheatbeer_richLore.add("");
        kastollian_wheatbeer_richLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        kastollian_wheatbeer_richMeta.setLore(kastollian_wheatbeer_richLore);
        kastollian_wheatbeer_rich.setItemMeta(kastollian_wheatbeer_richMeta);
        customItems.put("kastollian_wheatbeer_rich", kastollian_wheatbeer_rich);

        ItemStack marleon_gold_bitter = new ItemStack(Material.POTION);
        ItemMeta marleon_gold_bitterMeta = marleon_gold_bitter.getItemMeta();
        marleon_gold_bitterMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 9, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        marleon_gold_bitterMeta.setCustomModelData(4);
        marleon_gold_bitterMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        marleon_gold_bitterMeta.setDisplayName(colorUtilities.parseColors("&fMarleon Gold"));
        List<String> marleon_gold_bitterLore = new ArrayList<>();
        marleon_gold_bitterLore.add(colorUtilities.parseColors("<#828296>Bitter"));
        marleon_gold_bitterLore.add(colorUtilities.parseColors("<#464651>&oFrom the brewers of St. Denys"));
        marleon_gold_bitterLore.add("");
        marleon_gold_bitterLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        marleon_gold_bitterMeta.setLore(marleon_gold_bitterLore);
        marleon_gold_bitter.setItemMeta(marleon_gold_bitterMeta);
        customItems.put("marleon_gold_bitter", marleon_gold_bitter);

        ItemStack marleon_gold_malty = new ItemStack(Material.POTION);
        ItemMeta marleon_gold_maltyMeta = marleon_gold_malty.getItemMeta();
        marleon_gold_maltyMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 12, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        marleon_gold_maltyMeta.setCustomModelData(4);
        marleon_gold_maltyMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        marleon_gold_maltyMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>Marleon Gold"));
        List<String> marleon_gold_maltyLore = new ArrayList<>();
        marleon_gold_maltyLore.add(colorUtilities.parseColors("<#828296>Malty"));
        marleon_gold_maltyLore.add(colorUtilities.parseColors("<#464651>&oFrom the brewers of St. Denys"));
        marleon_gold_maltyLore.add("");
        marleon_gold_maltyLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        marleon_gold_maltyMeta.setLore(marleon_gold_maltyLore);
        marleon_gold_malty.setItemMeta(marleon_gold_maltyMeta);
        customItems.put("marleon_gold_malty", marleon_gold_malty);

        ItemStack marleon_gold_delicate = new ItemStack(Material.POTION);
        ItemMeta marleon_gold_delicateMeta = marleon_gold_delicate.getItemMeta();
        marleon_gold_delicateMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        marleon_gold_delicateMeta.setCustomModelData(4);
        marleon_gold_delicateMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        marleon_gold_delicateMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lM<#BA8455>&la<#C48F53>&lr<#CF9B52>&ll<#D3974B>&le<#D48B42>&lo<#D47E38>&ln <#D17636>&lG<#C67740>&lo<#BA774B>&ll<#AF7856>&ld"));
        List<String> marleon_gold_delicateLore = new ArrayList<>();
        marleon_gold_delicateLore.add(colorUtilities.parseColors("<#828296>Delicate"));
        marleon_gold_delicateLore.add(colorUtilities.parseColors("<#AE3131>&oFr<#BD344E>&oo<#C5355C>&om <#D53779>&ot<#DC3988>&ohe <#EB6585>&ob<#EE7A7D>&or<#F29075>&oe<#F5A56D>&ow<#F9BB64>&oe<#FCD05C>&or<#F9BB64>&os <#F29075>&oo<#EE7A7D>&of <#E74F8E>&oS<#E43A96>&ot<#DC3988>&o. <#CD366B>&oD<#C5355C>&oen<#B6323F>&oy<#AE3131>&os"));
        marleon_gold_delicateLore.add("");
        marleon_gold_delicateLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        marleon_gold_delicateMeta.setLore(marleon_gold_delicateLore);
        marleon_gold_delicate.setItemMeta(marleon_gold_delicateMeta);
        customItems.put("marleon_gold_delicate", marleon_gold_delicate);

        ItemStack marleon_gold_rich = new ItemStack(Material.POTION);
        ItemMeta marleon_gold_richMeta = marleon_gold_rich.getItemMeta();
        marleon_gold_richMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 15, 0, 9, 87, 104, 101, 97, 116, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        marleon_gold_richMeta.setCustomModelData(4);
        marleon_gold_richMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        marleon_gold_richMeta.setDisplayName(colorUtilities.parseColors("<#AF7856>&lM<#BA8455>&la<#C48F53>&lr<#CF9B52>&ll<#D3974B>&le<#D48B42>&lo<#D47E38>&ln <#D17636>&lG<#C67740>&lo<#BA774B>&ll<#AF7856>&ld"));
        List<String> marleon_gold_richLore = new ArrayList<>();
        marleon_gold_richLore.add(colorUtilities.parseColors("<#828296>Rich"));
        marleon_gold_richLore.add(colorUtilities.parseColors("<#AE3131>&oFr<#BD344E>&oo<#C5355C>&om <#D53779>&ot<#DC3988>&ohe <#EB6585>&ob<#EE7A7D>&or<#F29075>&oe<#F5A56D>&ow<#F9BB64>&oe<#FCD05C>&or<#F9BB64>&os <#F29075>&oo<#EE7A7D>&of <#E74F8E>&oS<#E43A96>&ot<#DC3988>&o. <#CD366B>&oD<#C5355C>&oen<#B6323F>&oy<#AE3131>&os"));
        marleon_gold_richLore.add("");
        marleon_gold_richLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        marleon_gold_richMeta.setLore(marleon_gold_richLore);
        marleon_gold_rich.setItemMeta(marleon_gold_richMeta);
        customItems.put("marleon_gold_rich", marleon_gold_rich);

        ItemStack darkbeer_bitter = new ItemStack(Material.POTION);
        ItemMeta darkbeer_bitterMeta = darkbeer_bitter.getItemMeta();
        darkbeer_bitterMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 15, 0, 8, 68, 97, 114, 107, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        darkbeer_bitterMeta.setCustomModelData(5);
        darkbeer_bitterMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        darkbeer_bitterMeta.setDisplayName(colorUtilities.parseColors("&fIlleryon Darkbeer"));
        List<String> darkbeer_bitterLore = new ArrayList<>();
        darkbeer_bitterLore.add(colorUtilities.parseColors("<#828296>Bitter"));
        darkbeer_bitterLore.add(colorUtilities.parseColors("<#464651>&oLumberjack's Philtre"));
        darkbeer_bitterLore.add("");
        darkbeer_bitterLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        darkbeer_bitterMeta.setLore(darkbeer_bitterLore);
        darkbeer_bitter.setItemMeta(darkbeer_bitterMeta);
        customItems.put("darkbeer_bitter", darkbeer_bitter);

        ItemStack darkbeer_spoiled = new ItemStack(Material.POTION);
        ItemMeta darkbeer_spoiledMeta = darkbeer_spoiled.getItemMeta();
        darkbeer_spoiledMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 6, -8, 0, 15, 0, 8, 68, 97, 114, 107, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        darkbeer_spoiledMeta.setCustomModelData(5);
        darkbeer_spoiledMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        darkbeer_spoiledMeta.setDisplayName(colorUtilities.parseColors("&fIlleryon Darkbeer"));
        List<String> darkbeer_spoiledLore = new ArrayList<>();
        darkbeer_spoiledLore.add(colorUtilities.parseColors("<#828296>Spoiled"));
        darkbeer_spoiledLore.add(colorUtilities.parseColors("<#464651>&oLumberjack's Philtre"));
        darkbeer_spoiledLore.add("");
        darkbeer_spoiledLore.add(colorUtilities.parseColors("&8[&7⭑&0⭑⭑⭑⭑&8]"));
        darkbeer_spoiledMeta.setLore(darkbeer_spoiledLore);
        darkbeer_spoiled.setItemMeta(darkbeer_spoiledMeta);
        customItems.put("darkbeer_spoiled", darkbeer_spoiled);

        ItemStack darkbeer_sweet = new ItemStack(Material.POTION);
        ItemMeta darkbeer_sweetMeta = darkbeer_sweet.getItemMeta();
        darkbeer_sweetMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 20, 0, 8, 68, 97, 114, 107, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        darkbeer_sweetMeta.setCustomModelData(5);
        darkbeer_sweetMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        darkbeer_sweetMeta.setDisplayName(colorUtilities.parseColors("<#4C251C>Illeryon Darkbeer"));
        List<String> darkbeer_sweetLore = new ArrayList<>();
        darkbeer_sweetLore.add(colorUtilities.parseColors("<#828296>Sweet"));
        darkbeer_sweetLore.add(colorUtilities.parseColors("<#464651>&oLumberjack's Philtre"));
        darkbeer_sweetLore.add("");
        darkbeer_sweetLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        darkbeer_sweetMeta.setLore(darkbeer_sweetLore);
        darkbeer_sweet.setItemMeta(darkbeer_sweetMeta);
        customItems.put("darkbeer_sweet", darkbeer_sweet);

        ItemStack darkbeer_earthy = new ItemStack(Material.POTION);
        ItemMeta darkbeer_earthyMeta = darkbeer_earthy.getItemMeta();
        darkbeer_earthyMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 8, -8, 0, 20, 0, 8, 68, 97, 114, 107, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        darkbeer_earthyMeta.setCustomModelData(5);
        darkbeer_earthyMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        darkbeer_earthyMeta.setDisplayName(colorUtilities.parseColors("<#4C251C>Illeryon Darkbeer"));
        List<String> darkbeer_earthyLore = new ArrayList<>();
        darkbeer_earthyLore.add(colorUtilities.parseColors("<#828296>Earthy"));
        darkbeer_earthyLore.add(colorUtilities.parseColors("<#464651>&oLumberjack's Philtre"));
        darkbeer_earthyLore.add("");
        darkbeer_earthyLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑&0⭑⭑&8]"));
        darkbeer_earthyMeta.setLore(darkbeer_earthyLore);
        darkbeer_earthy.setItemMeta(darkbeer_earthyMeta);
        customItems.put("darkbeer_earthy", darkbeer_earthy);

        ItemStack darkbeer_strong = new ItemStack(Material.POTION);
        ItemMeta darkbeer_strongMeta = darkbeer_strong.getItemMeta();
        darkbeer_strongMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 25, 0, 8, 68, 97, 114, 107, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        darkbeer_strongMeta.setCustomModelData(5);
        darkbeer_strongMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        darkbeer_strongMeta.setDisplayName(colorUtilities.parseColors("<#742B14>&lI<#692916>&ll<#5F2818>&ll<#54261A>&le<#4C251C>&lr<#4C251C>&ly<#4C251C>&lo<#4C251C>&ln <#4C251C>&lD<#4C251C>&la<#4C251C>&lr<#4C251C>&lk<#54261A>&lb<#5F2818>&le<#692916>&le<#742B14>&lr"));
        List<String> darkbeer_strongLore = new ArrayList<>();
        darkbeer_strongLore.add(colorUtilities.parseColors("<#828296>Strong"));
        darkbeer_strongLore.add(colorUtilities.parseColors("<#385035>&oL<#3D5736>&ou<#415E38>&om<#466639>&ob<#4C6A3A>&oe<#536A39>&or<#5A6A39>&oj<#626A38>&oa<#596437>&oc<#4E5D37>&ok<#425636>&o'<#385035>&os <#385035>&oP<#385035>&oh<#385035>&oi<#395133>&ol<#3B5430>&ot<#3C562D>&or<#3E582A>&oe"));
        darkbeer_strongLore.add("");
        darkbeer_strongLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        darkbeer_strongMeta.setLore(darkbeer_strongLore);
        darkbeer_strong.setItemMeta(darkbeer_strongMeta);
        customItems.put("darkbeer_strong", darkbeer_strong);

        ItemStack darkbeer_caramelly = new ItemStack(Material.POTION);
        ItemMeta darkbeer_caramellyMeta = darkbeer_caramelly.getItemMeta();
        darkbeer_caramellyMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 25, 0, 8, 68, 97, 114, 107, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        darkbeer_caramellyMeta.setCustomModelData(5);
        darkbeer_caramellyMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        darkbeer_caramellyMeta.setDisplayName(colorUtilities.parseColors("<#742B14>&lI<#692916>&ll<#5F2818>&ll<#54261A>&le<#4C251C>&lr<#4C251C>&ly<#4C251C>&lo<#4C251C>&ln <#4C251C>&lD<#4C251C>&la<#4C251C>&lr<#4C251C>&lk<#54261A>&lb<#5F2818>&le<#692916>&le<#742B14>&lr"));
        List<String> darkbeer_caramellyLore = new ArrayList<>();
        darkbeer_caramellyLore.add(colorUtilities.parseColors("<#828296>Caramelly"));
        darkbeer_caramellyLore.add(colorUtilities.parseColors("<#385035>&oL<#3D5736>&ou<#415E38>&om<#466639>&ob<#4C6A3A>&oe<#536A39>&or<#5A6A39>&oj<#626A38>&oa<#596437>&oc<#4E5D37>&ok<#425636>&o'<#385035>&os <#385035>&oP<#385035>&oh<#385035>&oi<#395133>&ol<#3B5430>&ot<#3C562D>&or<#3E582A>&oe"));
        darkbeer_caramellyLore.add("");
        darkbeer_caramellyLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        darkbeer_caramellyMeta.setLore(darkbeer_caramellyLore);
        darkbeer_caramelly.setItemMeta(darkbeer_caramellyMeta);
        customItems.put("darkbeer_caramelly", darkbeer_caramelly);

        ItemStack darkbeer_roasted = new ItemStack(Material.POTION);
        ItemMeta darkbeer_roastedMeta = darkbeer_roasted.getItemMeta();
        darkbeer_roastedMeta.getPersistentDataContainer().set(brewDataKey, PersistentDataType.BYTE_ARRAY, new byte[] {86, 1, 0, 0, 10, -8, 0, 25, 0, 8, 68, 97, 114, 107, 98, 101, 101, 114, 0, 0, 0, 0, 0});
        darkbeer_roastedMeta.setCustomModelData(5);
        darkbeer_roastedMeta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
        darkbeer_roastedMeta.setDisplayName(colorUtilities.parseColors("<#742B14>&lI<#692916>&ll<#5F2818>&ll<#54261A>&le<#4C251C>&lr<#4C251C>&ly<#4C251C>&lo<#4C251C>&ln <#4C251C>&lD<#4C251C>&la<#4C251C>&lr<#4C251C>&lk<#54261A>&lb<#5F2818>&le<#692916>&le<#742B14>&lr"));
        List<String> darkbeer_roastedLore = new ArrayList<>();
        darkbeer_roastedLore.add(colorUtilities.parseColors("<#828296>Roasted Taste"));
        darkbeer_roastedLore.add(colorUtilities.parseColors("<#385035>&oL<#3D5736>&ou<#415E38>&om<#466639>&ob<#4C6A3A>&oe<#536A39>&or<#5A6A39>&oj<#626A38>&oa<#596437>&oc<#4E5D37>&ok<#425636>&o'<#385035>&os <#385035>&oP<#385035>&oh<#385035>&oi<#395133>&ol<#3B5430>&ot<#3C562D>&or<#3E582A>&oe"));
        darkbeer_roastedLore.add("");
        darkbeer_roastedLore.add(colorUtilities.parseColors("&8[&7⭑⭑⭑⭑⭑&8]"));
        darkbeer_roastedMeta.setLore(darkbeer_roastedLore);
        darkbeer_roasted.setItemMeta(darkbeer_roastedMeta);
        customItems.put("darkbeer_roasted", darkbeer_roasted);

    }

    // Get a custom item by its name
    public static ItemStack getCustomItem(String name) {
        return customItems.get(name);
    }

    public static Map<String, ItemStack> getCustomItems() {
        return customItems; // Return the entire map for suggestions
    }
}