package net.sweenus.simplyswords.config;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SimplySwordsConfig {
    private static final HashMap<String, Boolean> BOOLEAN_OPTIONS = new LinkedHashMap<>();
    private static final HashMap<String, Float> GENERAL_OPTIONS = new LinkedHashMap<>();
    private static final HashMap<String, Float> FLOAT_OPTIONS = new LinkedHashMap<>();
    private static final HashMap<String, Float> WEAPON_OPTIONS = new LinkedHashMap<>();

    public static boolean getBooleanValue(String key) {
        if (!BOOLEAN_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return BOOLEAN_OPTIONS.getOrDefault(key, null);
    }

    public static float getGeneralSettings(String key) {
        if (!GENERAL_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return GENERAL_OPTIONS.getOrDefault(key, null);
    }

    public static float getFloatValue(String key) {
        if (!FLOAT_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return FLOAT_OPTIONS.getOrDefault(key, null);
    }

    public static float getWeaponAttributes(String key) {
        if (!WEAPON_OPTIONS.containsKey(key)) {
            System.out.println(key);
        }
        return WEAPON_OPTIONS.getOrDefault(key, null);
    }

    public static void init() {

        FLOAT_OPTIONS.put("speed_chance", 15f);
        FLOAT_OPTIONS.put("speed_duration", 300f);


        FLOAT_OPTIONS.put("slowness_chance", 50f);
        FLOAT_OPTIONS.put("slowness_duration", 50f);


        FLOAT_OPTIONS.put("toxin_chance", 15f);
        FLOAT_OPTIONS.put("toxin_duration", 150f);


        FLOAT_OPTIONS.put("freeze_chance", 15f);
        FLOAT_OPTIONS.put("freeze_duration", 120f);


        FLOAT_OPTIONS.put("wildfire_chance", 10f);
        FLOAT_OPTIONS.put("wildfire_duration", 180f);
        FLOAT_OPTIONS.put("wildfire_radius", 10f);

        FLOAT_OPTIONS.put("levitation_chance", 15f);
        FLOAT_OPTIONS.put("levitation_duration", 50f);

        FLOAT_OPTIONS.put("watcher_chance", 5f);
        FLOAT_OPTIONS.put("watcher_restore_amount", 0.5f);
        FLOAT_OPTIONS.put("watcher_radius", 8f);

        FLOAT_OPTIONS.put("omen_chance", 75f);
        FLOAT_OPTIONS.put("omen_absorption_amount", 1f);
        FLOAT_OPTIONS.put("omen_instantkill_threshold", 0.25f);

        FLOAT_OPTIONS.put("steal_chance", 25f);
        FLOAT_OPTIONS.put("steal_duration", 400f);
        FLOAT_OPTIONS.put("steal_invis_duration", 120f);
        FLOAT_OPTIONS.put("steal_blind_duration", 200f);
        FLOAT_OPTIONS.put("steal_radius", 30f);

        FLOAT_OPTIONS.put("gravity_chance", 35f);
        FLOAT_OPTIONS.put("gravity_duration", 250f);
        FLOAT_OPTIONS.put("gravity_radius", 10f);

        FLOAT_OPTIONS.put("soulmeld_chance", 75f);
        FLOAT_OPTIONS.put("soulmeld_duration", 250f);
        FLOAT_OPTIONS.put("soulmeld_radius", 5f);

        FLOAT_OPTIONS.put("soulrend_chance", 85f);
        FLOAT_OPTIONS.put("soulrend_duration", 500f);
        FLOAT_OPTIONS.put("soulrend_rend_damage_multiplier", 2f);
        FLOAT_OPTIONS.put("soulrend_rend_heal_multiplier", 0.5f);
        FLOAT_OPTIONS.put("soulrend_radius", 10f);
        FLOAT_OPTIONS.put("soulrend_max_stacks", 8f);

        FLOAT_OPTIONS.put("ferocity_chance", 75f);
        FLOAT_OPTIONS.put("ferocity_duration", 100f);
        FLOAT_OPTIONS.put("ferocity_max_stacks", 15f);
        FLOAT_OPTIONS.put("ferocity_strength_tier", 2f);

        FLOAT_OPTIONS.put("ember_ire_chance", 5f);
        FLOAT_OPTIONS.put("ember_ire_duration", 150f);

        FLOAT_OPTIONS.put("volcanic_fury_chance", 25f);

        FLOAT_OPTIONS.put("storm_chance", 15f);
        FLOAT_OPTIONS.put("storm_radius", 10f);

        FLOAT_OPTIONS.put("plague_chance", 55f);

        FLOAT_OPTIONS.put("brimstone_chance", 15f);

        FLOAT_OPTIONS.put("bramble_chance", 45f);
        FLOAT_OPTIONS.put("bramble_radius", 10f);



        GENERAL_OPTIONS.put("standard_loot_table_weight", 0.08f);
        GENERAL_OPTIONS.put("rare_loot_table_weight", 0.008f);
        GENERAL_OPTIONS.put("unique_loot_table_weight", 0.002f);


        BOOLEAN_OPTIONS.put("add_weapons_to_loot_tables", true);
        BOOLEAN_OPTIONS.put("compat_gobber_end_weapons_unbreakable", true);


        WEAPON_OPTIONS.put("longsword_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("twinblade_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("rapier_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("katana_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("sai_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("spear_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("glaive_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("warglaive_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("cutlass_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("claymore_positive_damage_modifier", 2f);
        WEAPON_OPTIONS.put("greataxe_positive_damage_modifier", 3f);
        WEAPON_OPTIONS.put("greathammer_positive_damage_modifier", 4f);
        WEAPON_OPTIONS.put("chakram_positive_damage_modifier", 0f);
        WEAPON_OPTIONS.put("scythe_positive_damage_modifier", 1f);

        WEAPON_OPTIONS.put("longsword_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("twinblade_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("rapier_negative_damage_modifier", 1f);
        WEAPON_OPTIONS.put("katana_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("sai_negative_damage_modifier", 3f);
        WEAPON_OPTIONS.put("spear_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("glaive_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("warglaive_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("cutlass_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("claymore_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("greataxe_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("greathammer_negative_damage_modifier", 0f);
        WEAPON_OPTIONS.put("chakram_negative_damage_modifier", 1f);
        WEAPON_OPTIONS.put("scythe_negative_damage_modifier", 0f);

        WEAPON_OPTIONS.put("iron_damage_modifier", 3f);
        WEAPON_OPTIONS.put("gold_damage_modifier", 2f);
        WEAPON_OPTIONS.put("diamond_damage_modifier", 3f);
        WEAPON_OPTIONS.put("netherite_damage_modifier", 3f);
        WEAPON_OPTIONS.put("runic_damage_modifier", 3f);

        WEAPON_OPTIONS.put("longsword_attackspeed", -2.4f);
        WEAPON_OPTIONS.put("twinblade_attackspeed", -1.7f);
        WEAPON_OPTIONS.put("rapier_attackspeed", -1.6f);
        WEAPON_OPTIONS.put("katana_attackspeed", -2f);
        WEAPON_OPTIONS.put("sai_attackspeed", -1.1f);
        WEAPON_OPTIONS.put("spear_attackspeed", -2.7f);
        WEAPON_OPTIONS.put("glaive_attackspeed", -2.6f);
        WEAPON_OPTIONS.put("warglaive_attackspeed", -2.2f);
        WEAPON_OPTIONS.put("cutlass_attackspeed", -2f);
        WEAPON_OPTIONS.put("claymore_attackspeed", -2.8f);
        WEAPON_OPTIONS.put("greataxe_attackspeed", -3.1f);
        WEAPON_OPTIONS.put("greathammer_attackspeed", -3.2f);
        WEAPON_OPTIONS.put("chakram_attackspeed", -3.0f);
        WEAPON_OPTIONS.put("scythe_attackspeed", -2.7f);

        WEAPON_OPTIONS.put("brimstone_damage_modifier", 6f);
        WEAPON_OPTIONS.put("thewatcher_damage_modifier", 6f);
        WEAPON_OPTIONS.put("stormsedge_damage_modifier", 3f);
        WEAPON_OPTIONS.put("stormbringer_damage_modifier", 3f);
        WEAPON_OPTIONS.put("swordonastick_damage_modifier", 5f);
        WEAPON_OPTIONS.put("bramblethorn_damage_modifier", 6f);
        WEAPON_OPTIONS.put("watchingwarglaive_damage_modifier", 3f);
        WEAPON_OPTIONS.put("longswordofplague_damage_modifier", 3f);
        WEAPON_OPTIONS.put("emberblade_damage_modifier", 3f);
        WEAPON_OPTIONS.put("hearthflame_damage_modifier", 8f);
        WEAPON_OPTIONS.put("soulkeeper_damage_modifier", 8f);
        WEAPON_OPTIONS.put("twistedblade_damage_modifier", 4f);
        WEAPON_OPTIONS.put("soulstealer_damage_modifier", 0f);
        WEAPON_OPTIONS.put("soulrender_damage_modifier", 4f);
        WEAPON_OPTIONS.put("mjolnir_damage_modifier", 3f);
        WEAPON_OPTIONS.put("thedispatcher_damage_modifier", 4f);

        WEAPON_OPTIONS.put("brimstone_attackspeed", -2.8f);
        WEAPON_OPTIONS.put("thewatcher_attackspeed", -2.8f);
        WEAPON_OPTIONS.put("stormsedge_attackspeed", -1.7f);
        WEAPON_OPTIONS.put("stormbringer_attackspeed", -2.4f);
        WEAPON_OPTIONS.put("swordonastick_attackspeed", -2.6f);
        WEAPON_OPTIONS.put("bramblethorn_attackspeed", -1.6f);
        WEAPON_OPTIONS.put("watchingwarglaive_attackspeed", -2.2f);
        WEAPON_OPTIONS.put("longswordofplague_attackspeed", -2.4f);
        WEAPON_OPTIONS.put("emberblade_attackspeed", -2.4f);
        WEAPON_OPTIONS.put("hearthflame_attackspeed", -3.2f);
        WEAPON_OPTIONS.put("soulkeeper_attackspeed", -2.9f);
        WEAPON_OPTIONS.put("twistedblade_attackspeed", -2.6f);
        WEAPON_OPTIONS.put("soulstealer_attackspeed", -1.1f);
        WEAPON_OPTIONS.put("soulrender_attackspeed", -2.4f);
        WEAPON_OPTIONS.put("mjolnir_attackspeed", -3.0f);
        WEAPON_OPTIONS.put("thedispatcher_attackspeed", -2.0f);

    }

    public static void loadConfig() {
        JsonObject json;
        json = Config.getJsonObject(Config.readFile(new File("config/simplyswords/booleans.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            BOOLEAN_OPTIONS.put(entry.getKey(), entry.getValue().getAsBoolean());
        }

        json = Config.getJsonObject(Config.readFile(new File("config/simplyswords/general_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            GENERAL_OPTIONS.put(entry.getKey(), entry.getValue().getAsFloat());
        }

        json = Config.getJsonObject(Config.readFile(new File("config/simplyswords/effects_config.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            FLOAT_OPTIONS.put(entry.getKey(), entry.getValue().getAsFloat());
        }

        json = Config.getJsonObject(Config.readFile(new File("config/simplyswords/weapon_attributes.json5")));
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            WEAPON_OPTIONS.put(entry.getKey(), entry.getValue().getAsFloat());
        }

    }


    public static void generateConfigs(boolean overwrite) {
        StringBuilder config = new StringBuilder("{\n");
        int i = 0;
        for (String key : BOOLEAN_OPTIONS.keySet()) {
            config.append("  \"").append(key).append("\": ").append(BOOLEAN_OPTIONS.get(key));
            ++i;
            if (i < BOOLEAN_OPTIONS.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        Config.createFile("config/simplyswords/booleans.json5", config.toString(), overwrite);

        config = new StringBuilder("{\n");
        i = 0;
        for (String item : GENERAL_OPTIONS.keySet()) {
            if (i == 0) {
                config.append("// -- GENERAL CONFIGURATION -- \n");
                config.append("\n");
                config.append("// -- Loot Table Weights -- \n");
                config.append("// The chances of loot appearing in chests. \n");
                config.append("// 1 = 100% chance \n");
                config.append("// Values are very sensitive - recommend keeping changes small \n");
                config.append("// Simply Swords loot has a chance to appear in any chest vanilla or modded, except villager chests \n");
                config.append("// ------------------------ \n");
                config.append("\n");
                config.append("// Standard Loot: Iron > Gold Weapons. Default: 0.08 \n");
            }
            if (i == 1) {
                config.append("\n");
                config.append("// Rare Loot: Diamond & Runic Weapons. Default: 0.008 \n");
            }
            if (i == 2) {
                config.append("\n");
                config.append("// Unique Loot: Unique Weapons. Default: 0.002 \n");
            }
            config.append("  \"").append(item).append("\": ").append(GENERAL_OPTIONS.get(item));
            ++i;
            if (i < GENERAL_OPTIONS.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        Config.createFile("config/simplyswords/general_config.json5", config.toString(), overwrite);

        config = new StringBuilder("{\n");
        i = 0;
        for (String item : FLOAT_OPTIONS.keySet()) {
            if (i == 0) {
                config.append("// -- EFFECTS CONFIGURATION -- \n");
                config.append("\n");
                config.append("//Chance range 0-100, where 100 = 100% chance to occur\n");
                config.append("//Radius is measured in blocks\n");
                config.append("//Duration in ticks, where 20 is equivalent to one second \n");
                config.append("\n");
                config.append("// -- Runic Power: Swiftness -- \n");
                config.append("// ---------------------------- \n");
            }
            if (i == 2) {
                config.append("\n");
                config.append("// -- Runic Power: Slow -- \n");
                config.append("// ----------------------- \n");
            }
            if (i == 4) {
                config.append("\n");
                config.append("// -- Runic Power: Poison -- \n");
                config.append("// ------------------------- \n");
            }
            if (i == 6) {
                config.append("\n");
                config.append("// -- Runic Power: Freeze -- \n");
                config.append("// ------------------------- \n");
            }
            if (i == 8) {
                config.append("\n");
                config.append("// -- Runic Power: Wildfire -- \n");
                config.append("// --------------------------- \n");
            }
            if (i == 11) {
                config.append("\n");
                config.append("// -- Runic Power: Float -- \n");
                config.append("// ------------------------ \n");
            }
            if (i == 13) {
                config.append("\n");
                config.append("// -- Unique Effect: Watcher -- \n");
                config.append("// -- Restore amount refers to health gained from each enemy in range -- \n");
                config.append("// ---------------------------- \n");
            }
            if (i == 16) {
                config.append("\n");
                config.append("// -- Unique Effect: Omen -- \n");
                config.append("// -- Absorption amount refers to the tier of regeneration gained on proc -- \n");
                config.append("// -- Instantkill Threshold refers to the % of maxhealth an enemy must be UNDER in order for the effect to proc. Where 1 = 100% -- \n");
                config.append("// ---------------------------- \n");
            }
            if (i == 19) {
                config.append("\n");
                config.append("// -- Unique Effect: Soul Steal -- \n");
                config.append("// Duration refers to the haste, slow, and glow effects \n");
                config.append("// ------------------------------- \n");
            }
            if (i == 24) {
                config.append("\n");
                config.append("// -- Unique Effect: Gravity -- \n");
                config.append("// NOT YET IMPLEMENTED \n");
                config.append("// ---------------------------- \n");
            }
            if (i == 27) {
                config.append("\n");
                config.append("// -- Unique Effect: Soul Meld -- \n");
                config.append("// ----------------------------- \n");
            }
            if (i == 30) {
                config.append("\n");
                config.append("// -- Unique Effect: Soul Rend -- \n");
                config.append("// ----------------------------- \n");
            }
            if (i == 36) {
                config.append("\n");
                config.append("// -- Unique Effect: Ferocity -- \n");
                config.append("// ----------------------------- \n");
            }
            if (i == 40) {
                config.append("\n");
                config.append("// -- Unique Effect: Ember Ire -- \n");
                config.append("// ------------------------------ \n");
            }
            if (i == 42) {
                config.append("\n");
                config.append("// -- Unique Effect: Volcanic Fury -- \n");
                config.append("// ---------------------------------- \n");
            }
            if (i == 43) {
                config.append("\n");
                config.append("// -- Unique Effect: Storm -- \n");
                config.append("// -------------------------- \n");
            }
            if (i == 45) {
                config.append("\n");
                config.append("// -- Unique Effect: Plague -- \n");
                config.append("// --------------------------- \n");
            }
            if (i == 46) {
                config.append("\n");
                config.append("// -- Unique Effect: Brimstone -- \n");
                config.append("// ------------------------------ \n");
            }
            config.append("  \"").append(item).append("\": ").append(FLOAT_OPTIONS.get(item));
            ++i;
            if (i < FLOAT_OPTIONS.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        Config.createFile("config/simplyswords/effects_config.json5", config.toString(), overwrite);

        config = new StringBuilder("{\n");
        i = 0;
        for (String item : WEAPON_OPTIONS.keySet()) {
            if (i == 0) {
                config.append("// -- WEAPON ATTRIBUTES CONFIGURATION -- \n");
                config.append("// These values should be THE SAME ON BOTH CLIENT AND SERVER, otherwise damage tooltips will display incorrect on the client \n");
                config.append("// The damage values of weapons can be modified by adjusting their weights \n");
                config.append("// This is not the outputted damage value you see in game, but it affects it directly \n");
                config.append("// Calculation: vanilla tool material damage + base_modifier + positive_modifier - negative_modifier = actual modifier \n");
                config.append("\n");
                config.append("// -- Positive Damage Modifiers -- \n");
                config.append("// Example use-case: Adding 3 to a value below will INCREASE the in-game damage of that weapon type by 3 \n");
                config.append("// ------------------------------- \n");
            }
            if (i == 14) {
                config.append("\n");
                config.append("// -- Negative Damage Modifiers -- \n");
                config.append("// Example use-case: Adding 3 to a value below will DECREASE the in-game damage of that weapon type by 3 \n");
                config.append("// ------------------------------- \n");
            }
            if (i == 28) {
                config.append("\n");
                config.append("// -- Base Damage Modifiers -- \n");
                config.append("// Positive & Negative damage modifiers scale off these base values \n");
                config.append("// --------------------------- \n");
            }
            if (i == 33) {
                config.append("\n");
                config.append("// -- Attack Speed Modifiers -- \n");
                config.append("// Recommended range: -1.0 to -3.7, with -1.0 being fast and -3.7 being slow \n");
                config.append("// ---------------------------- \n");
            }
            if (i == 47) {
                config.append("\n");
                config.append("\n");
                config.append("// -- UNIQUE ATTRIBUTES CONFIGURATION -- \n");
                config.append("// Uniques scale a little bit differently and only require one modifier \n");
                config.append("// This is not the outputted damage value you see in game, but it affects it directly \n");
                config.append("// Calculation: Vanilla netherite tool damage + damage_modifier = actual modifier \n");
                config.append("\n");
                config.append("// -- Damage Modifiers -- \n");
                config.append("// Example use-case: Adding 3 to a value below will INCREASE the in-game damage of that weapon by 3 \n");
                config.append("// ---------------------- \n");
            }
            if (i == 63) {
                config.append("\n");
                config.append("// -- Attack Speed Modifiers -- \n");
                config.append("// Recommended range: -1.0 to -3.7, with -1.0 being fast and -3.7 being slow \n");
                config.append("// ---------------------------- \n");
            }
            config.append("  \"").append(item).append("\": ").append(WEAPON_OPTIONS.get(item));
            ++i;
            if (i < WEAPON_OPTIONS.size()) {
                config.append(",");
            }
            config.append("\n");
        }
        config.append("}");
        Config.createFile("config/simplyswords/weapon_attributes.json5", config.toString(), overwrite);

    }
}