package net.runelite.client.plugins.AutoEquipPlugin;

import net.runelite.api.Client;

import javax.inject.Inject;
import java.util.List;
import java.util.Arrays;

public class AutoEquipPluginManager
{
    @Inject
    private Client client;

    public void equipItems(String[] itemNames)
    {
        // Aquí pondríamos la lógica real de buscar los ítems en inventario
        // y equiparlos automáticamente, ahora lo dejamos simulado:
        System.out.println("Intentando equipar: " + Arrays.toString(itemNames));
    }

    public void showMessage(String message)
    {
        // Aquí podrías usar ChatMessageManager para mostrar en chat
        System.out.println("[AutoEquip] " + message);
    }
}
