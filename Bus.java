import java.util.UUID;

public class Bus extends PublicTransport{
    int currentPeople = 0;
    int pay = 1000;
    String uuid = UUID.randomUUID().toString();

    Bus() {
        // 상속 필드
        maxPeople = 30;
        state = "운행";
        carNum = uuid;

        System.out.println(carNum);
    }

    void inPeople(int num) {
        maxPeople -= num;
        currentPeople += num;

        if (maxPeople > 0) {
            System.out.println("탑승 승객 수 = " + num);
            System.out.println("잔여 승객 수 = " + maxPeople);
            System.out.println("요금 확인 = " +  (pay * num));

        } else {
            System.out.println("최대 승객 수 초과");
            maxPeople += num;
            currentPeople -= num;
        }
    }

    String changeState(String busState) {
        if (busState == "운행") {
            state = "차고지행";
            maxPeople = 30;
            currentPeople = 0;
        } else {
            state = "운행";
        }

        return state;
    }

    int peopleCnt() {

        return currentPeople;
    }

    void amountFuel(int num) {
        fuel += num;
        System.out.println("주유량 = " + fuel);
        if (fuel < 10) {
            state = "차고지행";
            System.out.println(state);
            System.out.println("주유 필요");
        }
    }


}


