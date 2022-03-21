package facadepattern;

public class realizaConversao {

	private Converte PNG;
	private Converte JPG;
	private Converte JPEG;

	public realizaConversao() {
		PNG = new converterPNG();
		JPG = new converterJPG();
		JPEG = new converterJPEG();
	}

	public void convertendoPNG() {
		PNG.converter();
	}

	public void convertendoJPG() {
		JPG.converter();
	}

	public void convertendoJPEG() {
		JPEG.converter();
	}

}
