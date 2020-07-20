import java.util.ArrayList;
import java.util.Map;
import java.awt.event.KeyEvent;
import javax.swing.JProgressBar;

public class Controller 
{
	ArrayList<Attack> jinKazamaAttacks = new ArrayList<Attack>();
	ArrayList<Attack> azazelAttacks = new ArrayList<Attack>();
	ArrayList<Attack> bryanFuryAttacks = new ArrayList<Attack>();
	ArrayList<Attack> kazuyaMishimaAttacks = new ArrayList<Attack>();
	ArrayList<Attack> heihachiMishimaAttacks = new ArrayList<Attack>();
	ArrayList<Attack> devilJinAttacks = new ArrayList<Attack>();
	ArrayList<Attack> ogreAttacks = new ArrayList<Attack>();
	ArrayList<Attack> armorKingAttacks = new ArrayList<Attack>();
	ArrayList<Attack> liliAttacks = new ArrayList<Attack>();
	
	Character jinKazama = new Character("Jin Kazama", 170, jinKazamaAttacks);
	Character azazel = new Character("Azazel", 300, azazelAttacks);
	Character bryanFury = new Character("Bryan Fury", 185, bryanFuryAttacks);
	Character heihachiMishima = new Character("Heihachi Mishima", 225, heihachiMishimaAttacks);
	Character kazuyaMishima = new Character("Kazuya Mishima", 175, kazuyaMishimaAttacks);
	Character devilJin = new Character("Devil Jin", 200, devilJinAttacks);
	Character ogre = new Character("Ogre", 400, ogreAttacks);
	Character armorKing = new Character("Armor King", 250, armorKingAttacks);
	Character lili = new Character("Emelie de Rochefort", 150, liliAttacks);
	
	public Sound sound = new Sound();
	
	//KeyHandler variables
	int healthCounter, lowRoundhouseCounter, meter, meterLimit, jinRageLimit, devilJinRageLimit, liliRageLimit, roundCount, jinAttackCounter, 
	spinnningDemonCounter, abolishingFistCounter, wraithKickCounter, edelweissCounter, thornWhipCounter, meterCounter;
	int hiddenBonus = 60;
	
	//Results
	int azazelWins, jinWins, bryanWins, heihachiMishimaWins, kazuyaMishimaWins, devilJinWins, ogreWins, liliWins, armorKingWins;
	final int MAXIMUM_GAMES = 3;
	
	public static final Map<Integer, Integer> keyEventTriggers = Map.of(
		KeyEvent.VK_E, 1,
		KeyEvent.VK_W, 2,
		KeyEvent.VK_R, 3,
		KeyEvent.VK_G, 4,
		KeyEvent.VK_J, 7
	);
	
