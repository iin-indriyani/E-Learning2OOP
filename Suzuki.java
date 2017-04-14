public class Suzuki extends Mobil{
String merk;
public static void main (String[] args){
Suzuki szk = new Suzuki();
szk.Mobil();
Mobil mbl = new Mobil();
mbl.setMerk("Suzuki");
mbl.setHarga(400000000);
System.out.println("Merk Mobil : "+mbl.getMerk());
System.out.println("Harga Mobil : "+mbl.getHarga());
}
public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Mobil Suzuki");
	}
public void Mobil(){
super.tampilkan();
tampilkan();
super.melaju();
super.rem();
super.mundur();
}
}