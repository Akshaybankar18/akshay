package basicJavaCodes;

public class swapingNo {
		public static void main(String[] args) {
			
			String input = "kcHHCnjncjshfn$%^&&***129875";
			int uppercase=0;
			int lowercase=0;
			int number=0;
			int specialsymbol=0;
			char[] ch = input.toCharArray();
			for (char cr:ch) {
			if(cr>='A' && cr<='Z') {
				uppercase++;}
			else if (cr>='a' && cr<='z') {
				lowercase++;
			}
			else if(cr>='0' && cr<='9'){
				number++;
			}else  {specialsymbol++;} {
				
			}
			}
			{ System.out.println(uppercase);
			System.out.println(lowercase);
			System.out.println(number);
			System.out.println(specialsymbol);
			}
		}
	}



