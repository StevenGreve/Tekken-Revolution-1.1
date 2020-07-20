import java.util.ArrayList;
import java.util.Random;
import java.lang.Math; 

public class Character 
{
	private String _name;
	private int _hp;
	private final int _maxHP;
	private ArrayList<Attack> _attacks = new ArrayList<Attack>();
	private ArrayList<Boolean> _battleHistory = new ArrayList<Boolean>();
	private Random _randomGenerator = new Random();

	Character(String name, int hp, ArrayList<Attack> attacks)
	{
		this._name = name;
		this._hp = hp;
		this._maxHP = hp;
		this._attacks = attacks;
	}
	
	public String getName() 
	{
		return _name;
	}

	public int getHP() 
	{
		return this._hp;
	}

	public void setHP(int hp) 
	{
		this._hp = hp;
	}
	
	public void addHP(int bonus)
	{
		if (this._hp + bonus <= this._maxHP)
			this._hp += bonus;
	}
	
	public void restoreHP()
	{
		this._hp = this._maxHP;
	}
	
	public void inflictDamage(int damage)
	{
		this._hp -= Math.abs(damage);
	}
	
	public Attack getRandomAttack()
	{
	    return this.getAttacks().get(_randomGenerator.nextInt(this.getAttacks().size()));
	}
	
	public ArrayList<Attack> getAttacks() 
	{
		return this._attacks;
	}
	
	public ArrayList<Boolean> getBattleHistory()
	{
		return this._battleHistory;
	}
	
	public void updateBattleHistory(Boolean result)
	{
		this._battleHistory.add(result);
	}
	
	public int getBattleCount()
	{
		return this._battleHistory.size();
	}
	
	// NOTE: Returns false even if getBattleCount() is 0.
	public Boolean wonLastBattle()
	{
		return this._battleHistory.isEmpty() ? false : this._battleHistory.get(this.getBattleCount() - 1);
	}
}
