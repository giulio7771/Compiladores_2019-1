package gals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class Semantico implements Constants
{
    Stack<DataType> pilha = new Stack();
    List<String> listaid = new ArrayList<>();
    List<String> codigo = new ArrayList<>();
    String operador = "";
    DataType tipovar = null;
    Map<String,DataType> ts = new HashMap<>();
    
    public List<String> getCodigo(){
        return codigo;
    }
    
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("action "+action);
        switch(action){
            case 1:
                action1();
                break;
            case 2:
                action2();
                break;
            case 3:
                action3();
                break;
            case 4:
                action4();
                break;
            case 5:
                action5(token);
                break;
            case 6:
                action6(token);
                break;
            case 7:
                action7();
                break;
            case 8:
                action8();
                break;
            case 9:
                action9(token);
                break;
            case 10:
                action10();
                break;
            case 11:
                action11();
                break;
            case 12:
                action12();
                break;
            case 13:
                action13();
                break;
            case 14:
                action14();
                break;
            case 15:
                action15();
                break;
            case 16:
                action16();
                break;
            case 17:
                action17();
                break;
            case 30:
                action30(token);
                break;
            case 31:
                action31(token);
                break;
            case 32:
                action32(token);
                break;
            case 33:
                action33(token);
                break;
            case 34:
                action34();
                break;
            case 35:
                action35();
                break;
            default:
                break;
            
        }
    }	
    
    public void action1(){//exceção pendente
        DataType tipo1 = pilha.pop();
        DataType tipo2 = pilha.pop();
        if(tipo1.equals(DataType.float64) || tipo2.equals(DataType.float64)){
            pilha.push(DataType.float64);
        }else{
            pilha.push(DataType.int64);
        }
        codigo.add("add");
    }

    private void action2() {//exceção pendente
       DataType tipo1 = pilha.pop();
       DataType tipo2 = pilha.pop();
       if(tipo1 == DataType.float64 || tipo2 == DataType.int64){
           pilha.push(DataType.float64);
       }else{
           pilha.push(DataType.int64);
       }
       codigo.add("sub");
    }

    private void action3() {//exceção pendente
        DataType tipo1 = pilha.pop();
       DataType tipo2 = pilha.pop();
       if(tipo1 == DataType.float64 || tipo2 == DataType.int64){
           pilha.push(DataType.float64);
       }else{
           pilha.push(DataType.int64);
       }
       codigo.add("mul");
    }

    private void action4() throws SemanticError {
       DataType tipo1 = pilha.pop();
       DataType tipo2 = pilha.pop();
       if(tipo1 == tipo2){
           pilha.push(tipo1);
       }else{
           throw new SemanticError("tipo(s) incompatível(is) em expressão aritmetica");
       }
           
       codigo.add("div");
    }

    private void action5(Token token) {
        pilha.push(DataType.int64);
        codigo.add("ldc.i8 "+token.getLexeme());
        codigo.add("conv.r8");
    }

    private void action6(Token token) {
        pilha.push(DataType.float64);
        codigo.add("ldc.r8 "+token.getLexeme());
    }

    private void action7() throws SemanticError {
        DataType tipo = pilha.pop();
        if(tipo == DataType.float64 || tipo == DataType.int64){
            pilha.push(tipo);
        }else{
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmetica");
        }
    }

    private void action8() throws SemanticError {
        DataType tipo = pilha.pop();
        if(tipo == DataType.float64 || tipo == DataType.int64){
            pilha.push(tipo);
        }else{
            throw new SemanticError("tipo(s) incompatível(is) em expressão aritmetica");
        }
        codigo.add("ldc.i8 -1");
        codigo.add("mul");
    }

    private void action9(Token token) {
        operador = token.getLexeme();
    }

    private void action10() throws SemanticError {
        DataType tipo1 = pilha.pop();
        DataType tipo2 = pilha.pop();
        if(tipo1 == tipo2){
            pilha.push(DataType.bool);
        }else{
            throw new SemanticError("tipos incompatíveis em expressão relacional");
        }
        switch(operador){
            case ">": codigo.add("cgt");break;
            case "<": codigo.add("clt");break;
            case "=": codigo.add("ceq");break;
        }
        
    }

    private void action11() {
        pilha.push(DataType.bool);
        codigo.add("ldc.i4.1");
    }

    private void action12() {
        pilha.push(DataType.bool);
        codigo.add("ldc.i4.0");
    }

    private void action13() throws SemanticError {
        DataType tipo = pilha.pop();
        if(tipo == DataType.bool){
            pilha.push(DataType.bool);
        }else{
            throw new SemanticError("Tipo(s) incompatível(is) em espressão lógica");
        }
        codigo.add("ldc.i4.1");
        codigo.add("xor");
    }

    private void action14() {
        DataType tipo = pilha.pop();
        if(tipo == DataType.int64){
                codigo.add("conv.i8");
        }
        codigo.add("\"call void [mscorlib]System.Console::Write("+tipo.toString()+")\"\n");
    }

    private void action15() {
        codigo.add(".assembly extern mscorlib {}\n"
                + ".assembly _codigo_objeto{}\n"
                + ".module   _codigo_objeto.exe\n\n"
                + ".class public _UNICA{\n");
    }

    private void action16() {
        codigo.add(".method static public void _principal() {\n"
                + " .entrypoint\n");
    }
    
    private void action17() {
        codigo.add("ret\n"
                + "}\n"
                + "}");
    }

    private void action30(Token token) {
        switch(token.getLexeme()){
            case "int": tipovar = DataType.int64;
            case "real": tipovar = DataType.float64;
        }
    }

    private void action31(Token token) throws SemanticError {//TODO
        for (String id : listaid) {
            if(ts.containsKey(id)){
                throw new SemanticError(token.getLexeme()+": identificador já declarado");
            }
            ts.put(id, tipovar);
            codigo.add(".locals("+tipovar.toString()+" "+id+")");
        }
        listaid.clear();
    }

    private void action32(Token token) {
        listaid.add(token.getLexeme());
    }

    private void action33(Token token) throws SemanticError {
        String id = token.getLexeme();
        if(!ts.containsKey(id)){
            throw new SemanticError("");
        }
        DataType tipoid = ts.get(id);
        pilha.push(tipoid);
        codigo.add("ldloc "+id);
        if(tipoid == DataType.int64){
            codigo.add("conv.r8");
        }
    }

    private void action34() throws SemanticError {
        String id = listaid.get(0);listaid.remove(id);
        if(!ts.containsKey(id)){
            throw new SemanticError("");
        }
        DataType tipoid = ts.get(id);
        DataType tipoexp = pilha.pop();
        if(tipoid != tipoexp){
            throw new SemanticError("");
        }
        if(tipoid == DataType.int64){
            codigo.add("conv.i8");
        }
        codigo.add("stloc "+id);
    }

    private void action35() throws SemanticError {
        for (String id : listaid) {
            if(!ts.containsKey(id)){
                throw new SemanticError("");
            }
            DataType tipoid = ts.get(id);
            String classe = "";
            switch(tipoid){
                case int64: classe = "Int64";
                case float64: classe = "Double";
            }
            codigo.add("call string [mscorlib]System.Console::ReadLine()");
            codigo.add("call "+tipoid.toString()+" [mscorlib]System."+classe+"::Parse(string)");
            codigo.add("stloc "+id);
        }
        listaid.clear();
    }

}
