package FabricaDeViolaoPrototype;

public class ViolaoClassico extends ViolaoPrototype {

	
	
	@Override
	public String exibirInfo() {
		return("Modelo: Viol�o Classico \nNumero de cordas: 6 - Material: Nylon");
	}

	@Override
	public ViolaoPrototype clonar() {		
		return(new ViolaoClassico());
	}
	

}
