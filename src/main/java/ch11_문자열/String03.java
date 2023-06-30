package ch11_문자열;

public class String03 {
    public static void main(String[] args) {
        //특정키워드를 포함하는 배열값만 추출해 새로운 배열들로 분류
        String[] addressArray = new String[] {
                "부산시 동래구",
                "부산시 진구",
                "창원시 마산합포구",
                "창원시 진해구",

        };
        String[] addressArray2 = new String [0];    //부산시 넣을 배열
        String[] addressArray3 = new String [0];   //창원시 넣을 배열

        for(int i = 0; i < addressArray.length; i++) {
            if(addressArray[i].contains("부산시")) {   //"부산시"를 포함하면 아래 실행
                //기존 배열의 공간보다 1이 큰 새로운 배열을 생성한다.
                String[] tempArray = new String[addressArray2.length +1];
                // 기존의 배열에 있는 정보를 새로운 배열에 옮긴다.
                for(int j = 0; j < addressArray2.length; j++) {
                    tempArray[j] = addressArray2[j];
                }
                // 마지막 배열 공간에 새로운 값을 대입한다.
                tempArray[addressArray2.length] = addressArray[i];
                // 새로운 배열을 기존의 배열 변수에 대입한다.
                addressArray2 = tempArray;

            }else if(addressArray[i].contains("창원시")) {
                //위에 거랑 같은 코드 => 이럴때 메소드를 쓴다.
                String[] tempArray = new String[addressArray3.length +1];
                for(int j = 0; j < addressArray3.length; j++) {
                    tempArray[j] = addressArray3[j];
                }
                tempArray[addressArray3.length] = addressArray[i];
                addressArray3 = tempArray;

            }
        }
        System.out.println("[부산시 거주 수강생]");
        for(int i = 0; i < addressArray2.length; i++) {
            System.out.println(addressArray2[i]);
        }
        System.out.println("[창원시 거주 수강생]");
        for(int i = 0; i < addressArray3.length; i++) {
            System.out.println(addressArray3[i]);
        }
    }
}
