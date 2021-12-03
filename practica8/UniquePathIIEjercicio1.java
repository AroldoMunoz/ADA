package practica8;

public class UniquePathIIEjercicio1 {
	//Unique Path II
	/*programa de un robot stá ubicado en la esquina superior izquierda de una cuadrícula de m x n.
	 *El robot solo puede moverse hacia abajo o hacia la derecha en cualquier momento.
	 *El robot está tratando de llegar a la esquina inferior derecha de la cuadrícula.
	 *hallamos el maximos caminos de que puede el robot hacer
	 *
	 *relacion de recurrencia 
	 *si empieza en obtruido termina el programa botando 0
	 *si es obtruido el valor del actual cuadrado es 0,
	 *si no es obtruido, los adayacentes de derecha y abajo seran: 1 si es libre y 0 si es obtruido,
	 *si tiene adayacentes izquierda y arriba el valor del actual es la suma de estos 2 adyacentes
	 *
	 *Complejidad O(mn)
	*/
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int temp[]=new int[n];//creamos un vector auxiliar que nos sirve para contar
		if (obstacleGrid[0][0] == 1) //si es 1(obtruido)entonces no puede empezar y retorna 0
			return 0;
		temp[0]=1;
		//llenamos el vector auxiliar si en el grid hay 0 exixte camino asi que ponemos 1 por exixtencia de camino
		for(int i=1;i<n;i++) { 
			temp[i]=0;
			if (temp[i-1]==1&&obstacleGrid[0][i] == 0) {
				temp[i]=1;
				}
			}
		//visitamos los otras coordenadas, si es 1 entonces el vector pone 0 por camino obtruido
        for (int i = 1; i < m; i++) {
        	for (int j = 0; j < n; j++) {
        		if ( obstacleGrid[i][j] == 1)
        			temp[j]=0;
        		else
        			//sumamos los valores adyacentes  ya que al sumar  hay tantos caminos de un lado q de otro
        			//parra llegar al punto actual
        			if (j!=0 ) 
    				temp[j]=temp[j]+temp[j-1];
            }
        }
        //retorna el ultimo valor del vector ya que este es el valor requerido para llegar a este punto extremo
         return temp[n-1];
	}
	      
	    public static void main(String []args){
			//caso prueba obstrucion al centro
			int [][] arr= {{0,0,0}, {0,1,0}, {0,0,0}};
			System.out.println(uniquePathsWithObstacles(arr));
			
			//con obstrucion al inicio
			int [][] arr1= {{1,0,0}, {0,0,0}, {0,0,0}};
			System.out.println(uniquePathsWithObstacles(arr1));
			
			//sin obstrucion de 3 x 3
			int [][] arr2= {{0,0,0}, {0,0,0}, {0,0,0}};
			System.out.println(uniquePathsWithObstacles(arr2));
			
	    	
			
		}
	}
	

