package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		DatabaseConnection connection1 = DatabaseConnection.getInstance();
		DatabaseConnection connection2 = DatabaseConnection.getInstance();

		// ispis hash koda
		System.out.println(Integer.toHexString(connection1.hashCode()));
		
		System.out.println(connection1);
		System.out.println(connection2);
		
		DatabaseConnectionLazy connection_lazy1 = DatabaseConnectionLazy.getInstance();
		DatabaseConnectionLazy connection_lazy2 = DatabaseConnectionLazy.getInstance();
		
		System.out.println(connection_lazy1);
		System.out.println(connection_lazy2);

	}

}
