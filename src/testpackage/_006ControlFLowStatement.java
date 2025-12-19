package testpackage;

/*
for - execute a block of code a specific number of times typically when the number of iterations is known.
while - execute a block of code repeatedly as long as a specified condition is true typically when the number of iterations is unknown.
do-while - similar to while loop but guarantees at least one execution of the block before checking the condition.
 */
public class _006ControlFLowStatement {

    public static void main(String[] args) {
        _006ControlFLowStatement obj = new _006ControlFLowStatement();
        obj.starPattern2();
    }

    public void forLoopExample(){

        // for(initialization; condition; increment/decrement){
        //     // code to be executed
        // }

        for(int i=1; i<=5; i = i+1){
            System.out.println("Hello Java!!" );
        }

        //print the sum of 10 natural numbers
        int sum =0;
        for (int i=1; i<=10; i++){
            sum= sum+i;
        }

        System.out.println("Sum of first 10 natural numbers is: "+sum);
    }

    public void whileLoopExample(){
        // initialization
        // while(condition){
        //     // code to be executed
        //     // increment/decrement
        // }
        int sum =0;
        int i=1;
        while(i<=10){
            sum = sum+i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers is: "+sum);

    }

    public void nestedforloop(){
        //outer loop works on the rows
        for(int i=1; i<=3; i++){
            //inner loop works on the columns
            for(int j=1; j<=2; j++){
                System.out.print("i: "+i+" j: "+j);
            }
            System.out.println();
        }

    }

    public void starPattern1(){
        for(int i=1; i<=4; i++){
            for (int j=1; j<=3; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public void starPattern2(){
        for(int i=1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}
