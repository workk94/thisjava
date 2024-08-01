package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args){
        int [][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        //배열의 길이
        System.out.println(scores.length); //1차원 배열의 길이
        System.out.println(scores[0].length); //2차원배열의 길이(첫번째)
        System.out.println(scores[1].length); //2차원배열의 길이(두번째)

        System.out.println(scores[0][2]);
        System.out.println(scores[1][1]);

        int class1Sum = 0;
        //1번째 반의 평균 점수 구하기
        for(int i =0; i<scores[0].length; i++){
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println(class1Avg);

        int class2Sum = 0;
        //1번째 반의 평균 점수 구하기
        for(int i =0; i<scores[1].length; i++){
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println(class2Avg);

        int totalStudent = 0;
        int totalSum = 0;
        for(int i = 0; i<scores.length; i++){
            totalStudent += scores[i].length;
//            System.out.println(totalStudent);
            for(int j = 0; j<scores[i].length; j++){
                totalSum += scores[i][j];
            }
//            System.out.println(totalSum);
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println(totalAvg);
    }
}
