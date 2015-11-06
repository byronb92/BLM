import junit.framework.TestCase;

public class CompareChampionTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	
	public void testMaokaiVsBraum()
	{
		Champion Maokai = new Champion("Maokai");
		Champion Braum = new Champion("Braum");
		CompareChampion comparison = new CompareChampion(Maokai, Braum);
		comparison.compareAll();
	}
	
	public void testLeonaVsAlistar()
	{
		
		System.out.println("Leona vs Alistar");
		Champion champ1 = new Champion("Leona");
		Champion champ2 = new Champion("Alistar");
		champ1.setLevel(2);
		champ2.setLevel(2);
		CompareChampion comparison = new CompareChampion(champ1, champ2);
		comparison.compareAll();
		System.out.println("---------------");
	}
}
