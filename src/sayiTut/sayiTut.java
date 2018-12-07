package sayiTut;
import java.util.Scanner;
public class sayiTut {
	public static void aOlusturGetir() {
		int[][] a = new int[5][10];
		int say = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = say;
				say = say + 2;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
	public static void bOlusturGetir() {
		int[][] b = new int[4][10];
		int say = 64;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				b[i][j] = say;
				say++;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(b[i][j] + " ");
				if (i == 3 && j == 6) {
					break;
				}
			}
			System.out.println();
		}
	}
	public static void cOlusturGetir() {
		int[][] c = new int[5][10];
		int say = 16;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				c[i][j] = say;
				say++;
				if (say == 32)
					say = say + 16;
				if (say == 64)
					say = say + 16;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(c[i][j] + " ");
				if (i == 4 && j == 7)
					break;
			}
			System.out.println();
		}
	}
	public static void dOlusturGetir() {
		int[][] d = new int[5][10];
		int say = 2;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				d[i][j] = say;
				if(say%2==0)say++; else say=say+3;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void eOlusturGetir() {
		int[][] e = new int[4][10];
		int say = 32;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				e[i][j] = say;
				say++;
				if (say==64)say=say+32;
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(e[i][j] + " ");
				if (i == 3 && j == 6) {
					break;
				}
			}
			System.out.println();
		}
	}
	public static void fOlusturGetir() {
		int[][] f = new int[5][10];
		int say = 8;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				f[i][j] = say;
				say++;
				if (say==16)say=say+8;
				if (say==32)say=say+8;
				if (say==48)say=say+8;
				if (say==64)say=say+8;
				if (say==80)say=say+8;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(f[i][j] + " ");
				if (i == 4 && j == 7) {
					break;
				}
			}
			System.out.println();
		}
	}
	public static void gOlusturGetir() {
		int[][] g = new int[5][10];
		int say = 4,sayac=0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				g[i][j] = say;
				say++;
				sayac++;
				if (sayac==4) {
					sayac=0;
					say=say+4;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(g[i][j] + " ");
				if (i == 4 && j == 8) {
					break;
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String devam="";
		int topla=0;
		do {
			System.out.println();
			System.out.println("Aklýnýzdan 1-100 Arasý Bir Sayý Tutun..");
			System.out.println();
			System.out.println("Tuttugunuz sayi burada mevcut mu?(y/n)");
			aOlusturGetir();
			devam=scan.next();
			if (devam.equals("y")) topla=topla+1; else if(devam.equals("n")) {} else {System.out.println("Yanlis Secim."); System.exit(0);}
			System.out.println(devam);
			System.out.println("Tuttugunuz sayi burada mevcut mu?(y/n)");
			bOlusturGetir();
			devam=scan.next();
			if (devam.equals("y")) topla=topla+64; else if(devam.equals("n")) {} else {System.out.println("Yanlis Secim."); System.exit(0);}
			System.out.println("Tuttugunuz sayi burada mevcut mu?(y/n)");
			cOlusturGetir();
			devam=scan.next();
			if (devam.equals("y")) topla=topla+16; else if(devam.equals("n")) {} else {System.out.println("Yanlis Secim."); System.exit(0);}
			System.out.println("Tuttugunuz sayi burada mevcut mu?(y/n)");
			dOlusturGetir();
			devam=scan.next();
			if (devam.equals("y")) topla=topla+2; else if(devam.equals("n")) {} else {System.out.println("Yanlis Secim."); System.exit(0);}
			System.out.println("Tuttugunuz sayi burada mevcut mu?(y/n)");
			eOlusturGetir();
			devam=scan.next();
			if (devam.equals("y")) topla=topla+32; else if(devam.equals("n")) {} else {System.out.println("Yanlis Secim."); System.exit(0);}
			System.out.println("Tuttugunuz sayi burada mevcut mu?(y/n)");
			fOlusturGetir();
			devam=scan.next();
			if (devam.equals("y")) topla=topla+8; else if(devam.equals("n")) {} else {System.out.println("Yanlis Secim."); System.exit(0);}
			System.out.println("Tuttugunuz sayi burada mevcut mu?(y/n)");
			gOlusturGetir();
			devam=scan.next();
			if (devam.equals("y")) topla=topla+4; else if(devam.equals("n")) {} else {System.out.println("Yanlis Secim."); System.exit(0);}
			System.out.println("Tuttugunuz Sayi="+ topla);
		}while(true);
	}

}
