import java.util.*;

class Graph {
    private int V; // Numero de nós que o grafo irá possuir

    public int cn; // Número de moedas que este mapa do pac-man possui
    
    public LinkedList<No>[] adj; // // Lista dos nós vizinho, ou seja aqueles que virão depois
    
    public boolean[] visited; //Lista de visitados
    
    public Integer[][] parent; //Matriz que armazena os pais visitados de cada moeda
    
    //Seta essa pilha que guardará todos os nós visitados
    public List<Stack<Integer>> stack;
    
    //Seta esse auxiliar que ajudará a montar a variável que exibirá o caminho
    public List<Stack<Integer>> auxPath;
    
    //Pilha que exibirá o caminho
    public List<Stack<Integer>> path;

    // Constructor
    Graph(int v, int cn) {
        V = v;
        this.cn = cn;
        //Seta a lista adjacente como um nó vazio
        adj = new LinkedList[V];

        //Inicializa a matriz com o número de moedas e com o número de vertices do grafo
        parent = new Integer[cn][V];

        //Seta o tamanho da lista de visitados com o número de vertices do grafo
        visited = new boolean[V];

        //Seta o numero de caminhos que esse mapa possuirá
        path  = new ArrayList<Stack<Integer>>(this.cn);

        //Seta quantas vezes cada vertice pode ser visitado
        stack  = new ArrayList<Stack<Integer>>(this.cn);

        //Seta quantas vezes essa variável irá auxiliar a montar o caminho
        auxPath  = new ArrayList<Stack<Integer>>(this.cn);

        //Initialize the arrays
        for (int i = 0; i < V; i++) {
            //Inicializa e insere vazio no endereço de memoria
            adj[i] = new LinkedList<No>();

            //Seta todos os vertices como não visitados
            visited[i] = false;
        }
        //Inicializa as variáveis relacionadas a exibir e montar o caminho
        for (int i = 0; i < cn; i++) {
            //Inicializa e insere vazio no endereço de memoria
            stack.add(i, new Stack<Integer>());
            path.add(i, new Stack<Integer>());
            auxPath.add(i, new Stack<Integer>());

            //Inicializa e insere -1 pra cada pai que pode ser visitado
            for(int r = 0; r<V; r++ )
                parent[i][r] = new Integer(-1);
            }
            
        }

    // Função que adiciona um nó ao grafo
    void addEdge(int v, int ni, boolean isCoin) {
        adj[v].add(new No(ni, isCoin));
    }

