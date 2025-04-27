package net.runelite.client.plugins.AutoEquipPlugin.utils;

import net.runelite.api.Client;

public class ClientInteractionUtils
{
    private static Client client;

    public static void setClient(Client clientInstance)
    {
        client = clientInstance;
    }

    public static void invokeMenuAction(String option, String target, int id, int opcode, int param0, int param1, int itemId)
    {
        if (client == null)
        {
            return;
        }

        client.invokeMenuAction(option, target, id, opcode, param0, param1, itemId);
    }
}
