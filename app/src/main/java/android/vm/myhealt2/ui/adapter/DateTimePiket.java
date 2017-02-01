package android.vm.myhealt2.ui.adapter;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.widget.DatePicker;
import android.widget.TimePicker;

/**
 * Created by Francesco on 01/02/2017.
 */

public class DateTimePiket {



    public static int[] pikerdate(Activity activity){
        int [] date = new int[3];
        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);


        DatePickerDialog datePickerDialog = new DatePickerDialog(activity,
                new DatePickerDialog.OnDateSetListener() {
                    public int [] date = new int[3];
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        date[0] = year;
                        date[1] = monthOfYear;
                        date[2] = dayOfMonth;
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
        return date;
    }

    public static int[] pikerhour(Activity activity){

        final int [] hour = new int[2];
        final Calendar c = Calendar.getInstance();
        int mHour = c.get(Calendar.HOUR_OF_DAY);
        int mMinute = c.get(Calendar.MINUTE);

        // Launch Time Picker Dialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(activity,
                new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay,
                                          int minute) {
                        hour[0]= hourOfDay;
                        hour[1] = minute;
                    }
                }, mHour, mMinute, false);
        timePickerDialog.show();


        return hour;
    }


}
