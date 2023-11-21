import java.util.Scanner;

public class SmallerStrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열 t를 입력하세요(t의 자릿 수는 1~18까지 입니다.): ");
        String t = String.valueOf(scanner.nextInt());
        String p = String.valueOf(scanner.nextInt());
        int result = solution(t,p);
        System.out.println(result);
    }

    public static int solution(String t, String p){
        Scanner scanner = new Scanner(System.in);
        //숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution
        int answer = 0;
        Long pInt = Long.parseLong(p);  //p문자열은 최대 18이므로 long type 적용
        for(int i=0;i <= t.length()-p.length(); i++){
            Long tss = Long.parseLong(t.substring(i, i+p.length()));
            if(pInt>=tss){
                answer++;
            }
        }
        return answer;
    }
}


