import java.util.UUID;

public class Taxi extends PublicTransport{
    String destination;
    int basicDistance = 1;
    int destinationDistance = 0;
    int basicPay = 3000;
    int distancePay = 1000;

    int payment = 0;
    // 누적 요금
    int fare = 0;
    String uuid = UUID.randomUUID().toString();

    Taxi() {
        // 상속 필드
        maxPeople = 4;
        fuel = 100;
        state = "일반";

        carNum = uuid;
        System.out.println(carNum);
        System.out.println("주유량 = " + fuel);
        System.out.println("상태 = " + state);

    }
    void startDrive() {
        if (fuel >= 10) {
            System.out.println("운행 가능합니다.");
        }
    }


    void inPeople(int num, String location, int km) {
        if (fuel >= 10 && state == "일반"){
            maxPeople -= num;
            destination = location;
            destinationDistance = km;

            state = "운행중";
            payment = (km - basicDistance) * distancePay + basicPay;

            if (maxPeople > 0) {
                System.out.println("탑승 승객 수 = " + num);
                System.out.println("잔여 승객 수 = " + maxPeople);
                System.out.println("기본 요금 확인 = " + basicPay);
                System.out.println("목적지 = " + destination);
                System.out.println("목적지까지 거리 = " + destinationDistance + "km");
                System.out.println("지불할 요금 = " + payment);
                System.out.println("상태 = " + state);

            } else {
                System.out.println("최대 승객 수 초과");
                maxPeople += num;
            }
        }
    }

    void inPeople(int num) {
        maxPeople -= num;

        if (maxPeople < 0) {
            System.out.println("최대 승객 수 초과");
            maxPeople = 4;
            state = "일반";
        }
    }

    void amountFuel(int num) {
        fuel += num;
        System.out.println("주유량 = " + fuel);

        if (fuel < 10) {
            state = "운행불가";
            System.out.println(state);
            System.out.println("주유 필요");
        }
    }

    // 요금결제 메소드
    void toPayment() {
        maxPeople = 4;
        fare += payment;
        System.out.println("누적요금 = " + fare);
    }

}
