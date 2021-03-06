import java.util.*;
public class poj2469 {
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
			int[] d = new int[52];
			for(int j=0;j<52;j++){
				d[j] = j;
			}
			int m = in.nextInt();
			int[][] s = new int[m][52];
			for(int j=0;j<m;j++){
				for(int k=0;k<52;k++){
					s[j][k] = in.nextInt()-1;
				}
			}
			in.nextLine();
			int o = 0;
			while(in.hasNextLine()){
				if(o!=0){
					for(int j=0;j<52;j++){
						System.out.println(int2name(d[j]));
					}
					System.out.println();
				}
				o++;
				Scanner strin = new Scanner(in.nextLine());
				if(!strin.hasNext()){
					break;
				}

				int t = strin.nextInt()-1;
				int[] d2 = new int[52];
				for(int j=0;j<52;j++){
					d2[j] = d[s[t][j]];
				}
				d = d2;
			}

			for(int j=0;j<52;j++){
				System.out.println(int2name(d[j]));
			}
			
	}
	
	static String int2name(int i){
		String name;
		String suit;
		if(i % 13<9){
			name = String.valueOf((i%13)+2);
		}else if(i% 13== 9){
			name = "Jack";
		}else if(i%13 == 10){
			name = "Queen";
		}else if(i%13 == 11){
			name = "King";
		}else{
			name = "Ace";
		}
		
		if(i/13==0){
			suit = "Clubs";
		}else if(i/13 == 1){
			suit = "Diamonds";
		}else if(i/13 == 2){
			suit = "Hearts";
		}else{
			suit = "Spades";
		}
		
		return name.concat(" of ").concat(suit);
	}
}

