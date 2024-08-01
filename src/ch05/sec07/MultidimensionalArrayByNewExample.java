package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        for(int i=0; i<mathScores.length; i++){
            for(int j=0; j<mathScores[i].length; j++){
                System.out.println("mathScores[" + i + "]" + "[" + j + "] : " + mathScores[i][j]);
            }
        }

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        for(int i=0; i<mathScores.length; i++){
            for(int j=0; j<mathScores[i].length; j++){
                System.out.println("mathScores[" + i + "]" + "[" + j + "] : " + mathScores[i][j]);
            }
        }

        int totalStudent = 0;
        int totalMathSum = 0;
        for(int i = 0; i<mathScores.length; i++){
            totalStudent += mathScores[i].length;
            for(int j = 0; j<mathScores[i].length; j++){
                totalMathSum += mathScores[i][j];
            }
        }

        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("수학평균 : " + totalMathAvg);

        //배열의 길이가 다를경우
        int[][] enlishScores = new int[2][];
        enlishScores[0] = new int[2];
        enlishScores[1] = new int[3];

        for(int i=0; i<enlishScores.length; i++){
            for(int j=0; j<enlishScores[i].length; j++){
                System.out.println("enlishScores[" + i + "]" + "[" + j + "] : " + enlishScores[i][j]);
            }
        }
        System.out.println();

        enlishScores[0][0] = 90;
        enlishScores[0][1] = 91;
        enlishScores[1][0] = 92;
        enlishScores[1][1] = 93;
        enlishScores[1][2] = 94;

        totalStudent = 0;
        int totalEnglishSum = 0;

        // 영어 점수 평균 구하기
        for(int i = 0; i<enlishScores.length; i++){
            totalStudent += enlishScores[i].length;
            for(int j = 0; j < enlishScores[i].length; j++){
                totalEnglishSum += enlishScores[i][j];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("영어평균점수 : " + totalEnglishAvg);

    }
}
