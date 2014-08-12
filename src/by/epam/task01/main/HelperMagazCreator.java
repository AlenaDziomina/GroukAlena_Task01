/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.main;

import by.epam.task01.ProjectExeptions.ProjectException;
import by.epam.task01.entity.MotoEquipment;
import by.epam.task01.logic.EquipFactory;
import by.epam.task01.logic.EquipFactory.eqType;
import static by.epam.task01.logic.EquipFactory.eqType.*;
import static by.epam.task01.main.Task01.localLog;
import java.util.ArrayList;

/**
 *
 * @author Helena.Grouk
 */
public abstract class HelperMagazCreator {
    
    public static final ArrayList<MotoEquipment> creatingMotoMagazin(){
        
        ArrayList<MotoEquipment> magaz = new ArrayList();
        int id = 0;

        String[][] str1 = {{"price", "300", "int"},
                            {"weight", "1.210", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "Carbon", "String"},
                            {"insertMaterial", "HydraDry", "String"},
                            {"vents", "7", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "COMMON", "String"},
                            {"size", "XL", "String"},
                            {"gender", "Y", "String"}
        };
        addEquip(magaz, HELMET, ++id, "520 CARBON", str1);
        
        String[][] str2 = {{"price", "170", "int"},
                            {"weight", "1.450", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "Fiberglass", "String"},
                            {"insertMaterial", "HydraDry", "String"},
                            {"vents", "5", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "COMMON", "String"},
                            {"size", "XL", "String"},
                            {"gender", "Y", "String"}
        };
        addEquip(magaz, HELMET, ++id, "524 FIBERGLASS", str2);
       
        String[][] str3 = {{"price", "160", "int"},
                            {"weight", "1.450", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "7", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "COMMON", "String"},
                            {"size", "XL", "String"},
                            {"gender", "Y", "String"}
        };
        addEquip(magaz, HELMET, ++id, "482 COOL", str3);
       
        String[][] str4 = {{"price", "260", "int"},
                            {"weight", "1.200", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "Carbon", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "7", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "true", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"gender", "Y", "String"}
        };
        addEquip(magaz, HELMET, ++id, "550 FULL CARBON", str4);
        
        String[][] str5 = {{"price", "90", "int"},
                            {"weight", "1.350", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "4", "int"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "true", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "TURIST", "String"},
                            {"size", "L", "String"},
                            {"gender", "W", "String"}
        };        
        addEquip(magaz, HELMET, ++id, "300 COMFORT", str5);
        
        String[][] str6 = {{"price", "360", "int"},
                            {"weight", "1.370", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "MODULAR", "String"},
                            {"shellMaterial", "Carbon", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "5", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "true", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "TURIST", "String"},
                            {"size", "L", "String"},
                            {"gender", "Y", "String"}
        };       
        addEquip(magaz, HELMET, ++id, "690 CARBON", str6);
       
        String[][] str7 = {{"price", "150", "int"},
                            {"weight", "1.600", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "ENDURO", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "7", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "L", "String"},
                            {"gender", "Y", "String"}
        };
        addEquip(magaz, HELMET, ++id, "771 STRASS", str7);
        
        String[][] str8 = {{"price", "150", "int"},
                            {"weight", "0.950", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "JET", "String"},
                            {"shellMaterial", "Fiberglass", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "COMMON", "String"},
                            {"size", "XS", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, HELMET, ++id, "170 DECOR", str8);
        
        String[][] str9 = {{"price", "230", "int"},
                            {"weight", "0.990", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "CROSS", "String"},
                            {"shellMaterial", "Carbon", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "2", "int"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "true", "boolean"},
                            {"motoType", "CROSS", "String"},
                            {"size", "L", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, HELMET, ++id, "729 CollMax", str9);
        
        String[][] str10 = {{"price", "90", "int"},
                            {"weight", "1.050", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "CROSS", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "2", "int"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "CROSS", "String"},
                            {"size", "3XS", "String"},
                            {"gender", "CH", "String"}
        };
        addEquip(magaz, HELMET, ++id, "710 Jr", str10);
        
        String[][] str11 = {{"price", "80", "int"},
                            {"weight", "1.250", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "4", "int"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "TURIST", "String"},
                            {"size", "3XS", "String"},
                            {"gender", "CH", "String"}
        };
        addEquip(magaz, HELMET, ++id, "370 Jr", str11);
       
        String[][] str12 = {{"price", "60", "int"},
                            {"weight", "0.850", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"helmetType", "JET", "String"},
                            {"shellMaterial", "Fiberglass", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "TURIST", "String"},
                            {"size", "3XS", "String"},
                            {"gender", "CH", "String"}
        };
        addEquip(magaz, HELMET, ++id, "Classic Jr", str12);
        
        String[][] str13 = {{"price", "400", "int"},
                            {"weight", "4.360", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, JACKET, ++id, "JARAMA", str13);
        
        String[][] str14 = {{"price", "330", "int"},
                            {"weight", "4.120", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, JACKET, ++id, "ARAGON", str14);
        
        String[][] str15 = {{"price", "570", "int"},
                            {"weight", "4.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, JACKET, ++id, "RAID", str15);
        
        String[][] str16 = {{"price", "400", "int"},
                            {"weight", "3.800", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "M", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, JACKET, ++id, "JEREZ", str16);
       
        String[][] str17 = {{"price", "440", "int"},
                            {"weight", "4.800", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "XXL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, JACKET, ++id, "NOGARO", str17);
        
        String[][] str18 = {{"price", "270", "int"},
                            {"weight", "2.700", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "false", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "XXL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, JACKET, ++id, "ROADRUNNER", str18);
        
        String[][] str19 = {{"price", "230", "int"},
                            {"weight", "1.900", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "false", "boolean"},
                            {"elbowsInsert", "false", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "L", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, JACKET, ++id, "LARA", str19);
        
        String[][] str20 = {{"price", "200", "int"},
                            {"weight", "2.200", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Humax Z-Liner", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "L", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, JACKET, ++id, "VALENCIA", str20);
                
        String[][] str21 = {{"price", "250", "int"},
                            {"weight", "2.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "XXL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, JACKET, ++id, "OPEN ROAD EVO", str20);
        
        String[][] str22 = {{"price", "90", "int"},
                            {"weight", "1.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "3XS", "String"},
                            {"gender", "CH", "String"}
        };
        addEquip(magaz, JACKET, ++id, "YONG RIDERS", str22);
        
        String[][] str23 = {{"price", "300", "int"},
                            {"weight", "2.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "true", "boolean"},
                            {"baseMaterial", "Humax Z-Liner", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XXL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, PANTS, ++id, "JARAMA", str23);
        
        String[][] str24 = {{"price", "270", "int"},
                            {"weight", "2.400", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "true", "boolean"},
                            {"baseMaterial", "Humax Z-Liner", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XXL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, PANTS, ++id, "ARAGON", str24);
        
        String[][] str25 = {{"price", "570", "int"},
                            {"weight", "3.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, PANTS, ++id, "RAID", str25);
        
        String[][] str26 = {{"price", "400", "int"},
                            {"weight", "3.200", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "M", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, PANTS, ++id, "JEREZ", str26);
        
        String[][] str27 = {{"price", "350", "int"},
                            {"weight", "2.800", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "false", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "XXL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, PANTS, ++id, "NOGARO", str27);
       
        String[][] str28 = {{"price", "270", "int"},
                            {"weight", "1.700", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "false", "boolean"},
                            {"kneeInsert", "false", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Rindleder 1.2", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "XXL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, PANTS, ++id, "VEGAS", str28);
        
        String[][] str29 = {{"price", "230", "int"},
                            {"weight", "1.100", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "false", "boolean"},
                            {"kneeInsert", "false", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Rindleder 1.0", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "L", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, PANTS, ++id, "LARA", str29);
        
        String[][] str30 = {{"price", "180", "int"},
                            {"weight", "1.200", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "false", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Humax Z-Liner", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "L", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, PANTS, ++id, "VALENCIA", str30);
        
        String[][] str31 = {{"price", "170", "int"},
                            {"weight", "1.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "XXL", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, PANTS, ++id, "OPEN ROAD EVO", str31);
       
        String[][] str32 = {{"price", "80", "int"},
                            {"weight", "0.900", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "3XS", "String"},
                            {"gender", "CH", "String"}
        };
        addEquip(magaz, PANTS, ++id, "YONG RIDERS", str32);
        
        String[][] str33 = {{"price", "170", "int"},
                            {"weight", "0.900", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "Hipora zip", "String"},
                            {"protectionMaterial", "Schleifer aus Metall", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "42", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, SHOES, ++id, "SBX Wasserdicht", str33);
       
        String[][] str34 = {{"price", "160", "int"},
                            {"weight", "0.850", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "Hipora zip", "String"},
                            {"protectionMaterial", "Schleifer aus Metall", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "41", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, SHOES, ++id, "GP-EVO Wasserdicht", str34);
        
        String[][] str35 = {{"price", "140", "int"},
                            {"weight", "0.800", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "Zip", "String"},
                            {"protectionMaterial", "Schleifer", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "43", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, SHOES, ++id, "TOURSPORT", str35);
        
        String[][] str36 = {{"price", "150", "int"},
                            {"weight", "0.750", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "Hipora", "String"},
                            {"protectionMaterial", "Schleifer", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "44", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, SHOES, ++id, "B40 ENDURO", str36);
        
        String[][] str37 = {{"price", "150", "int"},
                            {"weight", "0.550", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Textil-mix", "String"},
                            {"mountType", "Shoelace", "String"},
                            {"protectionMaterial", "Schleifer", "String"},
                            {"motoType", "STUNT", "String"},
                            {"size", "44", "String"},
                            {"gender", "M", "String"}
        };
        addEquip(magaz, SHOES, ++id, "B58", str37);
        
        String[][] str38 = {{"price", "530", "int"},
                            {"weight", "3.850", "float"},
                            {"manufacturer", "GAERNE", "String"},
                            {"baseMaterial", "Leader", "String"},
                            {"mountType", "clasp", "String"},
                            {"protectionMaterial", "Schleifer metal", "String"},
                            {"motoType", "CROSS", "String"},
                            {"size", "38", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, SHOES, ++id, "GAERNE SG12", str38);
        
        String[][] str39 = {{"price", "180", "int"},
                            {"weight", "1.850", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leader", "String"},
                            {"mountType", "clasp", "String"},
                            {"protectionMaterial", "Schleifer metal", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "35", "String"},
                            {"gender", "CH", "String"}
        };
        addEquip(magaz, SHOES, ++id, "JUNIOR SGJ", str39);
        
        String[][] str40 = {{"price", "300", "int"},
                            {"weight", "2.400", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "clasp", "String"},
                            {"protectionMaterial", "Schleifer", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "39", "String"},
                            {"gender", "W", "String"}
        };
        addEquip(magaz, SHOES, ++id, "GAERNE GP1", str40);
        
        return magaz;
        
    }
    
    
    private static void addEquip(ArrayList<MotoEquipment> magaz, eqType type, int id,
            String name, String[][] fields) {
        
        MotoEquipment obj;
        try {
            obj = EquipFactory.equipCreator(type, id, name, fields);
            if (obj != null) {
                magaz.add(obj);
            }
        } catch (ProjectException ex) {
            localLog.error("Creating equip failed.");
        }
        
    }

    
    
}
