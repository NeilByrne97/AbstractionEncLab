package ie.gmit.sw;

public class CypherRunner {

	public static void main(String[] args) throws CypherException {
		Cypherable cc = new VernamCypher();
		CypherKey ck = new StringCypherKey("WROFUWERIO0UEW0R");
		cc.setCypherKey(ck);
		
		String s = "Hello World!";
		String t = cc.encrypt(s);
		
		System.out.println(t);
		System.out.println(cc.decrypt(t));
		
	}

}
 