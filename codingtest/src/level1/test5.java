package level1;

public class Test5 {
	//양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
	//예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
	//	자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

//내 답(오답)
//	public boolean solution(int x) {
//		boolean answer = false;
//		double a =(double)x;
//		double b = 0.0;
//	//자리수합		//앞자리수						//뒷자리 수
//		b = (Math.floor(a/10))+a-(Math.floor(a/10)*10);
//		if (a%b == 0) {
//		answer = true;
//		}
//		return answer;
//	}
//}
    public boolean solution(int x) {
        boolean answer = true;
        return answer;
    }
}

