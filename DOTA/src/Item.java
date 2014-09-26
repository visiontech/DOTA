public class Item {
	String itemName;
	int intellect;
	int agility;
	int power;
	int armor;

	// {name, intellect, agility, power, armor}
	String[][] items = { { "Bracer", "5", "2", "2", "0" },
			{ "Power Treads", "5", "5", "5", "0" },
			{ "Robe of the Magi", "0", "5", "0", "0" },
			{ "Belt of Strength", "0", "0", "5", "0" },
			{ "Band of Elvenskin", "0", "5", "0", "0" } };

	String[] getItem(String name) {
		int i = 0;
		while (i < items.length) {
			if (items[i][0].equals(name)) {
				break;
			}
			i++;
		}

		return items[i];

	}

	Boolean getItemsIsAvailable(String name) {
		boolean av = false;

		for (int i = 0; i < items.length; i++) {
			if (name.equals(items[i][0])) {
				av = true;
			}
			
		}
		return av;
	}
	
	

	void showAvailabeItems() {
		// System.out.println(items.length);
		for (int i = 0; i < items.length; i++) {
			System.out.println("\nItemName: " + items[i][0] + "\nIntellect: +"
					+ items[i][1] + "\nAgility: +" + items[i][2] + "\nPower: +"
					+ items[i][3] + "\nArmor: +" + items[i][4]);
		}
	}
}
