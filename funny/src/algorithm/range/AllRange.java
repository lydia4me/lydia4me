package algorithm.range;


public class AllRange {
	public static void main(String[] args){
		String str = "123";
		char[] chs = str.toCharArray();
		fullRange(chs, 0, chs.length - 1);
	}

	private static void fullRange(char[] chs, int start, int end) {
		if(start == end){
			for(char c : chs){
				System.out.print(c);
			}
			System.out.println();
		}else{
			for(int i = start; i <= end; i ++){
				char temp = chs[i];
				chs[i] = chs[start];
				chs[start] = temp;
				
				fullRange(chs, start + 1, end);
				
				temp = chs[i];
				chs[i] = chs[start];
				chs[start] = temp;
			}
		}
	}
}
