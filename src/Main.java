public class Main {
    public static void main(String[] args) {
        int currentAmount=100;
        int addedAmount=1100;

        int bonus;
        if (addedAmount >=1000){
            bonus=addedAmount/100;
            addedAmount +=bonus;
        } else {
           bonus=0;
        }
        currentAmount += addedAmount;

        System.out.println(currentAmount);

    }
}
