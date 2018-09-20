/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Usuario
 */
public class Person {
    private final String name;
    private final LocalDate birthDate;
    
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    
    
    public int getAge (){
        LocalDate now = LocalDate.now();
        return  Period.between(birthDate, now).getYears();
    }
    
}
