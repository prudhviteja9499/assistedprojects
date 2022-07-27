package slassistedproject;


public class queryrange {
	public static void main(String args[]) 
    { 
        int arr[] = { 3, 7, 2, 5, 8, 9 }; 
        int n = arr.length;

        queryrange.buildSparseTable(arr, n); 
        
        System.out.println(queryrange.query(0,3)); 
        System.out.println(queryrange.query(3,4)); 
        System.out.println(queryrange.query(2,5)); 
    } 
	static int k = 16;
	static int N = 100000;
	
	static long table[][] = new long[N][k + 1];

	static void buildSparseTable(int arr[], int n) {
		
		for (int i = 0; i < n; i++)
			table[i][0] = arr[i];
		for (int j = 1; j <= k; j++)
			for (int i = 0; i <= n - (1 << j); i++)
				table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1];
	}

	static long query(int L, int R) {
		long answer = 0;
		for (int j = k; j >= 0; j--) {
			if (L + (1 << j) - 1 <= R) {
				answer = answer + table[L][j];
				L += 1 << j;
			}
		}
		return answer;
	}

}