package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 1;
        while (printTillInclusive>=counter){
            if (counter%2==0){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
