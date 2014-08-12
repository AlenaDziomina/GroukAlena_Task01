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
public abstract class AdditionalEquip extends BaseMotoEquipment{ 
    //дополнительная экипировка
    
    enum Season {SPRING, SUMMER, AUTUMN, WINTER}
    private String baseMaterial; //основной материал
    private Season season; //сезон применения

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
        
        AdditionalEquip eq = (AdditionalEquip)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(baseMaterial == null ? eq.baseMaterial != null : 
                !baseMaterial.equals(eq.baseMaterial)) {
            return false;
        }
        if(season != eq.season) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.baseMaterial);
        hash = 47 * hash + Objects.hashCode(this.season);
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
        str.append(", baseMaterial: ");
        str.append(baseMaterial);
        str.append(", season: ");
        str.append(season);
       
        return str.toString();
    }
}
