package skills.champs;
import java.util.HashMap;

import skills.Skill;


public abstract class ChampionSkills 
{
	Skill[] champSkills;
	protected HashMap<String, HashMap<String, Long>> skillOutput;
	protected int currentQLevel = 0;
	protected int currentWLevel = 0;
	protected int currentELevel = 0;
	protected int currentRLevel = 0;
	


	
	public ChampionSkills(Skill[] champSkills)
	{
		this.champSkills = champSkills;
		skillOutput = new HashMap<String,HashMap<String,Long>>();
	}
	
	public int getQLevel()	 { return currentQLevel; }
	public int getWLevel()	 { return currentWLevel; }
	public int getELevel()	 { return currentELevel; }
	public int getRLevel()	 { return currentRLevel; }
	
	public Skill getSpellQ() { return champSkills[0]; }
	public Skill getSpellW() { return champSkills[1]; }
	public Skill getSpellE() { return champSkills[2]; }
	public Skill getSpellR() { return champSkills[3]; }
	//TODO: Get passive spell.
	public HashMap<String, HashMap<String, Long>>  getSkillOutput()
	{
		return skillOutput;
	}
	
	
	public abstract String[] skillOrder();
	public abstract void spellQ();
	public abstract void spellW();
	public abstract void spellE();
	public abstract void spellR();
	public abstract void editSpellPassive();
	//public abstract void allSpells();
	
	// TODO: Ensure skill order has been initiated.
	public void updateSkilLevels(int currentLevel)
	{
		currentQLevel = 0;
		currentWLevel = 0;
		currentELevel = 0;
		currentRLevel = 0;
		for (int i = 0; i < currentLevel; i++)
		{
			if 		(skillOrder()[i].equals("Q")) 	{ currentQLevel++; }
			else if (skillOrder()[i].equals("W")) 	{ currentWLevel++; }
			else if (skillOrder()[i].equals("E")) 	{ currentELevel++; }
			else									{ currentRLevel++; }
		}
		spellQ();
		spellW();
		spellE();
		spellR();
	}

}
