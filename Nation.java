import java.util.ArrayList;
import java.util.List;

public class Nation {
	public int startinglocation = 0;
	public ArrayList<Integer> settlements = new ArrayList<Integer>();
	public double population = 0;
	public double wealth = 0;
	public int landsize = 1;
	public int civlevel = 0;
	public String culture = "blank";
	public String unitmodel = "*";
	
	Nation(){}
	
	Nation(int newstartinglocation, int newpopulation, int newwealth, 
		   int newlandsize, int newcivlevel, String newculture, String newunitmodel) {
		startinglocation = newstartinglocation;
		population = newpopulation;
		wealth = newwealth;
		landsize = newlandsize;
		civlevel = newcivlevel;
		culture = newculture;
		unitmodel = newunitmodel;
	}
	
	// Credit to https://www.geeksforgeeks.org/find-all-adjacent-elements-of-given-element-in-a-2d-array-or-matrix/
	static boolean isValidPos(int i, int j, int n, int m)
    {
        if (i < 0 || j < 0 || i > n - 1 || j > m - 1) {
            return false;
        }
        return true;
    }
	
	// Credit to https://www.geeksforgeeks.org/find-all-adjacent-elements-of-given-element-in-a-2d-array-or-matrix/
	static List<Integer>
    getAdjacent(List<List<Integer> > arr, int i, int j)
    {
        // Size of given 2d array
        int n = arr.size();
        int m = arr.get(0).size();
 
        // Initialising a array list where adjacent element
        // will be stored
        List<Integer> v = new ArrayList<>();
 
        // Checking for all the possible adjacent positions
        if (isValidPos(i - 1, j - 1, n, m)) {
            v.add(arr.get(i - 1).get(j - 1));
        }
        if (isValidPos(i - 1, j, n, m)) {
            v.add(arr.get(i - 1).get(j));
        }
        if (isValidPos(i - 1, j + 1, n, m)) {
            v.add(arr.get(i - 1).get(j + 1));
        }
        if (isValidPos(i, j - 1, n, m)) {
            v.add(arr.get(i).get(j - 1));
        }
        if (isValidPos(i, j + 1, n, m)) {
            v.add(arr.get(i).get(j + 1));
        }
        if (isValidPos(i + 1, j - 1, n, m)) {
            v.add(arr.get(i + 1).get(j - 1));
        }
        if (isValidPos(i + 1, j, n, m)) {
            v.add(arr.get(i + 1).get(j));
        }
        if (isValidPos(i + 1, j + 1, n, m)) {
            v.add(arr.get(i + 1).get(j + 1));
        }
 
        // Returning the arraylist
        return v;
    }
	
	void updatesettlements(ArrayList<Integer> settlements, int settlementnum, ArrayList<Integer> notallowed) {
		boolean allowed = true;
		for(int i = 0; i < notallowed.size()-1; i++) {
			if(settlementnum == notallowed.get(i))
			{
//				int settlementsize = settlements.size();
//				int lastsettlementindex = settlementsize - 1;
//				settlements.remove(lastsettlementindex);
				System.out.println("No");
				allowed = false;
				
			}
		}
		if(allowed == true) {
			settlements.add(settlementnum);
		}

	}

	
	
}
