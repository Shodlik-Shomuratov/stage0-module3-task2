package lang.print.gaps.task2;

public class AdvancedNamingConvention {
    private static final int ADULT_AGE = 18;

    private static final int age = 30;
    private static final int phoneNumber = 900909090;

    void callToFriend() {
        //some code
        System.out.print(age);
        System.out.print(phoneNumber);
        System.out.print(ADULT_AGE);
        callByNumber(phoneNumber);
    }

    void callByNumber(int Number) {
        //some code
        callToFriend();
        System.out.print(Number);
    }

}
