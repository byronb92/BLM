package skills.champs;
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
	 * Alistar Pulverize
	 * 1 second knockup, 0.5 second stun.
	 * AOESHOT, Range 325
	 */
	public void editSpellQ()
	{ 
		getSpellQ().setCastType(CastType.AOESHOT);
		getSpellQ().setDamageType(DamageType.AP);	
		Double qCost = (Double)getSpellQ().getCost()[super.getQLevel()];
		Double qCooldown = (Double)getSpellQ().getCooldowns()[super.getQLevel()];
	}

	@Override
	public void editSpellW() {
		
	}

	@Override
	public void editSpellE() {
		
	}

	@Override
	public void editSpellR() {
		
	}

	@Override
	public void editSpellPassive() {
		
	}

	@Override
	public String[] skillOrder() { return new String[]{"Q", "W", "W", "E", "W" ,"R"}; }
}
