/*
문제 3. - 합격 범위
int형 변수 score를 선언하세요.
score가 80점 이상이고, 100점 이하이면 true를 출력하고, 아니면 false를 출력하세요.
 */

package operator.ex;

public class OperatonEx3 {
    public static void main(String[] args) {
        int score = 80;
        boolean result = score >= 80 && score <= 100;
        System.out.println(result);
    }
}
