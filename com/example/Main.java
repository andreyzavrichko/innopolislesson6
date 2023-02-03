package com.example;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1.Создайте список,в котором хранится 3 даты:
        // 1 марта 2023 года, 2 сентября 2024 года, 6 апреля 2020 года.
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        Calendar date1 = new GregorianCalendar(2023, Calendar.MARCH, 1);
        Calendar date2 = new GregorianCalendar(2024, Calendar.SEPTEMBER, 2);
        Calendar date3 = new GregorianCalendar(2020, Calendar.APRIL, 6);

        List<Calendar> list = new ArrayList<>();
        list.add(date1);
        list.add(date2);
        list.add(date3);

        list.forEach(s -> System.out.println(dateFormat.format(s.getTime())));

        // 2.Получите текущую дату и выведите:год,месяц,день,часы,минуты и секунды
        String year = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
        String month = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
        String day = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
        String hour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
        String minute = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
        String second = new SimpleDateFormat("ss").format(Calendar.getInstance().getTime());

        System.out.println("Текущая дата:");
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

    }

}
