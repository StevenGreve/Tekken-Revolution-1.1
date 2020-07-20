import java.net.URL;

enum AttackType
{
	LOW,
	MID,
	HIGH;
}

public class Attack
{
	private String _name;
	private int _damage;
	private AttackType _type;
	private URL _soundFileURL;
	
	public AttackType getAttackType()
	{
		return this._type;
	}	
	
	public void setName(String newName)
	{
		this._name = newName;
	}
	
	public String getName()
	{
		return this._name;
	}
	
	public void setDamage(int newDamage)
	{
		this._damage = newDamage;
	}
	
	public int getDamage()
	{
		return this._damage;
	}
	
	public URL getSoundFile()
	{
		return this._soundFileURL;
	}
	
	Attack(String name, int damage, AttackType type)
	{
		this._name = name;
		this._damage = damage;
		this._type = type;
		this._soundFileURL = getClass().getResource(String.format("%s.wav", name));
	}
}
	










