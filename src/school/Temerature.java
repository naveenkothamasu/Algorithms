package school;

public class Temerature {

	public static void main(String[] args){
		
		int i = 0;
		double F = -1, C = -1;
		if(args.length != 2){
			System.out.println("Usage java Temperature -c 100");
			System.out.println("or java Temperature -f 70");
			return;
		}
		while(i<args.length){
			if(args[i].equalsIgnoreCase("-c")){
				C = Double.parseDouble(args[i+1]);
			}else if(args[i].equalsIgnoreCase("-f")){
				F = Double.parseDouble(args[i+1]);
			}
			i++;
		}
		if(F == -1 && C == -1){
			System.out.println("Usage java Temperature -c 100");
			System.out.println("or java Temperature -f 70");
			return;
		}
		
		if(C == -1){
			System.out.println("In Celcius : " + toConvert(C, F));
		}else{
			System.out.println("In Fahrenheit : " + toConvert(C, F));
		}
	}
	
	public static double toConvert(double C, double F){
		if(C == -1){
			C = (F-32.0)*100.0/180.0;
			return C;
		}else{
			F = 180.0*C/100.0 + 32;
			return F;
		}
	}
}
