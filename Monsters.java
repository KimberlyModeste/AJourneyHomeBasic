package edu.cuny.csi.csc330.project;

import java.util.Random;

public class Monsters {
	private String type;
	private Player mUser = Player.getInstance();
	private int health;
	private int attack;
	private int defense;
	private int speed;
	private int xp;
	private int magic = 1;
	private double worth;
	private boolean deathStaus = false;
	private boolean metal = false;
	private boolean hasMagic = false;
	private String magictype = "Fire";

	//Monsters(){}
	Monsters(String type)
	{
		Random rand = new Random();
		int coin;
		//Not sure how to implement magic right now
		if(type == "Dark Knight")
		{	
			this.type = "Dark Knight";
			magictype = "Poison";
			defense = 20;
			health = 180;
			attack = 9; 
			magic = 35;
			xp = 18000;
			speed = 30;
			worth = 40000;
			metal = true;
			
		}

		else if(type == "Dragon")
		{	
			
			coin = rand.nextInt(10);

			switch (coin){
				case 0:
				this.type = "Adult Black Dragon";
				magictype = "Acid";
				defense = 19;
				health = 195;
				attack = 13;	//13, 15, 17; 13+rand(3)+2 
				magic = 54;
				xp = 11500;
				break;

				case 1:
				this.type = "Adult Blue Dragon";
				magictype = "Lightning";
				defense = 19;
				health = 225;
				attack = 14;	
				magic = 66;
				xp = 15000;
				break;

				case 2:
				this.type = "Adult Brass Dragon";
				magictype = "Fire";
				defense = 18;
				health = 175;
				attack = 13;	
				magic = 45;
				xp = 10000;
				break;

				case 3:
				this.type = "Adult Bronze Dragon";
				magictype = "Lightning";
				defense = 19;
				health = 212;
				attack = 14;	
				magic = 66;
				xp = 13000;
				break;

				case 4:
				this.type = "Adult Copper Dragon";
				magictype = "Acid";
				defense = 18;
				health = 184;
				attack = 13;	
				magic = 54;
				xp = 11500;
				break;

				case 5:
				this.type = "Adult Gold Dragon";
				magictype = "Fire";
				defense = 19;
				health = 256;
				attack = 15;	
				magic = 66;
				xp = 18000;
				break;
				
				case 6:
				this.type = "Adult Green Dragon";
				magictype = "Poison";
				defense = 19;
				health = 207;
				attack = 13;	
				magic = 56;
				xp = 13000;
				break;

				case 7:
				this.type = "Adult Red Dragon";
				magictype = "Fire";
				defense = 19;
				health = 256;
				attack = 15;	
				magic = 63;
				xp = 18000;
				break;

				case 8:
				this.type = "Adult Silver Dragon";
				magictype = "Cold";
				defense = 19;
				health = 253;
				attack = 15;	
				magic = 58;
				xp = 15000;
				break;

				case 9:
				this.type = "Adult White Dragon";
				magictype = "Cold";
				defense = 18;
				health = 200;
				attack = 13;	
				magic = 54;
				xp = 10000;
				break;

			}

			speed = 40;
			worth = 40000;
			metal = true;
		}

		else if (type == "Goblin")
		{
			this.type = "Goblin";
			defense = 15;
			health = 7;
			attack = 5; 
			xp = 50;
			speed = 30;
			worth = 575;
		}
		
		else if(type == "Hydra")
		{	
			this.type = "Hydra";
			defense = 15;
			health = 172;
			attack = 10; 
			xp = 3900;
			speed = 30;
			worth = 18000;
		}
			
		else if(type == "Incubus")
		{	
			this.type = "Incubus";
			defense = 17;
			health = 68;
			attack = 5; 
			magic = 32;
			xp = 1100;
			speed = 30;
			worth = 9200;
			
		}
		
		//We need to fix this one later to mimic the player
		else if(type == "Mimic")
		{	
			this.type = "Mimic";
			
			health = mUser.getBaseHealth();
			attack =  mUser.getBaseAttack();
			defense = mUser.getBaseDefense();
			magic = mUser.getMagic();
			speed = mUser.getBaseSpeed();
			worth = 4600;
			
		}

		else  if(type == "Ork")
		{	
			
			this.type = "Ork";
			defense = 13;
			health = 15;
			attack = 9; 
			xp = 100;
			speed = 30;
			worth = 1150;	
		}

		else if(type == "Rock Titan")
		{	
			this.type = "Stone Giant";
			
			defense = 17;
			health = 126;
			attack = 19;
			xp = 2900;
			speed = 40;
			worth = 16100;
			metal = true;
		}
		
		else if(type == "Skeleton")
		{	
			this.type = "Skeleton";
			
			defense = 13;
			health = 13;
			attack = 5; 
			xp = 50;
			speed = 30;
			worth = 575;
			
		}
		
		else if(type == "Succubus")
		{	
			this.type = "Succubus";
			defense = 15;
			health = 66;
			attack = 5; 
			magic = 32;
			xp = 1100;
			speed = 30;
			worth = 9200;
			
		}
		
		else 
		{
			this.type = "Banana";
			
			health = 1;
			attack = 0;
			defense = 0;
			worth = 20; 
			
		}
		
	}
	
	public String getType() {
		return type;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public boolean isDeathStaus() {
		return deathStaus;
	}
	public void setDeathStaus(boolean deathStaus) {
		this.deathStaus = deathStaus;
	}
	
	public boolean isMetal() {
		return metal;
	}
	
	void displayMonsterStats()
	{
		System.out.println(type +"\t"+ health +" HP");
	}

	public double getWorth() {
		return worth;
	}
	
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}

	public boolean isHasMagic() {
		return this.hasMagic;
	}

	public boolean getHasMagic() {
		return this.hasMagic;
	}

	public void setHasMagic(boolean hasMagic) {
		this.hasMagic = hasMagic;
	}

	public String getMagictype() {
		return this.magictype;
	}

	public void setMagictype(String magictype) {
		this.magictype = magictype;
	}
}
