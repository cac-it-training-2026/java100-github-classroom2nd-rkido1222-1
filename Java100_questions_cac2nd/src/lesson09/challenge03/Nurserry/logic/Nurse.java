package lesson09.challenge03.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void divide(int cakes, int childs) {
		int waru;

		try {
			waru = cakes / childs;
			System.out.println("\n1人" + waru + "個になります。");

		} catch (ArithmeticException e) {
			System.out.println("\nケーキを食べる園児がいません");
		} finally {
			System.out.println("\nケーキの分配が終わりました。");
		}

	}

}
