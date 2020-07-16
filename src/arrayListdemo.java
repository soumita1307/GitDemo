import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class arrayListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> arr=new ArrayList<String>();
//		arr.add("soumita");
//		arr.add("chakraborty");
//		System.out.println(arr);
//		arr.add(1,"sweet");
//		System.out.println();
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("soumita");
		hs.add("usa");
		hs.add("usa");
		hs.add("moumita");
		System.out.println(hs);
		//hs.remove("soumita");
		System.out.println(hs);
		
		Iterator<String> is=hs.iterator();
		while(is.hasNext())
		{
			System.out.println(is.next());
		}
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Soumita");
		hm.put(1, "moumita");
		hm.put(42, "souranjan");
		
		System.out.println(hm);
		Set sn=hm.entrySet();
		
		Iterator it=sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		int a[]= {4,5,5,6,5,4,2,4,6};
		ArrayList<Integer> a1=new ArrayList<Integer>();
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(!a1.contains(a[i]))
			{
			a1.add(a[i]);
			k++;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
				}
			}
			System.out.println("The occurances of item"+a[i]+"is"+k+"times");
			if(k==1)
			{
				System.out.println("the unique element is"+a[i]);
			}
			k=0;
			}
		}
		
		
		
		
		
		
		}
		
	}


