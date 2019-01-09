import java.util.*;

class CoffeeMachineInput {
    int water = 1200;
    int milk = 540;
    int coffeeBeans = 120;
    int disposableCups = 9;
    int money = 550;

    public static void main(String[] args) {
        CoffeeMachineInput coffeeMachine = new CoffeeMachineInput();
        coffeeMachine.print();
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + "Write action (buy, fill, take): ");
        if (in.hasNextLine()){
            String action = in.nextLine();
            if ("buy".equals(action)){
                coffeeMachine.makeCoffee();
            }else if ("fill".equals(action)){
                coffeeMachine.addIngredients();
            }else if ("take".equals(action)){
                coffeeMachine.takeMoney();
            }
        }
        coffeeMachine.print();
    }
    public void makeCoffee() {
        System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()){
            int number = in.nextInt();
            if (number==1){
                water = water - 250;
                coffeeBeans = coffeeBeans - 16;
                money = money + 4;
                disposableCups--;
            }else if (number==2){
                water = water - 350;
                milk = milk - 75;
                coffeeBeans = coffeeBeans - 20;
                money = money + 7;
                disposableCups--;
            }else if (number==3){
                water = water - 200;
                milk = milk - 100;
                coffeeBeans = coffeeBeans - 12;
                money = money + 6;
                disposableCups--;
            }
        }
        System.out.println();
    }
    public void addIngredients(){

        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Write how many ml of water do you want to add: ");
            int waterInput = in.nextInt();
            System.out.print("Write how many ml of milk do you want to add: ");
            int milkInput = in.nextInt();
            System.out.print("Write how many grams of coffee beans do you want to add: ");
            int coffeeBeansInput = in.nextInt();
            System.out.print("Write how many disposable cups of coffee do you want to add: ");
            int disposableCupsInput = in.nextInt();
            water += waterInput;
            milk += milkInput;
            coffeeBeans += coffeeBeansInput;
            disposableCups += disposableCupsInput;
            System.out.println();
        }catch (InputMismatchException e){
            System.out.println("\n" + "Only numbers!!!" + "\n");
        }
    }
    public void takeMoney(){
        System.out.println("I gave you $" + money + "\n");
        money = 0;
    }

    public void print(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println(money + " of money");
    }
}