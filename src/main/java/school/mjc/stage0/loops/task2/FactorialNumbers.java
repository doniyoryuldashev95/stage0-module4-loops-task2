package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        System.out.println(1);
        while (printToInclusive>=counter){
            int overall = 1;
            int y = 1;
            while (y<=counter){
                overall*=y;
                y++;
            }
            System.out.println(overall);
            counter++;
        }
    }
}
