
package JogoPi;
import java.util.*;

public class Jogo{
    public static void jogar() {


        int vida = 15;
        int dano;


        String respostaJogador;

        ArrayList<String> perguntas = new ArrayList<>();
        ArrayList<String> respostas = new ArrayList<>();


        //  Perguntas sobre o tipo INT
        perguntas.add("O tipo de dado INT em SQL é usado para armazenar que tipo de valor?");
        respostas.add("numeros inteiros");

        perguntas.add("Qual é o intervalo aproximado de valores que um INT pode armazenar em SQL?");
        respostas.add("-2147483648 a 2147483647");

        perguntas.add("Se você quiser armazenar o número 25, qual tipo de dado deve usar?");
        respostas.add("int");

        perguntas.add("O tipo INT pode armazenar valores decimais?");
        respostas.add("nao");

        perguntas.add("Qual palavra-chave em SQL é usada para criar uma coluna do tipo inteiro?");
        respostas.add("int");

        perguntas.add("Qual tipo de dado é mais indicado para contar a quantidade de registros em uma tabela?");
        respostas.add("int");


        //  Sistema de sorteio da pergunta
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        //Essa linha escolhe aleatoriamente uma posição dentro do ArrayList e guarda esse número na variável indice.
        //Depois, você usa o indice pra buscar a pergunta e a resposta.
        int indice = random.nextInt(perguntas.size());


        System.out.println("");
        System.out.println("");

        System.out.println("Bem-vindo ao reino de Datária");
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();


        System.out.println("");
        System.out.println("");
        System.out.println("");


        System.out.println("Cinco pilares... Cinco dados... Um código quebrado.");
        scanner.nextLine(); // Espera o jogador apertar ENTER

        System.out.println("Fragmentos flutuam no ar — pedaços de runas, números e palavras misturados.");
        scanner.nextLine();

        System.out.println("Uma voz distante ecoa:");
        System.out.println("\"O equilíbrio foi quebrado... os Guardiões caíram.\"");
        scanner.nextLine();

        System.out.println("\"O Feitiço corruptum foi lançado, e agora nada mais é certo.\"");
        scanner.nextLine();

        System.out.println("Você desperta em meio a ruínas antigas...");
        System.out.println("Uma esfera de luz paira ao seu redor, é a essência enfraquecida de Date, a guardiã do tempo.");
        scanner.nextLine();

        System.out.println("Date: \"Eu não posso mais conter o colapso...\"");
        System.out.println("Date: \"Procure os outros Guardiões... Int, Varchar, Boolean, Float...\"");
        System.out.println("Date: \"Reúna-os, antes que o Sistema se apague...\"");
        scanner.nextLine();

        System.out.println(">>> Missão Iniciada: O Chamado dos Guardiões <<<");
        scanner.nextLine();


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


        System.out.println(nome + "," + nome);
        System.out.println(nome + ": Descupla, acho que acabei dormindo");
        System.out.println("Scarlet: Anda, vamos logo. Ou vamos chegar atrasados.");
        System.out.println(nome + ": Ir, mas para onde?");
        System.out.println("Scarlet: Você esqueceu? Hoje é nosso primeiro dia de aula na Academia de Algoritmos Arcanos");
        scanner.nextLine();
        System.out.println(nome + ": \"Finalmente... meu primeiro dia na Academia de Algoritmos Arcanos.\"");
        System.out.println("Você caminha pelo enorme portão de cristal que reflete linhas de código cintilantes.");
        System.out.println("A academia é linda — corredores de mármore branco, runas flutuando e alunos animados conversando.");
        scanner.nextLine();

        System.out.println("Um professor passa e diz:");
        System.out.println("Professor: \"Bem-vindo, aprendiz! Sua jornada para dominar a magia dos dados começa hoje.\"");
        System.out.println("Você sorri, mas sente algo diferente no ar... como se o tempo estivesse distorcido por um instante.");
        scanner.nextLine();

        System.out.println("De repente, uma voz suave ecoa na sua mente, como um sussurro distante:");
        System.out.println("Voz misteriosa: \"...aprendiz... consegue me ouvir?...\"");
        System.out.println(nome + ": (pensando) \"Quem está aí?\"");
        System.out.println("Voz: \"Sou Date... a Guardiã do Tempo. Preciso da sua ajuda...\"");
        scanner.nextLine();

        System.out.println("Você olha ao redor, mas ninguém parece ouvir a voz.");
        System.out.println("Date: \"Algo terrível está acontecendo... o Guardião Int, aquele que rege os números e a lógica foi corrompido.\"");
        System.out.println("Date: \"Me encontre... há um caminho escondido dentro da própria academia... siga o som do tempo.\"");
        scanner.nextLine();

        System.out.println("Enquanto caminha pelos corredores, um som metálico ressoa em sua mente, como um relógio quebrado.");
        System.out.println("Tic... tac... tic... tac...");
        System.out.println("Você sente o chão vibrar levemente e nota um brilho estranho atrás de uma tapeçaria antiga.");
        scanner.nextLine();

        System.out.println("Você afasta a tapeçaria e encontra uma pequena escadaria em espiral descendo para as profundezas.");
        System.out.println("No ar, uma energia azulada pulsa lentamente, como se o próprio código da realidade estivesse vivo.");
        System.out.println("Date: \"Sim... é por aí. Estou te guiando... não tenha medo.\"");
        scanner.nextLine();

        System.out.println("Você desce os degraus, e o som do mundo acima desaparece.");
        System.out.println("Ao final da escada, há uma enorme porta metálica coberta de símbolos binários, zeros e uns que piscam em padrões misteriosos.");
        System.out.println(nome + ": \"Essa... deve ser a entrada...\"");
        scanner.nextLine();

        System.out.println("Date: \"Para abrir a porta, concentre-se... o código responde à vontade daquele que busca equilíbrio.\"");
        System.out.println("Você fecha os olhos, respira fundo e sente a energia fluir pelas pontas dos dedos.");
        System.out.println("Os símbolos binários começam a se alinhar, formando uma sequência perfeita: 101101.");
        ;
        scanner.nextLine();

        System.out.println("Um estrondo ecoa — a porta se abre lentamente, liberando uma névoa fria e azul.");
        System.out.println("Do outro lado, há um salão vasto, com colunas de luz pulsando e ecos de vozes digitais.");
        System.out.println("Date: \"Você entrou no Calabouço Binário... lar do Guardião Int. Se falhar aqui, o equilíbrio de Datária será perdido.\"");
        scanner.nextLine();

        System.out.println("Você sente o peso da missão. Cada passo dentro do salão é acompanhado pelo som distante de engrenagens e algoritmos quebrados.");
        System.out.println("No centro, um pedestal flutua com fragmentos de números e luz.");
        System.out.println();

        System.out.println("");
        System.out.println("");
        System.out.println("");


        while(vida > 0){

            System.out.println(">>> MISSÃO 1 INICIADA: O ECO DE INT <<<");
            System.out.println("Local: Caverna Binária — O domínio corrompido do Guardião dos Números.");

            System.out.println("");
            System.out.println("");
            System.out.println("");

            ;
            scanner.nextLine();
            System.out.println();
            System.out.println("Você dá o primeiro passo dentro da Caverna Binária.");
            System.out.println("O chão é feito de blocos luminosos que mudam de cor conforme você anda.");
            System.out.println("Linhas de código flutuam no ar, como espíritos presos entre os números.");
            scanner.nextLine();

            System.out.println("Date: \"Aqui, a lógica reina... mas foi distorcida pela corrupção de Int.\"");
            System.out.println("Date: \"Tenha cuidado. O código reagirá a você — tanto com força quanto com razão.\"");
            scanner.nextLine();

            System.out.println("De repente, o chão embaixo de você pisca em vermelho.");
            System.out.println("Linhas de código se reorganizam, formando criaturas feitas de bits e números fragmentados!");
            System.out.println("Date: \"Cuidado! São *Erros de Compilação*! Restos de código corrompido que atacam qualquer coisa viva.\"");
            scanner.nextLine();

            System.out.println("Você avança pelo corredor da Caverna Binária...");
            System.out.println("As luzes piscam cada vez mais rápido, e uma voz robótica ecoa entre os blocos de código.");
            System.out.println("??? : \"Intruso detectado... Teste de integridade iniciado.\"");
            System.out.println("Date: \"Cuidado! É um Soldado Binário — ele testa a lógica de quem invade este domínio.\"");
            scanner.nextLine();


            boolean InimigoVivo = true;

            while (InimigoVivo) {
                System.out.println();
                System.out.println("O Soldado Binário de Int te encara e pergunta com voz metálica:");
                System.out.println("\"Qual desses valores é válido para uma variável do tipo int em sql?\"");
                System.out.println("1. 3.14");
                System.out.println("2. 1011");
                System.out.println("3. '2.298'");
                System.out.print("Digite o número da sua resposta: ");
                int resposta = scanner.nextInt();
                scanner.nextLine();


                if (resposta == 2) {
                    System.out.println();
                    System.out.println("Você responde com firmeza: '1011'.");
                    System.out.println("O Sentinela vibra em azul, e os números em seu corpo se reorganizam.");
                    System.out.println("Sentinela Binário: \"Validação concluída... tipo INT confirmado.\"");
                    System.out.println("O inimigo se desfaz em fragmentos de dados, libertando o caminho adiante.");
                    InimigoVivo = false;

                } else {
                    dano = random.nextInt(2) + 1;
                    vida -= dano;
                    System.out.println("Voce errou a resposta");
                    System.out.println("Você hesita... e o chão se ilumina em vermelho!");
                    System.out.println("Um feixe de números corrompidos te atinge, causando " + dano + " pontos de dano!");
                    System.out.println("Sua vida agora é: " + vida);
                    System.out.println();
                    System.out.println("Date: \"Errou! Lembre-se: o tipo INT armazena apenas números inteiros  sem aspas, sem casas decimais!\"");
                    System.out.println("O Sentinela Binário recalibra seus cálculos e repete a pergunta...");
                }
            }
            scanner.nextLine();
            System.out.println("Você respira fundo e observa os fragmentos do Soldado Binário se dissipando no ar.");
            System.out.println("As linhas de código à sua volta voltam a brilhar em azul, indicando que o caminho está limpo.");
            scanner.nextLine();

            System.out.println("Date: \"Bom trabalho! Este domínio está cheio de entidades criadas para testar o conhecimento lógico e sintático...\"");
            System.out.println("Date: \"Mas quanto mais fundo formos, mais complexas serão as perguntas.\"");
            scanner.nextLine();

            System.out.println("Você continua caminhando pela Caverna Binária, observando símbolos flutuando nas paredes —");
            System.out.println("comandos SQL, trechos de código, e variáveis deformadas pela corrupção digital.");
            System.out.println("De repente, uma rachadura surge no chão, e blocos começam a se mover sozinhos!");
            scanner.nextLine();

            System.out.println("As pedras se agrupam, formando uma figura colossal feita de dígitos e chamas elétricas.");
            System.out.println("??? : \"Eu sou o Golem dos Inteiros... aquele que mantém a ordem dos dados primitivos!\"");
            System.out.println("Date: \"Este é o próximo teste. Cuidado ele é implacável com erros de tipo!\"");
            scanner.nextLine();


            boolean respostaCorreta = false;

            do {
                System.out.println("O Golem dos Inteiros ergue sua lança digital e grita:");
                System.out.println("\"Para provar seu valor, responda com exatidão.\"");


                System.out.println(perguntas.get(indice));

                System.out.println("Qual sua resposta ?");
                respostaJogador = scanner.nextLine().toLowerCase().trim();

                if (respostaJogador.equalsIgnoreCase(respostas.get(indice))) {
                    System.out.println("Você responde com confiança");
                    System.out.println("O Golem dos Inteiros observa em silêncio... então sorri.");
                    System.out.println("\"Correto. Somente quem entende a natureza dos tipos pode seguir em frente.\"");
                    System.out.println("Ele se desfaz em números luminosos, abrindo um portal adiante.");
                    System.out.println("Date: \"Impressionante... estamos mais próximos do núcleo corrompido.\"");
                    respostaCorreta = true;
                } else {
                    dano = random.nextInt(3) + 2;
                    vida -= dano;
                    System.out.println();
                    System.out.println("Você hesita e responde de forma incorreta!");
                    System.out.println("O Guardião ergue a lança, lançando uma rajada de dados corrompidos!");
                    System.out.println("Você sofre " + dano + " pontos de dano!");
                    System.out.println("Sua vida agora é: " + vida);
                    System.out.println("Então o guardião refaz a pergunta");

                }
            } while (!respostaCorreta && vida > 0);


            System.out.println();
            System.out.println("Você respira fundo e atravessa o portal aberto pelos fragmentos do Golem dos Inteiros...");
            scanner.nextLine();

            System.out.println("A sensação é estranha — como se cada linha do seu código-fonte estivesse sendo reescrita.");
            System.out.println("Você surge em outro ambiente, mais silencioso, mas com uma energia densa no ar.");
            scanner.nextLine();

            System.out.println("Date: \"Chegamos... este lugar parece ser uma antiga área de testes de dados.\"");
            System.out.println("Date: \"Os registros indicam que aqui ocorriam experimentos com variáveis instáveis.\"");
            scanner.nextLine();

            System.out.println("À sua frente, há dois caminhos iluminados por blocos flutuantes de código:");
            System.out.println("➡ À esquerda, você vê um baú brilhando com símbolos binários girando ao redor.");
            System.out.println("➡ À direita, um corredor escuro, onde ecos metálicos lembram linhas de compilação se repetindo.");
            scanner.nextLine();
            System.out.println("Date: \"Hmm... parece que você terá que escolher, Explorador.\"");
            System.out.println("Date: \"O baú pode conter recompensas... ou armadilhas.\"");
            System.out.println();
            System.out.println("1. Abrir o baú.");
            System.out.println("2. Ignorar o baú e seguir em frente.");
            System.out.print("O que você deseja fazer? ");


            int escolha = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (escolha == 1) {
                System.out.println("Você se aproxima lentamente do baú...");
                System.out.println("Símbolos de 0 e 1 dançam ao redor da tampa, emitindo um brilho dourado.");
                scanner.nextLine();

                System.out.println("Você estende a mão e o abre cuidadosamente...");
                System.out.println("De dentro, sai uma nevoa escura, formando uma especie de tentaculo");
                System.out.println("Que entao te puxa para dentro do bau.");
                System.out.println("Ao abrir os olhos, voce ve que foi teleportado para uma arena em ruinas");

                System.out.println("O chão se fragmenta em placas luminosas flutuantes, formando uma arena circular no centro do abismo digital.");
                System.out.println("Correntes de números decimais giram ao redor, criando um redemoinho de dados instáveis.");
                scanner.nextLine();

                System.out.println("De repente, dois portais menores se abrem ao seu redor...");
                System.out.println("Deles caem criaturas pequenas, deformadas, com olhos brilhando em verde e códigos piscando pelo corpo.");
                System.out.println("Date: \"Atenção! São Goblins de Dados! Criaturas geradas a partir de variáveis corrompidas!\"");
                scanner.nextLine();

                System.out.println("Os goblins se movem rápido, chiando palavras distorcidas em binário.");
                System.out.println("??? : \"I...n..t..e..i...r...o ERR0! ERR0!\"");
                System.out.println("Date: \"Eles parecem instáveis! Cada um carrega um fragmento de código ligado ao tipo FLOAT!\"");
                scanner.nextLine();

                System.out.println("Você entra em posição de combate enquanto as criaturas cercam você pela esquerda e pela direita.");
                System.out.println("Date: \"Prepare-se! Responder corretamente é a única forma de desestabilizá-los!\"");
                scanner.nextLine();

                int goblins = 2;

                while (goblins > 0 && vida > 0) {
                    System.out.println();
                    System.out.println("Um dos Goblins de Dados se aproxima, gritando em binário:");
                    System.out.println(perguntas.get(indice));
                    System.out.println("Qual sua resposta ?");
                    respostaJogador = scanner.nextLine().toLowerCase().trim();

                    if (respostaJogador.equalsIgnoreCase(respostas.get(indice))) {
                        System.out.println("Você responde com firmeza");
                        System.out.println("O goblin congela por um instante... e explode em fragmentos de código!");
                        System.out.println("Date: \"Perfeito! Agora acabe com o outro goblin\"");
                        goblins--;
                    } else {
                        dano = random.nextInt(2) + 1;
                        vida -= dano;
                        System.out.println();
                        System.out.println("Você hesita... o goblin gargalha e lança uma onda de bits corrompidos!");
                        System.out.println("Você sofre " + dano + " pontos de dano!");
                        System.out.println("Sua vida agora é: " + vida);
                        System.out.println("Date: \"Errou! Fique calmo, você consegue. \"");
                    }

                    if (goblins > 0 && vida > 0) {
                        System.out.println();
                        System.out.println("O segundo Goblin salta das sombras, agitando um código bugado no ar!");
                        System.out.println(perguntas.get(indice));
                        System.out.println("Qual sua resposta ?");
                        respostaJogador = scanner.nextLine().toLowerCase().trim();


                        if (respostaJogador.equalsIgnoreCase(respostas.get(indice))) {
                            System.out.println("Você responde com certeza");
                            System.out.println("O goblin grita e começa a se desfazer em fragmentos de luz azul!");
                            System.out.println("Date: Perfeito" + nome + "voce ja esta um genio no tipo int");
                            goblins--;
                        } else {
                            dano = random.nextInt(2) + 1;
                            vida -= dano;
                            System.out.println();
                            System.out.println("Você hesita... o goblin gargalha e lança uma onda de bits corrompidos!");
                            System.out.println("Você sofre " + dano + " pontos de dano!");
                            System.out.println("Sua vida agora é: " + vida);
                            System.out.println("Date: \"Errou! Fique calmo, você consegue. \"");

                        }


                    }


                    if (goblins == 0) {
                        System.out.println("Ao derrotar os dois goblins,uma magia de invisibilidade é quebrada");
                        System.out.println("Revelando um bau no meio da arena");
                        System.out.println("Date: Pode abrir, esse com certeza terá uma recompensa");
                        System.out.println("Você estende a mão e o abre cuidadosamente...");
                        System.out.println("De dentro, uma rajada de luz azul surge — mas não te fere. Ela parece te reconhecer.");
                        System.out.println("Date: \"Incrível... parece que o baú continha fragmentos de código puro! Sua integridade aumentou.\"");
                        int cura = random.nextInt(3) + 2;
                        vida += cura;
                        System.out.println("Você recupera " + cura + " pontos de vida!");
                        System.out.println("Sua vida agora é: " + vida);
                        scanner.nextLine();
                    }


                }


                System.out.println();
                System.out.println("Com os dois Goblins derrotados, a arena começa a se desfazer em partículas luminosas.");
                System.out.println("O chão volta a ser sólido e o vento digital cessa.");
                System.out.println("Date: \"Bom trabalho, " + nome);
                System.out.println("Date: \"Mas sinto... algo muito mais forte à frente.\"");
                scanner.nextLine();

                System.out.println("Você volta para o corredor por onde veio.");
            }

            System.out.println("As paredes da caverna binária agora brilham com um tom vermelho pulsante, como se o próprio código estivesse vivo.");
            System.out.println("Linhas de 0 e 1 correm pelas paredes, formando padrões que lembram olhos observando você.");
            scanner.nextLine();

            System.out.println("Date: \"Esses sinais... são rastros do Guardião original.\"");
            System.out.println("Date: \"O primeiro tipo corrompido: o INT. Ele era o protetor da lógica e da precisão, mas foi contaminado pelo erro.\"");
            System.out.println("Date: \"Prepare-se. Esse será o seu primeiro grande teste.\"");
            scanner.nextLine();

            System.out.println("O chão começa a tremer. Números inteiros se projetam do solo, girando em espiral, até formarem uma figura colossal feita de dígitos e faíscas elétricas.");
            System.out.println("??? : \"Eu sou o Guardião INT Corrompido! A pureza dos inteiros foi manchada por conversões impuras e cálculos errados!\"");
            System.out.println("Date: \"Cuidado! Ele não é mais o mesmo. Responder corretamente é a única forma de quebrar sua corrupção!\"");
            scanner.nextLine();

            int vidaBoss = 15;

            ArrayList<String> perguntasBoss = new ArrayList<>();
            ArrayList<String> respostasBoss = new ArrayList<>();

            perguntasBoss.add("O tipo INT em SQL é usado para armazenar que tipo de dado?");
            respostasBoss.add("numeros inteiros");

            perguntasBoss.add("Se eu quiser guardar a idade de uma pessoa, qual tipo de dado é mais indicado?");
            respostasBoss.add("int");

            perguntasBoss.add("Qual valor o tipo INT pode armazenar: 25.6 ou 25?");
            respostasBoss.add("25");

            //i < perguntasBoss.size() → ainda existem perguntas não feitas (por exemplo, se há 3 perguntas, ele vai de i = 0 até i = 2);
            //vidaBoss > 0 → o boss ainda não morreu
            //vida > 0 → o jogador ainda está vivo.
            for (int i = 0; i < perguntasBoss.size() && vidaBoss > 0 && vida > 0; i++) {
                System.out.println();
                System.out.println("A vida do Boss é: " + vidaBoss);
                System.out.println("Guardião Int: \"" + perguntasBoss.get(i) + "\"");
                System.out.print("Sua resposta: ");
                respostaJogador = scanner.nextLine().toLowerCase().trim();

                if (respostaJogador.equalsIgnoreCase(respostasBoss.get(i))) {
                    vidaBoss -= 5;
                    System.out.println();
                    System.out.println("Você acerta em cheio! O Guardião se contorce, linhas de código se partem ao meio!");
                    System.out.println("Guardião Int: \"Resposta... válida... integridade comprometida...\"");
                    System.out.println("Vida do Guardião agora: " + vidaBoss);
                } else {
                    dano = random.nextInt(5) + 2;
                    vida -= dano;
                    System.out.println();
                    System.out.println("Você hesita, e o Guardião libera um raio de dados corrompidos!");
                    System.out.println("Você sofre " + dano + " pontos de dano!");
                    System.out.println("Sua vida agora é: " + vida);
                    System.out.println("Date: \"Errou! Lembre-se, o tipo INT não aceita textos nem decimais!\"");
                }


            }


            System.out.println("Guardião Int: \"Ouvi rumores... o mago real ainda vive, escondido nos andares mais profundos...\"");
            System.out.println("Guardião Int: \"Purifique os outros Guardiões... e talvez o Reino dos Dados seja restaurado.\"");
            System.out.println("O corpo dele se desfaz em fragmentos de dados, deixando um portal brilhante atrás de si.");
            System.out.println("Date: \"Você conseguiu, " + nome + "! O primeiro Guardião foi liberto do Feitiço Corruptom.\"");
            scanner.nextLine();

            System.out.println();
            System.out.println("O Guardião Int cai de joelhos, seus olhos de código azul escurecendo.");
            System.out.println("Guardião Int: \"...Integridade restaurada... Obrigado, guerreiro da lógica...\"");
            System.out.println("O corpo dele se desfaz em fragmentos de dados, deixando um portal brilhante atrás de si.");
            System.out.println("Date: \"Você conseguiu, " + nome + "! O primeiro Guardião foi purificado.\"");
            scanner.nextLine();



            System.out.println("Então um portal se abre um sua frente");
            System.out.println("Ao adentrar no portal, voce se depara com quatro portas");
            System.out.println("1- Lago das Frações Flutuantes");
            System.out.println("2- Biblioteca das Palavras Infinitas");
            System.out.println("3- Jardim das Eras");
            System.out.println("4- Templo das Duas Verdades");
            System.out.println("Para onde voce quer ir?");

            int opcao = scanner.nextInt();





            switch (opcao) {
                case 1:
                    Float();
                    break;
                case 2:
                    Boolean();
                    break;
                case 3:
                    Varchar();
                    break;
                case 4:
                    Date();
                    break;


            }



        }












    }

    public static void Float(){
        System.out.println("1");
    }


    public static void Boolean(){
        System.out.println("2");
    }

    public static void Varchar(){
        System.out.println("3");
    }

    public static void Date(){
        System.out.println("4");
    }






}