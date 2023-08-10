package main.java;

public class Week2Prac {
    public static void main(String[] args) {
        //Question 5
        int marks[] = {10, 70, 20, 90, 30, 49, 50};
        int countpasses = 0;
        for (int i = 0; i < marks.length; i++){
            if(marks[i] >= 50){
                countpasses += 1;
            }
        }
        System.out.print(countpasses);
        //Question 6
        int sumNegatives(int[] data) {
            //write your code here
            int negativeSum = 0;
            for(int i = 0; i < data.length; i++) {
                if(data[i] < 0){
                    negativeSum += data[i];
                }
            }
            return negativeSum;
        }


    }
}
