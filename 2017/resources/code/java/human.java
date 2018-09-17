import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.lang.Throwable;
import java.lang.ThreadDeath;
import java.*;
import javax.*;



public class human {
	
	//Declares variables
	
	String race;
	String name;
	String food;
	String location;
	String talk;
	String weapon;
	String weaponName;
	String friendName;
	String enemyName;
	String faveFood;
	String faveWeapon;
	String faveWeaponName;
	String deathType;
	String gender;
	String it;
	String itIt;
	String print;
	int foodEaten;
	int age;
	int numOfFriends;
	int numOfEnemies;
	int intel;
	int speed;
	int date;
	int month;
	int year;
	int random;
	int idleCounter;
	int seconds;
	int between;
	int lines;
	int faveFoodEaten;
	int defaultSpeed;
	long defaultHours;
	long defaultDistance;
	long timeRunning;
	long hours;
	long distance;
	ArrayList<String> friends = new ArrayList<String>();
	ArrayList<String> enemies = new ArrayList<String>();
	
	
	
	public human(String humanRace,String humanName,int humanAge,String humanGender) {
		
		//Creates a new human
		
		race = humanRace;
		name = humanName;
		age = humanAge;
		gender = humanGender;
		
		createHuman();
		
	}
	
	
	
	public void createHuman() {
		
		//Displays human statistics
		
		it();
		
		System.out.println("A new Human has been created!");
		
		wait(1);
		
		p("Name: " + name);
		p("Race: " + race);
		p("Age: " + age);
		p("Gender: " + gender);
		
		wait(1);
		
		l();
		p("Type h.instructions() for more information.");
		l(2);
		
		humanTestDrive();
		
	}
	
	
	
	public static void main(String[] args) {

		human h = new human("Numenorian","Elendil",25,"Male");
	
	}
	
	
	
	public void toDoList() {
		
		//A list of things for the human to do
		
		
		
	}
	
	
	
	public void humanTestDrive() {
		
		//Starts program
		
		instructions();
		initialize();
		showList();
		toDoList();
		doIdle();
		endProgram();
		
	}
	


	public void instructions() {

		//Instructions on what to do

		p("1. Intellegence");
		l();
		p("setIntellegence()");
		p(" - Gives " + name + " the default intellegence level");
		l();
		p("setIntellegence(A number between 0 and 150)");
		p(" - Gives " + name + " the specified intellegence level");
		l();
		p("showIntellegence()");
		p(" - Prints out " + name + "'s intellegence level");
		l(3);
		p("2. Birthday");
		l();
		p("setBirthday()");
		p(" - Sets the default birthdate for " + name + "'s birthday");
		l();
		p("setBirthday(day,month,year in numbers");
		p(" - Sets the above specified date for " + name + "'s birthday");
		l();
		p("showBirthday()");
		p(" - Prints out " + name + "'s birthdate");
		l();
		p("birthday()");
		p(" - Sings Happy Birthday for " + name);
		l(3);
		

	}
	
	
	
	public void initialize() {
		
		//Sets default settings
		
		defaultRun(10,100);
		setLocation("Arnor, Middle-Earth");
		setBirthday(16,1,2003);
		defaultEat("cookies",99);
		setIntellegence(125);
		defaultFight("sword","Narsil");
		
		setRelationships();
		
	}
	
	
	
	public void setRelationships() {
		
		//Adds friends and enemies
		
		friends.add("Cirdan the Shipwright");
		friends.add("Elrond");
		friends.add("Gil-Galad");
		
		enemies.add("Sauron");
		enemies.add("Ar-Pharazon");
		
	}
	
	
	
	public void showList() {
		
		//Displays default settings and stats
		
		showFriends();
		showEnemies();
		showBirthday();
		showRelationships();
		
	}

	
	
	public void timeRunningWait() {
		
		//Set how long to sleep
		
		try {

			Thread.sleep(timeRunning);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();

		}
		
	}
	
	
	
	public void wait(int numOfSeconds) {
		
		//Pauses the program for the specified amount of seconds
		
		numOfSeconds = numOfSeconds * 1000;
		seconds = numOfSeconds;
		
		try {

			Thread.sleep(seconds);

		} catch (InterruptedException e) {

			Thread.currentThread().interrupt();

		}
		
	}
	
	
	
