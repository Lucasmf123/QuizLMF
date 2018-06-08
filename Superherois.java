
public class Superherois  extends Padrao{
	
	@Override
	public void cadastrarPerguntas() {
		
		//1� Objeto
		Perguntas p1 = new Perguntas();
		p1.setPergunta("Em qual filme do Homem-Aranha, Dr. Octopus ataca?");
		p1.setQuestaoA("Homem-Aranha 2");
		p1.setQuestaoB("Homem-Aranha 1");
		p1.setQuestaoC("Homem-Aranha 3");
		p1.setQuestaoD("O espetacular Homem-Aranha");
		p1.setResposta('a');
		Padrao.conjuntoPerguntas.add(p1);
		
		//2� Objeto
		Perguntas p2 = new Perguntas();
		p2.setPergunta("Como Hulk se transforma?");
		p2.setQuestaoA("Picado por uma aranha radioativa");
		p2.setQuestaoB("Uma radia��o c�smica");
		p2.setQuestaoC("Poderes que apareceram de repente");
		p2.setQuestaoD("Caiu no lixo t�xico");
		p2.setResposta('b');
		Padrao.conjuntoPerguntas.add(p2);
		
		//3� Objeto
		Perguntas p3 = new Perguntas();
		p3.setPergunta("De onde Super Homem veio?");
		p3.setQuestaoA("Kripton");
		p3.setQuestaoB("Terra");
		p3.setQuestaoC("Marte");
		p3.setQuestaoD("Plut�o");
		p3.setResposta('a');
		Padrao.conjuntoPerguntas.add(p3);
		
		//4� Objeto
		Perguntas p4 = new Perguntas();
		p4.setPergunta("Quem � o parceiro do Batman?");
		p4.setQuestaoA("Super Homem");
		p4.setQuestaoB("Lanterna Verde");
		p4.setQuestaoC("Robin");
		p4.setQuestaoD("Hulk");
		p4.setResposta('c');
		Padrao.conjuntoPerguntas.add(p4);
		
		//5� Objeto
		Perguntas p5 = new Perguntas();
		p5.setPergunta("Qual o maior inimigo do Homem-Aranha?");
		p5.setQuestaoA("Magneto");
		p5.setQuestaoB("Dr. Caveira");
		p5.setQuestaoC("Loki");
		p5.setQuestaoD("Venon");
		p5.setResposta('d');
		Padrao.conjuntoPerguntas.add(p5);
		
		Perguntas p6 = new Perguntas();
		p6.setPergunta("Qual foi o primeiro her�i da Am�rica?");
		p6.setQuestaoA("Homem de Ferro");
		p6.setQuestaoB("Hulk");
		p6.setQuestaoC("Thor");
		p6.setQuestaoD("Capit�o Am�rica");
		p6.setResposta('d');
		Padrao.conjuntoPerguntas.add(p6);
		
		Perguntas p7 = new Perguntas();
		p7.setPergunta("Qual � a mulher m�gica da Marvel Universe?");
		p7.setQuestaoA("Feiticeira Escalante");
		p7.setQuestaoB("Feiticeira Escalasse");
		p7.setQuestaoC("Feitu�uss");
		p7.setQuestaoD("Nenhuma das alternativas");
		p7.setResposta('b');
		Padrao.conjuntoPerguntas.add(p7);
		
		Perguntas p8 = new Perguntas();
		p8.setPergunta("Qual � o sobrenome de Zatanna, a mulher m�gica da Liga da Justi�a?");
		p8.setQuestaoA("Zatanes");
		p8.setQuestaoB("Zatara");
		p8.setQuestaoC("Zat�vez");
		p8.setQuestaoD("Zatarra");
		p8.setResposta('b');
		Padrao.conjuntoPerguntas.add(p8);
		
		Perguntas p9 = new Perguntas();
		p9.setPergunta("Qual o nome inteiro de Arlequina, a vil� de Batman e capacho de Coringa?");
		p9.setQuestaoA("Dr. Arle Quina");
		p9.setQuestaoB("Dr. Harley Quinzel");
		p9.setQuestaoC("Dr. Harleen Quinzel");
		p9.setQuestaoD("Dr. Harley Quina");
		p9.setResposta('c');
		Padrao.conjuntoPerguntas.add(p9);
		
		Perguntas p10 = new Perguntas();
		p10.setPergunta("Qual o nome do ator que fez Steve Rogers, vugo Capit�o Am�rica no filme Os Vingadores?");
		p10.setQuestaoA("Chris Evans");
		p10.setQuestaoB("Chris Brown");
		p10.setQuestaoC("Chris Hemsworth");
		p10.setQuestaoD("Chris Egan");
		p10.setResposta('a');
		Padrao.conjuntoPerguntas.add(p10);
		
		Perguntas p11 = new Perguntas();
		p11.setPergunta("Nos filmes \"Quarteto Fant�stico\" e \"Quarteto Fant�stico e o Surfista Prateado\", Chris Evans atuou como um personagem. No filme \"Os Vingadores\" ele atuou como outro personagem. Que personagens s�o esses?");
		p11.setQuestaoA("Tocha Humana e Thor");
		p11.setQuestaoB("Coisa e Thor");
		p11.setQuestaoC("Sr. Fant�stico e Capit�o America");
		p11.setQuestaoD("Tocha Humana e Capit�o Am�rica");
		p11.setResposta('d');
		Padrao.conjuntoPerguntas.add(p11);
		
		Perguntas p12 = new Perguntas();
		p12.setPergunta("Qual o nome do irm�o de Thor, o vil�o do filme \"Os Vingadores\"?");
		p12.setQuestaoA("Loki");
		p12.setQuestaoB("Loqui");
		p12.setQuestaoC("Koki");
		p12.setQuestaoD("Koqui");
		p12.setResposta('a');
		Padrao.conjuntoPerguntas.add(p12);
		
		Perguntas p13 = new Perguntas();
		p13.setPergunta("Thor e Capit�o Am�rica s�o de que grupo?");
		p13.setQuestaoA("Os Vingativos");
		p13.setQuestaoB("Liga da Justi�a");
		p13.setQuestaoC("Liga da Injusti�a");
		p13.setQuestaoD("Os Vingadores");
		p13.setResposta('d');
		Padrao.conjuntoPerguntas.add(p13);
		
		Perguntas p14 = new Perguntas();
		p14.setPergunta("Em que reino Thor nasceu?");
		p14.setQuestaoA("Asgard");
		p14.setQuestaoB("Eisgard (pronuncia-se Aisgard)");
		p14.setQuestaoC("Midgard");
		p14.setQuestaoD("Millygard");
		p14.setResposta('a');
		Padrao.conjuntoPerguntas.add(p14);
		
		Perguntas p15 = new Perguntas();
		p15.setPergunta("O reino de Midgard � que planeta?");
		p15.setQuestaoA("Marte");
		p15.setQuestaoB("Terra");
		p15.setQuestaoC("Reino de Odim (onde Thor nasceu)");
		p15.setQuestaoD("J�piter, o planeta dos Anel�deos (inimigos de Thor)");
		p15.setResposta('b');
		Padrao.conjuntoPerguntas.add(p15);
		
		Perguntas p16 = new Perguntas();
		p16.setPergunta("Como � o nome do ajudante digital do Homem de Ferro?");
		p16.setQuestaoA("Jarbas");
		p16.setQuestaoB("Stark Mobile");
		p16.setQuestaoC("Jarvis");
		p16.setQuestaoD("Alfred");
		p16.setResposta('c');
		Padrao.conjuntoPerguntas.add(p16);
		
		Perguntas p17 = new Perguntas();
		p17.setPergunta("Qual s�rie mostra um jovem, filho de um atirador de lesmas profissional, que vai para um mundo abaixo de nossos p�s, a Slugterra?");
		p17.setQuestaoA("Slugterraqueo");
		p17.setQuestaoB("Slugterr�neo");
		p17.setQuestaoC("Slugterra");
		p17.setQuestaoD("Herdeiros de Slugterra");
		p17.setResposta('b');
		Padrao.conjuntoPerguntas.add(p17);
		
		Perguntas p18 = new Perguntas();
		p18.setPergunta("Como Bruce vira o Hulk?");
		p18.setQuestaoA("Toda vez que vai em seu laborat�rio");
		p18.setQuestaoB("Quando fica chateado");
		p18.setQuestaoC("Quando fica com �dio");
		p18.setQuestaoD("Quando esta com sono");
		p18.setResposta('c');
		Padrao.conjuntoPerguntas.add(p18);
		
		Perguntas p19 = new Perguntas();
		p19.setPergunta("Qual o sobrenome de Bruce, o Hulk?");
		p19.setQuestaoA("Bruce");
		p19.setQuestaoB("Banner");
		p19.setQuestaoC("Bener");
		p19.setQuestaoD("Banana");
		p19.setResposta('b');
		Padrao.conjuntoPerguntas.add(p19);
		
		Perguntas p20 = new Perguntas();
		p20.setPergunta("Onde o Super-Homem cresceu?");
		p20.setQuestaoA("Metropolis");
		p20.setQuestaoB("National City");
		p20.setQuestaoC("Smallville (Pequen�polis)");
		p20.setQuestaoD("Kripton");
		p20.setResposta('c');
		Padrao.conjuntoPerguntas.add(p20);
		
		
	}

}