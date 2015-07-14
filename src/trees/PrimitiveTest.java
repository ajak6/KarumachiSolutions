package trees;

public class PrimitiveTest {
	public static void main(String[] args) {
		long sum = 0L;
		long r = System.currentTimeMillis();
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(System.currentTimeMillis() - r);
		
		System.out.println();
		int a[]={1,4,5,7,8,9,10,11,15};
		new PrimitiveTest().find(a,5,9);
	}



	// hello

	// I: { a, b, c, d}
	//
	// (x, y), x <= y

	public void find(int a[], int x,int y){
	//1,3,4,6 2,4
	    if(a==null)
	     return;
//	    if(y>x) 
//	     return;
	    for(int i=0;i<a.length;i++){
	        if(a[i]>=x && a[i]<=y)
	            System.out.println(a[i]);
	        else{
	            continue;
	        }
	    }
	} 
	public void findBS(int a[],int x, int y){
	   int indexX=findHelper(a,x,0,a.length-1);
	   int indexY=findHelper(a,y,0,a.length-1);
	    if(indexX>0 && indexY >0){
	    for(int i=indexX ; i<=indexY ; i++){
	        System.out.println(a[i]);
	    }
	   }
	   
	}
	public int findHelper(int a[], int x, int low, int high){
	          //5
	          //1,2,4

	            if(low<=high)
	           {
	              int mid=low+(high-low)/2;
	              if(mid==high&& a[mid]<x)
	                 return mid;             
	              if(a[mid]<x && mid!=high &&a[mid+1]>=x)
	                return mid+1;
	              
	              else if(a[mid]<x){
	                 return findHelper(a,x,mid+1,high);
	              }else{
	                  return findHelper(a,x,low,mid-1);
	              }
	           }
	           return -1;
	                
	   }
}
