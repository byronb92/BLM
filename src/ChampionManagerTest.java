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
		System.out.println("HP Level 1");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.sortHealth(championManager.getChampions());
		System.out.println("--------------------------");
	}
	
	public void testSortHPLevel2()
	{
		System.out.println("HP Level 2");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.normalizeLevels(championManager.getChampions(), 2);
		championSorter.sortHealth(championManager.getChampions());
		System.out.println("--------------------------");
	}
	
	public void testSortHPLevel3()
	{
		System.out.println("HP Level 3");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.normalizeLevels(championManager.getChampions(), 3);
		championSorter.sortHealth(championManager.getChampions());
		System.out.println("--------------------------");
	}
	
	public void testSortHPLevel4()
	{
		System.out.println("HP Level 4");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.normalizeLevels(championManager.getChampions(), 4);
		championSorter.sortHealth(championManager.getChampions());
		System.out.println("--------------------------");
	}
	
	public void testSortHPLevel5()
	{
		System.out.println("HP Level 5");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.normalizeLevels(championManager.getChampions(), 5);
		championSorter.sortHealth(championManager.getChampions());
		System.out.println("--------------------------");
	}
	
	public void testSortHPLevel6()
	{
		System.out.println("HP Level 6");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.normalizeLevels(championManager.getChampions(), 6);
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
	
	public void testSortAS()
	{
		
		System.out.println("Attack Speed Level 2");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.normalizeLevels(championManager.getChampions(), 6);
		championSorter.sortAS(championManager.getChampions());
		System.out.println("--------------------------");
	}
	
	public void testSortMR()
	{
		
		System.out.println("Magic Resistance");
		championManager.addAllMeleeSupports();
		SortChampions championSorter = new SortChampions();
		championSorter.sortMR(championManager.getChampions());
		System.out.println("--------------------------");
	}
}
