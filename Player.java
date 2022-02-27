package edu.cuny.csi.csc330.project;

import java.util.Random;
import java.util.ArrayList;

public class Player {
	//Strength and Dexterity = Attack
	//Constitution and Intellegence  = Defense
	//Wisdom and Charisma = Health
	private static Player singlePlayer = null;
	private String playerName;
	private int baseHealth = 3;
	private int baseAttack = 1;
	private int baseDefense = 1;
	private int baseSpeed = 1;
	private int currentHealth = 3;
	private int currentAttack = 0;
	private int currentDefense = 1;
	private int currentSpeed = 1;
	private int magic = 1 ;
	private double currency = 0;
	//private ArrayList
	private String [] medals = new String [3];
	private int medalCounter = 0;
	private String race = "Human";
	private String myClass = "Monk";
	private boolean hasDarkvision = false;
	private boolean hasMagic = false;
	private ArrayList<String> proWeapons = new ArrayList<String>();
	private int level = 1;
	private int exp = 0;

	//All races and classes
	private String [] races = {"Dwarf", "Elf", "Halfling", "Human", "Dragonborn", "Gnome", "Half-Elf", "Half-Orc", "Tiefling"};
	private String [] classes = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", 
								"Warlock", "Wizard"};

	private Player()
	{
		setPlayerName("You");
		Random rand = new Random();	
		
		setRace(races[rand.nextInt(races.length)]);
		setPlayerStats();
	}

	private Player(String name)
	{
		Random rand = new Random();
		
		setRace(races[rand.nextInt(races.length)]);
		setPlayerName(name);
		setPlayerStats();
	}
	
	public void setPlayerStats()
	{
		Random rand = new Random();
		int coin;
		setMyClass(classes[rand.nextInt(classes.length)]);

		/*
			Adding to Pro Weapons
			setBaseHealth(8);
			addProWeapons("LightArmor");
			addProWeapons("MediumArmor");
			addProWeapons("HeavyArmor");	
			addProWeapons("Shield");
			addProWeapons("Club");
			addProWeapons("Dagger");
			addProWeapons("Dart");
			addProWeapons("Javelin");
			addProWeapons("QuarterStaff");
			addProWeapons("Scimitar");
			addProWeapons("Sickle");
			addProWeapons("Sling");
			addProWeapons("Spear");
			addProWeapons("Simple");
			addProWeapons("HandCrossbow");
			addProWeapons("LightCrossbow");
			addProWeapons("Longsword");
			addProWeapons("Rapier");
			addProWeapons("Shortsword");
			addProWeapons("Martial");

		*/
		
		switch(myClass){
			case "Barbarian":
			setBaseHealth(12);
			addProWeapons("LightArmor");
			addProWeapons("MediumArmor");
			addProWeapons("Shield");
			addProWeapons("Simple");
			addProWeapons("Martial");
			setCurrency(80);

			break;

			case "Bard":
			setBaseHealth(8);
			addProWeapons("LightArmor");
			addProWeapons("Simple");
			addProWeapons("HandCrossbow");
			addProWeapons("Longsword");
			addProWeapons("Rapier");
			addProWeapons("Shortsword");
			setHasMagic(true);			
			setCurrency(200);

			break;

			case "Cleric":
			setBaseHealth(8);
			addProWeapons("LightArmor");
			addProWeapons("MediumArmor");
			addProWeapons("Shield");
			addProWeapons("Simple");
			setCurrency(200);
			setHasMagic(true);
			break;

			case "Druid":
			setBaseHealth(8);
			addProWeapons("LightArmor");
			addProWeapons("MediumArmor");
			addProWeapons("Shield");
			addProWeapons("Club");
			addProWeapons("Dagger");
			addProWeapons("Dart");
			addProWeapons("Javelin");
			addProWeapons("QuarterStaff");
			addProWeapons("Scimitar");
			addProWeapons("Sickle");
			addProWeapons("Sling");
			addProWeapons("Spear");
			setHasMagic(true);
			setCurrency(80);

			break;

			case "Fighter":
			setBaseHealth(10);
			addProWeapons("LightArmor");
			addProWeapons("MediumArmor");	
			addProWeapons("HeavyArmor");	
			addProWeapons("Shield");
			addProWeapons("Simple");
			addProWeapons("Martial");
			setCurrency(200);

			break;

			case "Monk":
			setBaseHealth(8);
			addProWeapons("Simple");
			addProWeapons("Shortsword");
			setCurrency(20);
			break;

			case "Paladin":
			setBaseHealth(10);
			addProWeapons("LightArmor");
			addProWeapons("MediumArmor");
			addProWeapons("HeavyArmor");	
			addProWeapons("Shield");
			addProWeapons("Simple");
			addProWeapons("Martial");
			setHasMagic(true);
			setCurrency(200);
			
			break;

			case "Ranger":
			setBaseHealth(10);
			addProWeapons("LightArmor");
			addProWeapons("MediumArmor");	
			addProWeapons("Shield");
			addProWeapons("Simple");
			addProWeapons("Martial");
			setHasMagic(true);
			setCurrency(200);
			break;

			case "Rogue":
			setBaseHealth(8);
			addProWeapons("LightArmor");
			addProWeapons("Simple");
			addProWeapons("HandCrossbow");
			addProWeapons("Longsword");
			addProWeapons("Rapier");
			addProWeapons("Shortsword");
			setCurrency(160);
			break;

			case "Sorcerer":
			setBaseHealth(6);
			addProWeapons("Dagger");
			addProWeapons("Dart");
			addProWeapons("Sling");
			addProWeapons("QuarterStaff");
			addProWeapons("LightCrossbow");
			setHasMagic(true);
			setCurrency(120);
			break;

			case "Warlock":
			setBaseHealth(8);
			addProWeapons("LightArmor");
			addProWeapons("Simple");
			setHasMagic(true);
			setCurrency(160);
			break;

			case "Wizard":
			setBaseHealth(6);
			addProWeapons("Dagger");
			addProWeapons("Dart");
			addProWeapons("Sling");
			addProWeapons("QuarterStaff");
			addProWeapons("LightCrossbow");
			setCurrency(160);
			setHasMagic(true);
			break;

			default:
			break;
		}		
		
		switch(race){
			case "Dwarf":
			setBaseDefense(getBaseDefense()+2);
			setBaseSpeed(25);
			setHasDarkvision(true);
			if(!proWeapons.contains("BattleAxe"))
			addProWeapons("BattleAxe");
			if(!proWeapons.contains("HandAxe"))
			addProWeapons("HandAxe");
			if(!proWeapons.contains("LightHammer"))
			addProWeapons("LightHammer");
			if(!proWeapons.contains("WarHammer"))
			addProWeapons("WarHammer");
			coin = rand.nextInt(2);

			if(coin == 0)
			{
				setBaseHealth(getBaseHealth()+2);
			}
			else 
			{
				if(!proWeapons.contains("LightArmor"))
				addProWeapons("LightArmor");
				if(!proWeapons.contains("MediumArmor"))
				addProWeapons("MediumArmor");
				setBaseAttack(getBaseAttack()+2);
			}
			break;

			case "Elf":
			setBaseAttack(getBaseAttack()+2);
			setBaseSpeed(30);
			setHasDarkvision(true);
			setHasMagic(true);

			coin = rand.nextInt(3);
			if(coin == 0)
			{
				setBaseDefense(getBaseDefense()+1);
				if(!proWeapons.contains("Longsword"))
				addProWeapons("Longsword");
				if(!proWeapons.contains("Shortsword"))
				addProWeapons("Shortsword");
				if(!proWeapons.contains("Shortbow"))
				addProWeapons("Shortbow");
				if(!proWeapons.contains("Longbow"))
				addProWeapons("Longbow");
			}

			else if(coin == 1)
			{
				setBaseHealth(getBaseHealth()+1);
				if(!proWeapons.contains("Longsword"))
				addProWeapons("Longsword");
				if(!proWeapons.contains("Shortsword"))
				addProWeapons("Shortsword");
				if(!proWeapons.contains("Shortbow"))
				addProWeapons("Shortbow");
				if(!proWeapons.contains("Longbow"))
				addProWeapons("Longbow");
				setBaseSpeed(35);
			}

			else
			{
				setBaseHealth(getBaseHealth()+1);
				if(!proWeapons.contains("Shortsword"))
				addProWeapons("Shortsword");
				if(!proWeapons.contains("Crossbow"))
				addProWeapons("Crossbow");
				if(!proWeapons.contains("Rapier"))
				addProWeapons("Rapier");
			}
			break;

			
			case "Halfling":
			setBaseAttack(getBaseAttack()+2);
			setBaseSpeed(25);
			coin = rand.nextInt(2);
			if(coin == 0)
			{
				setBaseHealth(getBaseHealth()+1);
			}
			else
			{
				setBaseDefense(getBaseDefense()+1);
			}
			break;
			
			case "Human":
			setBaseAttack(getBaseAttack()+2);
			setBaseDefense(getBaseDefense()+2);
			setBaseHealth(getBaseHealth()+2);
			setBaseSpeed(30);
			break;

			case "Dragonborn":
			setBaseAttack(getBaseAttack()+2);
			setBaseHealth(getBaseHealth()+1);
			setBaseSpeed(30);
			setHasMagic(true);
			coin = rand.nextInt(5);
			if(coin == 0)
			{
				if(!proWeapons.contains("Acid"))
				addProWeapons("Acid");
			}
			

			else if(coin == 1)
			{
				if(!proWeapons.contains("Lightning"))
				addProWeapons("Lightning");
			}
			

			else if(coin == 2)
			{
				if(!proWeapons.contains("Fire"))
				addProWeapons("Fire");
			}
			

			else if(coin == 3)
			{
				if(!proWeapons.contains("Poison"))
				addProWeapons("Poison");
			}

			else 
			{
				if(!proWeapons.contains("Cold"))
				addProWeapons("Cold");
			}
			break;

			case "Gnome":
			setBaseDefense(getBaseDefense()+2);
			setBaseSpeed(25);
			setHasDarkvision(true);
			coin = rand.nextInt(2);
			if(coin == 0)
			{
				setBaseAttack(getBaseAttack()+1);
				setHasMagic(true);
			}
			else 
			{
				setBaseDefense(getBaseDefense()+1);
			}
			break;

			case "Half-Elf":
			setBaseHealth(getBaseHealth()+2);
			coin = rand.nextInt(3);
			if(coin == 0)
			setBaseAttack(getBaseAttack()+1);
			else if(coin == 1)
			setBaseDefense(getBaseDefense()+1);
			else 
			setBaseHealth(getBaseHealth()+1);
			setHasMagic(true);
			setBaseSpeed(30);
			setHasDarkvision(true);
			break;

			case "Half-Orc":
			setBaseAttack(getBaseAttack()+2);
			setBaseDefense(getBaseDefense()+1);
			setBaseSpeed(30);
			setHasDarkvision(true);
			break;

			case "Tiefling":
			setBaseDefense(getBaseDefense()+1);
			setBaseHealth(getBaseHealth()+2);
			setBaseSpeed(30);
			setHasMagic(true);
			setHasDarkvision(true);
			if(!proWeapons.contains("Fire"))
			addProWeapons("Fire");
			break;

			default:
			break;
		}

		setCurrentHealth(getBaseHealth());
		setCurrentDefense(getBaseDefense());
		setCurrentAttack(getBaseAttack());
		setCurrentSpeed(getBaseSpeed());	
	
	}

	public static Player getInstance()
	{
		if (singlePlayer == null)
			singlePlayer = new Player();
		return singlePlayer;
	}

	public static Player getInstance(String Name)
	{
		if (singlePlayer == null)
			singlePlayer = new Player(Name);
		return singlePlayer;
	}

	//Race of the Player 
	public String getRace() {
		return this.race;
	}
	public void setRace(String race) {
		this.race = race;
	}


	//Class of the player
	public String getMyClass() {
		return this.myClass;
	}
	public void setMyClass(String myClass) {
		this.myClass = myClass;
	}


	//Money
	public double getCurrency() {
		return currency;
	}
	public void setCurrency(double currency) {
		this.currency = currency;
	}

	
	//The health that will be decreased when attacked
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	
	//Overall maximum Health
	public int getBaseHealth() {
		return baseHealth;
	}
	public void setBaseHealth(int baseHealth) {
		this.baseHealth = baseHealth;
	}


	//Overall maximum Attack
	public int getBaseAttack() {
		return baseAttack;
	}
	public void setBaseAttack(int baseAttack) {
		this.baseAttack = baseAttack;
	}

	
	//Overall maximum Defense
	public int getBaseDefense() {
		return baseDefense;
	}
	public void setBaseDefense(int baseDefense) {
		this.baseDefense = baseDefense;
	}


	//Overall Basic Speed
	public int getBaseSpeed(){
		return baseSpeed;
	}
	public void setBaseSpeed(int baseSpeed){
		this.baseSpeed = baseSpeed;
		 
	}


	//If the player has Darkvision
	public boolean getHasDarkvision() {
		return this.hasDarkvision;
	}
	public void setHasDarkvision(boolean hasDarkvision) {
		this.hasDarkvision = hasDarkvision;
	}

	//If the player has magic
	public boolean getHasMagic() {
		return this.hasMagic;
	}
	public void setHasMagic(boolean hasMagic) {
		this.hasMagic = hasMagic;
	}

	//Weapons that they're good at
	public List<String> getProWeapons() {
		return this.proWeapons;
	}
	public void addProWeapons(String proWeapons) {
		this.proWeapons.add(proWeapons);
	}


	//These can be above the base if there is a temporary stat buff
	//Or below if there's a disadvantage like a weaker attack
	public int getCurrentAttack() {
		return currentAttack;
	}
	public void setCurrentAttack(int currentAttack) {
		this.currentAttack = currentAttack;
	}

	
	public int getCurrentDefense() {
		return currentDefense;
	}
	public void setCurrentDefense(int currentDefense) {
		this.currentDefense = currentDefense;
	}

	
	public int getCurrentSpeed() {
		return this.currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	//For the hero ending if we have time
	//Maybe we can make more big monsters and once 
	//the player has 3 they have the hero title
	public String [] getMedals() {
		return medals;
	}
	public void setMedals(String medals) {
		this.medals[medalCounter] = medals;
		medalCounter++;
	}
	
	public int getMedalCounter() {
		return medalCounter;
	}
	public void setMedalCounter(int medalCounter) {
		this.medalCounter = medalCounter;
	}
	
	public void medalWin() 
	{
		if (getMedalCounter()==3)
		{
			System.out.print("You have collected 3 medals and became a legend!");
			System.out.println("");
			System.out.print("Congratulations on getting the good ending 2 of 2!");
			
			System.exit(0);
		}

	}
		
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}

	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}

	public int getExp(){
		return exp;
	}
	public void setExp(int exp){
		this.exp+=exp;

	switch(true){
		case (getExp() >= 300 && getExp() < 900):
			if(getLevel() == 1)
			{
				setLevel(2);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 900 && getExp() < 2700):
			if(getLevel() == 2)
			{
				setLevel(3);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 2700 && getExp() < 6500):
			if(getLevel() == 3)
			{
				setLevel(4);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 6500 && getExp() < 14000):
			if(getLevel() == 4)
			{
				setLevel(5);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 14000 && getExp() < 23000):
			if(getLevel() == 5)
			{
				setLevel(6);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 23000 && getExp() < 34000):
			if(getLevel() == 6)
			{
				setLevel(7);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 34000 && getExp() < 48000):
			if(getLevel() == 7)
			{
				setLevel(8);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 48000 && getExp() < 64000):
			if(getLevel() == 8)
			{
				setLevel(9);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 64000 && getExp() < 85000):
			if(getLevel() == 9)
			{
				setLevel(10);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 85000 && getExp() < 100000):
			if(getLevel() == 10)
			{
				setLevel(11);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 100000 && getExp() < 120000):
			if(getLevel() == 11)
			{
				setLevel(12);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 120000 && getExp() < 140000):
			if(getLevel() == 12)
			{
				setLevel(13);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 140000 && getExp() < 165000):
			if(getLevel() == 13)
			{
				setLevel(14);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 165000 && getExp() < 195000):
			if(getLevel() == 14)
			{
				setLevel(15);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 195000 && getExp() < 225000):
			if(getLevel() == 15)
			{
				setLevel(16);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 225000 && getExp() < 265000):
			if(getLevel() == 16)
			{
				setLevel(17);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 265000 && getExp() < 305000):
			if(getLevel() == 17)
			{
				setLevel(18);
				setRandUpgrade();
			}
		break;

		case (getExp() >= 305000 && getExp() < 355000):
			if(getLevel() == 18)
			{
				setLevel(19);
				setRandUpgrade();
			}
		break;

		case (getExp() < 355000):
			if(getLevel() == 19)
			{
				setLevel(20);
				setRandUpgrade();
			}
		break;

		default:
		break;
	}		

	}

	void setRandUpgrade(){
		Random rand = new Random();
		int coin;

		coin = rand.nextInt(4);
		switch (coin){
			case 0: setBaseHealth(getBaseHealth()+2); break;
			case 1: setBaseAttack(getBaseAttack()+2); break;
			case 2: setBaseDefense(getBaseDefense()+2); break;
			case 3: setBaseSpeed(getBaseSpeed()+2); break;
			default: break;
		}
	}

	//health and new health
	void displayStats()
	{
		System.out.println(playerName +"\t"+ currentHealth +" Hp");
		
	}
	void displayAllStats()
	{
		System.out.println(playerName +"\t"+ currentHealth +" / "+ baseHealth+" HP");
		System.out.println("Level: "+ level);
		System.out.println("Exp: "+ exp );
		System.out.println("Race: " + race);
		System.out.println("Class: " + myClass);
		System.out.println("Attack: "+ currentAttack);
		System.out.println("Defense: "+ currentDefense);
		System.out.println("Speed: "+ currentSpeed);
		System.out.println("Currency: "+ currency);
	}
}



