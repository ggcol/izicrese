package lz3.es2;

import java.util.Random;

public class HeroFactory {

	public HeroFactory() {
	}

	public Eroe getAnHero () {
		Eroe hero = generateStat();
		switch (hero.getGenerate()) {
		case 1:
			hero = new Guerriero(hero.getForza(), hero.getDestrezza(), hero.getSaggezza(), hero.getGenerate());
			break;
		case 2:
			hero = new Arciere(hero.getForza(), hero.getDestrezza(), hero.getSaggezza(), hero.getGenerate());
			break;
		case 3: 
			hero = new Mago(hero.getForza(), hero.getDestrezza(), hero.getSaggezza(), hero.getGenerate());
			break;
		}
		return hero;

	}

	public Eroe generateStat() {
		Eroe e = new Eroe();
		int uB20 = 20;
		int uB14 = 14;
		int lB10 = 10;
		int lB15 = 15;
		int sag;
		int frz;
		int des;

		do { 
			frz = randomN(lB15, uB20);
			sag = randomN(lB15, uB20);
			des = randomN(lB15, uB20);
		} while (frz == des || frz == sag || des == frz || des == sag || sag == frz || sag == des);

		if (frz > sag && frz > des) {
			e.setForza(frz);
			e.setDestrezza(randomN(lB10, uB14));
			e.setSaggezza(randomN(lB10, uB14));
			e.setGenerate(1);
		} else if (des > frz && des > sag) {
			e.setDestrezza(des);
			e.setForza(randomN(lB10, uB14));
			e.setSaggezza(randomN(lB10, uB14));
			e.setGenerate(2);
		} else if (sag > frz && sag > des) {
			e.setSaggezza(sag);
			e.setForza(randomN(lB10, uB14));
			e.setDestrezza(randomN(lB10, uB14));
			e.setGenerate(3);
		} else {
			System.out.println("indeciso");
		}

		return e;

	}

	public int randomN (int lowerBound, int upperBound) {
		Random r = new Random(); 
		int number;
		do {
			number = r.nextInt(20);
		} while (number < lowerBound || number > upperBound);
		return number;
	}

}
