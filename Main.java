import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {		
		World w = new World();
		StringBuilder world = w.worldcreator(10,5); // 6 == 6 rows 
		
		// newstartinglocation, population, newwealth, newlandsize, newcivlevel, newculture, newunitmodel
		Nation ZetaReticulians = new Nation(1,50,100,1,1,"ZetaReticulian","Z");
		Nation Humans = new Nation(1,50,100,1,1,"Human","H");
		
		//birthrate, attackpower, defense, intelligence, discipline, health, special1
		Cultures ZetaReticulianCulture = new Cultures(.2,1.5,1.5,3,3,150,"N/A");
		Cultures HumanCulture = new Cultures(.1,1,1,1,1,100,"N/A");
		
//		n.settlements.add(2);
		//n.settlements.add(200);
//		System.out.println(n.settlements);
		
		ArrayList<Integer> notallowed = new ArrayList<Integer>();
		
		for(int i = 0; i < world.length(); i++) {
			if(world.charAt(i) == '*' || world.charAt(i) == '\n') {
				notallowed.add(i);
			}
		}
		
		ZetaReticulians.updatesettlements(ZetaReticulians.settlements, 200, notallowed);
		w.worldupdator(world,ZetaReticulians.settlements,ZetaReticulians.unitmodel);
		System.out.println(world);
		Humans.updatesettlements(Humans.settlements, 212, notallowed);
		w.worldupdator(world,Humans.settlements,Humans.unitmodel);
		System.out.println(world);
		
		int i = 0;
		while(i<100) {
			
			ZetaReticulians.population = ZetaReticulians.population + ZetaReticulians.population * ZetaReticulianCulture.birthrate;
			Humans.population = Humans.population + Humans.population * HumanCulture.birthrate;
			
			Random rand = new Random();
			int rand_int1 = rand.nextInt(500);
			
			
			if(ZetaReticulians.population >= 600) {
				System.out.println(ZetaReticulians.population);
				ZetaReticulians.population = ZetaReticulians.population - 100;
				ZetaReticulians.updatesettlements(ZetaReticulians.settlements, rand_int1, notallowed);
				w.worldupdator(world,ZetaReticulians.settlements,ZetaReticulians.unitmodel);
				System.out.println(world);
				System.out.println(ZetaReticulians.population);
			}
			
			i = i + 1;
			Thread.sleep(1000);
		}
		
		
		

	}

}
