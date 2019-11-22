
public class HA1 {
	public static void main(String[] args) {
		byte a=127;
		short b=32767;
		char zeichen;
		int c=2147483647;
		long d=9223372036854775807L;
		boolean e=true;
		boolean f=false;
		double g=12.2;
		float h=11.2f;
		System.out.println("max byte= "+Byte.MAX_VALUE);
		System.out.println("min byte= "+Byte.MIN_VALUE);
		System.out.println("max short= "+Short.MAX_VALUE);
		System.out.println("min short= "+Short.MIN_VALUE);
		System.out.println("max int= "+Integer.MAX_VALUE);
		System.out.println("min int= "+Integer.MIN_VALUE);
		System.out.println("max long= "+Long.MAX_VALUE);
		System.out.println("min long= "+Long.MIN_VALUE);
		System.out.println("max double= "+Double.MAX_VALUE);
		System.out.println("min double= "+Double.MIN_VALUE);
		System.out.println("max float= "+Float.MAX_VALUE);
		System.out.println("min float= "+Float.MIN_VALUE);
		System.out.println("boolean= "+e+" or "+f);
		System.out.println("char= A-Z");
		System.out.println("********************************");
		int[] mass= {8,2,9,4,5,6};
		int min= mass[0];
		int max= mass[0];
		for(int i=0;i<mass.length; i++) {
			if(min>mass[i])
				min=mass[i];
			if(max<mass[i])
				max=mass[i];
			}
		System.out.println("min value= "+min);
		System.out.println("max value= "+max);
		}

		}
		
	
	

