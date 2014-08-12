/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.logic;


import by.epam.task01.ProjectExeptions.ProjectException;
import by.epam.task01.entity.Helmet;
import by.epam.task01.entity.Jacket;
import by.epam.task01.entity.MotoEquipment;
import by.epam.task01.entity.Pants;
import by.epam.task01.entity.Shoes;



/**
 *
 * @author Helena.Grouk
 */
public class EquipFactory {

    
    
    public enum eqType {HELMET, JACKET, PANTS, SHOES}
    
    public static MotoEquipment equipCreator(eqType type, int id, String name, 
            String[][] args) throws ProjectException{
        
        MotoEquipment newEquip = buildEquip(type, id, name); 
        
        if (args == null) {
            throw new ProjectException("ObjectCreator: objArgs == null");
        }
        for (String[] arg : args){    
            setEquipProperties(type, newEquip, arg);
        }
        return newEquip;
    }
        
    private static MotoEquipment buildEquip(eqType type, int id, String name)
            throws ProjectException {
        switch (type) {
            case HELMET: return new Helmet(id, name);
            case JACKET: return new Jacket(id, name);
            case PANTS: return new Pants(id, name);
            case SHOES: return new Shoes(id, name);
            default: throw new ProjectException("Unnoun equip type: " + type);
        }
    }
    
    private static void setEquipProperties(eqType type, MotoEquipment equip, 
            String[] arg) throws ProjectException {
            
        if(arg == null || arg.length < 3) {
            throw new ProjectException("SetProperties: arg == null or empty.");
        }
        
        switch (type) {
            case HELMET: setHelmetProp((Helmet)equip, arg); break;
            case JACKET: setJacketProp((Jacket)equip, arg); break;
            case PANTS: setPantsProp((Pants)equip, arg); break;
            case SHOES: setShoesProp((Shoes)equip, arg); break;
            default: throw new ProjectException("Unnoun equip type: " + type);
        }
        
    }
    
    private static void setHelmetProp(Helmet helmet, String[] arg) 
            throws ProjectException {    
        switch (arg[0].toLowerCase()) {
            case "manufacturer" : helmet.setManufacturer(arg[1]); break;
            case "price" : helmet.setPrice(Integer.parseInt(arg[1])); break;
            case "weight": helmet.setWeight(Float.parseFloat(arg[1])); break;
            case "size": helmet.setSize(arg[1]); break;
            case "gender": helmet.setGender(arg[1]); break;
            case "mototype": helmet.setMotoType(arg[1]); break;
            case "helmettype": helmet.setHelmetType(arg[1]); break;
            case "shellmaterial": helmet.setShellMaterial(arg[1]); break;
            case "insertmaterial": helmet.setInsertMaterial(arg[1]); break;
            case "vents": helmet.setVents(Integer.parseInt(arg[1])); break;
            case "sunvisor": helmet.setSunVisor(Boolean.parseBoolean(arg[1])); break;
            case "headsetconnector": helmet.setHeadsetConnector(Boolean.parseBoolean(arg[1])); break;
            case "admissiongp": helmet.setAdmissionGp(Boolean.parseBoolean(arg[1])); break;
            default: throw new ProjectException("Unnoun helmet property: " + arg[0]);
        }
    }

    private static void setPantsProp(Pants pants, String[] arg) 
            throws ProjectException {
         switch (arg[0].toLowerCase()) {
            case "manufacturer" : pants.setManufacturer(arg[1]); break;
            case "price" : pants.setPrice(Integer.parseInt(arg[1])); break;
            case "weight": pants.setWeight(Float.parseFloat(arg[1])); break;
            case "size": pants.setSize(arg[1]); break;
            case "gender": pants.setGender(arg[1]); break;
            case "mototype": pants.setMotoType(arg[1]); break;
            case "protectionmaterial": pants.setProtectionMaterial(arg[1]); break;
            case "basematerial": pants.setBaseMaterial(arg[1]); break;
            case "waterproof": pants.setWaterproof(Boolean.parseBoolean(arg[1])); break;
            case "perforation": pants.setPerforation(Boolean.parseBoolean(arg[1])); break;
            case "insulation": pants.setInsulation(Boolean.parseBoolean(arg[1])); break;
            case "hipinsert": pants.setHipInsert(Boolean.parseBoolean(arg[1])); break;
            case "kneeinsert": pants.setKneeInsert(Boolean.parseBoolean(arg[1])); break;
            case "slidermount": pants.setSliderMount(Boolean.parseBoolean(arg[1])); break;
            default: throw new ProjectException("Unnoun pants property: " + arg[0]);
        }
    }
    
    private static void setJacketProp(Jacket jacket, String[] arg) 
            throws ProjectException {
        switch (arg[0].toLowerCase()) {
            case "manufacturer" : jacket.setManufacturer(arg[1]); break;
            case "price" : jacket.setPrice(Integer.parseInt(arg[1])); break;
            case "weight": jacket.setWeight(Float.parseFloat(arg[1])); break;
            case "size": jacket.setSize(arg[1]); break;
            case "gender": jacket.setGender(arg[1]); break;
            case "mototype": jacket.setMotoType(arg[1]); break;
            case "protectionmaterial": jacket.setProtectionMaterial(arg[1]); break;
            case "basematerial": jacket.setBaseMaterial(arg[1]); break;
            case "waterproof": jacket.setWaterproof(Boolean.parseBoolean(arg[1])); break;
            case "perforation": jacket.setPerforation(Boolean.parseBoolean(arg[1])); break;
            case "insulation": jacket.setInsulation(Boolean.parseBoolean(arg[1])); break;
            case "backinsert": jacket.setBackInsert(Boolean.parseBoolean(arg[1])); break;
            case "elbowsinsert": jacket.setElbowsInsert(Boolean.parseBoolean(arg[1])); break;
            case "shouldersinsert": jacket.setShouldersInsert(Boolean.parseBoolean(arg[1])); break;
            default: throw new ProjectException("Unnoun jacket property: " + arg[0]);
        }
    }
       
    private static void setShoesProp(Shoes shoes, String[] arg) throws ProjectException {
        switch (arg[0].toLowerCase()) {
            case "manufacturer" : shoes.setManufacturer(arg[1]); break;
            case "price" : shoes.setPrice(Integer.parseInt(arg[1])); break;
            case "weight": shoes.setWeight(Float.parseFloat(arg[1])); break;
            case "size": shoes.setSize(arg[1]); break;
            case "gender": shoes.setGender(arg[1]); break;
            case "mototype": shoes.setMotoType(arg[1]); break;
            case "protectionmaterial": shoes.setProtectionMaterial(arg[1]); break;
            case "basematerial": shoes.setBaseMaterial(arg[1]); break;               
            case "mounttype": shoes.setMountType(arg[1]); break;           
            default: throw new ProjectException("Unnoun shoes property: " + arg[0]);
        }
    }
    
}
