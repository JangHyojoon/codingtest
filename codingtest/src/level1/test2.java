package level1;

public class test2 {
	//�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
	//���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.
	//x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	//n�� 1000 ������ �ڿ����Դϴ�.
	public long[] solution(long x, int n) {

				
		long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (i+1)*x;
        }
        return answer;
    }
}
// long �迭���� long ���� �־����