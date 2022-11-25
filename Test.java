import java.util.UUID;

public class Test {
    public static void main(String[] args) {

//        PublicTransport pt = new PublicTransport();
        Bus bus = new Bus();
        Bus bus2 = new Bus();

        // 1. 승객 +2
        bus.inPeople(2);
        System.out.println();

        // 3. 주유량 -50
        bus.amountFuel(-50);
        System.out.println();

        // 5. 상태 변경
        bus.changeState(bus.state);
        System.out.println("상태 = " + bus.state);

        // 6. bus에 주유량 +10
        bus.amountFuel(10);
        System.out.println();

        // 8. 상태 변경
        bus.changeState(bus.state);

        // 9. 승객 + 45
        bus.inPeople(45);
        System.out.println();

        // 11. 승객 + 5
        bus.inPeople(5);
        System.out.println();

        // 13. 주유량 -55
        bus.amountFuel(-55);
        System.out.println();

        System.out.println("-----------------------------------------------------------------------------");

        // 0. 택시 생성
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        System.out.println();

        // 1. 승객 탑승
        taxi1.inPeople(2, "서울역", 2);
        System.out.println();

        // 3. 주유량 -80
        taxi1.amountFuel(-80);

        // 4. 요금 결제
        taxi1.toPayment();
        System.out.println();

        // 6. 승객 + 6
        taxi1.inPeople(5);
        System.out.println();

        // 8. 승객 +3, 구로디지털단지역, 12
        taxi1.inPeople(3, "구로디지털단지역", 12);
        System.out.println();

        // 10. 주유량 -20
        taxi1.amountFuel(-20);

        // 11. 주유 필요
        taxi1.toPayment();


    }
}
