//DAWN OF DARNESS

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;

class rpgExemplo {
	
  static int temp_dialog =70, temp_narrativa = 150, temp_transicao = 25; //Para rodar o jogo sem o delay nas mensagens, pode mudar o valor destas 3 vari�veis para 0;
  public static void main(String[] args) throws Exception{
    Scanner entrada = new Scanner (System.in);
    Digita("\nMestre: Est� pronto para vivenciar o verdadeiro desespero... h�, digo, aventura?",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.println("\n1 - Sim | 2 - Com certeza! |3 - N�o sei n�o hein...");
    int escolha_menu = entrada.nextInt();
        if(escolha_menu == 1 || escolha_menu == 2){
          Digita("\nMestre: Conhe�a o alvorecer da escurid�o!",TimeUnit.MILLISECONDS, temp_dialog);
          menu();
        }else if(escolha_menu == 3){
           Digita("\nMestre: N�o se engane jovem, n�o � como se voc� tivesse muita escolha... Abrace o destino!",TimeUnit.MILLISECONDS, temp_dialog);
           menu();
        }else{
            Digita("\nMestre: Mesmo digitando uma op��o inv�lida, seu destino lhe aguarda! Viva muito, explore, venca seus desafios e encontre a cura...",TimeUnit.MILLISECONDS, temp_dialog);
           menu();
        }}
    static void menu() throws Exception {
    Scanner entrada = new Scanner (System.in);
    int escolha_menu;
    do{
    Digita("\n\n..:: DAWN OF DARKNESS ::.. \n\n1 - Jogar \n2 - Cap�tulos\n3 - Cr�ditos \n4 - Sair",TimeUnit.MILLISECONDS, temp_transicao);
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
      System.out.println("\nOp��o inv�lida, digite novamente: ");
    }}while(escolha_menu !=1 && escolha_menu !=2 && escolha_menu !=3 && escolha_menu !=4);
    }
     static void creditos()throws Exception {
     Scanner entrada = new Scanner (System.in);
        int escolha_menu, temp_narrativa = 150;
        Digita("\n\n</> Desenvolvedores </>\n\n-> Ygor Oliveira \n-> Fillipe Vital \n-> Gabriely Barbosa \n-> Rodrigo Shuttleton \n-> Yasmim Candel�ria",TimeUnit.MILLISECONDS, temp_narrativa);
        do{
        System.out.println("\n2 - Sair");
        escolha_menu = entrada.nextInt();
        if(escolha_menu == 2){
          menu();
        }else{
           System.out.println("\nOp��o inv�lida, digite novamente: ");
        }}while(escolha_menu!=2);
     }
     static void capitulos()throws Exception {
     Scanner entrada = new Scanner (System.in);
        int escolha_capitulo;
        System.out.println("\n..:: DAWN OF DARKNESS - Cap�tulos da Hist�ria ::..");
        do{
        System.out.println("\n\n1 - A Taverna dos Aventureiros\n2 - A Floresta dos Desafios\n3 - A culpa � sua, n�o minha!\n4 - Voltar");
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
          System.out.println("\nOp��o inv�lida, digite novamente: ");
        }}while(escolha_capitulo!=1 && escolha_capitulo!=2 &&escolha_capitulo!=3 &&escolha_capitulo!=4);
     }

          static void jogo()throws Exception{
          Scanner entrada = new Scanner (System.in);
          Digita("\nMestre: Hmm... veja s� o que temos por aqui, ser� um corajoso ou um curioso? \n\nBem... vamos l�...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\nMestre: Para come�armos, por favor, diga-me o seu nome.",TimeUnit.MILLISECONDS, temp_dialog);
          System.out.println("\n");
          String nome_aventureiro = entrada.next();
          Digita("\nMestre: Seja bem-vindo(a), ao intenso mundo de Alduin, " + nome_aventureiro + "!",TimeUnit.MILLISECONDS, 50);
          Digita("\n\nMestre: A partir daqui, serei seu guia e companheiro nesta jornada, pode me chamar de mestre.",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Gostaria de saber mais sobre a hist�ria do mundo no qual voc� est� prestes a entrar ou ir direto para o jogo?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu;
          do{
          System.out.println("\n\n1 - Conte-me mais, mestre!");
          System.out.println("2 - Podemos ir direto para o jogo?");
          System.out.println("3 - Voltar");
          escolha_menu = entrada.nextInt();
          if(escolha_menu == 1){
          Digita("\n\nMestre: Muito bem, por onde come�ar...?",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nEsta � a hist�ria de um mundo m�gico e incr�vel chamado Alduin.\nAlduin � um mundo repleto de vida, esperan�a e prosperidade, diversas criaturas e animais vivem em harmonia. Alduin � dividido em 4 grandes na��es, s�o elas: \n\n1) O Norte comandado pela corte de Elizabeth Clarke. Dom�nio dos bruxos.\n2) O Leste comandado pelos cavaleiros do reino de Luke Yeagher.\n3) O Sul comandado pelos Elfos e criaturas miticas. Seu maior emp�rio fica na capital de Elfheim.\n4) E o Oeste comandado pelos Dem�nios e Monstros Ancestrais. \n\nUma praga se espalha pelas sombras, desolando toda a vida existente em Alduin, aquele que contrai a praga certamente morre em um m�s. A praga destr�i as suas for�as e apodrece aos poucos seus org�os, ningu�m sabe quem ou o que � o causador dessa doen�a, mas existem rumores de que ela teve in�cio mas redondezas do Oeste. Territ�rio dos dem�nios.",TimeUnit.MILLISECONDS, temp_dialog);
                  
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Neste mundo voc� assumir� o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          capitulo_1();
          capitulo_2();
          capitulo_3();

          }else if(escolha_menu == 3){
                 menu();
          }
          else if(escolha_menu == 2){
          Digita("\n\nMestre: "+nome_aventureiro+", hora de iniciar a aventura!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Neste mundo voc� assumir� o papel de um triste cavalei... quer dizer, um bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          capitulo_1();
          capitulo_2();
          capitulo_3();
    
          }else{
            System.out.println("\nOp��o inv�lida!");
          }
          }while(escolha_menu!= 1 ||escolha_menu!= 2 || escolha_menu!= 3);
          }

        static void capitulo_1() throws Exception{

        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Cap�tulo 1 - A Taverna dos Aventureiros!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu n�o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
        Digita("\n\nMestre: 14 dias ap�s sair com seu ex�rcito em busca da cura para seu pai, voc� se encontra em uma taverna isolada da cidade e civiliza��o. \n\nO lugar est� em peda�os, claramente d� para perceber que esta taverna j� teve seus momentos de gloria e felicidade, mas atualmente poucas pessoas ainda frequentam este local e as poucas restantes est�o doentes ou em sofrimento.\n\nO dono da taverna � um velho an�o, sem esperan�as na vida, sua �nica fonte de renda era a taverna e com a chegada da praga seus lucros ca�ram muito. Mas mesmo assim ele continua com seu sorriso no rosto a ajudar quem for preciso na regi�o.\nO taverneiro enquanto limpava o balc�o se aproxima de voc� e pergunta:",TimeUnit.MILLISECONDS, temp_dialog);
        int resposta_menu;
        Digita("\n\nTaverneiro (An�o): Jovem rapaz, est� tudo bem? N�o acha que j� bebeu muito? Algo lhe ocorreu?",TimeUnit.MILLISECONDS, temp_dialog);
        do{
        System.out.println("\n1 - Sim est� tudo bem... | 2 - N�o estou afim de conversar, an�o...");
        resposta_menu = entrada.nextInt();
          if(resposta_menu != 1 && resposta_menu != 2){
              Digita("\n\nTaverneiro (An�o): Desculpe meu jovem, poderia repetir..?",TimeUnit.MILLISECONDS, temp_dialog);
          }
        }while(resposta_menu!=1 && resposta_menu!=2);
        Digita("\n\nMestre: O taverneiro ao ouvir suas palavras graves e fortes, lhe d� um sorriso e apenas continua a limpar sua taverna...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Voc� n�o ficou bebado devido a sua alta resist�ncia, por�m encontra-se em tremendo luto e angustia pois perdeu muitos amigos na busca pela cura de seu pai... O ato ocorreu em uma feroz batalha... al�m disso seu pai est� com a praga e provavelmente morrer� no pr�ximo inverno... voc� n�o sabe a quem recorrer, e n�o sabe � causa dessa doen�a...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Pouco tempo depois surge um homem, com roupas pretas e uma capa grande com capuz. Logo atr�s dele entra uma Elfa de pele clara que vestia uma capa esverdeada que ia de seus ombros at� o ch�o. Os dois seguem at� o balc�o aonde voc� est� e sentam ao seu lado.",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\n** Tens�o no ar **",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nHomem do capuz: J� faz muito tempo, n�o � jovem principe da capital de Luke Yeagher?",TimeUnit.MILLISECONDS, temp_dialog);
        int escolha_menu3, escolha_menu4;
        do{
        System.out.println("\n\n1 - Quem � voc�?");
        System.out.println("2 - Por favor estranho, n�o estou afim de joguinhos..");
        escolha_menu3 = entrada.nextInt();
        if(escolha_menu3 == 1 || escolha_menu3 == 2){
          Digita("\n\nHomem do capuz: Hahahaha, n�o se lembra mais..?",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\n** Observa **",TimeUnit.MILLISECONDS, temp_narrativa);
          do{
          System.out.println("\n\n1 - Espera ai, voc� � Rosswald? O grande bruxo Rosswald?!!");
          escolha_menu4 = entrada.nextInt();
          if(escolha_menu4!= 1){
            Digita("\n\nMestre: O homem n�o ouviu o que voc� falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu4!=1); 
        }else{
            Digita("\n\nMestre: O homem n�o ouviu o que voc� falou...",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(escolha_menu3 != 1 && escolha_menu3 == 2);
        Digita("\n\n** O homem tira o capuz **",TimeUnit.MILLISECONDS, temp_narrativa);
          Digita("\n\nRosswald: Da �ltima vez que te vi voc� era uma crian�a, jovem principe!",TimeUnit.MILLISECONDS, temp_dialog); 
          Digita("\n\nRosswald: Vejo que amadureceu bastante, hein. A capital inteira de Luke Yeagher est� dizendo que voc� est� procurando a cura da praga...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nRosswald: Eu e minha companheira Idril temos pistas que talvez possam ajuda-lo, pistas que nos levam para o Oeste, Terra dos Dem�nios...",TimeUnit.MILLISECONDS, temp_dialog);  
          Digita("\n\nIdril (Elfa): Meu nome � Idril, soubemos do que aconteceu com os seus companheiros na busca pela floresta sombria... sinto muito.",TimeUnit.MILLISECONDS, temp_dialog);   
          Digita("\n\nIdril (Elfa): O fato � que as criaturas da floresta elfica est�o morrendo pela praga, creio que podemos fazer uma parceria para investigar essas pistas... N�o aguento mais perder vida inocentes por essa doen�a!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nRosswald: N�o se sinta obrigado a nos ajudar meu jovem principe, apenas n�o quero v�-lo em total desola��o. Movido pelas suas motiva��es e de Idril, podemos partir agora! O que me diz?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu5, escolha_menu6;
          do{
          System.out.println("\n\n1 - E como eu poderia ajuda-los?");
          escolha_menu5 = entrada.nextInt();
          if(escolha_menu5!= 1){
            Digita("\n\nMestre: O homem n�o ouviu o que voc� falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu5!=1);
            Digita("\n\nIdril: Nos acompanhando at� o Caverna do Dem�nio! �s pistas nos dizem que o Rei Dem�nio � o causador dessa praga...",TimeUnit.MILLISECONDS, temp_dialog);
          do{
          System.out.println("\n\n1 - O Rei Dem�nio...? Maldito...");
          escolha_menu6 = entrada.nextInt();
          if(escolha_menu6!= 1){
            Digita("\n\nMestre: A Idril n�o ouviu o que voc� falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu6!=1);
          Digita("\n\nRosswald: E ai meu jovem, pronto para partirmos?",TimeUnit.MILLISECONDS, temp_dialog);
          int escolha_menu7, escolha_menu8;
          do{
          System.out.println("\n\n1 - Montar a parceria \n2 - N�o participar dessa busca.");
          escolha_menu7 = entrada.nextInt();
          if(escolha_menu7!= 1 && escolha_menu7!= 2){
            Digita("\n\nMestre: A Idril n�o ouviu o que voc� falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }
          else if(escolha_menu7 == 2){
            Digita("\n\nIdril: Este jovem est� muito abalado, Rosswald. Vamos embora.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nRosswald: Bom amig�o, entendo sua dor... Por�m n�o temos mais tempo a perder aqui. Que a sorte esteja sempre ao seu lado...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Os dois saem da taverna e voc� continua bebendo, bebendo e bebendo...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\n** 2 meses depois **",TimeUnit.MILLISECONDS, temp_narrativa);
            Digita("\n\nMestre: O tempo passou e voc� n�o conseguiu encontrar a cura, seu pai morreu e mundo est� em repleto caos.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: �s vezes, s� o que a gente precisa � de companheiros... O que poderia ter acontecido caso tivesse feito a parceria? Tarde demais para pensar.",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\nMestre: Agora s� lhe resta morrer pela praga, bravo cavaleiro...",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\n\n** Fim de Jogo **",TimeUnit.MILLISECONDS, temp_narrativa);
            System.out.println("\n\n\n\n");
            System.exit(0);
          }
          else if(escolha_menu7 == 1){
                Digita("\n\nIdril: Perfeito!!! Rosswald, juntos eu sei que conseguiremos.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: Ah sim, levante meu jovem principe, vamos conseguir salvar seu pai e a floresta elfica, eu garanto.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Voc� vira seu �ltimo caneco de cerveja **",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: E juntos, voc�s partem para o Oeste, para Caverna do Rei Dem�nio!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nTaverneiro (An�o): EI! Jovem cavaleiro?",TimeUnit.MILLISECONDS, temp_dialog);
                int escolha_menu9;
                do{
                   System.out.println("\n\n1 - O qu�?");
                     escolha_menu9 = entrada.nextInt();
                      if(escolha_menu9!= 1){
                      Digita("\n\nMestre: O taverneiro n�o ouviu o que voc� falou...",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_menu6!=1);
                      Digita("\n\nTaverneiro (An�o): Boa sorte na sua busca! Sei que seus amigos ir�o lhe ajudar!",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\n\nMestre: E juntos voc�s partem para aventura!",TimeUnit.MILLISECONDS, temp_dialog);

          }}while(escolha_menu7!= 1 && escolha_menu7!= 2);

     }
     static void capitulo_2() throws Exception{
        Scanner entrada = new Scanner (System.in);
        int resp;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Cap�tulo 2 - A Floresta dos Desafios!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu n�o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
         Digita("\n\n** 1 dia de viagem se passa ** ",TimeUnit.MILLISECONDS, temp_narrativa);
         Digita("\n\nMestre: Para chegar na Caverna do Rei Dem�nio, voc�s precisam passar por uma floresta de desafios. Segundo minhas pesquisas a respeito, muitas pessoas que adentram-na, dficilmente saem vivos...",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\n** Tens�o no ar **",TimeUnit.MILLISECONDS, temp_narrativa);
         Digita("\n\nMestre: Voc�s chegam na floresta e ficam de guarda alta, pois a qualquer momento inimigos podem aparecer...",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Reza a lenda que lobos gigantes circulam nesta floresta... e, infelizmente, tr�s lobos cercam voc�s... se quiserem evitar que mais apare�am, precisar�o responder uma pergunta.",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: S� para avisar, para cada resposta errada a quantidade de lobos para enfrentar aumentar� para 6, depois para 9, 12 e assim sucessivamente. �s alternativas estar�o aleatoriamente bagun�adas, isto posto, fique atento bravo cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Voc�s aguentar�o combater no m�ximo 6 lobos! Acima disso, a sorte que dir� o destino de voc�s...",TimeUnit.MILLISECONDS, temp_dialog);

          String a,b,c,d,e, pergunta_embaralhada, resposta_questao01;
          int qtd_lobos = 3, qtd_goblins = 0, resp_dado, random, resp_skill, escolha_fugir;
        a = "a) Apenas 3.";
        b = "b) 25 e 3.";
        c = "c) 25 e � 2.";
        d = "d) 3 e � 2.";
        e = "e) Apenas � 2.";
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

        pergunta_embaralhada = "\n\nMestre: Quais s�o �s ra�zes reais da equa��o x2 � x = 6?" + "\n\n" +alternativas.get(0)+ "\n" +alternativas.get(1)+ "\n" +alternativas.get(2)+ "\n" +alternativas.get(3)+ "\n" +alternativas.get(4);
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
          Digita("\n\nMestre: Cavaleiro, voc� errou.",TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "d":
          case "D":
          Digita("\n\nMestre: Se preparem! "+ qtd_lobos + " lobos est�o � caminho!",TimeUnit.MILLISECONDS, temp_dialog);
          if(qtd_lobos > 6){
            random = 1 + (int) (Math.random() * 6); 
            Digita("\n\nMestre: Voc�s foram avisados, tudo agora depender� da sorte de voc�s... lance o dado, igual ou acima de 4 voc�s vivem, caso contr�rio voc�s morrem.",TimeUnit.MILLISECONDS, temp_dialog);
              do{
              Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Dado de 6 lados.",TimeUnit.MILLISECONDS, temp_transicao);
              Digita("\n\nRodar os dados? ",TimeUnit.MILLISECONDS, temp_transicao);
              Digita("\n\n1 - Vamos l�!!!",TimeUnit.MILLISECONDS, temp_transicao);
               System.out.println("\n");
              resp_dado = entrada.nextInt();
              if(resp_dado != 1){
               Digita("\n\nMestre: Meu bravo cavaleiro, eu n�o ouvi direito.",TimeUnit.MILLISECONDS, 25);
               }}while(resp_dado!=1); 
               
              if(random >= 4){
               Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
               Digita("\n\nDado: "+random,TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nMestre: Parece que o dia de sua morte ainda n�o chegou cavaleiro... Enfrente os lobos.",TimeUnit.MILLISECONDS, temp_dialog);
              }else{
                Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nDado: "+random,TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nLobos: Aarrrrh aaarrhhh",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: Ei ei ei ei ei ei ei n�o vamos conseguir enfrentar tantos...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: Rosswald! N�o h� como fugir, o que vamos faremos?",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: ROSSWALD, ROSSWAAAAAAAAAAAAAALD!!!!!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nRosswald: N���������OOOOOOOOO!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                do{
                System.out.println("\n\n1 - Fugir...");
                escolha_fugir = entrada.nextInt();
                if(escolha_fugir!= 1){
                Digita("\n\nMestre: A��o inv�lida.",TimeUnit.MILLISECONDS, temp_dialog);
          }}while(escolha_fugir!=1); 
                Digita("\n\nMestre: Hummm, entendo... quando um dificil desafio nos � posto a prova, revelamos nossa verdadeira natureza.",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Os lobos o devoram inteiro em alguns segundos ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                System.exit(0);
              }}
          break;
          default:
          Digita("\n\nMestre: Desculpe jovem cavaleiro, eu n�o consegui ouvi-lo, pode repetir?",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(!resposta_questao01.equals("D") && !resposta_questao01.equals("d"));

               Digita("\n\nRosswald: VENHAM PRA CIMA, AAAAAAAAAAAAAAAHHHHHH!!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nRosswald: TROV�O LUPINO!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nIdril: F�RIA DE ELFHEIM!!!",TimeUnit.MILLISECONDS, temp_dialog);
               Digita("\n\nMestre: Chegou a hora de usar suas habilidades!",TimeUnit.MILLISECONDS, temp_dialog);
               do{
               System.out.println("\n\n1 - CORTE ESPECTRAL DE LUKE YEAGHER \n2 - PRINCIPE FANTASMA");
                resp_skill = entrada.nextInt();
                if(resp_skill != 1 && resp_skill != 2){
                   Digita("\n\nMestre: Eu n�o ouvi direito, cavaleiro.",TimeUnit.MILLISECONDS, temp_dialog);
                }}while(resp_skill != 1 && resp_skill!= 2);
                 Digita("\n\nMestre: Voc�s mataram os lobos, por�m ao chegarem na entrada da Caverna do Rei Dem�nio, se deparam com 5 goblins guardi�es.",TimeUnit.MILLISECONDS, temp_dialog);
                 Digita("\n\nIdril: O que faremos, Rosswald?",TimeUnit.MILLISECONDS, temp_dialog);
                 Digita("\n\nRosswald: Podemos enfrent�-los, ou tentar a sorte procurando por alguma entrada alternativa...",TimeUnit.MILLISECONDS, temp_dialog);
                 
                 int pontuacao = 0,resp_entrada;
              do{
               System.out.println("\n\n1 - Enfrentar os Goblins Guardi�es \n2 - Procurar por outra entrada.");
                resp_entrada = entrada.nextInt();
                if(resp_entrada == 1){
                Digita("\n\nMestre: Cavaleiro corajoso! Para vencer os goblins voc� precisar� responder 3 perguntas e acertar no m�nimo duas delas. �s quest�es a seguir n�o poder�o ser respondidas novamente. Se voc� n�o acertar pelo menos duas, ent�o o cruel combate contra os goblins depender� da sorte...",TimeUnit.MILLISECONDS, temp_dialog);
               


          String resp_bhaskara; 
          do{
          Digita("\n\nMestre: Aplicando a f�rmula de Bhaskara, resolva as seguintes equa��es do 2� grau. \n\na) 3x� � 7x + 4 = 0\n\nb) 9y� � 12y + 4 = 0\n\nc) 5x� + 3x + 5 = 0\n\nEm seguida, digite a alternativa com os resultados corretos.",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n\nA) Resolu��o -> a = S{4/3,1} | b = S{2/3,2/3} | c = N�o possuem ra�zes. ");
        System.out.println("\nB) Resolu��o -> a = S{5/3,2} | b = S{3/2,4/3} | c = N�o possuem ra�zes. ");
        System.out.println("\nC) Resolu��o -> a = S{4,1} | b = S{2/3,2/3} | c = N�o possuem ra�zes. ");
        System.out.println("\nD) Resolu��o -> a = N�o possuem raizes | b = S{2/3,2/3} | c = N�o possuem ra�zes. ");
        System.out.println("\nE) Resolu��o -> a = N�o possuem raizes | b = S{2/3,2/3} | c = S{4/3,1}");
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
          Digita("\n\nMestre: Pontua��o igual � "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "a":
          case "A":
          pontuacao = pontuacao+1;
          Digita("\n\nMestre: Resposta certa, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Pontua��o igual � "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          default:
          Digita("\n\nMestre: Desculpe cavaleiro, eu n�o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(!resp_bhaskara.equals("A") && !resp_bhaskara.equals("a") && !resp_bhaskara.equals("b") && !resp_bhaskara.equals("B") && !resp_bhaskara.equals("c") && !resp_bhaskara.equals("C") && !resp_bhaskara.equals("d") && !resp_bhaskara.equals("D") && !resp_bhaskara.equals("e") && !resp_bhaskara.equals("E"));
        

        String resp_equacao;
        do{
        Digita("\n\nMestre: Determine cada elemento da seguinte equa��o: x2 � 4x � 5 = 0",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("\n\nA) Resolu��o -> a = 1 | b = -5 | c = 4");
        System.out.println("\nB) Resolu��o -> a = -5 | b = -4 | c = 1");
        System.out.println("\nC) Resolu��o -> a = 0 | b = -4 | c = -5");
        System.out.println("\nD) Resolu��o -> a = -5 | b = 0 | c = 1");
        System.out.println("\nE) Resolu��o -> a = 1 | b = -4 | c = -5");
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
          Digita("\n\nMestre: Pontua��o igual � "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          case "e":
          case "E":
          pontuacao = pontuacao+1;
          Digita("\n\nMestre: Resposta certa, cavaleiro!",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Pontua��o igual � "+pontuacao,TimeUnit.MILLISECONDS, temp_dialog);
          break;
          default:
          Digita("\n\nMestre: Desculpe cavaleiro, eu n�o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }}while(!resp_equacao.equals("A") && !resp_equacao.equals("a") && !resp_equacao.equals("b") && !resp_equacao.equals("B") && !resp_equacao.equals("c") && !resp_equacao.equals("C") && !resp_equacao.equals("d") && !resp_equacao.equals("D") && !resp_equacao.equals("e") && !resp_equacao.equals("E"));

    int vetor[] = new int [5], num_aleatorio, roda_dado, resp_dado_goblins;
    String resposta_mestre="";
    for (int i = 0;i<vetor.length;i++){
      num_aleatorio = 1 + (int) (Math.random() * 10);
      vetor[i] = num_aleatorio;
    }

    Digita("\n\nMestre: A 3� pergunta, fica a crit�rio de sua sorte. De 1 a 10, eu pensarei em exatamente 5 n�meros e poder�o ser eles repetidos e diferentes (n�o seguir� nenhuma ordem), desta forma voc� precisar� acertar apenas 1 desses 5.",TimeUnit.MILLISECONDS, temp_dialog);
    System.out.print("\n\nTente acertar: ");
     int num = entrada.nextInt();
     for (int i = 0;i<vetor.length;i++){
         if(num == vetor[i]){
            resposta_mestre = "\n\nMestre: Voc� acertou, boa!";
            pontuacao=pontuacao+1;
            break;
        
         }else{
            resposta_mestre = "\n\nMestre: Infelizmente voc� errou.";
         }
         }
         Digita("\n\nMestre: Veja s� os n�meros que pensei: ",TimeUnit.MILLISECONDS, temp_dialog);
         System.out.print("\n");
          for (int i = 0;i<vetor.length;i++){ 
            System.out.println("\n"+(i+1)+"� n�mero = "+vetor[i]);
            }
          Digita(resposta_mestre,TimeUnit.MILLISECONDS, temp_dialog); 
          Digita("\n\nMestre: Pontua��o nas quest�es = "+(pontuacao),TimeUnit.MILLISECONDS, temp_dialog);
            if(pontuacao >=2){
                  Digita("\n\nMestre: Enfrentem os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
            }else if(pontuacao < 2){
            Digita("\n\nMestre: Voc�s foram avisados, tudo agora depender� da sorte de voc�s... lance o dado, igual ou acima de 4 voc�s vivem, caso contr�rio voc�s morrem.",TimeUnit.MILLISECONDS, temp_dialog);
              roda_dado = 1 + (int) (Math.random() * 6); 
              do{
               Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Dado de 6 lados.",TimeUnit.MILLISECONDS, temp_transicao);
               Digita("\n\nRodar os dados? ",TimeUnit.MILLISECONDS, temp_transicao);
               Digita("\n\n1 - Vamos l�!!!",TimeUnit.MILLISECONDS, temp_transicao); 
               System.out.println("\n");
               resp_dado_goblins = entrada.nextInt();
               System.out.println("\n");
               if(resp_dado_goblins != 1){
               Digita("\n\nMestre: Meu bravo cavaleiro, eu n�o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
               }}while(resp_dado_goblins != 1);
                Digita("\n\n** Rodando os dados ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nDado: "+roda_dado,TimeUnit.MILLISECONDS, temp_dialog);
                if(roda_dado<4){
                Digita("\n\nGoblins: Matem eles!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nRosswald: N���O! Idril, fuja! Eles s�o fortes demais...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Rosswald morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nIdril: ROSSWALD, N�O... SEUS MALDITOS, IR�O PAGAR POR ISSO!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\nIdril: QUEIMEEEEEEEEM!!!",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril conjura fogo com seu cajado ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: Mesmo com suas fortes habilidades de fogo, n�o foi suficiente...",TimeUnit.MILLISECONDS, temp_dialog);
                Digita("\n\n** Idril morre ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: S� restou voc� em batalha, jovem cavaleiro. O que vai fazer?",TimeUnit.MILLISECONDS, temp_dialog);
                do{
                System.out.println("\n\n1 - Fugir... \n2 - Lutar");
                escolha_fugir = entrada.nextInt();
                if(escolha_fugir!= 1 && escolha_fugir!= 2){
                Digita("\n\nMestre: A��o inv�lida.",TimeUnit.MILLISECONDS, temp_dialog);
                }
                else if(escolha_fugir == 2){
                    Digita("\n\nMestre: Realmente muito corajoso, por�m voc� sozinho n�o conseguir�...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Coragem nem sempre � a resposta meu jovem, � nos momentos de desespero onde mais precisamos manter a racionalidade...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Lembre-se disso...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins te devoram ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\n** Fim de Jogo ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    System.exit(0);
                }
                else if(escolha_fugir == 1){
                    Digita("\n\nMestre: Fugir? E eu pensando que cavaleiros eram corajosos...",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: N�o h� como fugir meu jovem, encare seu destino.",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Goblins se aproximam ** ",TimeUnit.MILLISECONDS, temp_narrativa);
                    Digita("\n\nMestre: Aceita��o � o primeiro passo para compreens�o de um erro. Aprenda e fa�a melhor na pr�xima aventura...",TimeUnit.MILLISECONDS, 70);
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
                   Digita("\n\nMestre: Eu n�o ouvi direito, cavaleiro.",TimeUnit.MILLISECONDS, temp_dialog);
                }}while(escolha_de_habilidade != 1 && escolha_de_habilidade!= 2);
                Digita("\n\n* Todos os goblins morrem **",TimeUnit.MILLISECONDS, temp_narrativa);
                Digita("\n\nMestre: E juntos voc�s entram na Caverna do Rei Dem�nio...",TimeUnit.MILLISECONDS, temp_dialog); 


         }
                else if(resp_entrada == 2){
                  Digita("\n\nMestre: Muito bem, h� exatamente 10 rotas alternativas que parecem indicar uma entrada para Caverna, por�m apenas uma dessas rotas permitir� que voc�s entrem... Voc� ter� apenas 5 chances para descobrir. Caso seguiam pelo caminho errado 5 vezes, os goblins ser�o alertados e todos voc�s morrer�o da maneira mais r�pida e cruel que conseguem imaginar... Que comece o desafio!",TimeUnit.MILLISECONDS, temp_dialog);
                  System.out.print("\n");
                  for(int i = 1; i<= 10;i++){
                        Digita("\n"+i+" - para seguir na "+i+"� rota aleat�ria.",TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  int rota_escolhida, tentativas = 0;
                  int rota_aleatoria = 1 + (int) (Math.random() * 10);
                  do{
                  Digita("\n\nMestre: Escolha uma rota para seguir: ",TimeUnit.MILLISECONDS, temp_dialog);
                  rota_escolhida = entrada.nextInt();
                  if(tentativas==4){
                  Digita("\n\nMestre: Os goblins foram alertados...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** Um deles arranca a cabe�a de Rosswald **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\n** Na sequ�ncia, os goblins arrancam fora �s suas pernas **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\nMestre: Sem tempo sequer para reagir, voc� observa Idril inutilmente tentando lutar...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** Voc� morre enquanto assistia Idril ser devorada **",TimeUnit.MILLISECONDS, temp_narrativa);
                  Digita("\n\nMestre: Para sobreviver aos grandes desafios da vida, �s vezes uma boa intui��o pode nos ajudar...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\n\n** Fim de Jogo **",TimeUnit.MILLISECONDS, temp_narrativa);
                  System.exit(0);
                  }
                   else if(rota_escolhida > rota_aleatoria && (rota_escolhida-rota_aleatoria) == 1){
                  tentativas = tentativas+1;
                  Digita("\n\nMestre: A rota n�o � essa, por�m ela est� pr�xima...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  else if(rota_escolhida < rota_aleatoria && (rota_aleatoria-rota_escolhida) == 1){
                  tentativas = tentativas+1;
                  Digita("\n\nMestre: A rota n�o � essa, por�m ela est� pr�xima...",TimeUnit.MILLISECONDS, temp_dialog);
                  Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                  }
                  else if(rota_escolhida > rota_aleatoria){
                      tentativas = tentativas+1;
                      Digita("\n\nMestre: A rota n�o � essa...",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                   }
                   else if(rota_escolhida < rota_aleatoria){
                      tentativas = tentativas+1;
                      Digita("\n\nMestre: A rota n�o � essa...",TimeUnit.MILLISECONDS, temp_dialog);
                      Digita("\nMestre: Tentativas = "+(tentativas),TimeUnit.MILLISECONDS, temp_dialog);
                   }
                else if(rota_escolhida == rota_aleatoria){
                   Digita("\n\nMestre: Voc�s descobriram uma passagem para Caverna e n�o precisar�o lutar contra os goblins!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nIdril: Conseguimos Rosswald!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nRosswald: Jovem principe... Idril... vamos l�. Bora chutar a bunda desse Rei Dem�nio de uma vez por todas!",TimeUnit.MILLISECONDS, temp_dialog);
                   Digita("\n\nMestre: E juntos, voc�s entram na caverna do Rei Dem�nio",TimeUnit.MILLISECONDS, temp_dialog);
      }}while(rota_escolhida!=rota_aleatoria);

                }
                
 } while(resp_entrada != 1 && resp_entrada!= 2);
 
 }

     static void capitulo_3() throws Exception{

        Scanner entrada = new Scanner (System.in);
        int resp, resp2, resp3, resp4, resp5, resp6, resp7, resp8, resp9, resp10, resp11, resp12, resp13, resp14;
        do{
        Digita("\n\n\n..:: DAWN OF DARKNESS ::.. - Cap�tulo 3 - A culpa � sua, n�o minha!",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\nIniciar aventura? ",TimeUnit.MILLISECONDS, temp_transicao);
        Digita("\n\n1 - Vamos!!!",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp = entrada.nextInt();
        if(resp != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, eu n�o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp!=1);
          Digita("\n\nMestre: Ao entrar na Caverna do Rei Dem�nio, voc�s ficam surpresos...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: Estava tudo VAZIO! Sem monstros, dem�nios ou qualquer coisa assustadora...",TimeUnit.MILLISECONDS, temp_dialog);
          do{
      
        Digita("\n\n1 - Esperem, isso est� estranho...",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp2 = entrada.nextInt();
        if(resp2 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp2!=1);

        Digita("\n\nIdril: Sim de fato, por que n�o h� nada aqui dentro?",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nRosswald: Hum.. cuidado, dem�nios podem ficar invisiveis...",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nMestre: Voc�s exploram a Caverna, por�m ainda n�o encontram nada. Tudo continua vazio e sem o menor barulho",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nIdril: Rosswald, e se os boatos n�o forem verdade...?",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nRosswald: Eles PRECISAM ser Idril, n�o temos muita escolha...",TimeUnit.MILLISECONDS, temp_dialog);
        do{
      
        Digita("\n\n1 - Boatos? As pistas que voc�s disseram na taverna eram apenas boatos?",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp3 = entrada.nextInt();
        if(resp3 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp3!=1);
           Digita("\n\nRosswald: Sim jovem, mas s�o FORTES BOATOS que indicam que o respons�vel pela praga � o asqueroso Rei Dem�nio. N�o faria muita diferen�a te falar isso na taverna.",TimeUnit.MILLISECONDS, temp_dialog);

           do{
      
        Digita("\n\n1 - SEM ESSA! Como podem agir baseado em boatos?",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp4 = entrada.nextInt();
        if(resp4 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp4!=1);
         Digita("\n\nRosswald: N�o mudaria muito, n�o �? Voc� estava desesperado quando pedimos sua ajuda... n�s tamb�m estamos! Pessoas est�o morrendo, cavaleiro! Morrendo a mais de dois meses! Se h� alguma pequena chance de vencermos essa doen�a, precisamos agarra-la forte!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nRosswald: Desculpe, mas ou�a principe, seu pai tamb�m � uma das vitimas da praga... N�o se sente tentado a ir atr�s da menor possibilidade poss�vel de encontrar alguma cura?",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nIdril: Sim pequeno cavaleiro, controle suas emo��es e vamos continuar... Os boatos s�o verdadeiros, e vamos conseguir encontrar uma cura para popula��o de Alduin com esse Rei Dem�nio.",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: E assim voc�s prosseguem explorando a masmorra, at� que...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\n** Barulho de ronco ** ",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nRosswald: Esperem! O que foi isso...?",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\n** Barulho de ronco ** ",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nMestre: Idril tremendo da cabe�a aos p�s, olha para algo deitado no fim de uma das passagens da caverna.",TimeUnit.MILLISECONDS, temp_dialog);
           Digita("\n\nRosswald: Fa�am o menor barulho poss�vel...",TimeUnit.MILLISECONDS, temp_dialog);

           do{
      
        Digita("\n\n1 - Rosswald, isso � um....",TimeUnit.MILLISECONDS, temp_transicao);
        System.out.println("\n");
        resp5 = entrada.nextInt();
        if(resp5 != 1){
          Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
        }
        }while(resp5!=1);
         Digita("\n\nMestre: DRAG�O!",TimeUnit.MILLISECONDS, temp_dialog);
         Digita("\n\nMestre: Para passarem do drag�o sem acorda-lo, ser� uma tarefa complicada...",TimeUnit.MILLISECONDS, temp_dialog);
          Digita("\n\nMestre: O ch�o da caverna � velho e antigo, por isso possui diversas fendas e rachaduras que fazem barulho ao pisar. A ideia � que passem pelo drag�o silenciosamente e sem pisar em nenhuma das fendas.",TimeUnit.MILLISECONDS, temp_dialog);
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
            Digita("\n\nMestre: Para passar do drag�o, ser�o necess�rios 10 passos. Neste percurso da Caverna cont�m cinco fendas no ch�o. Que a sorte esteja com voc�s...",TimeUnit.MILLISECONDS, temp_dialog);
             Digita("\nMestre: Aaaah, para ajud�-los, darei uma dica... Se o drag�o se mexer, � por que voc�s est�o pr�ximos a uma fenda, tomem cuidado!",TimeUnit.MILLISECONDS, temp_dialog);
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
                Digita("\n\nMestre: Onde ir�o pisar? ",TimeUnit.MILLISECONDS, temp_dialog);
                posicao_escolhida = entrada.nextInt();
                if(posicao_escolhida > (caminho.length-1) || posicao_escolhida < 0 || posicao_escolhida == guarda_posicao){
                 Digita("\n\nMestre: Desculpe cavaleiro, n�o ouvi direito.",TimeUnit.MILLISECONDS, temp_dialog);
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
                    Digita("\n\nMestre: O drag�o acordou!",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\nMestre: Resultado do seu percurso = "+(pontuacao +" / "+pontuacao_maxima),TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\n** Todos voc�s morrem em um piscar de olhos ** ",TimeUnit.MILLISECONDS, temp_narrativa);
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
                    Digita("\n\nMestre: Voc�s conseguiram passar sem pisar em nenhuma fenda!",TimeUnit.MILLISECONDS, temp_dialog);
                    Digita("\n\nMestre: Resultado do seu percurso = "+(pontuacao +" / "+pontuacao_maxima),TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nIdril: Uuufaaa! Conseguimos!",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nRosswald: Estamos chegando ao fim da Caverna, s� mais um pouco e talvez encontraremos o Rei Dem�nio.",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nMestre: Voc�s chegam ao fim da caverna... O lugar estranhamente parecia algum tipo de catedral por debaixo da terra de t�o imenso que era.",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\nRosswald: Ok, esperem. Ser� a qualquer momento...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** 1 minuto se passa **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nRosswald: A qualquer momento...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** Mais 2 minutos se passam **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nIdril: Ei Rosswald... no fim das contas eram apenas boatos...",TimeUnit.MILLISECONDS, temp_dialog);
                     Digita("\n\n** Idril come�a a chorar **",TimeUnit.MILLISECONDS, temp_narrativa);
                     Digita("\n\nMestre: Rosswald parece n�o notar.",TimeUnit.MILLISECONDS, temp_dialog);

                     do{
                        Digita("\n\n1 - Ei cara, sua mulher est� chorando.",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp6 = entrada.nextInt();
                        if(resp6 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp6!=1);
                       Digita("\n\n** Rosswald continua parado, esperando alguma coisa **",TimeUnit.MILLISECONDS, temp_narrativa);
                      do{
                        Digita("\n\n1 - ROSSWALD! IDRIL EST� CHORANDO, D� PARA FAZER ALGUMA COISA?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp7 = entrada.nextInt();
                        if(resp7 != 1){
                        Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                         }}while(resp7!=1);
                        Digita("\n\n** Rosswald n�o move um m�sculo sequer **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRei Dem�nio: COMO ESPERADO DO GRANDE BRUXO DO NORTE!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\n** Idril olha assustada **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRei Dem�nio: Foi o primeiro a me notar hahahaha...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nMestre: O Rei Dem�nio era um ser muito assustador. Tinha asas negras pontiagudas, pele negra avermelhada, olhos luminosos, presas e media cerca de 5 metros de altura...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Dem�nio: O que os trazem na minha casa, jovens?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Ent�o voc� estava invisivel o tempo todo... Outros dem�nios moram aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Dem�nio: Vivo em solid�o bruxo, extrema solid�o... Mas voc�s n�o responderam minha pergunta, o que vieram fazer aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: VIEMOS ATR�S DA CURA DA PRAGA! POR QUE EST� MATANDO O POVO DE ALDUIN? POR QUE?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nRei Dem�nio: Ah compreendo... o desespero...",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: RESPONDA SEU NOJENTO DESGRA�ADO, POR QUE EST� MATANDO �S PESSOAS?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nRei Dem�nio: E por qual motivo voc� protege �s pessoas, pequena Elfa?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\n** Idril fica calada **",TimeUnit.MILLISECONDS, temp_narrativa);
                         Digita("\n\nRei Dem�nio: N�o sabe, n�o �?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: N�O VEM COM ESSA, N�O � PRECISO DE UM MOTIVO PARA QUERER A FELICIDADE, A VIDA, A PROSPERIDADE E O SORRISO NO ROSTO DAS PESSOAS!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Dem�nio: Ah � mesmo? Essas palavras soam t�o bonitas quando ditas por uma Elfa. Parecem at� uma serenata.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** Rosswald segura a m�o de Idril **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nRosswald: Se acalme Idril, precisamos manter o foco.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: � como ela diz, oh Lorde dos Dem�nios! Viemos atr�s da cura da praga. Voc� deve saber algo a respeito, sim?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Dem�nio: Ah sei sim, tanto quanto qualquer pessoa. Est� matando a todos, isso n�o � lindo?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: O que quer dizer..? Como assim qualquer pessoa?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Dem�nio: Todos est�o morrendo, n�o �? � natural que o mundo inteiro fique sabendo...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: N�o venha com joguinhos, diga. Voc� � o culpado disso, n�o �?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRei Dem�nio: � uma acusa��o bem s�ria, bruxo do norte.",TimeUnit.MILLISECONDS, temp_dialog);
                        do{
                        Digita("\n\n1 - DIGA DE UMA VEZ, MONSTRO! POR QUE EST� MATANDO TODOS COM A PRAGA?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp8 = entrada.nextInt();
                        if(resp8 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp8!=1);

                       Digita("\n\n** Rei Dem�nio faz uma reverencia **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRei Dem�nio: O jovem principe de Luke Yeagher, realmente visitas interessantes eu tenho hoje.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - PERDI MUITOS AMIGOS NA BUSCA PELA CURA E MEU PAI EST� MORRENDO! RESPONDA, FILHO DA M�E!",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRei Dem�nio: Duas acusa��es s�rias em apenas alguns minutos... e no fim das contas eu sou monstro.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - DIGA, MALDITO, DIGA DE UMA VEZ POR TODAS! QUAL A SUA RAZ�O PARA MATAR �S PESSOAS?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRei Dem�nio: Eu n�o mato �s pessoas, principe. Quem mata � a praga. No m�ximo eu �s assisto morrer.",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - POR QUE? POR QUE FAZER ISSO?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp9 = entrada.nextInt();
                        if(resp9 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp9!=1);
                       Digita("\n\nRosswald: Responda logo, voc� � ou n�o o respons�vel pela praga? Se continuar de brincadeiras, morrer� aqui e agora!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: Dem�nios al�m de ficarem invisiveis, no geral n�o s�o dificeis de matar. Se forem altos, � s� pular em cima. Se forem tremendamente fortes, ent�o � s� usar usar magia. Voc� sabe disso, n�o � Lorde Dem�nio?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei Dem�nio: N�o esperava menos coragem do bruxo do norte! � exatamente isso.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei Dem�nio: Mas o fato � que...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** Rei Dem�nio come�a a se transformar **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nIdril: Esperem, ele est�...",TimeUnit.MILLISECONDS, temp_dialog);
                        do{
                        Digita("\n\n1 - ENCOLHENDO?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp10 = entrada.nextInt();
                        if(resp10 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp10!=1);
                       Digita("\n\nMestre: O Rei Dem�nio se transforma em algo de aparencia humana... na verdade ele se transforma em um verdadeiro humano. E voc� lembra dele de alguma lugar... Ele tinha um sorriso no rosto...",TimeUnit.MILLISECONDS, temp_dialog);
                       do{
                        Digita("\n\n1 - MAS QUEM � VOC�?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp11 = entrada.nextInt();
                        if(resp11 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp11!=1);
                        Digita("\n\nRosswald: Taverna? O an�o da taverna... Mas que diabos est� acontecendo aqui?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: Imposs�vel! Aquele an�o � um pobre coitado com uma taverna sem lucros por causa da praga, n�o tem como ele ser o Rei Dem�nio",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAn�o: Voc�s realmente conseguiram passar pelo desafio dos goblins, estou admirado! Estava torcendo por voc�s!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Mas o que est� acontecendo aqui...? An�o, por que?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAn�o: Sempre fui um dem�nio, jovens. E n�o, n�o sou o culpado pela praga.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** Sil�ncio **",TimeUnit.MILLISECONDS, temp_narrativa);
                        Digita("\n\nAn�o: Vivo em minha humilde taverna, observando o qu�o determinados conseguem ser os aventureiros. Acreditem, nada � mais legal do que ser aventureiro. Nada. � t�o libertador, n�o acham?",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAn�o: Sinceramente, prefiro mil vezes a minha taverna do que minha casa. Olhem em volta, nem Verrad me faz companhia! Aquele drag�o dorminhoco!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\n** Rosswald e Idril entreolham-se , sem compreender a situa��o **",TimeUnit.MILLISECONDS, temp_narrativa);
                        do{
                        Digita("\n\n1 - CALA BOCA!",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp11 = entrada.nextInt();
                        if(resp11 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp11!=1);
                       Digita("\n\n** O an�o continua a falar e falar **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nAn�o: Vieram aqui pelos boatos, n�o � jovens? Mas voc�s precisam entender, EU N�O SOU O CULPADO DISSO!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: Ent�o quem �? DIGA, AN�O! VOC� � O REI DOS DEM�NIOS, DEVE SABER ALGO A RESPEITO!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAn�o: Eu sei quem s�o os culpados... querem ouvir a hist�ria?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: Por favor, nos ajude! Nos diga!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAn�o: Muito bem, tudo come�ou na terra dos Elfos...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** Idril fica cheia de �dio ao ouvir aquilo **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nAn�o: Havia um experimento sendo feito por um grupo de elfos aventureiros, aah pobrezinhos. Queriam alcan�ar a vida eterna, mal sabiam eles o tamanho do desastre que fariam. Mal sabiam o qu�o angustiamente �, n�o poder morrer...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAn�o: Eles vieram at� mim pois o processo necessitava da ben��o dos dem�nios. Um poderoso dem�nio.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAn�o: Eu apenas concebi a eles a oportunidade para realizarem um sonho, mas assim que a f�rmula ficou pronta, houve uma explos�o gigantesca, t�o grande que deixou alguns elfos visinhos ao local do experimento, surdos at� hoje!",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nIdril: N�o pode ser! Aquela explos�o de Elfheim aconteceu devido a queda de um raio! Era um dia de tempestade.",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAn�o: Voc�s realmente gostam de boatos, n�o � jovens? Assustador...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAn�o: Enfim, depois disso o mundo est� vivendo nessa pandemia da praga at� hoje. E segundos os novos boatos, eu sou o culpado! Hahahahahaha, � t�o bom isso! Dem�nios nunca s�o conhecidos por feitos grandiosos assim, geralmente s� fazem o mal e bl� bl� bl�...",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nAn�o: Ou�am jovens, voc�s est�o de parab�ns por terem chegado at� aqui! Acreditem, se Verrad tivesse sido acordado, virariam ra��o de drag�o! ",TimeUnit.MILLISECONDS, temp_dialog);
                        Digita("\n\nRosswald: Se a sua hist�ria for verdadeira, ent�o se voc� retirasse a ben��o demoniaca das pessoas doentes, talvez elas pudessem... talvez ela pudessem...",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAn�o: Eu j� disse hoje que n�o esperava menos de voc�, bruxo do norte? Realmente um homem s�bio.",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: Voc� precisa nos ajudar, An�o! Por favor, precisa retirar a ben��o dos doentes e acabar com isso!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAn�o: Voc�s invadem a minha casa, me acusam, me amea�am de morte e agora querem que eu ajude voc�s..? Querem que eu ajude o MUNDO?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nIdril: VOC� CONTRIBUIU PARA ESSSA PANDEMIA SE TORNAR REALIDADE, CONCEBEU PODER A POBRES ELFOS INOCENTES! PRECISA CONSERTAR O QUE FEZ, MALDITO!",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAn�o: � por isso que dem�nios s�o legais, n�s n�o temos essa exigencia cega e egoista dos homens. Vivemos de forma simples, sem preconceito e na mais pac�fica paz. Talvez alguns sejam maus, mas quem no mundo � 100% puro?",TimeUnit.MILLISECONDS, temp_dialog);
                         Digita("\n\nAn�o: Querem saber por que dem�nios ficam invisiveis?",TimeUnit.MILLISECONDS, temp_dialog);
                          do{
                        Digita("\n\n1 - POR FAVOR, AN�O. FA�A ESSA CRISE PARAR, LHE PROMETO GRANDIOSAS RECOMPENSAS DE LUKE YEAGHER.",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp12 = entrada.nextInt();
                        if(resp12 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp12!=1);
                       Digita("\n\nAn�o: Os dem�nios ficam invisiveis para n�o assustar �s pessoas... Geralmente n�s nascemos feios, horriveis e assustadores. Todos saem correndo assim que nos veem.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAn�o: N�o que isso me deixe triste, � s� que h� tanto preconceito no mundo dos homens... realmente algo chato, sabe? Alguns como eu, depois de muito estudo na vida, aprendem a se transformar em humanos. E assim vivem suas vidas, para sempre como humanos.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAn�o: Querem que eu retire a ben��o dem�niaca do mundo de Alduin? Querem que eu cure a praga? Quem criou isso foram voc�s!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRosswald: Cuidado dem�nio, n�o fomos n�s que ajudamos aqueles elfos.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nAn�o: N�o muda o fato! Voc�s s�o os aventureiros, voc�s criam ambi��es t�o dificieis de alcan�ar que apelam at� para os dem�nios para atingir seus objetivos. N�o ligam para nada! Agrade�am por poder morrer e se livrarem de um mundo t�o maldoso.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: N�O! N�O PODE FAZER ISSO! PRECISA AJUDAR A POPULA��O DE ALDUIN!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** O an�o se transforma em dem�nio novamente **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRosswald: O QUE PENSA QUE EST� FAZENDO?",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei dem�nio: VERRAD! VENHA AQUI.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** o feroz drag�o chega ao local pouco tempo depois **",TimeUnit.MILLISECONDS, temp_narrativa);
                       do{
                        Digita("\n\n1 - MALDITO... O QUE PENSA EM FAZER COM ESSE DRAG�O?",TimeUnit.MILLISECONDS, temp_transicao);
                        System.out.println("\n");
                        resp13 = entrada.nextInt();
                        if(resp13 != 1){
                      Digita("\n\nMestre: Meu bravo cavaleiro, n�o conseguiram te ouvir...",TimeUnit.MILLISECONDS, temp_dialog);
                       }}while(resp13!=1);
                       Digita("\n\nRei dem�nio: Alegrem-se jovens, estarei fazendo um favor tirando-os deste mundo t�o ruim.",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei dem�nio: Verrad, n�o permita que eles escapem!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\n** O drag�o da um rugido ensurdecedor **",TimeUnit.MILLISECONDS, temp_narrativa);
                       Digita("\n\nRosswald: N�o temos a menor chance de vencer...",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nIdril: Precisamos pensar em algo r�pido. Vamos todos morrer em alguns segundos!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei dem�nio: Prestigiem o total poder do Rei dos Dem�nios, a habilidade profanada do mundo dos mortos, que assola pa�ses e destr�i tudo!",TimeUnit.MILLISECONDS, temp_dialog);
                       Digita("\n\nRei dem�nio: ALVORECER DA ESCURID�O!",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\n** Os tr�s grandes her�is d�o �s m�os, n�o h� mais o que fazer... **",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Assim que o Rei Dem�nio usa sua habilidade final, todos voc�s morrem.",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Mas n�o se preocupe, meu jovem cavaleiro. N�o havia como terminar essa hist�ria de outro jeito! O ponto � que, voc� precisa aprender o seguinte: ",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: Quando estamos assustados, quando parece n�o haver mais esperan�as, precisamos manter a f�, confian�a e racionalidade. E n�o procurar algu�m para culpar. A culpa pode justificar uma causa, mas com certeza n�o vai resolve-la. Problemas n�s teremos a todo momento, mas precisamos encar�-los juntos. Resolv�-los juntos, e n�o culpar �s nossas sombras ou os nossos dem�nios.",TimeUnit.MILLISECONDS, temp_narrativa);
                      Digita("\n\nMestre: MORRAM EM PAZ JOVENS CAVALEIROS E PRESTIGIEM O ALVORECER DA ESCURID�O!",TimeUnit.MILLISECONDS, temp_narrativa);
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
                  Digita("\n\n** O drag�o se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
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
                   Digita("\n\n** O drag�o se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
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
                  Digita("\n\n** O drag�o se mexe ** ",TimeUnit.MILLISECONDS, temp_narrativa);
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