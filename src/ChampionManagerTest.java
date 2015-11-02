import junit.framework.TestCase;

public class ChampionManagerTest extends TestCase {

	private ChampionManager championManager;
	protected void setUp() throws Exception {
		super.setUp();
		championManager = new ChampionManager();
	}

	public void testMeleeAdditions()
	{
		championManager.addAllMeleeSupports();
		// 14 melee champions added by the champion manager.
		// If all champions were properly initalized, there should be 14 objects in the list.
		assertEquals(14, championManager.getChampions().size());
	}
	
	public void testSortHP()
	{
		System.out.println("HP");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.sortHealth(championManager.getChampions());
		System.out.println("--------------------------");
	}
	
	public void testSortAD()
	{
		System.out.println("Attack Damage");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.sortAD(championManager.getChampions());
		System.out.println("--------------------------");
	}
	
	public void testSortArmor()
	{
		
		System.out.println("Armor");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.sortArmor(championManager.getChampions());
		System.out.println("--------------------------");
	}
}
