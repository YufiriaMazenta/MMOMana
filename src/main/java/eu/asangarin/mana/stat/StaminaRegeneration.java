package eu.asangarin.mana.stat;

import net.Indyuce.mmoitems.stat.type.DoubleStat;
import org.bukkit.Material;

public class StaminaRegeneration extends DoubleStat {
	public StaminaRegeneration() {
		super("STAMINA_REGENERATION", Material.LIGHT_BLUE_DYE, "Stamina Regeneration", new String[]{"Increases stamina regen."});
	}
}
