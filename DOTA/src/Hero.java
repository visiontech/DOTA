import java.util.Arrays;

public class Hero {
	String heroname;
	int addintellect;
	int addagility;
	int addpower;
	int addhealth;
	int addstrike;
	int addarmor;
	
	int intellect;
	int agility;
	int power;
	int health;
	int strike;
	int armor;
	Inventory inv = new Inventory();
	
	void setHeroVar(String vars[]){
		heroname = vars[0];
		intellect = Integer.parseInt(vars[1]);
		agility = Integer.parseInt(vars[2]);
		power = Integer.parseInt(vars[3]);
		health = Integer.parseInt(vars[4]);
		armor = Integer.parseInt(vars[5]);
		setStrike();
	}
	
	
	
	void calcAttributes() {
		addintellect += inv.getTotalInvaVariables()[0];
		addagility += inv.getTotalInvaVariables()[1];
		addpower += inv.getTotalInvaVariables()[2];
		setStrike();
		setHealth();
	}
	
	
	void takeItems(){
		inv.setInventory();
		calcAttributes();
		System.out.println(Arrays.toString(inv.getInventory()));
	}
	

	void getInfo() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\nName " + heroname
				+"\nintellect " + intellect + " +"+addintellect+ 
				"\nagility " + agility+ " +"+addagility +
				"\npower " + power+ " +"+addpower);
		
		System.out.println("\nhealth " + health + " +"+addhealth+ "\nstrike " + strike
				+ "\nslots " + Arrays.toString(inv.getInventory())
				);
	}

	void setStrike() {
		
		strike = (intellect+addintellect) / 10 + (agility+addagility) / 8 + (power+addpower)/2;
	}

	void setHealth() {
		if(addhealth!=0){
			health -=addhealth;
		}
		addhealth= (int) (power*2.89);
		health +=addhealth;
	}
	
	void setHealtDamage(int strike) {
		health -= strike;
	}

	int getStrike() {
		return strike;
	}
	
	String getHeroName() {
		return heroname;
	}

	int getHealth() {
	
		//System.out.println(Arrays.toString(inv.getInventory()));
		return health;
	}
	

}
