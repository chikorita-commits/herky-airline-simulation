import java.util.ArrayList;

public class Chikorita {
	public static void main(String[] args) {
		for(int row = 0; row < 7; row++) {
			for(int col = 0; col < 10; col++) {
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
				int seats = 0;
				for (int i = 0; i < 43; i++) {
					int x = (int) (Math.random() * 10);
					arrayList.add(x);
					if(x!=9) {
						seats++;
					}
				}
				System.out.print(seats+" ");
				arrayList.clear();
			}
			System.out.println();
		}
		
	}
}
