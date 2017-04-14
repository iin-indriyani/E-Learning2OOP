public class Mobil{
String merk;
int harga;
public Mobil(){
this.merk="Merk Mobil Anda";
this.harga=0;
}
public Mobil(String m, int h ){
this.merk = m;
this.harga = h;
}
public void setMerk(String m){
this.merk=m;
}
public void setHarga(int h){
this.harga = h;
}
public String getMerk(){
return this.merk;
}
public int getHarga(){
return this.harga;
}
public void melaju(){
System.out.println("Mobil dapat melaju");
}
public void rem(){
System.out.println("Mobil dapat berhenti jika di rem");
}
public void mundur(){
System.out.println("Mobil dapat berjalan mundur");
}
public void tampilkan(){
System.out.println("Kelas Mobil");
}
}