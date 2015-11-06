package skills;


/**
 * Class used to be able to sort different abilities
 * based on the types of crowd control.
 * 
 * Additional information about crowd control can be found here:
 * http://leagueoflegends.wikia.com/wiki/Airborne#Airborne
 * @author byronb92
 *
 */
public class SkillCC extends Skill 
{
	
	/**
	 * Slow, SlowStrength, SlowLength
	 * Knockup
	 * Stun
	 */
	
	
	// Knockups have two portions, a move block and a stun portion.
	// The stun portion's time can be reduced by tenacity.
	// TODO: Use tenacity numbers to adjust knockup stun duration.
	public enum CCType {
		SLOW, STUN, ROOT,
		KNOCKUP, KNOCKBACK, KNOCKASIDE, KNOCKDOWN, PULL,
		TAUNT, CHARM, POLYMORPH,
		SILENCE, FLEE, STATIS, SUSPENSION, SUPPRESSION
	}
	
	
	CCType controlType;				// Enumerated CCType.
	double controlLength;			// length of crowd control.
	

	
	
	

}
