package skills;

import java.util.ArrayList;

public class Skill {
	private String id;
	private String name;
	private String description;	// TODO: Add skill descriptions.
	private	String resource;	// HP, MANA, ENERGY
	private String castType;	// SELF, ALLY, ENEMY, AOESHOT, LINESHOT
	private String damageType;	// AD, AP, TRUE, HEAL, SHIELD, MOD
	
	private Object[] cost;			// TODO: spells --> cost[5];
	private Object[] cooldown;	// TOOD: spells --> cooldown[5]
	private Object[] effect;	
	
	private void setId(String id)					{ this.id = id; }
	private void setName(String name)				{ this.name = name; }
	private void setCosts(Object[] cost) 			{ this.cost = cost; }
	private void setCooldowns(Object[] cooldown) 	{ this.cooldown = cooldown; }
	private void setEffects(Object[] effects)		{ this.effect = effects; }
	
	public Skill() { }
	public Skill(String id, String name, Object[] cost, Object[] cooldown, Object[] effects)
	{
		setId(id);
		setName(name);
		setCosts(cost);
		setCooldowns(cooldown);
		setEffects(effects);
	}

}
