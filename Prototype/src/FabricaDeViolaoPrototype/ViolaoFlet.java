package FabricaDeViolaoPrototype;

public class ViolaoFlet extends ViolaoPrototype{

	@Override
	public String exibirInfo() {
		return("Modelo: Viol�o Flet \nNumero de cordas: 6 - Material: Nylon");
	}

	@Override
	public ViolaoPrototype clonar() {
		return(new ViolaoFlet());
	}

}
