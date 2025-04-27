package net.runelite.client.plugins.AutoEquipPlugin.utils;

import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemContainer;

import java.util.ArrayList;
import java.util.List;

public class InventoryUtils
{
    private final Client client;

    public InventoryUtils(Client client)
    {
        this.client = client;
    }

    public List<Integer> findItems(String itemName)
    {
        List<Integer> matchingItemIds = new ArrayList<>();

        ItemContainer inventory = client.getItemContainer(InventoryID.INVENTORY);
        if (inventory == null)
        {
            return matchingItemIds;
        }

        final int[] itemIds = inventory.getItemIds();

        for (int itemId : itemIds)
        {
            if (itemId == -1)
            {
                continue;
            }

            final String name = client.getItemDefinition(itemId).getName();
            if (name != null && name.equalsIgnoreCase(itemName))
            {
                matchingItemIds.add(itemId);
            }
        }

        return matchingItemIds;
    }
}
