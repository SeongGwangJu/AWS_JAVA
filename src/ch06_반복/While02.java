package ch06_반복;

public class While02 {
    public static void main(String[] args) {
        //while로 for문 구현하기

        int i = 0;
        while (i < 10) {
            if(i % 2 == 0) {
                i++;
                continue; //뒤에거 무시하고 바로 다음 조건으로 넘어가라. 위에 i++가 없다면 무한루프.
            }
            System.out.println(i);
            i++;

        }
        /*
       i를 전역변수로 사용함으로써 낭비하게된다. 따라서, 이런 경우에는 for를 사용하는게 적절하다.
        */
    }
}
