package champion;
import junit.framework.TestCase;

public class ChampionTest extends TestCase {

	Champion champOne;
	Champion champTwo;
	protected void setUp() throws Exception {
		super.setUp();
		champOne = new Champion("Alistar");
		champTwo = new Champion("Nautilus");
	}
	
	// Tests taken from Alistar.json
	public void testBaseStatInitialize()
	{
		assertEquals(1, champOne.getLevel());
		assertEquals(613.36, champOne.getHP(), 0);
		assertEquals(champOne.getAD(), 61.1116, 0);
		assertEquals(champOne.getArmor(), 24.38, 0);
		assertEquals(champOne.getMR(), 32.1, 0);
		//TODO: Test attack speed.
		
		// Level up tests.
		champOne.setLevel(2);
		assertEquals(champOne.getHP(), 719.36,0);
		assertEquals(champOne.getAD(), 64.7316, 0);
		assertEquals(champOne.getArmor(), 27.88, 0);
		assertEquals(champOne.getMR(), 33.35, 0);
		//TODO: Test attack speed.
		
	}

}