	public void p(String toPrint) {
		
		//Same as System.out.printIn(); but simplified
		
		print = toPrint;
		System.out.println(print);
		
	}
	
	
	
	public void generateRandomNumber() {
		
		//Generates a random number between 1 and 10
		
		double rand = Math.random();
		rand = rand * 10;
		double randomNumber = Math.ceil(rand);
		random = (int)randomNumber;
		
	}
	
	
	
	public void generateRandomNumber(int inBetween) {
		
		//Generates a random number up to the specified number
		
		between = inBetween;
		
		double rand = Math.random();
		rand = rand * between;
		double randomNumber = Math.ceil(rand);
		random = (int)randomNumber;
		
	}
	
	
	
	public void l(int numOfLines) {
		
		//Sets how many blank lines to make
		
		lines = numOfLines;
		
		doLines();
		
	}
	
	
	
	public void l() {
		
		//Makes 1 blank line
		
		lines = 1;
		
		doLines();
		
	}
	
	
	
	public void doLines() {
		
		//A method to skip lines
		
		for (int i = 0; i < lines; i++) {
			
			p(" ");
			
		}
		
	}
	
	
	
	public void doIdle() {
		
		//Starts the idle(); method
		
		wait(10);
		
		idle();
		
	}
	
	
	
	public void idle() {
		
		//What the human does after the program finishes
		
		generateRandomNumber(3);
		
		l();
		
		switch (random) {
			
			case 1:
				
				p("Human Roaming.");
				roam(5);
				break;
			
			case 2:
				
				p("Human Sleeping.");
				sleep(5);
				break;
				
			case 3:
				
				break;
				
			default:
				
				p("ERROR IN IDLE");
					
		}
		
	}
	
	
	
	public void roam(int humanHours) {
		
		//Makes the human roam
		
		hours = humanHours;
		
		wait(1);
		p("Roaming for " + hours + " hours.");
		
		timeRunning = hours * 1000;
		
		
		
	}
	
	
	
	public void setBirthday(int humanDate,int humanMonth,int humanYear) {
		
		//Sets birthdate
		
		date = humanDate;
		month = humanMonth;
		year = humanYear;
		
	}
	
	
	
	public void showBirthday() {
		
		//Prints out birthdate
		
		l();
		p(name + "'s birthday is: " + date + "/" + month + "/" + year + "!");
		
	}
	
	
	
	public void setBirthday() {
		
		//Default birthdate
		
		date = 1;
		month = 1;
		year = 2000;
		
	}
	
	
	
	public void birthday() {
		
		//Sings Happy Birthday
		
		l();
		p("Today is " + name + "'s birthday!");
		l();
		p("Happy Birthday to you, Happy Birthday to you.");
		p("Happy Birthday to " + name + ", Happy Birthday to you!");
		
	}
	
	
	
	public void it() {
		
		//Determines whether to use 'he', 'she', or 'it'.
		
		switch (gender) {
			
			case "male":
				
				it = " his ";
				itIt = " he ";
				break;
				
			case "Male":
				
				it = " his ";
				itIt = " he ";
				break;
				
			case "female":
				
				it = " her ";
				itIt = " she ";
				break;
			
			case "Female":
				
				it = " her ";
				itIt = " she ";
				break;
				
			case "girl":
				
				it = " her ";
				itIt = " she ";
				break;
				
			case "boy":
				
				it = " his ";
				itIt = " he ";
				break;
				
			default:
			
				it = " its ";
				itIt = " it";
			
		}
		
		
	}
	
	
	
	public void setIntellegence(int humanIntel) {
		
		//Sets how clever the human is
		
		intel = humanIntel;
		
		wait(2);
		
		l();
		p("Set " + name + "'s intellegence level to " + intel + ".");
		
	}
	
	
	
	public void setIntellegence() {

		//setIntellegence: no fields provided

		intel = 75;

		setIntellegence();

	}
	
	
	
	public void showIntellegence() {
		
		//Says a statement about the human's intellegence
		
		l();
		
		if (intel <= 50 && intel > 0) {
			
			p(name + " is not very intellegent. (Intellegence level = " + intel + ")");
			
		} 
		
		if (intel <= 100 && intel > 50) {
			
			p(name + " has average intellegence. (Intellegence level = " + intel + ")");
			
		}
		
		if (intel > 100 && intel <= 150) {
			
			p(name + " is very intellegent! (Intellegence level: " + intel + ")");
			
		}
		
		if (intel > 150) {
			
			p("ERROR: The number you entered, " + intel + ", is too high! Please enter a number between 0 and 150");
			
		}
		
		if (intel < 0) {
			
			p("ERROR: The number you entered, " + intel + ", is too low! Please enter a number between 0 and 150.");
		}
		
		l();
		
	}
	
	
	
