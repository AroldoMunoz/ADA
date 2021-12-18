#include <iostream>
#include <vector>
#include <set>
#define pb push_back
#define mp make_pair
#define f first
#define s second
using namespace std;
/*road reparation(reparacion de carreteras)
Existen n ciudades y m caminos entre ellos. 
Desafortunadamente, el estado de las carreteras es tan malo que no se pueden utilizar. 
Su tarea es reparar algunas de las carreteras para que haya una ruta decente entre dos ciudades.
Para cada camino, usted conoce su costo de reparación y debe encontrar una solución donde el costo total sea lo más pequeño posible.
de la ciudad a su camino para cuidad b su costo es c
*/
typedef long long ll;
typedef pair<ll, int> pl;
typedef vector<int> vi;
vector<pl> adj[200000];
int n;
ll MAX = 100000000000;
//usando algoritmo prim
ll prim(){
	ll weight = 0;
	vector<bool> selected(n, false);
	vector<ll> min(n, MAX);
	min[0] = 0;
	set<pl> q;
	q.insert({0, 0});
	vector<bool> visited(n, false);
	for (int i = 0; i < n; ++i) {
		if (q.empty()) {
			return -1;
		}
		int v = q.begin() -> s;
		visited[v] = true;
		weight += q.begin()-> f;
		q.erase(q.begin());

		for (pl e : adj[v]) {
			if(!visited[e.s] && e.f < min[e.s]) {
				q.erase({min[e.s], e.s});
				min[e.s] = e.f;
				q.insert({e.f, e.s});
			}
		}
	}
	return weight;
}

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);

	int m; 
	cin >> n >> m;//ingresa n numero de ciudades y m carreteras
	for (int i = 0; i < m; i++){
		int a, b; ll c;
		cin >> a >> b >> c;//ingresa ciudad a y ciudad b y su costo c de la carretera
		a--; b--;
		adj[a].pb(mp(c, b));
		adj[b].pb(mp(c, a));
	}
	ll ans = prim();
	//ans es el costo minimo para hacer la carretera
	//si el valor ans encuentra un no conexo no podra exixtir camino hacia una ciudad y es imposible hacer camino
	if(ans == -1){
		cout << "IMPOSSIBLE";
	}
	else{
		cout << ans;
	}
	return 0;
}