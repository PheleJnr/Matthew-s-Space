//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double[] scores = new double[5];
    int index;
    double max;

    System.out.print("Enter the scores of students: ");
    scores[0] = keyboard.nextDouble();
    max = scores[0];

    for(index = 1; index < 5; index++) {
        System.out.println(index);
        scores[index] = keyboard.nextDouble();
        if(scores[index] > max){
            max = scores[index];
        }

    }

    System.out.println("The max scores is: " + max);
//    System.out.println(scores[index] + " is at position " + index);
}
