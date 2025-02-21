package eu.asangarin.mana.stat;

import net.Indyuce.mmoitems.stat.type.DoubleStat;
import org.bukkit.Material;

public class ManaRegeneration extends DoubleStat {
	public ManaRegeneration() {
		super("MANA_REGENERATION", Material.LAPIS_LAZULI, "Mana Regeneration", new String[]{"Increases mana regen."});
	}
}
