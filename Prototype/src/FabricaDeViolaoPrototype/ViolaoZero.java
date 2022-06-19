package FabricaDeViolaoPrototype;

public class ViolaoZero extends ViolaoPrototype{

	@Override
	public String exibirInfo() {
		return("Modelo: Violão Zero/Duplo Zero/Triplo Zero \nTamanho: Menor/Medio/Maior");
	}

	@Override
	public ViolaoPrototype clonar() {
		return (new ViolaoZero());
	}

}
