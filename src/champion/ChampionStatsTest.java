package champion;
import junit.framework.TestCase;
import org.json.simple.JSONObject;

public class ChampionStatsTest extends TestCase {

	JSONObject championStats;
	protected void setUp() throws Exception {
		super.setUp();
		ChampionStats dataparser = new ChampionStats();
		championStats = dataparser.getChampionStats("Alistar");
	}
	

			
	// Test stat retrieval with Alistar example. (Patch 5.18)
	/**
	 *      "hp":613.36,
            "hpperlevel":106.0,
            "mp":278.84,
            "mpperlevel":38.0,
            "movespeed":330.0,
            "armor":24.38,
            "armorperlevel":3.5,
            "spellblock":32.1,
            "spellblockperlevel":1.25,
            "attackrange":125.0,
            "hpregen":8.675,
            "hpregenperlevel":0.85,
            "mpregen":6.0,
            "mpregenperlevel":0.8,
            "crit":0.0,
            "critperlevel":0.0,
            "attackdamage":61.1116,
            "attackdamageperlevel":3.62,
            "attackspeedoffset":0.0,
            "attackspeedperlevel":2.125
	 */
	public void testHP()
	{
		Double alistarHP = (Double)championStats.get("hp");
		assertEquals(alistarHP.doubleValue(), 613.36, 0);
	}
	
	
			


}
