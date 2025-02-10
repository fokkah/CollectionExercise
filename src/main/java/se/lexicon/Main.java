package se.lexicon;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*

        ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");
            //System.out.println("Ex1: \n" + weekDays + "\n");
            //System.out.println("Ex2:");
        //Iterator itr = weekDays.iterator();
        //while (itr.hasNext()){
            //System.out.println(itr.next());
        //}
         */

        HashSet<String> weekdayMinusThursday = new HashSet<String>();
        weekdayMinusThursday.add("Monday");
        weekdayMinusThursday.add("Tuesday");
        weekdayMinusThursday.add("Wednesday");
        weekdayMinusThursday.add("Thursday");
        weekdayMinusThursday.add("Friday");
        weekdayMinusThursday.add("Saturday");
        weekdayMinusThursday.add("Sunday");
        System.out.println("\nNot sorted\n" + weekdayMinusThursday + "\n");

        List<String> list = new ArrayList<String>(weekdayMinusThursday);
        Collections.sort(list);
        System.out.println("Why doesnt this sort it?\n" + list);

        TreeSet<String> treeSet = new TreeSet<>(weekdayMinusThursday);
        System.out.println(treeSet);





        //Iterator<String> itr = set.iterator();
        //set.remove("Thursday");
        //System.out.println(set);
        //set.add("Thursday");
        //System.out.println(set);











    }
















}