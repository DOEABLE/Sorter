import java.util.Arrays;
import java.util.Scanner;
public class stringSorter {
    /*
    프로그래머스 코딩 test : k번째 수
    File Name : stringSorter
    since : 23-10-23
    description : 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
    예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
    1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
    2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
    3. 2에서 나온 배열의 3번째 숫자는 5입니다.
    배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
    조건1. array의 길이는 1이상 100이하
    조건2. array의 각 원소는 1이상 100이하
    조건3. commands의 길이는 1이상 50이하
    조건4. commands의 각 원소의 길이 : 3*/
    public static void main(String[] args){
        //배열과 명령어를 준비한다.(변수를 선언하기만 하고 초기화(처음 값을 넣어주는 것)를 하지 않으면 뭔가 할 수 없는 상태임.)
        int[] array = {};
        int[][] commands = {};

        //solution 메서드를 호출하여 결과를 받는다.
        int[] result = solution(array, commands);
        /*result 배열을 쪼개는 함수 구현*/

        //print result
        System.out.println(result);
        /*결과값이 깨져서 출력되는 이유는 System.out.println(result);에서 result 배열을 직접 출력하고 있기 때문입니다.
        자바에서 배열을 System.out.println()으로 직접 출력하면, 배열의 내용이 아닌 배열 객체의 정보가 출력됩니다. 따라서 [I@6d06d69c와 같은 형태로 잘못된 결과가 출력되었습니다.

        for(int num : result){              //'for-each' 문법을 사용하여 result라는 배열의 모든 요소를 num에 순차적으로 넣어 출력하는 코드. -> num = string이잖아... 그냥 배열 그대로 유지해.
            System.out.print(num);
        }
        -->[해결] : 반복문을 사용해서 result 배열의 각 요소를 개별적으로 출력하는 하기. */
        System.out.println(Arrays.toString(result));

        System.out.println("종료하려면 엔터 키를 누르세요.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public static int[] solution(int[] array, int[][] commands) {      //매개변수인  int[] array와 int[][] commands를 받아들이며, 반환값으로 int[]배열을 가지고 있음.
        Scanner scanner = new Scanner(System.in);                      //배열 array에 들어갈 숫자들을 입력 받는다.

        System.out.print("배열의 길이를 입력하세요(최대 100): ");
        int length = scanner.nextInt();

        array = new int[length];

        System.out.println("배열 요소를 입력하세요: ");
        for(int i =0; i<length; i++){
            System.out.print("array[" + i + "]");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    /*n번째 숫자를 찾아주는 함수*/

}
