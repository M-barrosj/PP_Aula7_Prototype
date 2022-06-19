package FabricaDeViolaoPrototype;

public class App {

	public static void main(String[] args) {
		
		ViolaoClassico prototipoViolao1 = new ViolaoClassico();
		ViolaoFolk prototipoViolao2 = new ViolaoFolk();
		
		ViolaoPrototype ViolaoClassico = prototipoViolao1.clonar();
		System.out.println(ViolaoClassico.exibirInfo());
		
		
		
		ViolaoPrototype ViolaoFolk = prototipoViolao2.clonar();
		System.out.println(ViolaoFolk.exibirInfo());
		
		
		ViolaoZero prototipoViolao3 = new ViolaoZero();
		
		ViolaoPrototype ViolaoZero = prototipoViolao3.clonar();
		System.out.println(ViolaoZero.exibirInfo());
		
		ViolaoPrototype ViolaoDuploZero = prototipoViolao3.clonar();
		
		System.out.println(ViolaoDuploZero.exibirInfo());
		
		ViolaoPrototype ViolaoTriploZero = prototipoViolao3.clonar();
		
		System.out.println(ViolaoTriploZero.exibirInfo());

	}

}
