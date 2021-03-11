public class Main {
    public static void main(String[] args) {
        Rate closePeopleOne = new Rate();
        closePeopleOne.id = 1;
        closePeopleOne.eSim = "Поддерживает eSim";
        closePeopleOne.name = "Близкие Люди 1";
        closePeopleOne.mobileInternet = 15;
        closePeopleOne.minutes = 400;
        closePeopleOne.sms = 300;
        closePeopleOne.price = 350;
        closePeopleOne.url = "https://kazan.beeline.ru/customers/products/mobile/tariffs/details/blizkie-lydi/";
        System.out.println(closePeopleOne.eSim);
        System.out.println(closePeopleOne.name);
        System.out.println(closePeopleOne.mobileInternet);
        System.out.println(closePeopleOne.minutes);
        System.out.println(closePeopleOne.sms);
        System.out.println(closePeopleOne.price);
        System.out.println(closePeopleOne.url);

        Rate closePeopleTwo = new Rate();
        closePeopleTwo.id = 2;
        closePeopleTwo.eSim = "Поддерживает eSim";
        closePeopleTwo.name = "Близкие Люди 2";
        closePeopleTwo.mobileInternet = 30;
        closePeopleTwo.minutes = 600;
        closePeopleTwo.sms = 300;
        closePeopleTwo.oldPrice = 400;
        closePeopleTwo.price = 320;
        closePeopleTwo.url = "https://kazan.beeline.ru/customers/products/mobile/tariffs/details/blizkie-lydi-2/";
        System.out.println(closePeopleTwo.eSim);
        System.out.println(closePeopleTwo.name);
        System.out.println(closePeopleTwo.mobileInternet);
        System.out.println(closePeopleTwo.minutes);
        System.out.println(closePeopleTwo.sms);
        System.out.println(closePeopleTwo.price);
        System.out.println(closePeopleTwo.url);


    }
}
