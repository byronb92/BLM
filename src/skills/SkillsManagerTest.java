package skills;

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
	
	public void testAlistarLevel2()
	{
		championManager.addChampion("Alistar", 2);
		Champion alistar = championManager.getChampion(0);		
		skillsManager.attachSkillsToChampion(alistar);
		
		assertNotNull(alistar.getChampionSkills());
		assertEquals(1, alistar.getChampionSkills().getQLevel());
		assertEquals(1, alistar.getChampionSkills().getWLevel());
		assertEquals(0, alistar.getChampionSkills().getELevel());
		assertEquals(0, alistar.getChampionSkills().getRLevel());
	}

}
