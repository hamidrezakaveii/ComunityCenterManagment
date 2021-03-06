/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import control.AppCtr;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MemberList;
import tools.CreateMember;
/**
 *
 * @author 1795928
 */
public class FileManagement {
    
        public static void writeFile(String fichierOutput, String data, boolean statut) {
        File file = new File(fichierOutput);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(file, true);  //Pass true as a second argument to FileWriter to turn on "append" mode
            bw = new BufferedWriter(fw);
            bw.newLine();
            fw.write(data);
            bw.flush(); 
             

        } catch (IOException ex) {
            Logger.getLogger(FileManagement.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if (bw != null) {
                        bw.close();
                    }

                } catch (IOException ex) {
                    Logger.getLogger(FileManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void readFile(String fileInput, boolean statut, ArrayList<String> list) {

        File file = new File(fileInput);
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                //list.addMember(Utility.splitLine(line));
                //list.add(Utility.splitLine(line));
                list.add(line);

            }
        } catch (IOException ex) {
            Logger.getLogger(AppCtr.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(AppCtr.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (br != null) {
                    br.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(FileManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
//Method used to update the file list of files acoording to files contained inside the folder of confirmations    
    public static void updateCFile() {
        File folder = new File("confirmations\\");
        File oldFile = new File("confirmedFile.txt");
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> fileInfo = new ArrayList<>();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String fullFileName = listOfFiles[i].getName();
                String[] parts = fullFileName.split("\\.");
                fileInfo.add(parts[0]);
            }
        }
        oldFile.delete();
        for (String s : fileInfo) {
            FileManagement.writeFile("confirmedFile.txt", s, true);
        }
    }
    
}
