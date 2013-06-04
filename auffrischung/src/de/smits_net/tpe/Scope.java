/*
 * (c) 2009 Thomas Smits
 */
package de.smits_net.tpe;

class Scope {
	int i = 1;

	void ersteMethode() {
		int i = 4;
		int j = 5;

		{
			int k = 7;
			this.i = i + j;
			zweiteMethode(k);
		}

		{
			int k = 7;
		}
	}

	void zweiteMethode(int i) {
		int j = 8;
		this.i = i + j;
	}

	public static void main(String[] args) {
		Scope scope = new Scope();
		scope.ersteMethode();
		System.out.println(5 * 70 % 6);
		System.out.println(5 * (70 % 6));
	}
}
