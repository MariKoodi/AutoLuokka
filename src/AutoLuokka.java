
public class AutoLuokka {

	public static void main(String[] args) {
		
		// Luodaan olio auto1 ja annetaan sille arvoja
		Auto auto1 = new Auto();
		auto1.merkki = "Subaru";
		auto1.malli = "Outback";
		auto1.bensanMaara = 10;
		
		// Tulostetaan auton tiedot
		auto1.naytaTiedot();
		
		// Kiihdytetään autolla ja tulostetaan tiedot uudestaan
		auto1.kiihdyta();
		auto1.naytaTiedot();
		
		// Tankataan auto ja tulostetaan tiedot uudestaan
		auto1.tankkaa(5);
		auto1.naytaTiedot();


	}

} // Main-luokan lopetus

// Luodaan luokka Auto
class Auto {
	
	// Attribuutit
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	// Metodit
	public void jarruta() {
		System.out.println("Auto jarruttaa");
	}
	public void kiihdyta() {
		if (bensanMaara > 0) {
			bensanMaara = bensanMaara - 1;
			System.out.println("Auto kiihdyttää");
		}
		else { System.out.println("Tankki tyhjä. Käy tankkaamassa, että voit kaasutella!"); }
	}
	public void tankkaa(int tankkaus) {
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + tankkaus);
		bensanMaara = bensanMaara + tankkaus;
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);
	}
	public void naytaTiedot() {
		System.out.println("Auton merkki: " + merkki);
		System.out.println("Auton malli: " + malli);
		System.out.println("Tankissa bensaa: " + bensanMaara);
	}
}
