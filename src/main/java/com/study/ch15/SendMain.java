package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {
        //  <> 둘다 제거하면 오브젝트로 들어가게 됨
        SendData<String> sendData1 = new SendData<>(200, "김준일");
//        send(sendData1);

        SendData<Member> sendData2 = new SendData<>(200, new Member("김준일", "01099881916"));
        send(sendData2);

        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("김준이", "01012312311"));
        send(sendData3);
    }

    //  <?> - 와일드카드(어떤 타입의 데이터가 들어올지 모를 때, 어떤 타입의 자료형이든 OK)
    //  <? extends T> T 또는 T를 상속받은 자식 클래스만 올 수 있게 제한(위에서 밑으로)
    //  <? super T> T 또는 T의 부모 클래스만 올 수 있게 제한(밑에서 위로)
    public static void send(SendData<? super VipMember> sendData) {
        sendData.send();
    }
}
