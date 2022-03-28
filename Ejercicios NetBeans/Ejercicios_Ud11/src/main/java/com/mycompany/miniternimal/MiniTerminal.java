/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniternimal;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class MiniTerminal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            MiniFileManager mfm=new MiniFileManager("C:\\Users\\DAW\\Desktop\\DatosParaEjerciciosFicheros-3");
            Scanner sc= new Scanner(System.in);            
            String comando="";
            do {
                //TODO El .print no funciona y hay que acveriguar por que .print("\n C:\\Users\\Guillermo>");
                try{
                    System.out.println("\nC:\\Users\\Guillermo>");
                    comando=sc.nextLine();
                    String[] comandos=comando.split(" ");
                    switch(comandos[0]){
                        case "pwd":
                            System.out.println(mfm.pwd());
                        break;

                        case "cd":
                            if (comandos.length<=1) {
                               mfm.cd(""); 
                            }else mfm.cd(comandos[1]);
                            //se podria hacer una expresion regular usando la C: para identificar si nos pasan una ruta absoluta o relativa y en caso de que fuese relativa limitar la busqueda
                            // usando la lista de ficheros generada con el comando ls

                        break;

                        case "ls":
                            File[] files=mfm.ls();
                            for (File f:files) {
                                System.out.println(f.getName());
                            }
                        break;

                        case "ll":
                            mfm.ll();
                        break;

                        case "mkdir":
                            mfm.mkdir(comandos[1]);
                        break;

                        case "rm":
                            mfm.rm(comandos[1]);
                        break; 

                        case "mv":
                            mfm.mv(comandos[1], comandos[2]);
                        break; 

                        case "help":
                        	System.out.println(mfm.help());
                            
                        break;

                        default:
                            if (!comandos[0].equals("exit"))System.out.println("Comando no reconocido."); 
                        break;                
                    }                
                }catch(MiniFileManagerException e){
                    e.getMessage();
                    e.printStackTrace();
                }
                     
            } while (!comando.toLowerCase().equals("exit"));        
        }catch(MiniFileManagerException e){
            e.getMessage();
            e.printStackTrace();
        }

        
    }    
}