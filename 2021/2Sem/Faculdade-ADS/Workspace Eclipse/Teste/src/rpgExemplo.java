//DAWN OF DARNESS

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;

class rpgExemplo {
	
  static int temp_dialog =70, temp_narrativa = 150, temp_transicao = 25; //Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 variáveis para 0;
  public static void main(String[] args) throws Exception{
    Scanner entrada = new Scanner (System.in);
    Digita("\nMestre: Está pronto para vivenciar o verdadeiro desespero... hã, digo, aventura?",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.println("\n1 - Sim | 2 - Com certeza! |3 - Não sei não hein...");
    int escolha_menu = entrada.nextInt();
        if(escolha_menu == 1 || escolha_menu == 2){
          Digita("\nMestre: Conheça o alvorecer da escuridão!",TimeUnit.MILLISECONDS, temp_dialog);
          menu();
        }else if(escolha_menu == 3){
           Digita("\nMestre: Não se engane jovem, não é como se você tivesse muita escolha... Abrace o destino!",TimeUnit.MILLISECONDS, temp_dialog);
           menu();
        }else{
            Digita("\nMestre: Mesmo digitando uma opção inválida, seu destino lhe aguarda! Viva muito, explore, venca seus desafios e encontre a cura...",TimeUnit.MILLISECONDS, temp_dialog);
           menu();
        }}
    static void menu() throws Exception {
    Scanner entrada = new Scanner (System.in);
    int escolha_menu;
    do{
    Digita("\n\n..:: DAWN OF DARKNESS ::.. \n\n1 - Jogar \n2 - Capítulos\n3 - Créditos \n4 - Sair",TimeUnit.MILLISECONDS, temp_transicao);
    System.out.println("\n");
    escolha_menu = entrada.nextInt();
    if(escolha_menu == 1){
              jogo();
    }
    else if(escolha_menu == 2){
             capitulos();
    }
    else if(escolha_menu == 3){
          creditos();
    }
    else if(escolha_menu == 4){
          System.exit(0);
    }
    else{
      System.out.println("\nOpção inválida, digite novamente: ");
    }}while(escolha_menu !=1 && escolha_menu !=2 && escolha_menu !=3 && escolha_menu !=4);
    }
     static void creditos()throws Exception {
     Scanner entrada = new Scanner (System.in);
        int escolha_menu, temp_narrativa = 150;
        Digita("\n\n</> Desenvolvedores </>\n\n-> Ygor Oliveira \n-> Fillipe Vital \n-> Gabriely Barbosa \n-> Rodrigo Shuttleton \n-> Yasmim Candelária",TimeUnit.MILLISECONDS, temp_narrativa);
        do{
        System.out.println("\n2 - Sair");
        escolha_menu = entrada.nextInt();
        if(escolha_menu == 2){
          menu();
        }else{
           System.out.println("\nOpção inválida, digite novamente: ");
        }}while(escolha_menu!=2);
     }
     static void capitulos()throws Exception {
     Scanner entrada = new Scanner (System.in);
        int escolha_capitulo;
        System.out.println("\n..:: DAWN OF DARKNESS - Capítulos da História ::..");
        do{
        System.out.println("\n\n1 - A Taverna dos Aventureiros\n2 - A Floresta dos Desafios\n3 - A culpa é sua, não minha!\n4 - Voltar");
        escolha_capitulo = entrada.nextInt();
        if(escolha_capitulo == 1){
          capitulo_1();
        }else if(escolha_capitulo == 2){
           capitulo_2();
        }else if(escolha_capitulo == 3){
           capitulo_3();
        }else if(escolha_capitulo == 4){
          menu();
        }else{
          System.out.println("\nOpção inválida, digite novamente: ");
        }}while(escolha_capitulo!=1 && escolha_capitulo!=2 &&escolha_capitulo!=3 &&escolha_capitulo!=4);
     }

          static void jogo()throws Exception{
          Scanner entrada = new Scanner (System.in);
          Digita("\nMestre: Hmm... veja só o que temos por aqui, será um corajoso ou um curioso? \n\nBem... vamos lá...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\nMestre: Para começarmos, por favor, diga-me o seu nome.",TimeUnit.MILLISECONDS, temp_dialog);
          System.out.println("\n");
          String nome_aventureiro = entrada.next();
          Digita("\nMestre: Seja bem-vindo(a), ao intenso mundo de Alduin, " + nome_aventureiro + "!",TimeUnit.MILLISECONDS, 50);
          Digita("\n\nMestre: A partir daqui, serei seu guia e companheiro nesta jornada, pode me chamar de mestre.",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Gostaria de saber mais sobre a história do mundo no qual você está prestes a entrar ou ir direto para o jogo?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu;
          do{
          System.out.println("\n\n1 - Conte-me mais, mestre!");
          System.out.println("2 - Podemos ir direto para o jogo?");
          System.out.println("3 - Voltar");
          escolha_menu = entrada.nextInt();
          if(escolha_menu == 1){
          Digita("\n\nMestre: Muito bem, por onde começar...?",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nEsta é a história de um mundo mágico e incrível chamado Alduin.\nAlduin é um mundo repleto de vida, esperança e prosperidade, diversas criaturas e animais vivem em harmonia. Alduin é dividido em 4 grandes nações, são elas: \n\n1) O Norte comandado pela corte de Elizabeth Clarke. Domínio dos bruxos.\n2) O Leste comandado pelos cavaleiros do reino de Luke Yeagher.\n3) O Sul comandado pelos Elfos e criaturas miticas. Seu maior empério fica na capital de Elfheim.\n4) E o Oeste comandado pelos Demônios e Monstros Ancestrais. \n\nUma praga se espalha pelas sombras, desolando toda a vida existente em Alduin, aquele que contrai a praga certamente morre em um mês. A praga destrói as suas forças e apodrece aos poucos seus orgãos, ninguém sabe quem ou o que é o causador dessa doença, mas existem rumores de que ela teve início mas redondezas do Oeste. Território dos demônios.",TimeUnit.MILLISECONDS, temp_dialog);
                  
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Neste mundo você assumirá o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          capitulo_1();
          capitulo_2();
          capitulo_3();

          }else if(escolha_menu == 3){
                 menu();
          }
          else if(escolha_menu == 2){
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Neste mundo você assumirá o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          capitulo_1();
          capitulo_2();
          capitulo_3();
    
          }else{
            System.out.println("\nOpção inválida!");
          }
          }while(escolha_menu!= 1 ||escolha_menu!= 2 || escolha_menu!= 3);
          }

        static void capitulo_1() throws Exception{

        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Capítulo 1 - A Taverna dos Aventureiros!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
        Digita("\n\nMestre: 14 dias após sair com seu exército em busca da cura para seu pai, você se encontra em uma taverna isolada da cidade e civilização. \n\nO lugar está em pedaços, claramente dá para perceber que esta taverna já teve seus momentos de gloria e felicidade, mas atualmente poucas pessoas ainda frequentam este local e as poucas restantes estão doentes ou em sofrimento.\n\nO dono da taverna é um velho anão, sem esperanças na vida, sua única fonte de renda era a taverna e com a chegada da praga seus lucros caíram muito. Mas mesmo assim ele continua com seu sorriso no rosto a ajudar quem for preciso na região.\nO taverneiro enquanto limpava o balcão se aproxima de você e pergunta:",TimeUnit.MILLISECONDS, temp_dialog);
        int resposta_menu;
        Digita("\n\nTaverneiro (Anão): Jovem rapaz, está tudo bem? Não acha que já bebeu muito? Algo lhe ocorreu?",TimeUnit.MILLISECONDS, temp_dialog);
        do{
        System.out.println("\n1 - Sim está tudo bem... | 2 - Não estou afim de conversar, anão...");
        resposta_menu = entrada.nextInt();
          if(resposta_menu != 1 && resposta_menu != 2){
              Digita("\n\nTaverneiro (Anão): Desculpe meu jovem, poderia repetir..?",TimeUnit.MILLISECONDS, temp_dialog);
          }
        }while(resposta_menu!=1 && resposta_menu!=2);
        Digita("\n\nMestre: O taverneiro ao ouvir suas palavras graves e fortes, lhe dá um sorriso e apenas continua a limpar sua taverna...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Você não ficou bebado devido a sua alta resistência, porém encontra-se em tremendo luto e angustia pois perdeu muitos amigos na busca pela cura de seu pai... O ato ocorreu em uma feroz batalha... além disso seu pai está com a praga e provavelmente morrerá no próximo inverno... você não sabe a quem recorrer, e não sabe à causa dessa doença...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Pouco tempo depois surge um homem, com roupas pretas e uma capa grande com capuz. Logo atrás dele entra uma Elfa de pele clara que vestia uma capa esverdeada que ia de seus ombros até o chão. Os dois seguem até o balcão aonde você está e sentam ao seu lado.",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\n** Tensão no ar **",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nHomem do capuz: Já faz muito tempo, não é jovem principe da capital de Luke Yeagher?",TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_menu3, escolha_menu4;
        do{
        System.out.println("\n\n1 - Quem é você?");
        System.out.println("2 - Por favor estranho, não estou afim de joguinhos..");
        escolha_menu3 = entrada.nextInt();
        if(escolha_menu3 == 1 || escolha_menu3 == 2){
          Digita("\n\nHomem do capuz: Hahahaha, não se lembra mais..?",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\n** Observa **",TimeUnit.MILLISECONDS, temp_narrativa);
          do{
          System.out.println("\n\n1 - Espera ai, você é Rosswald? O grande bruxo Rosswald?!!");
          escolha_menu4 = entrada.nextInt();
          if(escolha_menu4!= 1){
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu4!=1); 
        }else{
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(escolha_menu3 != 1 && escolha_menu3 == 2);
        Digita("\n\n** O homem tira o capuz **",TimeUnit.MILLISECONDS, temp_narrativa);
          Digita("\n\nRosswald: Da última vez que te vi você era uma criança, jovem principe!",TimeUnit.MILLISECONDS, temp_dialog); 
          Digita("\n\nRosswald: Vejo que amadureceu bastante, hein. A capital inteira de Luke Yeagher está dizendo que você está procurando a cura da praga...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nRosswald: Eu e minha companheira Idril temos pistas que talvez possam ajuda-lo, pistas que nos levam para o Oeste, Terra dos Demônios...",TimeUnit.MILLISECONDS, temp_dialog);  
          Digita("\n\nIdril (Elfa): Meu nome é Idril, soubemos do que aconteceu com os seus companheiros na busca pela floresta sombria... sinto muito.",TimeUnit.MILLISECONDS, temp_dialog);   
          Digita("\n\nIdril (Elfa): O fato é que as criaturas da floresta elfica estão morrendo pela praga, creio que podemos fazer uma parceria para investigar essas pistas... Não aguento mais perder vida inocentes por essa doença!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nRosswald: Não se sinta obrigado a nos ajudar meu jovem principe, apenas não quero vê-lo em total desolação. Movido pelas suas motivações e de Idril, podemos partir agora! O que me diz?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu5, escolha_menu6;
          do{
          System.out.println("\n\n1 - E como eu poderia ajuda-los?");
          escolha_menu5 = entrada.nextInt();
          if(escolha_menu5!= 1){
            Digita("\n\nMestre: O homem não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu5!=1);
            Digita("\n\nIdril: Nos acompanhando até o Caverna do Demônio! Às pistas nos dizem que o Rei Demônio é o causador dessa praga...",TimeUnit.MILLISECONDS, temp_dialog);
          do{
          System.out.println("\n\n1 - O Rei Demônio...? Maldito...");
          escolha_menu6 = entrada.nextInt();
          if(escolha_menu6!= 1){
            Digita("\n\nMestre: A Idril não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu6!=1);
          Digita("\n\nRosswald: E ai meu jovem, pronto para partirmos?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu7, escolha_menu8;
          do{
          System.out.println("\n\n1 - Montar a parceria \n2 - Não participar dessa busca.");
          escolha_menu7 = entrada.nextInt();
          if(escolha_menu7!= 1 && escolha_menu7!= 2){
            Digita("\n\nMestre: A Idril não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }
          else if(escolha_menu7 == 2){
            Digita("\n\nIdril: Este jovem está muito abalado, Rosswald. Vamos embora.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nRosswald: Bom amigão, entendo sua dor... Porém não temos mais tempo a perder aqui. Que a sorte esteja sempre ao seu lado...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Os dois saem da taverna e você continua bebendo, bebendo e bebendo...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\n** 2 meses depois **",TimeUnit.MILLISECONDS, temp_narrativa);
            Digita("\n\nMestre: O tempo passou e você não conseguiu encontrar a cura, seu pai morreu e mundo está em repleto caos.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Às vezes, só o que a gente precisa é de companheiros... O que poderia ter acontecido caso tivesse feito a parceria? Tarde demais para pensar.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Agora só lhe resta morrer pela praga, bravo cavaleiro...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\n** Fim de Jogo **",TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n\n\n\n");
            System.exit(0);
          }
          else if(escolha_menu7 == 1){
                Digita("\n\nIdril: Perfeito!!! Rosswald, juntos eu sei que conseguiremos.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: Ah sim, levante meu jovem principe, vamos conseguir salvar seu pai e a floresta elfica, eu garanto.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Você vira seu último caneco de cerveja **",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: E juntos, vocês partem para o Oeste, para Caverna do Rei Demônio!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nTaverneiro (Anão): EI! Jovem cavaleiro?",TimeUnit.MILLISECONDS, temp_dialog);
                int escolha_menu9;
                do{
                   System.out.println("\n\n1 - O quê?");
                     escolha_menu9 = entrada.nextInt();
                      if(escolha_menu9!= 1){
                      Digita("\n\nMestre: O taverneiro não ouviu o que você falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu6!=1);
                      Digita("\n\nTaverneiro (Anão): Boa sorte na sua busca! Sei que seus amigos irão lhe ajudar!",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\n\nMestre: E juntos vocês partem para aventura!",TimeUnit.MILLISECONDS, temp_dialog);

          }}while(escolha_menu7!= 1 && escolha_menu7!= 2);

     }
     static void capitulo_2() throws Exception{
        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Capítulo 2 - A Floresta dos Desafios!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
         Digita("\n\n** 1 dia de viagem se passa ** ",TimeUnit.MILLISECONDS, temp_narrativa);
         Digita("\n\nMestre: Para chegar na Caverna do Rei Demônio, vocês precisam passar por uma floresta de desafios. Segundo minhas pesquisas a respeito, muitas pessoas que adentram-na, dficilmente saem vivos...",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\n** Tensão no ar **",TimeUnit.MILLISECONDS, temp_narrativa);
         Digita("\n\nMestre: Vocês chegam na floresta e ficam de guarda alta, pois a qualquer momento inimigos podem aparecer...",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Reza a lenda que lobos gigantes circulam nesta floresta... e, infelizmente, três lobos cercam vocês... se quiserem evitar que mais apareçam, precisarão responder uma pergunta.",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Só para avisar, para cada resposta errada a quantidade de lobos para enfrentar aumentará para 6, depois para 9, 12 e assim sucessivamente. Às alternativas estarão aleatoriamente bagunçadas, isto posto, fique atento bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Vocês aguentarão combater no máximo 6 lobos! Acima disso, a sorte que dirá o destino de vocês...",TimeUnit.MILLISECONDS, temp_dialog);

          String a,b,c,d,e, pergunta_embaralhada, resposta_questao01;
          int qtd_lobos = 3, qtd_goblins = 0, resp_dado, random, resp_skill, escolha_fugir;
        a = "a) Apenas 3.";
        b = "b) 25 e 3.";
        c = "c) 25 e – 2.";
        d = "d) 3 e – 2.";
        e = "e) Apenas – 2.";
        do{
        ArrayList<String> alternativas = new ArrayList<String>();
        alternativas.add(0,a);
        alternativas.add(1,b);
        alternativas.add(2,c);
        alternativas.add(3,d);
        alternativas.add(4,e);

        Collections.shuffle(alternativas);
        Collections.shuffle(alternativas);
        Collections.shuffle(alternativas);

        pergunta_embaralhada = "\n\nMestre: Quais são às raízes reais da equação x2 – x = 6?" + "\n\n" +alternativas.get(0)+ "\n" +alternativas.get(1)+ "\n" +alternativas.get(2)+ "\n" +alternativas.get(3)+ "\n" +alternativas.get(4);
        System.out.println(pergunta_embaralhada);
        resposta_questao01 = entrada.next();
        switch (resposta_questao01) {
          case "a":
          case "A":
          case "b":
          case "B":
          case "c":
          case "C":
          case "e":
          case "E":
          qtd_lobos = qtd_lobos+3;
          Digita("\n\nMestre: Cavaleiro, você errou.",TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "d":
          case "D":
          Digita("\n\nMestre: Se preparem! "+ qtd_lobos + " lobos estão à caminho!",TimeUnit.MILLISECONDS, temp_dialog);
          if(qtd_lobos > 6){
            random = 1 + (int) (Math.random() * 6); 
            Digita("\n\nMestre: Vocês foram avisados, tudo agora dependerá da sorte de vocês... lance o dado, igual ou acima de 4 vocês vivem, caso contrário vocês morrem.",TimeUnit.MILLISECONDS, temp_dialog);
              do{
              Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Dado de 6 lados.",TimeUnit.MILLISECONDS, temp_transicao);
              Digita("\n\nRodar os dados? ",TimeUnit.MILLISECONDS, temp_transicao);
              Digita("\n\n1 - Vamos lá!!!",TimeUnit.MILLISECONDS, temp_transicao);
               System.out.println("\n");
              resp_dado = entrada.nextInt();
              if(resp_dado != 1){
               Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, 25);
               }}while(resp_dado!=1); 
               
              if(random >= 4){
               Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
               Digita("\n\nDado: "+random,TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nMestre: Parece que o dia de sua morte ainda não chegou cavaleiro... Enfrente os lobos.",TimeUnit.MILLISECONDS, temp_dialog);
              }else{
                Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nDado: "+random,TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nLobos: Aarrrrh aaarrhhh",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: Ei ei ei ei ei ei ei não vamos conseguir enfrentar tantos...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: Rosswald! Não há como fugir, o que vamos faremos?",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: ROSSWALD, ROSSWAAAAAAAAAAAAAALD!!!!!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nRosswald: NÃÃÃÃÃÃÃÃÃOOOOOOOOO!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                do{
                System.out.println("\n\n1 - Fugir...");
                escolha_fugir = entrada.nextInt();
                if(escolha_fugir!= 1){
                Digita("\n\nMestre: Ação inválida.",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_fugir!=1); 
                Digita("\n\nMestre: Hummm, entendo... quando um dificil desafio nos é posto a prova, revelamos nossa verdadeira natureza.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Os lobos o devoram inteiro em alguns segundos ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                System.exit(0);
              }}
          break;
          default:
          Digita("\n\nMestre: Desculpe jovem cavaleiro, eu não consegui ouvi-lo, pode repetir?",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(!resposta_questao01.equals("D") && !resposta_questao01.equals("d"));

               Digita("\n\nRosswald: VENHAM PRA CIMA, AAAAAAAAAAAAAAAHHHHHH!!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nRosswald: TROVÃO LUPINO!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nIdril: FÚRIA DE ELFHEIM!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nMestre: Chegou a hora de usar suas habilidades!",TimeUnit.MILLISECONDS, temp_dialog);
               do{
               System.out.println("\n\n1 - CORTE ESPECTRAL DE LUKE YEAGHER \n2 - PRINCIPE FANTASMA");
                resp_skill = entrada.nextInt();
                if(resp_skill != 1 && resp_skill != 2){
                   Digita("\n\nMestre: Eu não ouvi direito, cavaleiro.",TimeUnit.MILLISECONDS, temp_dialog);
                }}while(resp_skill != 1 && resp_skill!= 2);
                 Digita("\n\nMestre: Vocês mataram os lobos, porém ao chegarem na entrada da Caverna do Rei Demônio, se deparam com 5 goblins guardiões.",TimeUnit.MILLISECONDS, temp_dialog);
                 Digita("\n\nIdril: O que faremos, Rosswald?",TimeUnit.MILLISECONDS, temp_dialog);
                 Digita("\n\nRosswald: Podemos enfrentá-los, ou tentar a sorte procurando por alguma entrada alternativa...",TimeUnit.MILLISECONDS, temp_dialog);
                 
                 int pontuacao = 0,resp_entrada;
              do{
               System.out.println("\n\n1 - Enfrentar os Goblins Guardiões \n2 - Procurar por outra entrada.");
                resp_entrada = entrada.nextInt();
                if(resp_entrada == 1){
                Digita("\n\nMestre: Cavaleiro corajoso! Para vencer os goblins você precisará responder 3 perguntas e acertar no mínimo duas delas. Às questões a seguir não poderão ser respondidas novamente. Se você não acertar pelo menos duas, então o cruel combate contra os goblins dependerá da sorte...",TimeUnit.MILLISECONDS, temp_dialog);
               


          String resp_bhaskara; 
          do{
          Digita("\n\nMestre: Aplicando a fórmula de Bhaskara, resolva as seguintes equações do 2º grau. \n\na) 3x² – 7x + 4 = 0\n\nb) 9y² – 12y + 4 = 0\n\nc) 5x² + 3x + 5 = 0\n\nEm seguida, digite a alternativa com os resultados corretos.",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n\nA) Resolução -> a = S{4/3,1} | b = S{2/3,2/3} | c = Não possuem raízes. ");
        System.out.println("\nB) Resolução -> a = S{5/3,2} | b = S{3/2,4/3} | c = Não possuem raízes. ");
        System.out.println("\nC) Resolução -> a = S{4,1} | b = S{2/3,2/3} | c = Não possuem raízes. ");
        System.out.println("\nD) Resolução -> a = Não possuem raizes | b = S{2/3,2/3} | c = Não possuem raízes. ");
        System.out.println("\nE) Resolução -> a = Não possuem raizes | b = S{2/3,2/3} | c = S{4/3,1}");
        System.out.println("\n\nDigite a alternativa correta: ");
        resp_bhaskara = entrada.next();
        switch (resp_bhaskara) {
          case "e":
          case "E":
          case "b":
          case "B":
          case "c":
          case "C":
          case "d":
          case "D":
          Digita("\n\nMestre: Resposta errada, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Pontuação igual à "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "a":
          case "A":
          pontuacao = pontuacao+1;
          Digita("\n\nMestre: Resposta certa, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Pontuação igual à "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          default:
          Digita("\n\nMestre: Desculpe cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(!resp_bhaskara.equals("A") && !resp_bhaskara.equals("a") && !resp_bhaskara.equals("b") && !resp_bhaskara.equals("B") && !resp_bhaskara.equals("c") && !resp_bhaskara.equals("C") && !resp_bhaskara.equals("d") && !resp_bhaskara.equals("D") && !resp_bhaskara.equals("e") && !resp_bhaskara.equals("E"));
        

        String resp_equacao;
        do{
        Digita("\n\nMestre: Determine cada elemento da seguinte equação: x2 – 4x – 5 = 0",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n\nA) Resolução -> a = 1 | b = -5 | c = 4");
        System.out.println("\nB) Resolução -> a = -5 | b = -4 | c = 1");
        System.out.println("\nC) Resolução -> a = 0 | b = -4 | c = -5");
        System.out.println("\nD) Resolução -> a = -5 | b = 0 | c = 1");
        System.out.println("\nE) Resolução -> a = 1 | b = -4 | c = -5");
        System.out.println("\n\nDigite a alternativa correta: ");
        resp_equacao = entrada.next();
        switch (resp_equacao) {
          case "a":
          case "A":
          case "b":
          case "B":
          case "c":
          case "C":
          case "d":
          case "D":
          Digita("\n\nMestre: Resposta errada, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Pontuação igual à "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "e":
          case "E":
          pontuacao = pontuacao+1;
          Digita("\n\nMestre: Resposta certa, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Pontuação igual à "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          default:
          Digita("\n\nMestre: Desculpe cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(!resp_equacao.equals("A") && !resp_equacao.equals("a") && !resp_equacao.equals("b") && !resp_equacao.equals("B") && !resp_equacao.equals("c") && !resp_equacao.equals("C") && !resp_equacao.equals("d") && !resp_equacao.equals("D") && !resp_equacao.equals("e") && !resp_equacao.equals("E"));

    int vetor[] = new int [5], num_aleatorio, roda_dado, resp_dado_goblins;
    String resposta_mestre="";
    for (int i = 0;i<vetor.length;i++){
      num_aleatorio = 1 + (int) (Math.random() * 10);
      vetor[i] = num_aleatorio;
    }

    Digita("\n\nMestre: A 3ª pergunta, fica a critério de sua sorte. De 1 a 10, eu pensarei em exatamente 5 números e poderão ser eles repetidos e diferentes (não seguirá nenhuma ordem), desta forma você precisará acertar apenas 1 desses 5.",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.print("\n\nTente acertar: ");
     int num = entrada.nextInt();
     for (int i = 0;i<vetor.length;i++){
         if(num == vetor[i]){
            resposta_mestre = "\n\nMestre: Você acertou, boa!";
            pontuacao=pontuacao+1;
            break;
        
         }else{
            resposta_mestre = "\n\nMestre: Infelizmente você errou.";
         }
         }
         Digita("\n\nMestre: Veja só os números que pensei: ",TimeUnit.MILLISECONDS, temp_dialog);
         System.out.print("\n");
          for (int i = 0;i<vetor.length;i++){ 
            System.out.println("\n"+(i+1)+"º número = "+vetor[i]);
            }
          Digita(resposta_mestre,TimeUnit.MILLISECONDS, temp_dialog); 
          Digita("\n\nMestre: Pontuação nas questões = "+(pontuacao),TimeUnit.MILLISECONDS, temp_dialog);
            if(pontuacao >=2){
                  Digita("\n\nMestre: Enfrentem os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
            }else if(pontuacao < 2){
            Digita("\n\nMestre: Vocês foram avisados, tudo agora dependerá da sorte de vocês... lance o dado, igual ou acima de 4 vocês vivem, caso contrário vocês morrem.",TimeUnit.MILLISECONDS, temp_dialog);
              roda_dado = 1 + (int) (Math.random() * 6); 
              do{
               Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Dado de 6 lados.",TimeUnit.MILLISECONDS, temp_transicao);
               Digita("\n\nRodar os dados? ",TimeUnit.MILLISECONDS, temp_transicao);
               Digita("\n\n1 - Vamos lá!!!",TimeUnit.MILLISECONDS, temp_transicao); 
               System.out.println("\n");
               resp_dado_goblins = entrada.nextInt();
               System.out.println("\n");
               if(resp_dado_goblins != 1){
               Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
               }}while(resp_dado_goblins != 1);
                Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nDado: "+roda_dado,TimeUnit.MILLISECONDS, temp_dialog);
                if(roda_dado<4){
                Digita("\n\nGoblins: Matem eles!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: NÃÃÃO! Idril, fuja! Eles são fortes demais...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nIdril: ROSSWALD, NÃO... SEUS MALDITOS, IRÃO PAGAR POR ISSO!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: QUEIMEEEEEEEEM!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril conjura fogo com seu cajado ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: Mesmo com suas fortes habilidades de fogo, não foi suficiente...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: Só restou você em batalha, jovem cavaleiro. O que vai fazer?",TimeUnit.MILLISECONDS, temp_dialog);
                do{
                System.out.println("\n\n1 - Fugir... \n2 - Lutar");
                escolha_fugir = entrada.nextInt();
                if(escolha_fugir!= 1 && escolha_fugir!= 2){
                Digita("\n\nMestre: Ação inválida.",TimeUnit.MILLISECONDS, temp_dialog);
                }
                else if(escolha_fugir == 2){
                    Digita("\n\nMestre: Realmente muito corajoso, porém você sozinho não conseguirá...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Coragem nem sempre é a resposta meu jovem, é nos momentos de desespero onde mais precisamos manter a racionalidade...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Lembre-se disso...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins te devoram ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    System.exit(0);
                }
                else if(escolha_fugir == 1){
                    Digita("\n\nMestre: Fugir? E eu pensando que cavaleiros eram corajosos...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Não há como fugir meu jovem, encare seu destino.",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Aceitação é o primeiro passo para compreensão de um erro. Aprenda e faça melhor na próxima aventura...",TimeUnit.MILLISECONDS, 70);
                    Digita("\n\n** Goblins te devoram ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    System.exit(0);
                }}while(escolha_fugir!= 1 && escolha_fugir!= 2); 
         
                }else if(roda_dado>=4){
                      Digita("\n\nMestre: Enfrentem os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
                }
            }
        
                Digita("\n\nIdril: SONO CELESTIAL!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril coloca 2 grandes goblins para dormir **",TimeUnit.MILLISECONDS, temp_narrativa); 
                Digita("\n\nRosswald: BOLA DE FOGO!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald queima 2 goblins **",TimeUnit.MILLISECONDS, temp_narrativa); 
                Digita("\n\nMestre: Chegou a hora de usar suas habilidades!",TimeUnit.MILLISECONDS, temp_dialog);
                int escolha_de_habilidade;
                do{
                System.out.println("\n\n1 - CORTE ESPECTRAL DE LUKE YEAGHER \n2 - PRINCIPE FANTASMA");
                escolha_de_habilidade = entrada.nextInt();
                if(escolha_de_habilidade != 1 && escolha_de_habilidade != 2){
                   Digita("\n\nMestre: Eu não ouvi direito, cavaleiro.",TimeUnit.MILLISECONDS, temp_dialog);
                }}while(escolha_de_habilidade != 1 && escolha_de_habilidade!= 2);
                Digita("\n\n* Todos os goblins morrem **",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: E juntos vocês entram na Caverna do Rei Demônio...",TimeUnit.MILLISECONDS, temp_dialog); 


         }
                else if(resp_entrada == 2){
                  Digita("\n\nMestre: Muito bem, há exatamente 10 rotas alternativas que parecem indicar uma entrada para Caverna, porém apenas uma dessas rotas permitirá que vocês entrem... Você terá apenas 5 chances para descobrir. Caso seguiam pelo caminho errado 5 vezes, os goblins serão alertados e todos vocês morrerão da maneira mais rápida e cruel que conseguem imaginar... Que comece o desafio!",TimeUnit.MILLISECONDS, temp_dialog);
                  System.out.print("\n");
                  for(int i = 1; i<= 10;i++){
                        Digita("\n"+i+" - para seguir na "+i+"ª rota aleatória.",TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  int rota_escolhida, tentativas = 0;
                  int rota_aleatoria = 1 + (int) (Math.random() * 10);
                  do{
                  Digita("\n\nMestre: Escolha uma rota para seguir: ",TimeUnit.MILLISECONDS, temp_dialog);
                  rota_escolhida = entrada.nextInt();
                  if(tentativas==4){
                  Digita("\n\nMestre: Os goblins foram alertados...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** Um deles arranca a cabeça de Rosswald **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\n** Na sequência, os goblins arrancam fora às suas pernas **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\nMestre: Sem tempo sequer para reagir, você observa Idril inutilmente tentando lutar...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** Você morre enquanto assistia Idril ser devorada **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\nMestre: Para sobreviver aos grandes desafios da vida, às vezes uma boa intuição pode nos ajudar...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** Fim de Jogo **",TimeUnit.MILLISECONDS, temp_narrativa);
                  System.exit(0);
                  }
                   else if(rota_escolhida > rota_aleatoria && (rota_escolhida-rota_aleatoria) == 1){
                  tentativas = tentativas+1;
                  Digita("\n\nMestre: A rota não é essa, porém ela está próxima...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  else if(rota_escolhida < rota_aleatoria && (rota_aleatoria-rota_escolhida) == 1){
                  tentativas = tentativas+1;
                  Digita("\n\nMestre: A rota não é essa, porém ela está próxima...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  else if(rota_escolhida > rota_aleatoria){
                      tentativas = tentativas+1;
                      Digita("\n\nMestre: A rota não é essa...",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                   }
                   else if(rota_escolhida < rota_aleatoria){
                      tentativas = tentativas+1;
                      Digita("\n\nMestre: A rota não é essa...",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                   }
                else if(rota_escolhida == rota_aleatoria){
                   Digita("\n\nMestre: Vocês descobriram uma passagem para Caverna e não precisarão lutar contra os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nIdril: Conseguimos Rosswald!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nRosswald: Jovem principe... Idril... vamos lá. Bora chutar a bunda desse Rei Demônio de uma vez por todas!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nMestre: E juntos, vocês entram na caverna do Rei Demônio",TimeUnit.MILLISECONDS, temp_dialog);
      }}while(rota_escolhida!=rota_aleatoria);

                }
                
 } while(resp_entrada != 1 && resp_entrada!= 2);
 
 }

     static void capitulo_3() throws Exception{

        Scanner entrada = new Scanner (System.in);
        int resp, resp2, resp3, resp4, resp5, resp6, resp7, resp8, resp9, resp10, resp11, resp12, resp13, resp14;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Capítulo 3 - A culpa é sua, não minha!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
          Digita("\n\nMestre: Ao entrar na Caverna do Rei Demônio, vocês ficam surpresos...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Estava tudo VAZIO! Sem monstros, demônios ou qualquer coisa assustadora...",TimeUnit.MILLISECONDS, temp_dialog);
          do{
      
        Digita("\n\n1 - Esperem, isso está estranho...",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp2 = entrada.nextInt();
        if(resp2 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp2!=1);

        Digita("\n\nIdril: Sim de fato, por que não há nada aqui dentro?",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nRosswald: Hum.. cuidado, demônios podem ficar invisiveis...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Vocês exploram a Caverna, porém ainda não encontram nada. Tudo continua vazio e sem o menor barulho",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nIdril: Rosswald, e se os boatos não forem verdade...?",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nRosswald: Eles PRECISAM ser Idril, não temos muita escolha...",TimeUnit.MILLISECONDS, temp_dialog);
        do{
      
        Digita("\n\n1 - Boatos? As pistas que vocês disseram na taverna eram apenas boatos?",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp3 = entrada.nextInt();
        if(resp3 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp3!=1);
           Digita("\n\nRosswald: Sim jovem, mas são FORTES BOATOS que indicam que o responsável pela praga é o asqueroso Rei Demônio. Não faria muita diferença te falar isso na taverna.",TimeUnit.MILLISECONDS, temp_dialog);

           do{
      
        Digita("\n\n1 - SEM ESSA! Como podem agir baseado em boatos?",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp4 = entrada.nextInt();
        if(resp4 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp4!=1);
         Digita("\n\nRosswald: Não mudaria muito, não é? Você estava desesperado quando pedimos sua ajuda... nós também estamos! Pessoas estão morrendo, cavaleiro! Morrendo a mais de dois meses! Se há alguma pequena chance de vencermos essa doença, precisamos agarra-la forte!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nRosswald: Desculpe, mas ouça principe, seu pai também é uma das vitimas da praga... Não se sente tentado a ir atrás da menor possibilidade possível de encontrar alguma cura?",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nIdril: Sim pequeno cavaleiro, controle suas emoções e vamos continuar... Os boatos são verdadeiros, e vamos conseguir encontrar uma cura para população de Alduin com esse Rei Demônio.",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: E assim vocês prosseguem explorando a masmorra, até que...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\n** Barulho de ronco ** ",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nRosswald: Esperem! O que foi isso...?",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\n** Barulho de ronco ** ",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nMestre: Idril tremendo da cabeça aos pés, olha para algo deitado no fim de uma das passagens da caverna.",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nRosswald: Façam o menor barulho possível...",TimeUnit.MILLISECONDS, temp_dialog);

           do{
      
        Digita("\n\n1 - Rosswald, isso é um....",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp5 = entrada.nextInt();
        if(resp5 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp5!=1);
         Digita("\n\nMestre: DRAGÃO!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Para passarem do dragão sem acorda-lo, será uma tarefa complicada...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: O chão da caverna é velho e antigo, por isso possui diversas fendas e rachaduras que fazem barulho ao pisar. A ideia é que passem pelo dragão silenciosamente e sem pisar em nenhuma das fendas.",TimeUnit.MILLISECONDS, temp_dialog);
          int qtd_caminho = 15;
          int qtd_fendas = 5;
 
          int caminho[] = new int [qtd_caminho]; 
          for (int i = 0; i < caminho.length; i++){
               caminho[i] = (int) ((Math.random() * 0));   
          }
          int sorteia_fendas;
          for(int i=0; i<qtd_fendas;i++){    
            sorteia_fendas = (int) ((Math.random() * (qtd_caminho))); 
            do{
            if(caminho[sorteia_fendas] == -1){ 
            sorteia_fendas = (int) ((Math.random() * (qtd_caminho))); 
            }}while(caminho[sorteia_fendas] == -1);
            caminho[sorteia_fendas] = -1;
}
            Digita("\n\nMestre: Para passar do dragão, serão necessários 10 passos. Neste percurso da Caverna contém cinco fendas no chão. Que a sorte esteja com vocês...",TimeUnit.MILLISECONDS, temp_dialog);
             Digita("\nMestre: Aaaah, para ajudá-los, darei uma dica... Se o dragão se mexer, é por que vocês estão próximos a uma fenda, tomem cuidado!",TimeUnit.MILLISECONDS, temp_dialog);
            String fenda = "fenda";
            String espaco_marcado = "x";
            String espaco_livre = "_";
            System.out.println("\n");
            for(int i =0; i<caminho.length;i++){
                  System.out.println(i+"."+espaco_livre);
            }
                int posicao_escolhida = -1,guarda_posicao = -1, j =0;
                int pontuacao = 0;
                int pontuacao_maxima = (qtd_caminho-qtd_fendas);
                String troca_fenda = "", troca_vazio = "";
                while(j<qtd_caminho){
                j++;
                guarda_posicao = posicao_escolhida;
                do{
                Digita("\n\nMestre: Onde irão pisar? ",TimeUnit.MILLISECONDS, temp_dialog);
                posicao_escolhida = entrada.nextInt();
                if(posicao_escolhida > (caminho.length-1) || posicao_escolhida < 0 || posicao_escolhida == guarda_posicao){
                 Digita("\n\nMestre: Desculpe cavaleiro, não ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
                }
                else if(caminho[posicao_escolhida] == -1){
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+fenda);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }
                  if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);  
                  }}
                    Digita("\n\nMestre: O dragão acordou!",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\nMestre: Resultado do seu percurso = "+(pontuacao +" / "+pontuacao_maxima),TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Todos vocês morrem em um piscar de olhos ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    System.exit(0);
}
                  else if(caminho[posicao_escolhida] == 0 && pontuacao == (pontuacao_maxima-1)){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);

                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }}
                    Digita("\n\nMestre: Vocês conseguiram passar sem pisar em nenhuma fenda!",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\nMestre: Resultado do seu percurso = "+(pontuacao +" / "+pontuacao_maxima),TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nIdril: Uuufaaa! Conseguimos!",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nRosswald: Estamos chegando ao fim da Caverna, só mais um pouco e talvez encontraremos o Rei Demônio.",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nMestre: Vocês chegam ao fim da caverna... O lugar estranhamente parecia algum tipo de catedral por debaixo da terra de tão imenso que era.",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nRosswald: Ok, esperem. Será a qualquer momento...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** 1 minuto se passa **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nRosswald: A qualquer momento...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** Mais 2 minutos se passam **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nIdril: Ei Rosswald... no fim das contas eram apenas boatos...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** Idril começa a chorar **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nMestre: Rosswald parece não notar.",TimeUnit.MILLISECONDS, temp_dialog);

                     do{
                        Digita("\n\n1 - Ei cara, sua mulher está chorando.",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp6 = entrada.nextInt();
                        if(resp6 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp6!=1);
                       Digita("\n\n** Rosswald continua parado, esperando alguma coisa **",TimeUnit.MILLISECONDS, temp_narrativa);
                      do{
                        Digita("\n\n1 - ROSSWALD! IDRIL ESTÁ CHORANDO, DÁ PARA FAZER ALGUMA COISA?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp7 = entrada.nextInt();
                        if(resp7 != 1){
                        Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                         }}while(resp7!=1);
                        Digita("\n\n** Rosswald não move um músculo sequer **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRei Demônio: COMO ESPERADO DO GRANDE BRUXO DO NORTE!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\n** Idril olha assustada **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRei Demônio: Foi o primeiro a me notar hahahaha...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nMestre: O Rei Demônio era um ser muito assustador. Tinha asas negras pontiagudas, pele negra avermelhada, olhos luminosos, presas e media cerca de 5 metros de altura...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Demônio: O que os trazem na minha casa, jovens?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Então você estava invisivel o tempo todo... Outros demônios moram aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Demônio: Vivo em solidão bruxo, extrema solidão... Mas vocês não responderam minha pergunta, o que vieram fazer aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: VIEMOS ATRÁS DA CURA DA PRAGA! POR QUE ESTÁ MATANDO O POVO DE ALDUIN? POR QUE?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nRei Demônio: Ah compreendo... o desespero...",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: RESPONDA SEU NOJENTO DESGRAÇADO, POR QUE ESTÁ MATANDO ÀS PESSOAS?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nRei Demônio: E por qual motivo você protege às pessoas, pequena Elfa?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\n** Idril fica calada **",TimeUnit.MILLISECONDS, temp_narrativa);
                         Digita("\n\nRei Demônio: Não sabe, não é?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: NÃO VEM COM ESSA, NÃO É PRECISO DE UM MOTIVO PARA QUERER A FELICIDADE, A VIDA, A PROSPERIDADE E O SORRISO NO ROSTO DAS PESSOAS!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Demônio: Ah é mesmo? Essas palavras soam tão bonitas quando ditas por uma Elfa. Parecem até uma serenata.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** Rosswald segura a mão de Idril **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRosswald: Se acalme Idril, precisamos manter o foco.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: É como ela diz, oh Lorde dos Demônios! Viemos atrás da cura da praga. Você deve saber algo a respeito, sim?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Demônio: Ah sei sim, tanto quanto qualquer pessoa. Está matando a todos, isso não é lindo?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: O que quer dizer..? Como assim qualquer pessoa?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Demônio: Todos estão morrendo, não é? É natural que o mundo inteiro fique sabendo...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Não venha com joguinhos, diga. Você é o culpado disso, não é?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Demônio: É uma acusação bem séria, bruxo do norte.",TimeUnit.MILLISECONDS, temp_dialog);
                        do{
                        Digita("\n\n1 - DIGA DE UMA VEZ, MONSTRO! POR QUE ESTÁ MATANDO TODOS COM A PRAGA?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp8 = entrada.nextInt();
                        if(resp8 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp8!=1);

                       Digita("\n\n** Rei Demônio faz uma reverencia **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRei Demônio: O jovem principe de Luke Yeagher, realmente visitas interessantes eu tenho hoje.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - PERDI MUITOS AMIGOS NA BUSCA PELA CURA E MEU PAI ESTÁ MORRENDO! RESPONDA, FILHO DA MÃE!",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRei Demônio: Duas acusações sérias em apenas alguns minutos... e no fim das contas eu sou monstro.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - DIGA, MALDITO, DIGA DE UMA VEZ POR TODAS! QUAL A SUA RAZÃO PARA MATAR ÀS PESSOAS?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRei Demônio: Eu não mato às pessoas, principe. Quem mata é a praga. No máximo eu às assisto morrer.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - POR QUE? POR QUE FAZER ISSO?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRosswald: Responda logo, você é ou não o responsável pela praga? Se continuar de brincadeiras, morrerá aqui e agora!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: Demônios além de ficarem invisiveis, no geral não são dificeis de matar. Se forem altos, é só pular em cima. Se forem tremendamente fortes, então é só usar usar magia. Você sabe disso, não é Lorde Demônio?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei Demônio: Não esperava menos coragem do bruxo do norte! É exatamente isso.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei Demônio: Mas o fato é que...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** Rei Demônio começa a se transformar **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nIdril: Esperem, ele está...",TimeUnit.MILLISECONDS, temp_dialog);
                        do{
                        Digita("\n\n1 - ENCOLHENDO?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp10 = entrada.nextInt();
                        if(resp10 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp10!=1);
                       Digita("\n\nMestre: O Rei Demônio se transforma em algo de aparencia humana... na verdade ele se transforma em um verdadeiro humano. E você lembra dele de alguma lugar... Ele tinha um sorriso no rosto...",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - MAS QUEM É VOCÊ?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp11 = entrada.nextInt();
                        if(resp11 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp11!=1);
                        Digita("\n\nRosswald: Taverna? O anão da taverna... Mas que diabos está acontecendo aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: Impossível! Aquele anão é um pobre coitado com uma taverna sem lucros por causa da praga, não tem como ele ser o Rei Demônio",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnão: Vocês realmente conseguiram passar pelo desafio dos goblins, estou admirado! Estava torcendo por vocês!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Mas o que está acontecendo aqui...? Anão, por que?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnão: Sempre fui um demônio, jovens. E não, não sou o culpado pela praga.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** Silêncio **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nAnão: Vivo em minha humilde taverna, observando o quão determinados conseguem ser os aventureiros. Acreditem, nada é mais legal do que ser aventureiro. Nada. É tão libertador, não acham?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnão: Sinceramente, prefiro mil vezes a minha taverna do que minha casa. Olhem em volta, nem Verrad me faz companhia! Aquele dragão dorminhoco!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** Rosswald e Idril entreolham-se , sem compreender a situação **",TimeUnit.MILLISECONDS, temp_narrativa);
                        do{
                        Digita("\n\n1 - CALA BOCA!",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp11 = entrada.nextInt();
                        if(resp11 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp11!=1);
                       Digita("\n\n** O anão continua a falar e falar **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nAnão: Vieram aqui pelos boatos, não é jovens? Mas vocês precisam entender, EU NÃO SOU O CULPADO DISSO!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: Então quem é? DIGA, ANÃO! VOCÊ É O REI DOS DEMÔNIOS, DEVE SABER ALGO A RESPEITO!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnão: Eu sei quem são os culpados... querem ouvir a história?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: Por favor, nos ajude! Nos diga!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnão: Muito bem, tudo começou na terra dos Elfos...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** Idril fica cheia de ódio ao ouvir aquilo **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nAnão: Havia um experimento sendo feito por um grupo de elfos aventureiros, aah pobrezinhos. Queriam alcançar a vida eterna, mal sabiam eles o tamanho do desastre que fariam. Mal sabiam o quão angustiamente é, não poder morrer...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnão: Eles vieram até mim pois o processo necessitava da benção dos demônios. Um poderoso demônio.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnão: Eu apenas concebi a eles a oportunidade para realizarem um sonho, mas assim que a fórmula ficou pronta, houve uma explosão gigantesca, tão grande que deixou alguns elfos visinhos ao local do experimento, surdos até hoje!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: Não pode ser! Aquela explosão de Elfheim aconteceu devido a queda de um raio! Era um dia de tempestade.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnão: Vocês realmente gostam de boatos, não é jovens? Assustador...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnão: Enfim, depois disso o mundo está vivendo nessa pandemia da praga até hoje. E segundos os novos boatos, eu sou o culpado! Hahahahahaha, é tão bom isso! Demônios nunca são conhecidos por feitos grandiosos assim, geralmente só fazem o mal e blá blá blá...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAnão: Ouçam jovens, vocês estão de parabéns por terem chegado até aqui! Acreditem, se Verrad tivesse sido acordado, virariam ração de dragão! ",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Se a sua história for verdadeira, então se você retirasse a benção demoniaca das pessoas doentes, talvez elas pudessem... talvez ela pudessem...",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAnão: Eu já disse hoje que não esperava menos de você, bruxo do norte? Realmente um homem sábio.",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: Você precisa nos ajudar, Anão! Por favor, precisa retirar a benção dos doentes e acabar com isso!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAnão: Vocês invadem a minha casa, me acusam, me ameaçam de morte e agora querem que eu ajude vocês..? Querem que eu ajude o MUNDO?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: VOCÊ CONTRIBUIU PARA ESSSA PANDEMIA SE TORNAR REALIDADE, CONCEBEU PODER A POBRES ELFOS INOCENTES! PRECISA CONSERTAR O QUE FEZ, MALDITO!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAnão: É por isso que demônios são legais, nós não temos essa exigencia cega e egoista dos homens. Vivemos de forma simples, sem preconceito e na mais pacífica paz. Talvez alguns sejam maus, mas quem no mundo é 100% puro?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAnão: Querem saber por que demônios ficam invisiveis?",TimeUnit.MILLISECONDS, temp_dialog);
                          do{
                        Digita("\n\n1 - POR FAVOR, ANÃO. FAÇA ESSA CRISE PARAR, LHE PROMETO GRANDIOSAS RECOMPENSAS DE LUKE YEAGHER.",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp12 = entrada.nextInt();
                        if(resp12 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp12!=1);
                       Digita("\n\nAnão: Os demônios ficam invisiveis para não assustar às pessoas... Geralmente nós nascemos feios, horriveis e assustadores. Todos saem correndo assim que nos veem.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnão: Não que isso me deixe triste, é só que há tanto preconceito no mundo dos homens... realmente algo chato, sabe? Alguns como eu, depois de muito estudo na vida, aprendem a se transformar em humanos. E assim vivem suas vidas, para sempre como humanos.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnão: Querem que eu retire a benção demôniaca do mundo de Alduin? Querem que eu cure a praga? Quem criou isso foram vocês!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: Cuidado demônio, não fomos nós que ajudamos aqueles elfos.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAnão: Não muda o fato! Vocês são os aventureiros, vocês criam ambições tão dificieis de alcançar que apelam até para os demônios para atingir seus objetivos. Não ligam para nada! Agradeçam por poder morrer e se livrarem de um mundo tão maldoso.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: NÃO! NÃO PODE FAZER ISSO! PRECISA AJUDAR A POPULAÇÃO DE ALDUIN!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** O anão se transforma em demônio novamente **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRosswald: O QUE PENSA QUE ESTÁ FAZENDO?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei demônio: VERRAD! VENHA AQUI.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** o feroz dragão chega ao local pouco tempo depois **",TimeUnit.MILLISECONDS, temp_narrativa);
                       do{
                        Digita("\n\n1 - MALDITO... O QUE PENSA EM FAZER COM ESSE DRAGÃO?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp13 = entrada.nextInt();
                        if(resp13 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, não conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp13!=1);
                       Digita("\n\nRei demônio: Alegrem-se jovens, estarei fazendo um favor tirando-os deste mundo tão ruim.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei demônio: Verrad, não permita que eles escapem!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** O dragão da um rugido ensurdecedor **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRosswald: Não temos a menor chance de vencer...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: Precisamos pensar em algo rápido. Vamos todos morrer em alguns segundos!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei demônio: Prestigiem o total poder do Rei dos Demônios, a habilidade profanada do mundo dos mortos, que assola países e destrói tudo!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei demônio: ALVORECER DA ESCURIDÃO!",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\n** Os três grandes heróis dão às mãos, não há mais o que fazer... **",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Assim que o Rei Demônio usa sua habilidade final, todos vocês morrem.",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Mas não se preocupe, meu jovem cavaleiro. Não havia como terminar essa história de outro jeito! O ponto é que, você precisa aprender o seguinte: ",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Quando estamos assustados, quando parece não haver mais esperanças, precisamos manter a fé, confiança e racionalidade. E não procurar alguém para culpar. A culpa pode justificar uma causa, mas com certeza não vai resolve-la. Problemas nós teremos a todo momento, mas precisamos encará-los juntos. Resolvê-los juntos, e não culpar às nossas sombras ou os nossos demônios.",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: MORRAM EM PAZ JOVENS CAVALEIROS E PRESTIGIEM O ALVORECER DA ESCURIDÃO!",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\n\n\n\n\n\n\n\n",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\n  .....................:: FIM ::.....................",TimeUnit.MILLISECONDS, temp_narrativa);
                       creditos();
                       menu();

                  }
                else if(caminho[posicao_escolhida] == 0 && posicao_escolhida == (qtd_caminho-1) && caminho[posicao_escolhida-1] == -1){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }} 
                  Digita("\n\n** O dragão se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
}
                else if(caminho[posicao_escolhida] == 0 && posicao_escolhida == 0 && caminho[posicao_escolhida+1] == -1){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }} 
                   Digita("\n\n** O dragão se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
}
                else if(caminho[posicao_escolhida] == 0 && posicao_escolhida != 0 && posicao_escolhida !=  (qtd_caminho-1) && (caminho[posicao_escolhida-1] == -1 || caminho[posicao_escolhida+1] == -1) ){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }} 
                  Digita("\n\n** O dragão se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
}
                else if(caminho[posicao_escolhida] == 0){
                  caminho[posicao_escolhida] = 2;
                  pontuacao = pontuacao+1;
                  for(int i =0; i<caminho.length;i++){
                  if(caminho[i] == -1){
                    System.out.println(i+"."+espaco_livre);
                  }if(caminho[i] == 2){
                    System.out.println(i+"."+espaco_marcado);
                  }if(caminho[i] == 0){
                    System.out.println(i+"."+espaco_livre);
                  }} 
}
                }while(posicao_escolhida > (caminho.length-1) || posicao_escolhida < 0);       
}

     }
     public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
        for (char caractere : mensagem.toCharArray()) {
        System.out.print(caractere);
        unit.sleep(tempo_mensagem);
    }
}
    }