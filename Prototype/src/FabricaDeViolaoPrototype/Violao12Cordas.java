package FabricaDeViolaoPrototype;

public class Violao12Cordas extends ViolaoPrototype{

	@Override
	public String exibirInfo() {
		return("Modelo: Violão 12 Cordas \nNumero de cordas: 12 - Material: Nylon");
	}

	@Override
	public ViolaoPrototype clonar() {
		return(new Violao12Cordas());
	}

}
