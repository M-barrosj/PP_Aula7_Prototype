package FabricaDeViolaoPrototype;

public class ViolaoJumbo extends ViolaoPrototype{

	@Override
	public String exibirInfo() {
		return("Modelo: Violão Jumbo \nNumero de cordas: 6 - Material: Nylon");
	}

	@Override
	public ViolaoPrototype clonar() {
		return (new ViolaoJumbo());
	}
	

}
