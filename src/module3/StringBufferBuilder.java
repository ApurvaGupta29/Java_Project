package module3;

public class StringBufferBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer("Auto");
        s1.append("matic");//there is no contact method here
        System.out.println(s1);
        
        StringBuilder s2 = new StringBuilder("Manual");
        s2.append("Testing");
     
        System.out.println(s2); //mutable in nature
       System.out.println( s1.delete(0, 3));
       System.out.println( s1.insert(0, "Test"));
       System.out.println( s1.replace(0, 5,"Auto"));
       
       StringBuffer s3 = new StringBuffer("Apurva");
       System.out.println(s3.reverse());
       
      System.out.println( s3.substring(3));
      System.out.println(s3.reverse());
      System.out.println( s3.substring(3,5));
       
	}

}
