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
public abstract class MotoEquipment implements Comparable<MotoEquipment> {
    //мотоэкипировка
    
    private int id; //идентификатор объекта
    private String name; //торговое наименование
    private String manufacturer; //производитель
    private int price; //цена
    private float weight; //вес
    
    protected MotoEquipment(){}
    
    protected MotoEquipment(int id, String name) throws ProjectException {  
        setId(id);
        setName(name); 
    }
    
    protected MotoEquipment(int id, String name, int price, float weight)
            throws ProjectException {
        
        this(id, name);
        setPrice(price);
        setWeight(weight);
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
        
        MotoEquipment eq = (MotoEquipment)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(id != eq.id) {
            return false;
        }
        if(name == null ? eq.name != null : !name.equals(eq.name)){
            return false;
        }
        if(price != eq.price) {
            return false;
        }
        if(manufacturer == null ? eq.manufacturer != null : 
                !manufacturer.equals(eq.manufacturer)) {
            return false;
        }
        if(weight != eq.weight) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.manufacturer);
        hash = 59 * hash + this.price;
        hash = 59 * hash + Float.floatToIntBits(this.weight);
        return hash;
    }
    
    @Override
    public String toString() {
        
        StringBuilder str = new StringBuilder(getClass().getName());
        str.append('@');
        str.append("id: ");
        str.append(id);
        str.append(", name: ");
        str.append(name);
        str.append(", manufacturer: ");
        str.append(manufacturer);
        str.append(", price: ");
        str.append(price);
        str.append(", weight: ");
        str.append(weight);
       
        return str.toString();
    }
    
    @Override
    public int compareTo(MotoEquipment eq) { //сравнение по id
        if (eq == null ) {
            throw new NullPointerException();
        }
        int compareId = eq.getId();
        return this.id - compareId;      
    }
    
    protected final void setId(int id) throws ProjectException {
        if (id < 0) {
            throw new ProjectException("MotoEquipment.id < 0");
        }
        if (id == 0) {
            throw new ProjectException("MotoEquipment.id == 0");
        }
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    protected final void setName(String name) throws ProjectException {
        if (name == null){
            throw new ProjectException("MotoEquipment.name == null");
        }
        if (name.isEmpty()){
            throw new ProjectException("MotoEquipment.name is epty.");
        }
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setManufacturer(String manufacturer) throws ProjectException {
        if (manufacturer == null){
            throw new ProjectException("MotoEquipment.manufacturer == null");
        }
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setPrice(Integer price) throws ProjectException {
        if (price < 0) {
            throw new ProjectException("MotoEquipment.price < 0");
        }
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setWeight(Float weight) throws ProjectException {
        if (weight < 0) {
            throw new ProjectException("MotoEquipment.price < 0");
        }
        this.weight = weight;
    }
    
    public float getWeight() {  
        return weight;
    }


    
 
}


    
    
