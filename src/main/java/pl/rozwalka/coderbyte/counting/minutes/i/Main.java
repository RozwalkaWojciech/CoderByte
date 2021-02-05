package pl.rozwalka.coderbyte.counting.minutes.i;

/*
 * Have the function CountingMinutesI(str) take the str parameter being passed which will be two times
 * (each properly formatted with a colon and am or pm) separated by a hyphen and return the total number of minutes
 * between the two times. The time will be in a 12 hour clock format.
 * For example: if str is 9:00am-10:00am then the output should be 60.
 * If str is 1:00pm-11:00am the output should be 1320.
 */

class Main {

    public static int CountingMinutesI(String str) {

        String[] times = str.split("-");
        String[] startTime = times[0].split(":");
        String[] endTime = times[1].split(":");

        int startHour = Integer.parseInt(startTime[0]);
        int endHour = Integer.parseInt(endTime[0]);
        int startMin = Integer.parseInt(startTime[1].substring(0, startTime[1].length() - 2));
        int endMin = Integer.parseInt(endTime[1].substring(0, endTime[1].length() - 2));

        int minOfStartDay = startTime[1].contains("pm") ? (startHour * 60) + startMin + (12 * 60) : (startHour * 60) + startMin;
        int minOfEndDay = endTime[1].contains("pm") ? (endHour * 60) + endMin + (12 * 60) : (endHour * 60) + endMin;

        return minOfStartDay <= minOfEndDay ? minOfEndDay - minOfStartDay : (24 * 60) - minOfStartDay + minOfEndDay;
    }

    public static void main(String[] args) {
        System.out.println(CountingMinutesI("9:00am-10:00am"));
        System.out.println(CountingMinutesI("1:00pm-11:00am"));
    }
}
