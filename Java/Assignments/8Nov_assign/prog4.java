class Country {

	Country(String name) {
		System.out.println("Country = " + name);
		State maha = new State("Maharashtra");
		State goa = new State("Goa");
	}

	class State{

		String name;
		State(String name) {
			this.name= name;
			System.out.println("State = " + name);
			City pune = new City("Pune");
			City khopoli = new City("Khopoli");
		}

		class City {

			String name;
			City(String name) {
				this.name = name;
				System.out.println("City = " + name);
			}
		}
	}
}

class Main {

	public static void main(String[] args) {
		
		Country india = new Country("India");
	}
}