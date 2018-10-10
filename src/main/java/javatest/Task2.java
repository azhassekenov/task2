package javatest;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Task2 {
    public static Integer summaVsehChisel(Integer summa){
        return summa == 0 ? 0 : summa%10 + summaVsehChisel(summa/10) ;
    }
}
