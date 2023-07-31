public class convertJson {
    public static App getMobile(App mobile) {
        mobile.setBrand("SAMSUNG");
        mobile.setName("J2 Core");
        mobile.setRam(2);
        mobile.setRom(4);
        return mobile;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        App mobilePhone = new App();
        mobilePhone = getMobile(mobilePhone);
        System.out.println("The JSON representation of Object mobilePhone is ");
        System.out.println(new Gson().toJson(mobilePhone));
    }
}
