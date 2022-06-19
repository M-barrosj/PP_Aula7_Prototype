package FabricaDeViolaoPrototype;

public class ViolaoZero extends ViolaoPrototype{

	@Override
	public String exibirInfo() {
		return("Modelo: Viol�o Zero/Duplo Zero/Triplo Zero \nTamanho: Menor/Medio/Maior");
	}

	@Override
	public ViolaoPrototype clonar() {
		return (new ViolaoZero());
	}

}
