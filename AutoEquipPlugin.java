package net.runelite.client.plugins.AutoEquipPlugin;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.input.KeyListener;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.AutoEquipPlugin.utils.KeyListenerUtils;

import javax.inject.Inject;
import java.awt.event.KeyEvent;

@Slf4j
@PluginDescriptor(
        name = "Auto Equip",
        description = "Equipa ítems automáticamente con teclas rápidas",
        tags = {"auto", "equip", "gear", "pvp"}
)
public class AutoEquipPlugin extends Plugin implements KeyListener
{
    @Inject
    private Client client;

    @Inject
    private AutoEquipPluginManager manager;

    @Override
    protected void startUp() throws Exception
    {
        log.info("Auto Equip plugin iniciado ✅");
    }

    @Override
    protected void shutDown() throws Exception
    {
        log.info("Auto Equip plugin detenido ❌");
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        KeyListenerUtils.handleKeyPressed(e, client, manager);
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        // No usamos por ahora
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
        // No usamos por ahora
    }
}
