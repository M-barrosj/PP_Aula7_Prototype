package FabricaDeViolaoPrototype;

public class Violao7Cordas extends ViolaoPrototype{

	@Override
	public String exibirInfo() {
		return("Modelo: Violão 7 Cordas \nNumero de cordas: 7 - Material: Nylon");
	}

	@Override
	public ViolaoPrototype clonar() {
		return (new Violao7Cordas());
	}

}
