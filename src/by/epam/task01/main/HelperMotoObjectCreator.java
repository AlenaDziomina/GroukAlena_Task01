/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.main;

import by.epam.task01.ProjectExeptions.ProjectException;
import by.epam.task01.entity.EquippedMotorcyclist;
import by.epam.task01.entity.MotoEquipment;
import static by.epam.task01.logic.EquippedMotorcyclistFactory.MotoObjectCreator;
import static by.epam.task01.main.Task01.localLog;
import java.util.List;

/**
 *
 * @author Helena.Grouk
 */
public class HelperMotoObjectCreator {
    
    public static EquippedMotorcyclist creatingEquippedMotorcyclist(
            List<MotoEquipment> magaz) {
        
        String[][] args = {{"type", "size", "gender", "motoType"},
                            {"Helmet", "3XS", "CH", "CROSS"},
                            {"Jacket", "3XS", "CH", "ENDURO"},
                            {"Pants", "XXL", "M", "SPORT"},
                            {"Shoes", "35", "CH", "ENDURO"}};
        
        EquippedMotorcyclist eqMoto;
        try {
            eqMoto = MotoObjectCreator(magaz, args);  
            return eqMoto;
        } catch (ProjectException ex) {
            localLog.info("HelperMotoObjectCreator: can't create EquippedMotorcyclist.");
        }
        return null;
    }
    
    
}
