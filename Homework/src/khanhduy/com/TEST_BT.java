package khanhduy.com;

public class TEST_BT {
	static String Xu_Ly_Khoang_Trang_Viet_Thuong (String a )
	{
		a = a.trim();
		a = a.toLowerCase() ;
		return a  ; 
	}
	
	static String Viet_Hoa(String a) 
	{
		
		for (int i = 1 ; i<a.length() ; i++) 
		{
			if (a.charAt(i) == ' ' && a.charAt(i+1) != ' '  )  
				{
					
				//	a.charAt(i+1) =  Character.toUpperCase(a.charAt(i+1));
				a = Character.toUpperCase(a.charAt(0)) + a.substring(1 , i+1 ) + Character.toUpperCase(a.charAt(i+1)) + a.substring(i+2);
					
				}
		}
		 
	
	
		String c = "" + a.charAt(0); 
		// trường hợp phủ của 2 khoảng trắng liền kề là :
		// 1 .  2 chữ liền kề  
		// 2.  1 khoảng trắng và 1 chữ 
		for (int i = 0 ; i < a.length()-1 ; i++)
		{
			if (!(a.charAt(i) == ' '  && a.charAt(i+1) == ' ' ))
			{
				c = c +  a.charAt(i+1);
			}
		}
		
		return c ;
		
	}
	public static void main(String[] args) {
		String a = "   DON      KHAnh   DUy       " ;
		System.out.println(a);
		String b =Xu_Ly_Khoang_Trang_Viet_Thuong(a);
		System.out.println(b);
		b = Viet_Hoa(b);
		System.out.println(b);
		
		
		

	}

}
