public class Main
{
    public static void main(String[] args)
    {
        int creditBalance = 5000;
        double interestRate = 0.17;
        double oneMonth = 0;
        double twoMonth = 0;

        oneMonth = creditBalance * interestRate;
        twoMonth = (creditBalance + oneMonth) * interestRate;

        System.out.println("The interest for the first month is: " + oneMonth);
        System.out.println("The interest for the second month is: " + twoMonth);

    }
}