	public void addFriend(String humanFriendName) {
		
		//Adds friends
		
		friendName = humanFriendName;
		
		wait(1);
		
		friends.add(friendName);
		numOfFriends = friends.size();
		
		l();
		p(friendName + " is now " + name + "'s friend!");
		
	}
	
	
	
	public void addEnemy(String humanEnemyName) {
		
		//Adds enemies
		
		enemyName = humanEnemyName;
		
		wait(1);
		
		enemies.add(enemyName);
		numOfEnemies = enemies.size();
		
		l();
		p(enemyName + " is now " + name + "'s enemy!");
		
	}
	
	
	
	public void showFriends() {
		
		//Prints out a list of friends
		
		numOfFriends = friends.size();
		
		wait(2);
		
		l();
		
		if (friends.size() == 1) {

			p(name + " has 1 friend: " + friends);

		} else {

			p(name + " has " + numOfFriends + " friends: " + friends);

		}
		
	
	}
	
	
	public void showEnemies() {
		
		//Prints out a list of enemies
		
		numOfEnemies = enemies.size();
		
		wait(2);
		
		l();
		
		if (enemies.size() == 1) {
			
			p(name + " has 1 enemy: " + enemies);
			
		} else {
			
			p(name + " has " + numOfEnemies + " enemies: " + enemies);
			
		}
		
	}
	
	
	
	public void showRelationships() {
		
		//Prints out all friends and enemies
		
		l();
		p(name + "'s friends: " + friends);
		p(name + "'s enemies: " + enemies);
		
	}
	
	
	
	public void defaultFight(String humanFaveWeapon,String humanFaveWeaponName) {
		
		//Sets a favourite weapon and the weapon's name
		
		faveWeapon = humanFaveWeapon;
		faveWeaponName = humanFaveWeaponName;
		
		showFight();
		
	}
	
	
	
	public void defaultFight() {
		
		//Default weapons
		
		faveWeapon = "sword";
		faveWeaponName = (name + "'s " + faveWeapon);
		
		showFight();
		
	}
	
	
	
	public void showFight() {
	
		p("Set " + name + "'s favourite weapon to: " + faveWeapon);
		p("Set " + name + "'s " + faveWeapon + "'s name to: " + faveWeaponName);
		
	}
	
	
	
	public void fight(String humanWeapon,String humanWeaponName) { 
	
		//Starts a battle with client-specified weapon and weapon's name
		
		weapon = humanWeapon;
		weaponName = humanWeaponName;
		
		fightingA();
		
	}
	
	
	
	public void fight(String humanWeaponName) {
		
		//Starts a battle with either a favourite weapon or a named weapon
		
		switch (humanWeaponName) {
			
			case "favourite weapon":
				
				weapon = faveWeapon;
				weaponName = faveWeaponName;
				fightingA();
				break;
				
			default:
			
				weaponName = humanWeaponName;
				fightingC();
				break;
		
		}
		
	}
	
	
	
	public void fight() {
		
		//Starts a battle with a default weapon, sword

		weapon = "sword";

		fightingB();

	}
	
	
	
	public void fightingA() {
		
		//Both weapon type and weapon name
		
		wait(2);
		
		l();
		p("Arrgghh! Orcs are coming! " + name + " is fighting the orcs with a " + weapon + " called " + weaponName + "!");
		l();
		
		ifDie();
		
	}
	
	
	
	public void fightingB() {
		
		//Weapon type

		wait(2);
		
		l();
		p("Arrgghh! Orcs are coming! " + name + " is fighting the orcs with a " + weapon + "!");
		l();
		
		ifDie();
		
	}
	
	
	public void fightingC() {
		
		//Weapon name
		
		wait(2);
		
		l();
		p("Arrgghh! Orcs are coming! " + name + " is fighting the orcs with " + weaponName + "!");
		l();
		
		ifDie();
		
	}
	
	
	
