/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Helena.Grouk
 */
public abstract class SpecialMotoEquipment extends MotoEquipment{
    //специализированный экип
    
    //для какой основной экипировки предназначено
    private ArrayList<BaseMotoEquipment> forWhat; 
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        SpecialMotoEquipment eq = (SpecialMotoEquipment)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(forWhat != eq.forWhat) {
            return false;
        }  
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.forWhat);
        return hash;
    }

    @Override
    public String toString() {
        String str1 = super.toString();
        int i = str1.indexOf("@");
        if (i > 0) {
            str1 = str1.substring(i+1);
        }
        
        StringBuilder str = new StringBuilder(getClass().getName());
        str.append('@');
        str.append(str1);
        str.append(", forWhat: ");
        if (forWhat != null) {
            str.append(forWhat.toString());
        } else {
            str.append("null");
        }
        
        return str.toString();
       
    }
}
