public class TimeConversion {

    public static void main(String[] args) {

        System.out.println(timeConversion("12:05:45PM"));
    }

    static String timeConversion(String s) {

        String amPm = s.substring(8);
        StringBuilder sb = new StringBuilder();
        int hour = Integer.parseInt(s.substring(0, 2));

        if (hour == 12) {
            sb.append(amPm.equals("AM") ? "00" : "12");
        } else {
            sb.append(amPm.equals("AM") ? s.substring(0, 2) : String.valueOf(hour + 12));
        }

        sb.append(":").append(s, 3, 8);

        return sb.toString();

    }
}
