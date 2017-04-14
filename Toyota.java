public class Toyota extends Mobil{
String merk;
public static void main (String[] args){
Toyota toyota = new Toyota();
toyota.Mobil();
Mobil mbl = new Mobil();
mbl.setMerk("Toyota");
mbl.setHarga(450000000);
System.out.println("Merk Mobil: "+mbl.getMerk());
System.out.println("Harga Mobil : "+mbl.getHarga());
}
public void tampilkan(){
	System.out.println("ini tampilan dari Kelas Mobil Toyota");
	}
public void Mobil(){
super.tampilkan();
tampilkan();
super.melaju();
super.rem();
super.mundur();
}
}