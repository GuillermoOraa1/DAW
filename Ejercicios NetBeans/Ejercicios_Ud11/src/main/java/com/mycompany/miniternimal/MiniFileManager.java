/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniternimal;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author DAW
 */
public class MiniFileManager {
    private File file;
    
    public MiniFileManager(String ruta) throws MiniFileManagerException{
        File archivo= new File(ruta);
        if (archivo.exists())this.file=new File(ruta);
        else throw new MiniFileManagerException("La ruta indicada no existe");
        
    }
    
    public String pwd(){
        return this.file.getAbsolutePath();
    }
    
    public void cd(String ruta) throws MiniFileManagerException{
        if (ruta.equals("")){ 
            System.out.println(this.file.getAbsolutePath());;
        }else if (ruta.equals("..")){
            this.file=this.file.getParentFile();
        }else{
            File fichero=new File(ruta);
            if (fichero.exists()) {
               this.file= fichero; 
            }else{
                throw new MiniFileManagerException("La ruta indicada no existe");
            }        
        }     
    }
    
    public File[] ls(){
    	
    	File[]lista=this.file.listFiles();
    	
        Arrays.sort(lista,new Comparator<File>() {
        	
            public int compare(File f1, File f2) {
                if (f1.isDirectory() && f2.isFile())  return -1;
                   
                if (f2.isDirectory() && f1.isFile())  return 1; 
                     
                return f1.getName().compareTo(f2.getName());

            }
        });
        return lista;
    }
    
    public void ll(){
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        File[] files=this.ls();
        for (File f:files) {
            System.out.println("Nombre: "+f.getName()+" Tamano: "+f.length()+" bytes Fecha ultima modificacion: "+sdf.format(f.lastModified()));
        }
    }
    
    public void mkdir(String nombreDirectorio) throws MiniFileManagerException{
        File directorio= new File(this.file.getAbsolutePath().concat("\\"+nombreDirectorio));
        if (!directorio.exists()) {
            directorio.mkdir();
        }else{
            throw new MiniFileManagerException("El directorio ya existe");
        }

    }
    
    public void rm (String nombreArchivo)throws MiniFileManagerException{
        File ficherooriginal= new File(this.file.getAbsolutePath().concat("\\"+nombreArchivo));
        //verifico que el archivo existe y que tengo permisos de lectura, escritura y ejecucion sobre dicho archivo
        if (ficherooriginal.exists()&& ficherooriginal.canWrite()&& ficherooriginal.canExecute()) {
            if(ficherooriginal.isFile()) ficherooriginal.delete();
            if(ficherooriginal.isDirectory()){
                File [] contenido= ficherooriginal.listFiles();
                for (File fichero :contenido) {
                    if (fichero.isFile()) fichero.delete();   
                }
                if (ficherooriginal.listFiles().length!=0)System.out.println("No se han eliminado los subdirectorios");
                else ficherooriginal.delete();
            }          
        }
        else throw new MiniFileManagerException("No se ha encontrado el archivo solicitado.");      
    }
    
    public void mv(String rutaOrigenArchivo, String rutaDestinoArchivo)throws MiniFileManagerException{
        File ficheroOriginal= new File(this.file.getAbsolutePath().concat("\\"+rutaOrigenArchivo));
        File ficheroDestino= new File(this.file.getAbsolutePath().concat("\\"+rutaDestinoArchivo));
        //aqui muevo el fichero a la ruta de destino en caso de que quiera renombrarlo. Por eso pongo como condicion que el ficheroDestino no exista
        if (!ficheroDestino.exists() && ficheroOriginal.exists() && ficheroOriginal.canWrite() && ficheroOriginal.canExecute()) {
            if (ficheroOriginal.renameTo(ficheroDestino)) System.out.println("El archivo ha sido movido a: \n"+ficheroDestino.getPath());
            else throw new MiniFileManagerException("No se ha podido realizar la operacion.");  
        //si el fichero de origen no existe o no tengo los permisos para usarlo, me salta esta excepcion    
        }else if(!ficheroOriginal.exists()||!ficheroOriginal.canWrite()||!ficheroOriginal.canExecute()) {
        	throw new MiniFileManagerException("No se ha podido realizar la operacion. El fichero de origen no existe o no tiene los permisos necesarios.");   
        }else{
        	//aqui muevo el fichero a otra ruta pero sin renombrarlo. por eso pongo como condicion que el fichero destino ya exista y verifico que tenga todos los permisos para trabajar sobre ambos ficheros
            if (ficheroOriginal.exists() && ficheroOriginal.canWrite() && ficheroOriginal.canExecute() && ficheroDestino.exists() && ficheroDestino.canWrite() && ficheroDestino.canExecute()) {
                ficheroDestino= new File(this.file.getAbsolutePath().concat("\\"+rutaDestinoArchivo+"\\"+ficheroOriginal.getName())); // con esto mantengo el nombre original del fichero
                if (ficheroOriginal.renameTo(ficheroDestino)) System.out.println("El archivo ha sido movido a: \n"+ficheroDestino.getPath());
                else throw new MiniFileManagerException("No se ha podido realizar la operacion.No tiene los permisos necesarios.");     
            }
        }
    }
    
    public String help (){            
        return "-> pwd : Muestra cual es la carpeta actual.\n\n"+
               "-> cd <DIR> : Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.\n\n"+
               "-> ls : Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego\n" +
               "   archivos, ambos ordenados alfabéticamente).\n\n"+
               "-> ll : Como ls pero muestra también el tamaño y la fecha de la última modificación de los archivos.\n\n"+
               "-> mkdir <DIR> : Crea el directorio ‘DIR’ en la carpeta actual.\n\n"+
               "-> rm <FILE> : Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si\n" +
               "   tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.\n\n"+
               "-> mv <FILE1> <FILE2> : Mueve o renombra ‘FILE1’ a ‘FILE2’.\n\n"+
               "-> help : Muestra una breve ayuda con los comandos disponibles.\n\n"+
               "-> exit : Cierra la Shell.";
    }
    
    /*
    public void help (String comando){
        switch(comando){
            case "pwd":
                System.out.println("pwd : Muestra cual es la carpeta actual.");
            break;
                
            case "cd":
                System.out.println("cd <DIR> : Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.");
            break;
                
            case "ls":
                System.out.println("ls : Muestra la lista de directorios y archivos de la carpeta actual (primero "
                        + "directorios, luego\n" 
                        +"archivos, ambos ordenados alfabéticamente).\n");
            break;
                
            case "ll":
                System.out.println("ll : Como ls pero muestra también el tamaño y la fecha de la última modificación de los archivos.");
            break;
                
            case "mkdir":
                System.out.println("mkdir <DIR> : Crea el directorio ‘DIR’ en la carpeta actual.");
            break;
                
            case "rm":
                System.out.println("rm <FILE> : Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si\n" +
               "tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.");
            break; 
                
            case "mv":
                System.out.println("mv <FILE1> <FILE2> : Mueve o renombra ‘FILE1’ a ‘FILE2’.");
            break; 
                
            case "help":
                System.out.println("help : Muestra una breve ayuda con los comandos disponibles.");
            break;
                
            default:
                System.out.println("Comando no reconocido.");
            break; 
        }
}*/       

}