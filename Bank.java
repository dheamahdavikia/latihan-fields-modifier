public class Bank{
	private int saldo;//private itu tidak bisa diakses dengan class berbeda
	private String pesan;
	private String Nasabah;
	final int limitSaldo = 50;//bersifat constanta
	final String NamaBank = "Bank A"; // STATIC FIELD MODIFIER YANG BERUBAH SESUAI APA YANG TELAH DIRUBAH SEBELUMNYA 
	public static int nomerTransaksi = 0;


	public void tambahSaldo(int tambahSaldo){
		saldo += tambahSaldo;
		nomerTransaksi++;
	}
	public void namaNasabah(String namaNasabah){
		Nasabah = namaNasabah;
	}
	public void minSaldo(int minSaldo){
		if ((saldo - minSaldo ) >= limitSaldo) {
			saldo -= minSaldo;
			nomerTransaksi++;
		}
		else{
			System.out.println("MAAF SALDO ANDA TIDAK MENCUKUP");
		}
	}

	public void minSaldo(int minSaldo, String pesan){//METHOD OVERLOADING KARENA ANTARA METHOD DAN  2 PARAMETER BERBEDA
		if ((saldo - minSaldo ) > limitSaldo) {
			saldo -= minSaldo;
			nomerTransaksi++;
			System.out.println("jumlah saldo anda: " +  saldo);
			System.out.println("Pesan : " + pesan);
		}
		else{
			System.out.println("MAAF SALDO ANDA TIDAK MENCUKUP");
		}
	}

	public int getSaldo(){//Buat fungsi baru untuk menampilkan saldo pada class NASABAH
		return saldo;
	}

	public void showInfo(){//PERINTAH UNTUK MENAMPILKAN OUTPUT
		System.out.println("Nama Bank : "+ NamaBank);
		if (Nasabah != null) {
			System.out.println("Nama Nasabah :"+ Nasabah);
		}
		System.out.println("Sisa Saldo terakhir anda : "+ saldo);
	}


}