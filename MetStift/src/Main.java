import java.util.Scanner;

public class Main {

	final double PI = 3.141592;

	public static void main(String[] args) {
		Main m = new Main();
		double[] werteArray;
		m.menue();
		werteArray = m.eingabe();
		werteArray = m.berechnung(werteArray[0], werteArray[1], werteArray[2], werteArray[3], werteArray[4]);
		m.ausgabe(werteArray[0], werteArray[1], werteArray[2]);
	}

	double[] eingabe() {
		Scanner sc = new Scanner(System.in);
		double L1 = 0, L2 = 0;
		double d1 = 0, d2 = 0;
		double dichte = 0;
		int auswahl = 0;
		double[] werteArray = new double[5];

		do {
			auswahl = sc.nextInt();
			switch (auswahl) {
			case 1:
				dichte = 7.9;
				break;
			case 2:
				dichte = 8.9;
				break;
			case 3:
				dichte = 2.7;
				break;
			default:
				System.out.println("Auswahl ungültig!");
			}
		} while (auswahl > 3 || auswahl < 1);

		do {
			System.out.println("Bitte geben Sie die Länge für Zylinder 1 ein: ");
			L1 = sc.nextDouble();
		} while (L1 < 0 || L1 > 1000);

		do {
			System.out.println("Bitte geben Sie den Durchmesser für Zylinder 1 ein: ");
			d1 = sc.nextDouble();
		} while (d1 < 0 || d1 > 100);

		do {
			System.out.println("Bitte geben Sie die Länge für Zylinder 2 ein: ");
			L2 = sc.nextDouble();
		} while (L2 < 0 || L2 > 1000);

		do {
			System.out.println("Bitte geben Sie den Durchmesser für Zylinder 2 ein: ");
			d2 = sc.nextDouble();
		} while (d2 < 0 || d2 > 100);

		werteArray[0] = L1;
		werteArray[1] = d1;
		werteArray[2] = L2;
		werteArray[3] = d2;
		werteArray[4] = dichte;

		sc.close();

		return werteArray;

	}

	double[] berechnung(double L1, double d1, double L2, double d2, double dichte) {
		double volumen1 = 0, volumen2 = 0, flaeche1 = 0, flaeche2 = 0, gewicht1 = 0, gewicht2 = 0;
		double gesamtVolumen = 0, gesamtFlaeche = 0, gesamtMasse = 0;
		double[] werteArray = new double[3];
		volumen1 = volumenBerechnen(L1, d1);
		volumen2 = volumenBerechnen(L2, d2);
		flaeche1 = flaecheBerechnen(L1, d1);
		flaeche2 = flaecheBerechnen(L2, d2);
		gewicht1 = berechneMasse(volumen1, dichte);
		gewicht2 = berechneMasse(volumen2, dichte);

		gesamtVolumen = volumen1 + volumen2;
		gesamtFlaeche = (flaeche1 + flaeche2) - (2 * (Math.pow(d2 / 2, 2) * PI));
		gesamtMasse = gewicht1 + gewicht2;

		werteArray[0] = gesamtVolumen;
		werteArray[1] = gesamtFlaeche;
		werteArray[2] = gesamtMasse;

		return werteArray;

	}

	void ausgabe(double volumen, double flaeche, double gewicht) {
		System.out.printf("Gesamtvolumen: %.2f cm³%n", volumen);
		System.out.printf("Gesamtfläche: %.2f cm²%n", flaeche);
		System.out.printf("Gesamtgewicht: %.2f kg%n", gewicht);
	}

	double berechneMasse(double volumen, double dichte) {
		return (volumen * dichte) / 1000;
	}

	void menue() {
		System.out.println("Gewünschtes Material auswählen: ");
		System.out.println("1. Stahl");
		System.out.println("2. Kupfer");
		System.out.println("3. Aluminium");
	}

	public double volumenBerechnen(double laenge, double durchmesser) {
		return Math.pow(durchmesser / 2, 2) * PI * laenge;
	}

	public double flaecheBerechnen(double laenge, double durchmesser) {
		return Math.pow(durchmesser / 2, 2) * PI * 2 + laenge * durchmesser * PI;
	}

}
