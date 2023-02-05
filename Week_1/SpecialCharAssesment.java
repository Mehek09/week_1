package DXC;



public class SpecialCharAssesment {

	public static String MoveSC(String str) {
		int len= str.length();
		String sc="[a-zA-Z0-9\\s++]";
		String a="",b="";
		for(int i=0;i<len;i++) {
			char c=str.charAt(i);
			if(String.valueOf(c).matches(sc)) {
				a=a+c;
			}
			else {
				b=b+c;
			}
		}
		return a+b;
	}
		public static void main(String args[]) {
				String str="He@$ll&o";
			System.out.println(MoveSC(str));
 }

}