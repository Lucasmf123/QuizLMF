
import java.util.ArrayList;
import java.util.Random;

public abstract class Padrao {

	//ArrayList
	public static ArrayList<Perguntas> conjuntoPerguntas = new ArrayList<>();
	
	//Array contendo tr�s n�meros aleat�rios
	public static int indicesAleatorios[] = new int[13];
	
	//M�todo obrigat�rio para cadastrar as perguntas no ArrayList
	public abstract void cadastrarPerguntas();
	
	//M�todo para gerar tr�s n�meros aleat�rios
	public static void gerarValoresAleatorios() {
		
		//Vari�veis
		int indicePrincipal = 0, obterNumeroGerado;
		boolean existe = false;
		
		//Inicializar o Array com -1
		for(int i = 0; i < 13; i++) {
			indicesAleatorios[i] = -1;
		}
		
		//La�o
		while(indicePrincipal < 13) {
			
			//Gerar n�mero aleat�rio entre 0 e 4
			Random r = new Random();
			obterNumeroGerado = r.nextInt(20);
			
			//Verificar se existe o n�mero no Array
			existe = false;
			for(int i = 0; i < 13; i++) {
				if(indicesAleatorios[i] == obterNumeroGerado) {
					existe = true;
				}
			}
			
			//Caso o n�mero n�o exista no Array
			if(existe == false) {
				for(int i = 0; i < 13; i++) {
					if(indicesAleatorios[i] == -1) {
						indicesAleatorios[i] = obterNumeroGerado;
						indicePrincipal++;
						break;
					}
				}
			}
			
			
		}
	}
	

	
}