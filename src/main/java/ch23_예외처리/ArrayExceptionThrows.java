package ch23_예외처리;

public class ArrayExceptionThrows {
    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1, 2, 3, 4, 5};
        try {
            printArray(nums); //빨간줄 : 쓰고싶으면 Exception 예외처리를 꼭 해라.
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("exit");

    }
    //throws 예외처리를 미룬다
    //throws Exception :  이 메소드는 메소드 호출시 예외처리가 필요하다는 뜻
    public static void printArray(Integer [] numArray) throws Exception {
        if(true) {
            throw new RuntimeException("내가 강제로 생성한 예외지롱"); //강제로 예외생성
        }

        for(int i = 0; i < numArray.length +2 ; i++) { //예외 발생요인
            System.out.println(numArray[i]);
        }
    }


}
