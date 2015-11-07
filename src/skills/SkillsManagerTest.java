package skills;

import java.util.HashMap;

import champion.Champion;
import champion.ChampionManager;
import junit.framework.TestCase;

public class SkillsManagerTest extends TestCase {
	
	private ChampionManager championManager;
	private SkillsManager skillsManager;

	protected void setUp() throws Exception {
		super.setUp();
		
		championManager = new ChampionManager();
		skillsManager = new SkillsManager();
		
	}
	
	public void testAlistarLevelUp()
	{
		championManager.addChampion("Alistar", 2);
		Champion alistar = championManager.getChampion(0);		
		skillsManager.attachSkillsToChampion(alistar);
		
		// Alistar test level up: "Q", "W", "W", "E", "W" ,"R"
		assertNotNull(alistar.getChampionSkills());
		assertEquals(1, alistar.getChampionSkills().getQLevel());
		assertEquals(1, alistar.getChampionSkills().getWLevel());
		assertEquals(0, alistar.getChampionSkills().getELevel());
		assertEquals(0, alistar.getChampionSkills().getRLevel());
		
		// Test if skills change when level changes.
		alistar.setLevel(6);
		assertEquals(1, alistar.getChampionSkills().getQLevel());
		assertEquals(3, alistar.getChampionSkills().getWLevel());
		assertEquals(1, alistar.getChampionSkills().getELevel());
		assertEquals(1, alistar.getChampionSkills().getRLevel());
	}
	
	public void testAlistarSkills()
	{
		championManager.addChampion("Alistar", 1);
		Champion alistar = championManager.getChampion(0);		
		skillsManager.attachSkillsToChampion(alistar);
		
		// Test Q
		alistar.getChampionSkills().spellQ();
		Long cost65 = 65L;
		assertEquals(cost65, (alistar.getChampionSkills().getSkillOutput()
				.get("Q")).get("Cost"));
		
		// Test Q-W
		alistar.setLevel(2);
		// TODO: When level changes, update by calling all spells.
		//alistar.getChampionSkills().spellQ();
		//alistar.getChampionSkills().spellW();
		
		// Test E and Level 2 W
		alistar.setLevel(4);
		//alistar.getChampionSkills().spellE();
		//alistar.getChampionSkills().spellW();
		Long cost70 = 70L;
		assertEquals(cost70, (alistar.getChampionSkills().getSkillOutput()
				.get("W")).get("Cost"));
		
		// Test R
		alistar.setLevel(6);
		alistar.getChampionSkills().spellR();
		
	}

}
