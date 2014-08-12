/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.ProjectExeptions;

import static by.epam.task01.main.Task01.localLog;

/**
 *
 * @author Helena.Grouk
 */
public class ProjectException extends Exception{
    
    public ProjectException(String msg){
        localLog.error("InitializationException: " + msg);
    }
}
