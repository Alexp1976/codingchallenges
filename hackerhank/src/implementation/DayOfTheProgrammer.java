package implementation;

public class DayOfTheProgrammer {

    // https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true

    public static void main(String[] args) {

        System.out.println(dayOfProgrammer(1800));
    }

    static String dayOfProgrammer(int year) {

        int februaryDays;

        if (year < 1918) {
            if (year % 4 == 0) {
                februaryDays = 29;
            } else {
                februaryDays = 28;
            }
        } else if (year > 1918) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 400 != 0)) {
                februaryDays = 29;
            } else {
                februaryDays = 28;
            }
        } else {
            februaryDays = 15;
        }

        int dayInYear = 31 + februaryDays + 31 + 30 + 31 + 30 + 31 + 31;
        int dayOfProgrammer = 256 - dayInYear;

        return String.format("%02d.09.%d", dayOfProgrammer, year);
    }
}
