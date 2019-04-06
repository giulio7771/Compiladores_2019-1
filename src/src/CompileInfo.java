/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author diogo
 */
import java.util.List;
import java.util.Map;

public class CompileInfo {
    public int kind;
    public int line;
    public int ch;
    public String txt;
    public String includeFile;

    public CompileInfo(final int kind, final int line, final int ch, final String txt, final String includeFile) {
        this.kind = kind;
        this.line = line;
        this.ch = ch;
        this.txt = txt;
        this.includeFile = includeFile;
    }
    
    public interface Compilator {
        Map<Integer, List<CompileInfo>> buildProgram(final String codeSrc);
    } 
}