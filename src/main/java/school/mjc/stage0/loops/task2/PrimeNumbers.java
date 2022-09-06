package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (printToInclusive>=counter){
            int y = 2;
            boolean flag = false;
            while (y<counter){
                if(counter%y==0){
                    flag = true;
                    break;
                }
                y++;
            }
            if (!flag){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
