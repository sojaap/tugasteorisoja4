public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    // bagian overload
    public void kirimpesan(String nomortujuan, String pesan) {
        System.out.println("Memanggil "+ nomortujuan + " mengirim pesan : " + pesan);
    } 
    public void kirimpesan(String nomortujuansatu, String nomortujuandua, String pesan){
        System.out.println("Memanggil " + nomortujuansatu + " dan " + "dengan mengirim pesan : " + pesan);
    }
    // bagian overload
    public void kirimpesan(String [] daftarNomor, String pesan){
        for (String nomor : daftarNomor){
            System.out.println("Mendaftarkan Nomor dengan " + daftarNomor + " dengan pesan :" + pesan);
            }
        }

}