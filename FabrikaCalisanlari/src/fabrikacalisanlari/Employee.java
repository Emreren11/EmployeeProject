/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrikacalisanlari;

import java.time.Duration;

/**
 *
 * @author Emre
 */
public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    public double s_tax;
    public double s_bonus;
    public double raise_s;
    public double s_tax_bonus;
    public double sum;
    public Employee(String name,double salary,int workHours,int hireYear)
    {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        tax();
        bonus();
        raiseSalary();
        s_tax_bonus=salary+s_bonus-s_tax;
        sum=s_tax_bonus+raise_s;
        
    }
    
    public void tax()
    {
        if(salary>999)
        {
            s_tax=salary*0.03;
        }
    }
    
    public void bonus()
    {
        if(workHours>40)
        {
            int bonus;
            bonus=workHours-40;
            s_bonus=bonus*30;
        }
    }
    
    public void raiseSalary()
    {
        int yil=2021-hireYear;
        
        if(yil>-1)
        {
            if(yil<10)
            raise_s=salary*0.05;
        else if(yil>9&&yil<20)
            raise_s=salary*0.1;
        else
            raise_s=salary*0.15;
        }
        
    }
 
    @Override
    public String toString() {
        String bilgi=
                "Ad: "+name+"\n"+
                "Maaşı: "+salary+"\n"+
                "Çalışma Saati: "+workHours+"\n"+
                "Başlangıç Yılı: "+hireYear+"\n"+
                "Vergi: "+s_tax+"\n"+
                "Bonus: "+s_bonus+"\n"+
                "Maaş Artışı: "+raise_s+"\n"+
                "Vergi ve Bonuslar ile birlikte maaş: "+s_tax_bonus+"\n"+
                "Toplam Maaş: "+sum+"\n";
        return bilgi;
    }
    

    
    
    
}
