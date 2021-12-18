#include <bits/stdc++.h>
//Shortest Routes II (Rutas más cortas II)
/*
Existen n ciudades y m caminos entre ellos y q es numero de consultas que requiere
Tu tarea es procesar q consultas en las que debe determinar la longitud de 
la ruta más corta entre dos ciudades determinadas.
Cada línea tiene tres enteros a, b y c: hay una carretera 
entre ciudades a y b cuya longitud es c. Todos los caminos son de doble sentido.

*/
using namespace std;
typedef long long ll;
const int maxN = 500;
const ll INF = 0x3f3f3f3f3f3f3f3f;//valor del infinito

int n, m, q, a, b;
ll dist[maxN+1][maxN+1], c;

int main(){
    scanf("%d %d %d", &n, &m, &q);
    memset(dist, 0x3f, sizeof(dist));
    for(int i = 0; i < m; i++){
        scanf("%d %d %lld", &a, &b, &c);
        dist[a][b] = min(dist[a][b], c);
        dist[b][a] = min(dist[b][a], c);
    }

    for(int i = 1; i <= n; i++) 
        dist[i][i] = 0;
        
    for(int k = 1; k <= n; k++)
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= n; j++)
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);

    for(int i = 0; i < q; i++){
        scanf("%d %d", &a, &b);
        //Imprime la longitud de la ruta más corta para cada consulta, de a hacia b 
        //Si no hay ruta,se imprime -1
        printf("%lld\n", (dist[a][b] >= INF ? -1 : dist[a][b]));
    }
}