#include <bits/stdc++.h>
// Longest Flight Route (Ruta de vuelo más larga )
/*Uolevi ha ganado un concurso, y el premio es un vuelo gratuito 
que puede consistir en uno o más vuelos por ciudades. 
Por supuesto, Uolevi quiere elegir un viaje que tenga tantas ciudades como sea posible.
Uolevi quiere volar de Syrjälä a Lehmälä para visitar el número máximo de ciudades. 
Se le da la lista de vuelos posibles y sabe que no hay ciclos dirigidos en la red de vuelos.

La primera línea de entrada tiene dos números enteros.N y M: el número de ciudades y vuelos

Cada línea tiene dos enteros a y b: hay un vuelo desde la ciudad a a la ciudad b. 
Cada vuelo es un vuelo de ida.

*/
using namespace std;
const int maxN = 100000;

bool vis[maxN];//vector para ver si el nodo es visitado
//ans guarda la secuencia de la ruta y rutaMax son el numero de arcos que pasara
int N, M, rutaMax, a, b, in[maxN], p[maxN], l[maxN], ans[maxN];
vector<int> G[maxN];
queue<int> Q;

void dfs(int u, int par = 0){
    vis[u] = true;
    for(int v : G[u])
        if(v != par && !vis[v])
            dfs(v, u);
}

int main(){
    scanf("%d %d", &N, &M);
    for(int i = 0; i < M; i++){
        scanf("%d %d", &a, &b);
        G[a].push_back(b);
        in[b]++;
    }

    dfs(1);
    if(!vis[N]){
        printf("IMPOSSIBLE\n");
        return 0;
    }

    fill(l+2, l+maxN, -1);
    for(int i = 1; i <= N; i++)
        if(in[i] == 0)
            Q.push(i);

    while(!Q.empty()){
        int u = Q.front(); Q.pop();
        for(int v : G[u]){
            if(l[u] != -1 && l[v] < l[u]+1){
                l[v] = l[u] + 1;
                p[v] = u;
            }
            in[v]--;
            if(in[v] == 0)
                Q.push(v);
        }
    }

    rutaMax = l[N] - l[1] + 1;
    printf("%d\n", rutaMax);
    for(int i = rutaMax-1, u = N; i >= 0; i--){
        ans[i] = u;
        u = p[u];
    }
    for(int i = 0; i <rutaMax; i++)
        printf("%d%c", ans[i], (" \n")[i==rutaMax]);
}