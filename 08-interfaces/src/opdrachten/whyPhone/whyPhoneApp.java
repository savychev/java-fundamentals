package opdrachten.whyPhone;

public class whyPhoneApp {
    public static void main(String[] args) {
        WhyPhone smartPhone = new WhyPhone(1000, "Samsung", "White");
        showSpecs(smartPhone);

        System.out.println("\n* Dummy *\n");

        DummyPhone dummyPhone = new DummyPhone();
        dummyPhone.playChannel(100.8);
        dummyPhone.changeChannel(102.8);

    }

    public static void showSpecs(SmartPhone phone) {
        phone.shootAPhoto(2);
        phone.viewPhotos();
        phone.locatie(111.111,222.222);
        phone.navigate();
        phone.playChannel(104.6);
        phone.changeChannel(105.3);
        phone.connect("Current internet connection");
        phone.disconnect("Current internet connection");
    }
}
