import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Resp resp = new Resp();
		Hero hero1 = new Hero();
		System.out.println("Введите имя 1-го игрока:");
		hero1.setHeroVar(resp.selectHero());

		hero1.getInfo();
		System.out.println("Подготовьте " + hero1.getHeroName()
				+ " к бою...\n\n");

		Thread.sleep(2000);
		System.out
				.println("-------------------------------------------------\n"
						+ "\nТорговец: \"Можешь выбрать в моей лавке все что захочешь. "
						+ "\nЯ не возьму с Тебя ни гроша.\""
						+ "\n-------------------------------------------------");
		hero1.takeItems();
		hero1.getInfo();
		System.out.println("\n" + hero1.getHeroName()
				+ ": Спасибо старик за все! Я не забуду Твоей доброты!\n\n");
		System.out.println("\n" + hero1.getHeroName()
				+ ": Трепещи мой противник. Я сотру Тебя в порошок!\n\n");

		Hero hero2 = new Hero();
		System.out.println("Введите имя 2-го игрока:");
		hero2.setHeroVar(resp.selectHero());

		hero2.getInfo();
		System.out.println("Подготовьте " + hero2.getHeroName()
				+ " к бою...\n\n");

		Thread.sleep(2000);
		System.out
				.println("-------------------------------------------------\n"
						+ "\nТорговец: \"Можешь выбрать в моей лавке все что захочешь. "
						+ "\nЯ не возьму с Тебя ни гроша.\""
						+ "\n-------------------------------------------------");
		hero2.takeItems();
		hero2.getInfo();
		System.out.println("\n" + hero2.getHeroName()
				+ ": Спасибо старик за все! Я не забуду Твоей доброты!\n\n");
		System.out.println("\n" + hero2.getHeroName()
				+ ": Трепещи мой противник. Я сотру Тебя в порошок!\n\n");
		int id = 0;
		while (hero1.getHealth() > 0 && hero2.getHealth() > 0) {
			
			if(id%2==0){
				hero1.setHealtDamage(hero2.getStrike());
				
			} else {
				hero2.setHealtDamage(hero1.getStrike());
			}
			
			System.out.println((id+1)+". "+hero1.getHeroName()+" health: "+hero1.getHealth());
			System.out.println((id+1)+". "+hero2.getHeroName()+" health: "+hero2.getHealth());
			id++;
			Thread.sleep(800);
		}		
			System.out.println(""+(hero1.getHealth()<=0?hero2.getHeroName():hero1.getHeroName())+" :Я победил!\nНикто со мной не сравнится!!!");
		

	}
}
