import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.Start();

	}

	private Map<String, String> mapa = new HashMap<String, String>();

	private void Start() {
		adicionarItensNoMapa();
		exibirValorPelaChave("SGS");
		iterarMapa();
	}

	private void adicionarItensNoMapa() {
		try {
			mapa.put("SRS", "Santa Rita do Sapuca�");
			mapa.put("PA", "Pouse Alegre");
			mapa.put("SGS", "S�o Gon�alo do Sapuca�");
			mapa.put("ZORO", "Concei��o dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
			
		} catch (Exception e) {
			 System.out.println("Ocorreu uma exce��o");
		}
		 		
	}

	private void exibirValorPelaChave(String chave) {
		String valorItem = mapa.get(chave);

		if (valorItem == null || valorItem.isEmpty()) {
			System.out.println("Esta chave n�o est� presente no mapa! " + chave);

		} else {
			System.out.println("O valor dessa chave eh: " + mapa.get(chave));
		}

	}

	private void iterarMapa() {
		System.out.println("------");

		for (String chave : mapa.keySet()) {
			System.out.println("chave: " + chave + " valor: " + mapa.get(chave));
		}
	}

}
