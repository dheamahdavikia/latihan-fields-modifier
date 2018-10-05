public class Nasabah{
	public static void main(String[] args) {
		
		Bank B1 = new Bank();

		B1.namaNasabah("Dhea mahdavikia");
		B1.tambahSaldo(20);
		B1.minSaldo(90, "ini untuk bayar tagihan listrik");
		B1.showInfo();
	}
}