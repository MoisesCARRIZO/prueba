package net.runelite.client.plugins.AutoEquipPlugin;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("autoequipplugin")
public interface AutoEquipPluginConfig extends Config
{
    @ConfigItem(
            keyName = "mageKey",
            name = "Tecla Full Mage",
            description = "Tecla para equipar el set de Mage"
    )
    default net.runelite.client.config.Keybind mageKey()
    {
        return net.runelite.client.config.Keybind.NOT_SET;
    }

    @ConfigItem(
            keyName = "rangeKey",
            name = "Tecla Full Range",
            description = "Tecla para equipar el set de Range"
    )
    default net.runelite.client.config.Keybind rangeKey()
    {
        return net.runelite.client.config.Keybind.NOT_SET;
    }

    @ConfigItem(
            keyName = "meleeKey",
            name = "Tecla Full Melee",
            description = "Tecla para equipar el set de Melee"
    )
    default net.runelite.client.config.Keybind meleeKey()
    {
        return net.runelite.client.config.Keybind.NOT_SET;
    }

    @ConfigItem(
            keyName = "mageItems",
            name = "Ítems Mage",
            description = "Lista de ítems para equipar en Mage (separados por coma)"
    )
    default String mageItems()
    {
        return "Ahrim's hood,Ahrim's robetop,Ahrim's robeskirt,Occult necklace,Staff of the dead,Infinity boots,Barrows gloves";
    }

    @ConfigItem(
            keyName = "rangeItems",
            name = "Ítems Range",
            description = "Lista de ítems para equipar en Range (separados por coma)"
    )
    default String rangeItems()
    {
        return "Karil's coif,Karil's leathertop,Karil's leatherskirt,Amulet of fury,Toxic blowpipe,Snakeskin boots,Barrows gloves";
    }

    @ConfigItem(
            keyName = "meleeItems",
            name = "Ítems Melee",
            description = "Lista de ítems para equipar en Melee (separados por coma)"
    )
    default String meleeItems()
    {
        return "Serpentine helm,Bandos chestplate,Bandos tassets,Amulet of torture,Abyssal tentacle,Primordial boots,Barrows gloves";
    }
}
