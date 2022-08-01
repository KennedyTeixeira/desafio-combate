package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}	

	public int getArmor() {
		return armor;
	}	
	
	public void takeDamage(Champion other) {		
		if(armor > other.attack) {
			life--;
		}
		else {
			int damage = other.attack - armor;
			life = life - damage;
		}
				
	}
	
	public String toString() {
		if(life <= 0) {
			return name + ": " + "0" + " de vida" + " (morreu)";			
		}
		else {
			return name + ": " + life + " de vida";
		}
		
	}
	
}
