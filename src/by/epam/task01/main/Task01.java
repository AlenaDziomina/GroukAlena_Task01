/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.main;

import by.epam.task01.ProjectExeptions.ProjectException;
import by.epam.task01.entity.EquippedMotorcyclist;
import by.epam.task01.entity.MotoEquipment;
import static by.epam.task01.logic.EquipSorting.selectByPrice;
import static by.epam.task01.logic.EquipSorting.sortEquip;
import static by.epam.task01.main.HelperMagazCreator.creatingMotoMagazin;
import static by.epam.task01.main.HelperMotoObjectCreator.creatingEquippedMotorcyclist;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/**
 *
 * @author Helena.Grouk
 */
public class Task01 {
    
    static final String LOG_PROPERTIES_FILE = "Log4J.properties";
    public static Logger localLog = Logger.getLogger("localLoger");
    
    public static void main(String[] args) {
        
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
        
        List<MotoEquipment> magaz = creatingMotoMagazin();
        
        try {
            sortEquip(magaz, "weight");
            magaz.stream().forEach((eq) -> {
                System.out.println(eq.toString());
            });
        } catch (ProjectException ex) {
            localLog.error("Sorting equip by weight if fail.");
        }

        EquippedMotorcyclist eqMoto = creatingEquippedMotorcyclist(magaz);  
        System.out.println("SELECTED EQUIPMENT:");
        System.out.println(eqMoto.toString());
        int N = eqMoto.getPrice();
        System.out.println("FINALE PRICE = " + N);
        
        try {
            List<MotoEquipment> sortList = selectByPrice(magaz, 200, 300);
            sortList.stream().forEach((eq) -> {
                System.out.println(eq.toString());
            });
        } catch (ProjectException ex) {
            localLog.error("Sorting equip by price if fail.");
        }
        
    }
    

    
}
