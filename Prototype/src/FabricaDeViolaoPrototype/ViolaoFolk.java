package FabricaDeViolaoPrototype;

public class ViolaoFolk extends ViolaoPrototype{

	@Override
	public String exibirInfo() {		
		return ("Modelo: Viol�o Folk \nNumero de cordas: 6 - Material: A�o");
	}

	@Override
	public ViolaoPrototype clonar() {		
		return (new ViolaoFolk());
	}
	

}
