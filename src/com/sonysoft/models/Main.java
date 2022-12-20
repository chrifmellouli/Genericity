package com.sonysoft.models;

public class Main {

	public int somme(int... values) {
		int som = 0;
		for (int val : values) {
			som += val;
		}
		return som;
	}

	public static void main(String[] args) {

		Main m = new Main();
		int s = m.somme(1, 2, 5, 3, 6, 8);
		System.out.println("Somme= " + s);

		Fille fille = new Fille("Samar");
		Enceinte<Fille> iness = new Enceinte<>(fille);
		System.out.println("Iness " + iness.toString());

		Enceinte<Wlad> mounir = new Enceinte<>();
		System.out.println("Mounir " + mounir.toString());

		Fille fille1 = new Fille("Syrine");
		Wlad wlad = new Wlad("Hercule");
		EnceinteJumaux<Wlad, Fille> sonia = new EnceinteJumaux<>(wlad, fille1);
		System.out.println("Sonia " + sonia.toString());

		Chevre dolly = new Chevre("Dolly");
		Enceinte<Chevre> eya = new Enceinte<>(dolly);
		System.out.println("Eya " + eya.toString());

		Bagra zeyda = new Bagra("Zeyda");
		EnceinteJumaux<Fille, Fille> fathia = new EnceinteJumaux<>(fille, fille1);
		System.out.println("Fathia " + fathia.toString());

		EnceinteJumaux<Bagra, Fille> mabrouka = new EnceinteJumaux<>(zeyda, fille1);
		System.out.println("Mabrouka " + mabrouka.toString());

		EnceinteJumaux<Integer, String> obj = new EnceinteJumaux<>(1, "n'importe quoi");
		System.out.println("obj " + obj.toString());

		Generique<Bagra, Chevre, Fille, Wlad> t5awidh = new Generique<>(zeyda, dolly, fille, wlad);
		System.out.println(t5awidh.toString());

		Enceinte<?> mounira = new Enceinte<>(fille);
		System.out.println("Syrine va chez le docteur");
		System.out.println("mounira " + mounira.toString());

	}

}
