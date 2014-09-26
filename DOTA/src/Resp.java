import java.util.Arrays;
import java.util.Scanner;

public class Resp {
	
	
	/*heroname; 	intellect;  agility;  power; health;  armor;*/
	String heroes[][] = { { "Pudge", "10", "12", "30", "420" ,"5"},
			{ "Huskar", "12", "14", "31", "400","6"} };

	void showHeroes() {
		for (int i = 0; i < heroes.length; i++) {
			System.out.println("\nName: " + heroes[i][0] + "\nIntellect: "
					+ heroes[i][1] + "\nAgility: " + heroes[i][2] + "\nPower: "
					+ heroes[i][3] + "\nArmor: " + heroes[i][4]);
		}
	}

	Boolean getHeroIsAvailable(String name) {
		boolean av = false;

		for (int i = 0; i < heroes.length; i++) {
			if (name.equals(heroes[i][0])) {
				av = true;
			}

		}
		return av;
	}

	String[] selectHero() {
		boolean selectflg = false;
		String heroName = null;
		System.out.println("Пожалуйста сделайте свой выбор.");

		while (selectflg == false) {
			showHeroes();
			System.out.println("Введите имя героя:");

			Scanner reader = new Scanner(System.in);
			heroName = reader.nextLine();
			if (getHeroIsAvailable(heroName)) {
				selectflg = true;

			}
		}
		return getHero(heroName);
	}

	String[] getHero(String name) {
		int i = 0;

		while (i < heroes.length) {

			if (name.equals(heroes[i][0])) {
				break;
			}

			i++;
		}
		return heroes[i];
	}
}