	public void ifDie() {
		
		//Generates a random number and tests if the human dies
		
		wait(5);
		
		generateRandomNumber();
		
		switch (random) {
			
			case 10:
				
				die("battleDeath");
				break;
				
			case 9:
				
				die("battleDeath");
				break;
				
			case 8:
				
				p(name + " was mortally wounded in the battle.");
				talk("Ouch! But I still survived the battle...");
				p("... *dies*");
				die("injuryDeath");
				break;
				
			case 7:
				
				p(name + " was mortally wounded in the battle. (But " + name + " still survived!)");
				talk("Ouch! But I still survived the battle!");
				break;
				
			case 6:
				
				p(name + " was injured in the battle. Luckily, the injuries weren't too bad.");
				talk("I survived the battle!");
				break;
				
			case 5:
				
				p(name + " was injured in the battle. Luckily, the injuries weren't too bad.");
				talk("I survived the battle!");
				break;
				
			case 4:
				
				p(name + " was injured in the battle. Luckily, the injuries weren't too bad.");
				talk("I survived the battle!");
				break;
				
			case 3:
				
				p(name + " was injured in the battle. Luckily, the injuries weren't too bad.");
				talk("I survived the battle!");
				break;
				
			case 2:
				
				p(name + " escaped the battle with a few scratches.");
				talk("A few scratches! Yay! No serious wounds for once!");
				break;
				
			case 1:
				
				p(name + " escaped the battle unscathed!");
				talk("I'm so good at fighting that I didn't get hurt at all!");
				break;
				
			default:
			
				p("ERROR IN FIGHT");
			
		}
		
	}
	
	
	
	public void talk(String humanTalk) {
		
		//A method for the human to say something
		
		talk = humanTalk;
		
		wait(2);
		
		l();
		p(name + " said, '" + talk + "'");
		
	}
	
	
	
	public void setLocation(String humanLocation) {
		
		//Sets where the human lives
		
		location = humanLocation;
		
		showLocation();
		
	}
	
	
	
	public void setLocation() {

		//Default location

		location = "Middle-Earth";

		showLocation();

	}
	
	
		
	public void showLocation() {
		
		//Prints out location
		
		wait(2);
		
		l();
		p(name + " lives in " + location + ".");
		
	}
	
	
	
	public void defaultEat(String humanFaveFood,int humanFaveFoodEaten) {
		
		//Sets favourite food: all fields provided
		
		faveFood = humanFaveFood;
		faveFoodEaten = humanFaveFoodEaten;
		
		showEat();
		
	}
	
	
	
	public void defaultEat(String humanFaveFood) {
		
		//Sets favourite food: food name provided
		
		faveFood = humanFaveFood;
		faveFoodEaten = 1;
		
		showEat();
		
	}
	
	
	
	public void defaultEat(int humanFaveFoodEaten) {
		
		//Sets favourite food: food amount provided
		
		faveFood = "pork";
		faveFoodEaten = humanFaveFoodEaten;
		
		showEat();
		
	}
	
	
	
	public void defaultEat() {
		
		//Set favourite food: No fields provided
		
		faveFood = "pork";
		faveFoodEaten = 1;
		
		showEat();
		
	}
	
	
	
	public void showEat() {
		
		//Prints favourite food
		
		l();
		p("Set " + name + "'s favourite food to: " + faveFood);
		p("Set " + name + "'s favourite amount of food to: " + faveFoodEaten);
		
	}
	
	
	
	public void eat() {
		
		//Eats favourite food
		
		food = faveFood;
		foodEaten = faveFoodEaten;
		
		eating();
		
	}
	
	
	
	public void eat(String humanFood,int humanFoodEaten) {
		
		//Eats the specified food and the specified amount of food
		
		food = humanFood;
		foodEaten = humanFoodEaten;
		
		eating();
		
	}
	
	
	
	public void eat(String humanFood) {	
	
		//If one foodName is provided and foodAmount is not

		food = humanFood;
		foodEaten = faveFoodEaten;

		eating();

	}
	
	
	
	public void eating() {
		
		//Eats the food
		
		wait(2);
		
		l();
		p(name + " has eaten " + foodEaten + " " + food + ".");
		
		if (foodEaten > 5) {
			
			p(name + " needs some exercise!");
			run();
		}
		
	}
	
	
	
