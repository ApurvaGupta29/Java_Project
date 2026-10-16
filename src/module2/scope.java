package module2;

public class scope {

	static int count = 0;
    int id = 0;

    scope() {
    	//System.out.println(id);
        count++;
        id++;
        //System.out.println(id);
    }

    public static void main(String[] args) {
    	scope t1 = new scope();
    	scope t2 = new scope();
    	scope t3 = new scope();
        System.out.println(scope.count + " " + t3.id);
    }

}
