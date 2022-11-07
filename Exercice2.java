class Exercice2
{

	public static void tri(int[] a, int i)
	{
		if(i!=0)
		{
			if(a[i] <  a[i-1])
			{
				int b = a[i-1];
                System.out.print("permuter "+ a[i]+" et "+ a[i-1] + " la liste devient : [");
				a[i-1] = a[i];
				a[i] = b;
                for(int j = 0 ; j < a.length ; j++ )
                {
                    System.out.print(a[j]+" ");
                }
                System.out.println("]");
    
			}
            i--;
            tri(a,i);

		}
	}
 
	public static void Insertion(int[] a, int i)
	{
	i++;
		if(i == a.length)
		{
			System.out.print("le resultat final est : [");
		}
		else
		{
			tri(a, i);
			Insertion(a,i);
 
		}	
	}

    public static void tri(int[] a)
	{
		Insertion(a,0);
	}

	public static void main(String[] args)
	{
		int[] a = {0,7,14,38,6,58,42,20,17,8,31,25};
		tri(a);
		for(int i = 0 ; i < a.length ; i++ )
		{
			System.out.print(a[i]+" ");
		}
        System.out.print("]");
	}

}