package net.runelite.client.plugins.AutoEquipPlugin.utils;

import net.runelite.api.Client;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

public class KeyListenerUtils implements KeyListener
{
    private final AutoEquipUtils autoEquipUtils;
    private final List<String> items;
    private final int equipKeyCode;

    public KeyListenerUtils(Client client, List<String> items, int equipKeyCode)
    {
        this.autoEquipUtils = new AutoEquipUtils(client);
        this.items = items;
        this.equipKeyCode = equipKeyCode;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == equipKeyCode)
        {
            autoEquipUtils.equipItems(items);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
