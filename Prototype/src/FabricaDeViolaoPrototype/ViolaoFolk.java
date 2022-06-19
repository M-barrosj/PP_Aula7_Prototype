package FabricaDeViolaoPrototype;

public class ViolaoFolk extends ViolaoPrototype{

	@Override
	public String exibirInfo() {		
		return ("Modelo: Violão Folk \nNumero de cordas: 6 - Material: Aço");
	}

	@Override
	public ViolaoPrototype clonar() {		
		return (new ViolaoFolk());
	}
	

}
