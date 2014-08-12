/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

import java.util.Objects;

/**
 *
 * @author Helena.Grouk
 */
public abstract class SeparateBodyProtection extends BodyProtection { 
    //отдельная защита тела (в виде щитков)
    
    private String mountType; //тип крепления к телу
    
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
        
        SeparateBodyProtection eq = (SeparateBodyProtection)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(mountType == null ? eq.mountType != null : 
                !mountType.equals(eq.mountType)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.mountType);
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
        str.append(", mountType: ");
        str.append(mountType);
        return str.toString();
    }
}
