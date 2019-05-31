package Caballeros;

public class Armagedon {
	static class Muerte{String nombre="Muerte";
		public Muerte(){super();};
		public String Invocar( ){return "El fin se acerca, soy: ";};	
	}
	static class Guerra{String nombre="Guerra";
		public Guerra(){super();};
		public String Invocar( ){return "El fin se acerca, soy: ";};	
	}
	static class Peste{String nombre="Peste";
		public Peste(){super();};
		public String Invocar( ){return "El fin se acerca, soy: ";};	
	}
	static class Hambre{String nombre="Hambre";
		public Hambre(){super();};
		public String Invocar( ){return "El fin se acerca, soy: ";};	
	}
	public static void main(String[] args){
		System.out.print(new Muerte().Invocar());
		System.out.println(new Muerte().nombre);
		System.out.print(new Guerra().Invocar());
		System.out.println(new Guerra().nombre);
		System.out.print(new Peste().Invocar());
		System.out.println(new Peste().nombre);
		System.out.print(new Hambre().Invocar());
		System.out.println(new Hambre().nombre);
	}
}
