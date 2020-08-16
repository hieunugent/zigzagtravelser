import java.util.*;

class Program {
  public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
    // Write your code here.
		
		int endRow= array.size() -1;
		int endCol= array.get(0).size() -1;
		// 	System.out.println(endRow +" "+ endCol);
		// System.out.println(array.get(endRow).get(endCol));
		List<Integer> zigzag = new ArrayList<Integer>();
		
	
		int r = 0;
		int c = 0;
		boolean goingDown = true;
	
		while(isOkMove(r, c, array)){
			zigzag.add(array.get(r).get(c));
			if(goingDown){
				if(c == 0 || r == endRow){
					goingDown=false;
					if(r == endRow){
						c++;
					}else{r++;}
				}
				else{
					r++;c--;
				}
			}else{
				if(r == 0|| c == endCol){
					goingDown = true;
					if(c == endCol){
						r++;
					}else{c++;}
				}else{
					r--;
					c++;
				}
			}
  }
		return zigzag;
	
	}
	public static boolean isOkMove(int r , int c , List<List<Integer>> array){
		int endRow= array.size() -1;
		int endCol= array.get(0).size() -1;
		
		return !(r < 0 || r> endRow || c < 0 || c> endCol);
	}
	
}
