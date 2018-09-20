/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Person {
    private final String name;
    private final Calendar birthDate;
    private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);
    
    public Person(String name, Calendar birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }
    
    
    public int getAge (){
        Calendar today = GregorianCalendar.getInstance();
        return  (int) (miliSecondsToYear(today.getTimeInMillis() -
                birthDate.getTimeInMillis()));
    }
    
    private long miliSecondsToYear (long milles) {
        return milles/MILLISECONDS_PER_YEAR;
    }
}
