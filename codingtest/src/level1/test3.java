package level1;

public class test3 {
	//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
	//2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
	//행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
	
// 내답	
//    public int[][] solution(int[][] arr1, int[][] arr2) {
//        int[][] answer = new int [arr1.length][arr1[0].length];
//        for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				answer [i][j]+=arr1[i][j];
//			}
//		}
//        for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2[i].length; j++) {
//				answer[i][j]+=arr2[i][j];
//			}
//		}
//        return answer;
//    }
//}
//다른 답
//answer은 어차피 arr1과 arr2와 같은 모양일 것이다.
//그래서 그냥 answer을 arr1로 선언하고
//answer에 arr2를 더해준다.
public int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = arr1;
    
    for(int i=0; i<arr1.length; i++){
        for(int j=0; j<arr1[0].length; j++){
            answer[i][j] += arr2[i][j];
        }
    }
    return answer;
}
}
//2차원 배열에 대한 이해가 부족하다.