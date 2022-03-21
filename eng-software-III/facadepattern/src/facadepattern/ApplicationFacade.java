package facadepattern;

public class ApplicationFacade {

	public static void main(String[] args) {

		realizaConversao realizaConversao = new realizaConversao();

		realizaConversao.convertendoPNG();
		realizaConversao.convertendoJPG();
		realizaConversao.convertendoJPEG();

	}

}
