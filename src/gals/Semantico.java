package gals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Semantico implements Constants
{
    Stack<DataType> pilha = new Stack();
    List<String> ids = new ArrayList<>();
    List<String> codigo = new ArrayList<>();
    String operador = "";
    
    public void executeAction(int action, Token token)	throws SemanticError
    {
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
}
