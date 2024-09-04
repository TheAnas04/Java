/*
    04/09/2024
    Find common elements in three arrays.
*/
class Common
{
    public static void main(String args[])
    {
        
        int a[] = {10, 50, 10, 20, 40, 80};
        int b[] = {60, 70, 20, 80, 100};
        int c[] = {30, 40, 15, 20, 30, 70, 80, 120};
        int i, j, k;
        for( i=0 ; i<b.length ; i++ )
        {
            for( j=0 ; j<a.length ; j++ )
            {
                if(b[i] == a[j])
                {
                    for( k=0 ; k<c.length ; k++ )
                    {   
                        if(b[i]==c[k])
                            System.out.print("Common Element : "+b[i]+"    ");
                    }
                }
            }
        }
    }
}