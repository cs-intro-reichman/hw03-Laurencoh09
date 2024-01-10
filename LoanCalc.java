public class LoanCalc {

    static double epsilon = 0.001;  
    static int iterationCounter;    
    public static void main(String[] args) {
        // Gets the loan data
        double loan = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        
        System.out.println(" Loan sum = " + loan + ", interest rate = " + rate + "%, periods = " + n);

    
        System.out.print("Periodical payment, using brute force: ");
        System.out.printf("%.2f", bruteForceSolver(loan, rate, n, epsilon));
        System.out.println();
        System.out.println("number of iterations: " + iterationCounter);

      
        System.out.print("Periodical payment, using bi-section search: ");
        System.out.printf("%.2f", bisectionSolver(loan, rate, n, epsilon));
        System.out.println();
        System.out.println("number of iterations: " + iterationCounter);
    }

    public static double bruteForceSolver (double loan, double rate, int n, double epsilon) {
        double guess = loan / n; // Initial guess

        while (endBalance(loan, rate, n, guess) > 0) {
            guess += epsilon;
            iterationCounter++;
        }

        return guess;
    }

    public static double bisectionSolver (double loan, double rate, int n, double epsilon) {
        double lo = 0;
        double hi = loan / n * n; 
        double guess = (lo + hi) / 2;

        while ((hi - lo) > epsilon) {
            if (endBalance (loan, rate, n, guess) * endBalance(loan, rate, n, lo) > 0) {
                lo = guess;
            } else {
                hi = guess;
            }

            guess = (lo + hi) / 2;
            iterationCounter++;
        }

        return guess;
    }

    
    private static double endBalance ( double loan, double rate, int n, double payment ) {
        for (int i = 0; i < n; i++) {
            loan = (loan - payment) * (1 + rate / 100);
        }
        return loan;


    }
}
