package quiz.prob3;

public class MinSort {

	public static void main(String[] args) {

		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
	}

	private String sort(String string) {
		
	
		String z = "";
		char min= string.charAt(0);
		int i = 1;
	
		if(string.length()==0)
			return string;
			
		
		if (string.charAt(i)>min) {
//			z = z+string.charAt(i);
			
			i++;
		return z + sort(string.substring(1));
		}
		return z;
	}

}