	public void characterAttackSetup() 
    {
    	jinKazamaAttacks.add(new Attack("Electric Wind Hook Fist", 30, AttackType.MID));
    	jinKazamaAttacks.add(new Attack("High Right Roundhouse", 15, AttackType.HIGH));
    	jinKazamaAttacks.add(new Attack("High Low Roundhouse", 24, AttackType.LOW));
    	jinKazamaAttacks.add(new Attack("Left Axe Kick", 22, AttackType.HIGH));
    	jinKazamaAttacks.add(new Attack("Switch Blade", 55, AttackType.MID));
    	jinKazamaAttacks.add(new Attack("Thrusting Uppercut", 100, AttackType.MID));
    	jinKazamaAttacks.add(new Attack("Jin Kazama Rage Art", 150, AttackType.HIGH));
    	jinKazamaAttacks.add(new Attack("Confusion", 15, AttackType.LOW));
    	
    	kazuyaMishimaAttacks.add(new Attack("EWGF Kazuya", 23, AttackType.MID));
		kazuyaMishimaAttacks.add(new Attack("Abolishing Fist", 22, AttackType.HIGH));
		kazuyaMishimaAttacks.add(new Attack("Spinning Demon to Left Hook", 33, AttackType.LOW));
		kazuyaMishimaAttacks.add(new Attack("Tsunami Kicks", 55, AttackType.HIGH));
		kazuyaMishimaAttacks.add(new Attack("Twin Pistons", 90, AttackType.MID));
		kazuyaMishimaAttacks.add(new Attack("Dragon Uppercut", 75, AttackType.MID));
		
		devilJinAttacks.add(new Attack("Wraith Kick", 21, AttackType.MID));
		devilJinAttacks.add(new Attack("Hellfire Cannon", 32, AttackType.HIGH));
		devilJinAttacks.add(new Attack("Hellsweep", 45, AttackType.LOW));
		devilJinAttacks.add(new Attack("Obliteration", 50, AttackType.HIGH));
		devilJinAttacks.add(new Attack("Devil Jin Rage Art", 200, AttackType.MID));
		devilJinAttacks.add(new Attack("Invincible Move", 250, AttackType.HIGH));
		devilJinAttacks.add(new Attack("EWGF Devil Jin", 35, AttackType.MID));
		devilJinAttacks.add(new Attack("Nightmare", 20, AttackType.MID));
		
		ogreAttacks.add(new Attack("Cyclone Kick", 32, AttackType.HIGH));
		ogreAttacks.add(new Attack("Ancient Hurricance", 40, AttackType.MID));
		ogreAttacks.add(new Attack("Dragon Power Punch", 64, AttackType.HIGH));
		ogreAttacks.add(new Attack("Aztek Ritual", 28, AttackType.LOW));
    	
		azazelAttacks.add(new Attack("Judgment", 50, AttackType.HIGH));
		azazelAttacks.add(new Attack("Exodus", 35, AttackType.MID));
		azazelAttacks.add(new Attack("Templar", 23, AttackType.LOW));
		azazelAttacks.add(new Attack ("Stunning Claw", 18, AttackType.LOW));
		
		bryanFuryAttacks.add(new Attack("Hatchet Kick", 55, AttackType.LOW));
		bryanFuryAttacks.add(new Attack("Slash Kick", 35, AttackType.HIGH));
		bryanFuryAttacks.add(new Attack("Mach Kick", 30, AttackType.HIGH));
		bryanFuryAttacks.add(new Attack("Jet Uppercut", 25, AttackType.HIGH));
		
		heihachiMishimaAttacks.add(new Attack("Right Splits Kick", 25, AttackType.HIGH));
		heihachiMishimaAttacks.add(new Attack("Eishomon", 35, AttackType.LOW));
		heihachiMishimaAttacks.add(new Attack("Demon Uppercut", 45, AttackType.MID));
		heihachiMishimaAttacks.add(new Attack("EWGF Heihachi", 23, AttackType.MID));
		
		liliAttacks.add(new Attack("Matterhorn Ascension", 25, AttackType.MID));
		liliAttacks.add(new Attack("Edelweiss", 20, AttackType.LOW));
		liliAttacks.add(new Attack("Peacock Waltz", 32, AttackType.MID));
		liliAttacks.add(new Attack("Submissive Heal", 23, AttackType.HIGH));
		liliAttacks.add(new Attack("Thorn Whip", 13, AttackType.LOW));
		liliAttacks.add(new Attack("Lili Rage Art", 55, AttackType.MID));
		liliAttacks.add(new Attack("Au contraire", 10, AttackType.MID));
		
		armorKingAttacks.add(new Attack("Armor King Rage Art", 55, AttackType.MID));
		armorKingAttacks.add(new Attack("Minced Liver", 12, AttackType.MID));
		armorKingAttacks.add(new Attack("Dark Cyclone", 30, AttackType.HIGH));
		armorKingAttacks.add(new Attack("Dark Knee Lift", 17, AttackType.MID));
		armorKingAttacks.add(new Attack("Stomp", 12, AttackType.LOW));
    }
	
	public int performRandomAttack(Character player, Character enemy)
	{
		Attack enemyAttack = enemy.getRandomAttack();
		player.inflictDamage(enemyAttack.getDamage());
		sound.setURL(enemyAttack.getSoundFile());
		sound.play();		
		return player.getHP();
	}
	
	public void triggerAttackAction(int key, Character player, Character enemy, JProgressBar enemyHealthbar)
	{
		if (keyEventTriggers.values().size() > player.getAttacks().size())
		{
			throw new IndexOutOfBoundsException("KeyEvent map don't map list of Attacks in length.");
		}
		else
		{
			Attack playerAttack = player.getAttacks().get(keyEventTriggers.get(key) - 1);
			enemy.inflictDamage(playerAttack.getDamage());
			sound.setURL(playerAttack.getSoundFile());
			sound.play();
			enemyHealthbar.setValue(enemy.getHP());
		}
	}
}