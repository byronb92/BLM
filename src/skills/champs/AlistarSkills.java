package skills.champs;
import java.util.HashMap;

import org.json.simple.JSONArray;

import skills.Skill;
import skills.SkillEnums.*;

public class AlistarSkills extends ChampionSkills
{
	public AlistarSkills(Skill[] currentSkills)
	{
		super(currentSkills);
	}
	

	@Override
	/**
	 * Pulverize, 365 Range, +0.50 AP Scaling
	 */
	public void spellQ()
	{ 
		int index = super.getQLevel() - 1; // Arrays are 0-based.
		HashMap<String,Long> qHash = new HashMap<String,Long>();
		if (index >= 0)
		{
			getSpellQ().setCastType(CastType.AOESHOT);
			getSpellQ().setDamageType(DamageType.AP);	
			Long qCost = (Long)getSpellQ().getCost()[index];
			Long qCooldown = (Long)getSpellQ().getCooldowns()[index];
			JSONArray qEffect = (JSONArray)getSpellQ().getEffects()[2];
			Long qDamage = (Long)qEffect.get(index);
			Long qScaling = (new Double(0.50)).longValue();
			qHash.put("Cost", qCost);
			qHash.put("Cooldown", qCooldown);
			qHash.put("DamageAP", qDamage);	
			qHash.put("ScalingAP",qScaling);
			super.skillOutput.put("Q", qHash);
		}
		
	}

	@Override
	/**
	 * Headbutt, 650 Range, +0.70 AP Scaling
	 */
	public void spellW()
	{
		int index = super.getWLevel() - 1; 
		HashMap<String,Long> wHash = new HashMap<String,Long>();
		if (index >= 0)
		{
			getSpellW().setCastType(CastType.ENEMY);
			getSpellW().setDamageType(DamageType.AP);	
			Long wCost = (Long)getSpellW().getCost()[index];
			Long wCooldown = (Long)getSpellW().getCooldowns()[index];
			JSONArray wEffect = (JSONArray)getSpellW().getEffects()[2]; 
			Long wDamage = (Long)wEffect.get(index);
			Long wScaling = (new Double(0.70)).longValue();
			
			wHash.put("Cost", wCost);
			wHash.put("Cooldown", wCooldown);
			wHash.put("DamageAP", wDamage);
			wHash.put("ScalingAP", wScaling);
			super.skillOutput.put("W", wHash);
		}
	}

	@Override
	/**
	 * Triumphant Roar, 575 Range, +0.20 AP Scaling
	 * Notes: 	E cooldown reduced by minions.
	 * 			Heal is half effective on targets other than Alistar.
	 */
	public void spellE()
	{
		int index = super.getELevel() - 1; 
		HashMap<String,Long> eHash = new HashMap<String,Long>();
		if (index >= 0)
		{
			getSpellE().setCastType(CastType.SELFANDALLY);
			getSpellE().setDamageType(DamageType.HEAL);	
			Long eCost = (Long)getSpellE().getCost()[index];
			Long eCooldown = (Long)getSpellE().getCooldowns()[index];
			JSONArray eEffect = (JSONArray)getSpellE().getEffects()[2]; 
			Long eHeal = (Long)eEffect.get(index);
			Long allyHeal = eHeal / 2;
			Long eScaling = (new Double(0.20)).longValue();
			
			eHash.put("Cost", eCost);
			eHash.put("Cooldown", eCooldown);
			eHash.put("ScalingAP", eScaling);
			eHash.put("HealSelf", eHeal);
			eHash.put("HealAlly", allyHeal);
			super.skillOutput.put("E", eHash);
		}
	}

	@Override
	public void spellR()
	{
		int index = super.getRLevel() - 1; 
		HashMap<String,Long> rHash = new HashMap<String,Long>();
		if (index >= 0)
		{
			getSpellR().setCastType(CastType.SELF);
			getSpellR().setDamageType(DamageType.MOD);	
			Long rCost = (Long)getSpellR().getCost()[index];
			Long rCooldown = (Long)getSpellR().getCooldowns()[index];
			
			//1 = Ult Duration, 3 = AD Boost
			JSONArray rUltDuration = (JSONArray)getSpellR().getEffects()[1];
			JSONArray rADBoost = (JSONArray)getSpellR().getEffects()[3];
			Long currentUltDuration = (Long)rUltDuration.get(index);
			Long currentADBoost = (Long)rADBoost.get(index);
			
			rHash.put("Cost", rCost);
			rHash.put("Cooldown", rCooldown);
			rHash.put("ModADBoost", currentADBoost);
			rHash.put("ModLength", currentUltDuration);
			super.skillOutput.put("R", rHash);
		}
	}

	@Override
	public void editSpellPassive() {
		
	}

	@Override
	public String[] skillOrder() { return new String[]{"Q", "W", "W", "E", "W" ,"R"}; }


}
