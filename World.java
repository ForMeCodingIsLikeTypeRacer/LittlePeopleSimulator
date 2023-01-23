import java.util.ArrayList;

public class World {
	public int worldrows = 4;
	public int widthmultiplier = 1;
//	public String world = "********" + "\n" +
//	                      "*      *" + "\n" +
//	                      "*      *" + "\n" +
//	                      "*      *" + "\n" +
//	                      "*      *" + "\n" +
//	                      "*      *" + "\n" +
//	                      "*      *" + "\n" +
//			              "********";
	
	// capacity 1 = 3x3
	// capacity 2 = 4x3
	// capacity 3 = 5x3
	// capacity 4 = 4x4
	// capacity 16 = 6x6
	// capacity 25 = 7x7
	// capacity 36 = 8x8
	
	World(){}
	
	World(int newworldrows, int newwidthmultiplier) {
		worldrows = newworldrows;
		widthmultiplier = newwidthmultiplier;
	}
	
	StringBuilder worldupdator(StringBuilder world, ArrayList<Integer> settlements, String model) {
		StringBuilder updatedworld = world;
		int settlementsize = settlements.size();
		int lastsettlementindex = settlementsize - 1;
		
		world.replace(settlements.get(lastsettlementindex), settlements.get(lastsettlementindex)+1, model);
		
		return updatedworld;
	}
	
	StringBuilder worldcreator(int worldrows, int widthmultiplier) {
		StringBuilder world = new StringBuilder("");
		if(worldrows <= 4) {
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(i == 0 || i==4-1) {
						world = world.append("*");
						if(j == 4-1) {
							world = world.append("\n");
						}
					}
					else if(j == 0) {
						world = world.append("*");
					}
					else if(j == 4-1) {
						world = world.append("*\n");
					}
					else{
						world = world.append(" ");
					}
				}
			}
		}
		else if(worldrows > 4) {
			for(int i = 0; i < worldrows; i++) {
				for(int j = 0; j < worldrows*widthmultiplier; j++) {
					if(i == 0 || i==worldrows-1) {
						world = world.append("*");
						if(j == worldrows*widthmultiplier-1) {
							world = world.append("\n");
						}
					}
					else if(j == 0) {
						world = world.append("*");
					}
					else if(j == worldrows*widthmultiplier-1) {
						world = world.append("*\n");
					}
					else{
						world = world.append(" ");
					}
				}
			}
		}
		//System.out.println(world);
		return world;
	}
	
}
