package skills;

import java.util.ArrayList;
import skills.SkillEnums.*;

public class Skill {
	private String id;
	private String name;
	private String description;		// TODO: Add skill descriptions.
	
	private Object[] cost;			
	private Object[] cooldown;	
	private Object[] effect;	
	
	private	Resource resource;	
	private CastType castType;	
	private DamageType damageType;	
	

	public Object[] getCost() 						{ return cost; }
	public Object[] getCooldowns()					{ return cooldown; }
	public Object[] getEffects()						{ return effect; }
	
	// Same for all champions.
	private void setId(String id)					{ this.id = id; }
	private void setName(String name)				{ this.name = name; }
	private void setCosts(Object[] cost) 			{ this.cost = cost; }
	private void setCooldowns(Object[] cooldown) 	{ this.cooldown = cooldown; }
	private void setEffects(Object[] effects)		{ this.effect = effects; }
	

	// Dependent on each champion.
	public void setResource(Resource resourse)		{ this.resource = resource; }
	public void setCastType(CastType castType)		{ this.castType = castType; }
	public void setDamageType(DamageType damageType){ this.damageType = damageType; }

	
	public Skill() { }
	public Skill(String id, String name, Object[] cost, Object[] cooldown, Object[] effects)
	{
		setId(id);
		setName(name);
		setCosts(cost);
		setCooldowns(cooldown);
		setEffects(effects);
		setResource(Resource.MANA);			// Set all skill resources to mana by default.
	}

}
