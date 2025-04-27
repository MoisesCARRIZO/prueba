package net.runelite.client.plugins.AutoEquipPlugin.utils;

import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemContainer;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;

public class MenuUtils
{
    private static Client client;

    public static void setClient(Client clientInstance)
    {
        client = clientInstance;
    }

    public static void interactWithInventoryItem(String itemName)
    {
        if (client == null)
        {
            return;
        }

        ItemContainer inventory = client.getItemContainer(InventoryID.INVENTORY);
        if (inventory == null)
        {
            return;
        }

        Item[] items = inventory.getItems();

        for (int slot = 0; slot < items.length; slot++)
        {
            Item item = items[slot];
            int id = item.getId();

            if (id != -1)
            {
                String name = client.getItemDefinition(id).getName();
                if (name != null && name.equalsIgnoreCase(itemName))
                {
                    client.invokeMenuAction(
                            "Wear", // o "Wield"
                            name,
                            id,
                            MenuAction.ITEM_FIRST_OPTION.getId(),
                            WidgetInfo.INVENTORY.getId(),
                            slot,
                            id
                    );
                    break;
                }
            }
        }
    }
}
