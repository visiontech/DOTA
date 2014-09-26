import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Inventory {

	Item item = new Item();

	String items[] = new String[6];

	String[] getInventory() {

		return items;
	}
	
	
	int[] getTotalInvaVariables(){
		int vars [] = new int[4]; 
		int res [] = new int[4]; 
		for(int i = 0; i<items.length;i++){
			if(items[i]!=null){
			for(int k = 1; k<vars.length;k++){
				
			
				vars [k-1] += Integer.parseInt(item.getItem(items[i])[k]);
				
				}

			}
			}
		return vars;
	}
	

	void setInventory() {

		int id = 1;
		System.out.println("Для выбора доступны следующие вещи:");
		item.showAvailabeItems();

		while (id <= 6) {
			System.out
					.println("Введите имя предмета для добавления в свой инвентарь:> (Q для завершения выбора)");
			Scanner reader = new Scanner(System.in);
			String name = reader.nextLine();

			if (item.getItemsIsAvailable(name)) {
				setItem(name);
				id++;
				// System.out.println(Arrays.toString(getInventory()));
			} else if (name.matches("[Q,q]")){
				break;
			}
			else{
			
				System.out.println("Такой предмет не существует!");
			}
		}

		if (id == 7) {
			System.out.println("У вас закончилисть свободные ячейки!");
		}
	}

	void setItem(String itemName) {
		boolean addflg = false;
		// System.out.println(Arrays.toString(items));
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = itemName;
				addflg = true;
				break;
			}
			
		}

		if (addflg == false) {
			System.out.println("НЕТ МЕСТА!!!");

		} else {
			System.out.println(Arrays.toString(items));
		}

	}

	void removeItem(String itemName) {

		System.out.println(Arrays.toString(items));
		System.out.println("Какую ячейку вы хотите очистить: (1-6)");
		Scanner reader = new Scanner(System.in);

		switch (reader.nextLine()) {
		case "1":
			items[0] = null;
			break;
		case "2":
			items[1] = null;
			break;
		case "3":
			items[2] = null;
			break;
		case "4":
			items[3] = null;
			break;
		case "5":
			items[4] = null;
			break;
		case "6":
			items[5] = null;
			break;
		default:
			System.out.println("Пожалуйста введите правильный номер ячейки:>");
		}
	}
}
