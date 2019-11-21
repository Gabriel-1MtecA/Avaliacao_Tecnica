import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio{
	public static void main(String args []) {
		Scanner in = new Scanner (System.in);
		int m,vv,op,pa,re = 0;
		double money,tg,res,pc,z,ju;
		System.out.println("Digite o programa que será executado (1 ou 2)");
		vv=in.nextInt();
		if(vv!=2 && vv!=1){
			System.out.println("Você escolheu um número que nao está entre as escolhas...");
		}
		if(vv==1) {
		System.out.println("Digite o valor a ser investido");
		money = in.nextDouble();
		System.out.println("Digite a quantidade de meses");
		m = in.nextInt();
		renda(m, money, money);	
		}
		if(vv==2) {
			System.out.println("Informe o valor total  que irá pagar: ");
			z=in.nextDouble();
			System.out.println("Informe a forma de pagamento: ");
			System.out.println("1 A vista com 10% de desconto");
			System.out.println("2 Parcelar em 2x");
			if (z>=100) {
			System.out.println("3 Pacelar de 3 a 10 vezes");
			}
			re=in.nextInt();
			if (re==3) {
				     System.out.println("Quantas parcelas você deseja pagar?");
				pa=in.nextInt();
				parce10 (z,pa);
			}
			else if(re==2) {
				parce2(z);
			}
			else if(re==1) {
				avista(z);
			}
		}
	}
		
	
		public static double renda(int m,double money,double res ) {
			for (int i = 1; i<=m; i++) {
				res = (money*1)/100;
				money = money +res;
				DecimalFormat formatador = new DecimalFormat("0.00");
				System.out.println("Após o "+i+ "°mês ele terá um total de "+formatador.format(money));
				}
			return res;
		 
	}
		
		
		
		public static void avista (double v) {
			
		    double d = v;
		d = d*10/100;
		v=v-d;
		
		System.out.println("O total que irá pagar é: "+v);
	}
	
	public static void parce2 (double v) {
		v= v/2;
		
		System.out.println("O valor total a pagar parcelado em 2x é: "+v);
	}
	
	public static void parce10 (double v, int pa) {
		v=v/pa;
		double ju=0;
		
		for (int i=1;i<=pa;i++) {
			ju = pa*0.03;
		}
		ju= ju*pa;
		v=v+ju;
		System.out.printf("O valor total a pagar é: %.2f",v);
	}
}