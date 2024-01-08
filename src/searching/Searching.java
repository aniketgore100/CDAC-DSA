package searching;

public class Searching {
	
	static int LinearSearch(int a[], int x) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==x) {
				return  i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {11,22,33,44,55};
		int x = 66;
		int ans = Searching.LinearSearch(a, x);
		if(ans != -1) {
			System.out.println("found : " + ans);
		}
		else {
			System.out.println("not found : " + ans);
		}
	}

}
