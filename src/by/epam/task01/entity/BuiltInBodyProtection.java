/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

import by.epam.task01.ProjectExeptions.ProjectException;
import java.util.Objects;

/**
 *
 * @author Helena.Grouk
 */
public abstract class BuiltInBodyProtection extends BodyProtection{
    //встроенная защита тела
    
    private String baseMaterial; //материал основания
    private boolean waterproof; //влагостойкость (покрытия, пропитки и др)
    private boolean perforation; //наличие перворации
    private boolean insulation; //наличие утеплителя

    
    protected BuiltInBodyProtection(int id, String name)
            throws ProjectException {
        super(id, name);
    }
    
    protected BuiltInBodyProtection(int id, String name, int price,
            float weight) throws ProjectException {
        super(id, name, price, weight);
    }
    
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
        
        BuiltInBodyProtection eq = (BuiltInBodyProtection)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(baseMaterial == null ? eq.baseMaterial != null :
                !baseMaterial.equals(eq.baseMaterial)) {
            return false;
        }
        if(waterproof != eq.waterproof) {
            return false;
        }
        if(perforation != eq.perforation) {
            return false;
        }
        if(insulation != eq.insulation) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.baseMaterial);
        hash = 83 * hash + (this.waterproof ? 1 : 0);
        hash = 83 * hash + (this.perforation ? 1 : 0);
        hash = 83 * hash + (this.insulation ? 1 : 0);
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
        str.append(", waterproof: ");
        str.append(waterproof);
        str.append(", perforation: ");
        str.append(perforation);
        str.append(", insulation: ");
        str.append(insulation);
        
        return str.toString();
    }
    
    public void setBaseMaterial(String baseMaterial) throws ProjectException {
        if (baseMaterial == null) {
            throw new ProjectException("BuiltInBodyProtection.baseMaterial == null");
        }
        if (baseMaterial.isEmpty()) {
            throw new ProjectException("BuiltInBodyProtection.baseMaterial is empty");
        }
        this.baseMaterial = baseMaterial;
    }
    
    public String getBaseMaterial() {
        return baseMaterial;
    }
    
    public void setWaterproof(Boolean waterproof) {
        this.waterproof = waterproof;
    }
    
    public boolean isWaterproof() {
        return waterproof;
    }
    
    public void setPerforation(Boolean perforation) {
        this.perforation = perforation;
    }
    
    public boolean isPerforation() {
        return perforation;
    }
    
    public void setInsulation(Boolean insulation) {
        this.insulation = insulation;
    }
    
    public boolean isInsulation() {
        return insulation;
    }
    
    
}
