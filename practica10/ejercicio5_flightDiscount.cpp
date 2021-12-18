#include <bits/stdc++.h>
//Flight Discount(Descuento de vuelo)
/*Su tarea es encontrar una ruta de vuelo de precio mínimo desde Syrjälä a Metsälä. 
Tiene un cupón de descuento, con el que puede reducir a la mitad el precio 
de cualquier vuelo durante la ruta. Sin embargo, solo puede usar el cupón una vez.

La primera línea de entrada tiene dos número: n número de ciudades y m conexiones aéreas. 
Después de esto hay m líneas que describen los vuelos.
La ciudad 1 es Syrjälä, y la ciudad n es Metsälä.
Cada línea tiene tres enteros a, b, y c 
un vuelo comienza en la ciudad a, termina en la ciudad B, y su precio es C. 
Cada vuelo es unidireccional.
Imprime un entero: el precio de la ruta más barata de Syrjälä a Metsälä(de ciudad 1 a ciudad n)
*/
using namespace std;
typedef long long ll;
typedef pair<int,ll> edge;
typedef tuple<ll,int,int> node;
const int maxN = 200000;

int n, m, a, b;
ll c, dist[2][maxN];
vector<edge> G[maxN];
//usando cola de prioridad
priority_queue<node, vector<node>, greater<node>> Q;

int main(){
    scanf("%d %d", &n, &m);
    memset(dist, 0x3f, sizeof(dist));
    for(int i = 0; i < m; i++){
        scanf("%d %d %lld", &a, &b, &c);
        G[a].push_back({b, c});
    }
    dist[0][1] = 0;
    dist[1][1] = 0;
    Q.push({0, 1, 1});
    while(!Q.empty()){
        ll  d = get<0>(Q.top());
        int u = get<1>(Q.top());
        int coupon = get<2>(Q.top());
        Q.pop();

        if(dist[!coupon][u] < d)   
            continue;

        for(edge e : G[u]){
            int v = e.first;
            ll  w = e.second;

            if(coupon){
                if(dist[0][v] > d + w){
                    dist[0][v] = d + w;
                    Q.push({d+w, v, 1});
                }
                if(dist[1][v] > d + w/2){
                    dist[1][v] = d + w/2;
                    Q.push({d+w/2, v, 0});
                }
            } else {
                if(dist[1][v] > d + w){
                    dist[1][v] = d + w;
                    Q.push({d+w, v, 0});
                }
            }
        }
    }
    printf("%lld\n", min(dist[0][n], dist[1][n]));
}