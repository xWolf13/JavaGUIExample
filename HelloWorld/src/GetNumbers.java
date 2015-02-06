
public class GetNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] values = new int[3][3];
		System.out.println(numbers(values));
	}

public static boolean numbers(int[][] values)
{	
	int maxNumber = values[0].length * values.length;
		
	System.out.println(maxNumber);
	int count = 0;
	for(int i = 0; i < values[0].length; ++i)
	{	
		for(int j = 0; j < values.length; ++j)
		{
			int a = values[i][j];
			
			for(int k = values.length[0]; k >= 0; --k)
			{
				for(int l = values.length; l >= 0; --l)
				{
					if(values[k][l] == a)
					{
						return false;
					}
				}
			}
		}
	
	
	}
	
	return true;
}
}


