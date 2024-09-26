public class SmartPhone extends Handphone {

    public SmartPhone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void kirimpesan(String nomortujuan, String pesan) {
        System.out.println("Melakukan panggilan video ke " + nomortujuan + " dengan pesan : " + pesan);
    }

    @Override
    public String toString() {
        return "SmartPhone []";
    }
    @Override
    public void kirimpesan(String emailtujuan, String subjek, String pesan) {
        System.out.println("Mengakses email " + emailtujuan + " dengan " + subjek + " disertai pesan :" + pesan);
    }
    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}