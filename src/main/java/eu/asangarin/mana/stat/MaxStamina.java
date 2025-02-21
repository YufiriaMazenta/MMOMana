package eu.asangarin.mana.stat;

import net.Indyuce.mmoitems.stat.type.DoubleStat;
import org.bukkit.Material;

public class MaxStamina extends DoubleStat {
	public MaxStamina() {
		super("MAX_STAMINA", Material.LIGHT_BLUE_DYE, "Max Stamina", new String[]{"Adds stamina to your max stamina bar."});
	}
}