    // Função que realiza a busca por largura no grafo a partir da posição que o pac-man está
    void BFS(int s) {

        //Seta o auxiliar que será usado para atualizar a lista de pais
        int aux_parent;

        //Variável que diz quantas moedas eu encontrei até agora
        int coinNumberFound = 0;

        //Seta esse auxiliar que indica se já chegou ao objetivo
        boolean find = false;
        
        //Array que guarda a posição inicial por onde o pac-man começou a buscar a moeda
        int init[] = new int[this.cn];

        //Inicializa a posição 0 do vetor com a primeira posição que o pac-man começou a buscar
        init[0] = s;
        //This array gets the position of the coins I've got
        int[] posCoinNumberFound = new int[this.cn];
        
        //Seta a variável pathNo para usa-la ao inserir o caminho na variável path
        Integer[] pathNo = new Integer[this.cn];

        //Fila que vai guardar os proximos nós a serem visitados
        Queue<No> queue = new LinkedList<No>();
        
        //A partir da entrada(nome da cidade) ele encontra qual o nó dessa entrada
        No no = adj[s].element();
        
        // Marca o nó atual como visitado
        visited[s] = true;

        //Adiciona o nó atual na fila de nós
        queue.add(no);

        //Seta que o pai do proximo nó a ser visitado é o atual
        parent[coinNumberFound][s] = s;

        //Enquanto ainda tiver nós a serem visitados e a cidade não for encontrada ele executará
        while (!queue.isEmpty() && !find) {

            //Remove o topo da fila  para buscar o proximo nó
            s = queue.poll().pos;

            //Adiciona ele na pilha
            stack.get(coinNumberFound).add(s);

            //Atribui o no ao auxiliar para poder utiliza-lo depois
            aux_parent = s;
           
            //Se o node que estou visitando possuir uma moeda, então executará
            if (adj[s].element().coin) {

                //Salva a posição que a moeda foi encontrada
                posCoinNumberFound[coinNumberFound] = s;

                //Adiciona o último elemento visitado no auxiliar para poder usa-lo
                auxPath.get(coinNumberFound).add(stack.get(coinNumberFound).lastElement());
                
                //Adiciona o ultimo elemento na pilha do caminho pois será guardado e exbido ao contrario
                path.get(coinNumberFound).add(s);

                //Enquanto ainda tiver visitados executará
                while(!stack.get(coinNumberFound).isEmpty()){

                    //Atribui o pai do ultimo elemento da pilha auxiliar na variável pathNo
                    pathNo[coinNumberFound] = parent[coinNumberFound][auxPath.get(coinNumberFound).lastElement()];

                    //Se o ultimo elemento na pilha de visitados for igual ao filho do pai setado na variável pathNo
                    if(stack.get(coinNumberFound).lastElement() == pathNo[coinNumberFound]){
                        
                        //Adiciona ao authPath para atualizar a variavel pathNo
                        auxPath.get(coinNumberFound).add(pathNo[coinNumberFound]);

                        //Adiciona à variável que exibirá o caminho
                        path.get(coinNumberFound).add(pathNo[coinNumberFound]);

                    }

                    //Desempilha a pilha de visitados
                    stack.get(coinNumberFound).pop();


                }

                //Se a moeda for a primeira, ele atribui no caminho onde começou
                if(coinNumberFound == 0)
                    path.get(coinNumberFound).add(init[0]);

                //Para garantir que não procurará a moeda já encontrada ele remove
                adj[s].element().coin = false;

                //Seta o array de visitados como zero 
                //para que ele possa percorrer nós visitados anteriormente
                // caso precise para encontrar a outra moeda
                for (int i = 0; i < V; i++) {
                    visited[i] = false;
                }

                //Limpa a fila para poder iniciar a busca novamente
                queue.clear();

                //Eu encontro o ultimo nó que eu parei, para começar a nova busca a partir dele
                no = adj[s].element();
                
                //Adiciono ele na fila
                queue.add(no);

                //Como eu já encontrei eu atualizo o valor da variável coinNumberFound
                coinNumberFound++;

                //Verifica se todas as moedas já foram encontradas
                if(coinNumberFound == this.cn)

                    //Seta a variável auxiliar find como verdadeiro para indicar que todas as moedas foram encontradas
                    find = true;

                //Senão ele guarda a nova posição para iniciar a busca
                else
                    init[coinNumberFound] = s;

            } else {
                
                //Pega todos os nós vixinho do proximo no
                Iterator<No> i = adj[s].listIterator();

                //Enquanto ainda houver nós vizinho
                while (i.hasNext()) {

                    //Atribui o proximo nó vizinho na variável auxiliar n
                    No n = i.next();

                    //Se n não foi visitado
                    if (visited[n.pos] == false) {

                        //Diz que o no atual(aux_parent) é pai do proximo nó a ser visitado(n)
                        parent[coinNumberFound][n.pos] = aux_parent;

                        //Seta o proximo nó como visitado para não voltarmos a verificar esse novamente
                        visited[n.pos] = true;

                        //Adiciona na fila para ser visitado
                        queue.add(n);

                    }
                }
            }
        }
        System.out.println(" ");
        System.out.println("Caminho para as moedas");
        
        //Itera para todos os caminhos encontrados
        for(int y = 0; y < this.cn; y++){
            System.out.print("Moeda "+ (y+1) + ": [");

            //Enquanto todos os elementos do caminho não tiverem sido exibidos
            while(!path.get(y).isEmpty()){
                
                //Exibe e já desempilha para exibir o caminho inverso
                System.out.print(path.get(y).pop() + " ");
            }
            System.out.print("]");   
            System.out.println("");
            
        }


       



    }
}
