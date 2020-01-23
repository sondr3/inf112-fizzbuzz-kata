package fizzbuzz;

public class FizzBuzz {
    private int first;
    private int second;

    public FizzBuzz(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public String fizzBuzz(int input) {
        String output = "";
        if (input % this.first == 0 && input % this.second == 0) output = "fizzbuzz";
        else if (input % this.first == 0) output = "fizz";
        else if (input % this.second == 0) output = "buzz";
        else output += input;

        return output;
    }
}
