#include <bits/stdc++.h>
//shortest routes I (Rutas más cortas I)
/*Existen N ciudades y M conexiones de vuelo entre ellos. 
Su tarea es determinar la longitud de la ruta más corta desde Syrjälä a cada ciudad.

un vuelo comienza en la ciudad a, termina en la ciudad b, y su longitud es c. 
Cada vuelo es un vuelo de ida.

*/
using namespace std;
typedef long long ll;
const int maxN = 1e5;

struct Edge {
    int v; 
    ll w; 
    
};
struct Node {
    int id; ll dist;
    friend bool operator<(const Node &a, const Node &b){
        return a.dist > b.dist;
    }
};

int N, M, a, b;
ll dist[maxN+1], c;

vector<Edge> G[maxN+1];
//usando cola de prioridad
priority_queue<Node> Q;

int main(){
    scanf("%d %d", &N, &M);
    for(int i = 0; i < M; i++){
        scanf("%d %d %lld", &a, &b, &c);
        G[a].push_back({b, c});
    }

    memset(dist, 0x3f, sizeof(dist));
    dist[1] = 0;
    Q.push({1, 0});
    while(!Q.empty()){
        ll d = Q.top().dist;
        int u = Q.top().id;
        Q.pop();
        if(d > dist[u]) 
            continue;
        for(Edge e : G[u]){
            if(dist[e.v] > d+e.w){
                dist[e.v] = d+e.w;
                Q.push({e.v, d+e.w});
            }
        }
    }

    for(int i = 1; i <= N; i++)
    //muestra las rutas más cortas desde Syrjälä hacia las otras cuidades
        printf("%lld%c", dist[i], (" \n")[i==N]);
}