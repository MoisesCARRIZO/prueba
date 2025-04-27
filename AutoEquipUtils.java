package net.runelite.client.plugins.AutoEquipPlugin.utils;

import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;

import java.util.List;

public class AutoEquipUtils
{
    private final Client client;

    public AutoEquipUtils(Client client)
    {
        this.client = client;
    }

    public void equipItems(List<String> itemNames)
    {
        if (client == null)
        {
            return;
        }

        List<Widget> widgets = InventoryUtils.findItems(client, itemNames);

        for (Widget widget : widgets)
        {
            MenuUtils.clickItem(client, widget, "Equip");
        }
    }
}