	public void defaultRun(int humanFaveSpeed,long humanFaveDistance) {
		
		//setRun: both fields provided
		
		defaultSpeed = humanFaveSpeed;
		defaultDistance = humanFaveDistance;
		
		showRun();
		
	}
	
	
	
	public void defaultRun(int humanFaveSpeed) {
		
		//setRun: speed provided
		
		defaultSpeed = humanFaveSpeed;
		defaultDistance = 10;
		
		showRun();
		
	}
	
	
	
	public void defaultRun(long humanDistance) {
		
		//setRun: distance provided
		
		defaultSpeed = 5;
		defaultDistance = humanDistance;
		
		showRun();
		
	}
	
	
	
	public void defaultRun() {
		
		//setRun: no fields provided
		
		defaultSpeed = 5;
		defaultDistance = 10;
		
		showRun();
		
	}
	
	
	
	public void showRun() {
		
		//Prints default running stats
		
		l();
		p("Set " + name + "'s default speed to: " + defaultSpeed);
		p("Set " + name + "'s default distance to: " + defaultDistance);
		
	}
	
	
	
	public void run() {
		
		//default run
		
		speed = defaultSpeed;
		distance = defaultDistance;
		
		running();
		
	}
	
	
	
	public void run(int humanSpeed,long humanDistance) {
		
		//Custom run
		
		speed = humanSpeed;
		distance = humanDistance;
		
		running();
		
	}
	
	
	
	public void running() {
		
		//Starts running
		
		hours = distance/speed;
		
		timeRunning = hours * 1000;
	
		timeRunningWait();
		
		l();
		p(name + " has run " + distance + " km at " + speed + " km/h.");
		
		if (hours >= 2) {
			
		p(name + " has been running for " + hours + " hours and is now tired.");
		p(name + " needs to sleep for " + hours + " hours.");
		
		sleep(hours);
		
		}
		
	}
	
	
	
	public void defaultSleep(long humanHours) {
		
		//setSleep: all fields provided
		
		defaultHours = humanHours;
		
		showSleep();
		
	}
	
	
	
	public void defaultSleep() {
		
		//setSleep: no fields provided
		
		defaultHours = 5;
		
		showSleep();
		
	}
	
	
	
	public void showSleep() {
		
		//Prints out default sleep stats
		
		l();
		p("Set " + name + "'s hours of sleeping to: " + defaultHours);
		
	}
	
	
	
	public void sleep(long humanHours) {
		
		//Custom sleep
		
		hours = humanHours;
		timeRunning = hours * 1000;
		
		sleeping();
		
	}
	
	
	
	public void sleep() {
		
		//Default sleep
		
		hours = defaultHours;
		timeRunning = hours * 1000;
		
		sleeping();
		
	}
	
	
	
	public void sleeping() {
		
		//A method that makes the human sleep
		
		p("z");

		for (int i = 0; i < (hours - 1); i++) {

			System.out.print("z");

		}

		l();
		p("... " + hours + " hours later ...");

		wait(2);

		p(name + " wakes up!");

		wait(2);

	}
	
	
	
	public void die(String humanDeathType) {
		
		//What to do if the human died
		
		wait(3);
		
		deathType = humanDeathType;
		
		l();
		
		switch (deathType) {
			
			case "battleDeath":
				
				p("Unfortunately, " + name + " was killed in the battle. ");
				p(name + "'s enemies, " + enemies + " are laughing.");
				break;
			
			case "sickDeath":
				
				p("Unfortunately, " + name + " was killed by the plague. ");
				break;
				
			case "injuryDeath":
				
				p("Unfortunately, " + name + " died from " + it + " injuries.");
				break;
				
			case "coldDeath":
				
				p("Unfortunately, " + name + " died from the cold.");
				break;
				
			default:
			
				p(name + " did not die!");
				break;
			
		}
		
		p(name + "'s friends, " + friends + ", are sad. :( "); 
		l();
		
		wait(2);
		
		isDead();
		
	}
	
	
	
	public void isDead() {
		
		//Revives human
		
		l();
		p("Reviving " + name + "...");
		wait(2);
		p("...");
		wait(2);
		l();
		p(name + " revived.");
		
	}
	
	
	
	public void endProgram() {
		
		//Prints out end of program
		
		l();
		p("END OF PROGRAM");
		
	}
	
}
