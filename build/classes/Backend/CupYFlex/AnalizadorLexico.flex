
package Backend.CupYFlex;
import java_cup.runtime.* ;
import java_cup.runtime.Symbol;
import Backend.EditorCompilador.sym;
import java.util.ArrayList;

/*--------------2 Declaraciones ------------*/

%% 

%public 
%class AnalizadorLexico 
%cupsym sym
%cup 
%char
%column
%full
%cupdebug
%line 
%unicode


%{
    
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }

    private Symbol symbol(int type, Object value, int fila, int columna) {
        return new Symbol(type, yyline, yycolumn, value);
    }
    ArrayList<String> nombrePlanetas = new ArrayList();
%}

D = [0-9]
//LetraS = [A-Za-z|Ñ|ñ]
simbol= [_@#$]
ID   =  [A-Z|a-z|0-9|Ñ|ñ|_|simbol]+
D = [0-9]
codJava= "%%"~"%%"
//enBlanco = [ \t\n| ]+
 //SaltoDeLinea = \r|\r\n
Comilla = [\"]
Barra = "\|"
%state COMENT_MULTI
%state COMENT_SIMPLE 
%state CODIGOJ

%%


<YYINITIAL> "/*"                {yybegin(COMENT_MULTI);}
<COMENT_MULTI> "*/"        {yybegin(YYINITIAL);}
<COMENT_MULTI>  .          {}
<COMENT_MULTI> [\r|\r\n\f] {}


<YYINITIAL> "//"          {yybegin(CODIGOJ);}
<CODIGOJ>[^\n]            {}
<CODIGOJ> "\n"            {yybegin(YYINITIAL);}

<YYINITIAL> "{"                {yybegin(COMENT_MULTI);}
<COMENT_MULTI> "}"        {yybegin(YYINITIAL); return symbol(sym.CODIGOJ , yytext(), yyline, yycolumn);}
<COMENT_MULTI>  .          {}
<COMENT_MULTI> [\r|\r\n\f] {}


//simbolos
<YYINITIAL> {
    ({D})       {System.out.println( "D..." +  yytext());return symbol(sym.DIGITO , yytext(), yyline, yycolumn);}

    "."         {System.out.println( "PUNTO..." +  yytext());return symbol(sym.PUNTO , yytext(), yyline, yycolumn);}

    ("NOMBRE:"|"nombre:")         {System.out.println( "nombre..." +  yytext());
                                        return symbol(sym.NOMBREID , yytext(), yyline, yycolumn);}
    ("VERSION:"|"version:")        {System.out.println( "version..." +  yytext());
                                        return symbol(sym.VERSIONID , yytext(), yyline, yycolumn);}

    ("AUTOR:"|"autor:")":"          {System.out.println( "autor..." +  yytext());
                                        return symbol(sym.AUTORID , yytext(), yyline, yycolumn);}

    ("LANZAMIENTO"|"lanzamiento")":"    {System.out.println( "lanzamiento..." +  yytext());
                                        return symbol(sym.LANZAMIENTOID , yytext(), yyline, yycolumn);}
    
    ("extension")":"                {System.out.println( "extension..." +  yytext());
                                        return symbol(sym.EXTENSIONID , yytext(), yyline, yycolumn);}

    ("terminal")                    {System.out.println( "TERMINALID..." +  yytext());
                                        return symbol(sym.TERMINALID , yytext(), yyline, yycolumn);}
    ("no terminal")                 {System.out.println( "NOTERMINALID..." +  yytext());
                                        return symbol(sym.NOTERMINALID , yytext(), yyline, yycolumn);}  
                                    

    {codJava}                       {System.out.println( "codigo java..." +  yytext());return symbol(sym.JAVACODE , yytext(), yyline, yycolumn);}
    {ID}                            {System.out.println( "id..." +  yytext());return symbol(sym.ID , yytext(), yyline, yycolumn);} 
    
    ":"                             {System.out.println( "Dos puntos..." +  yytext());return symbol(sym.DOSPUNTOS , yytext(), yyline, yycolumn);} 
    ";"                             {System.out.println( "punto y coma..." +  yytext());return symbol(sym.PUNTOYCOMA , yytext(), yyline, yycolumn);} 
    "%"                             {System.out.println( "porcentaje..." +  yytext());return symbol(sym.PORCIENTO , yytext(), yyline, yycolumn);} 
    "="                             {System.out.println( "igual..." +  yytext());return symbol(sym.IGUAL , yytext(), yyline, yycolumn);} 
    ("{")                           {System.out.println( "llaveAbre..." +  yytext()); return symbol(sym.LLAVEABRE , yytext(), yyline, yycolumn);} 
    ("}")                           {System.out.println( "llaveCierra..." +  yytext()); return symbol(sym.LLAVECIERRA , yytext(), yyline, yycolumn);}   
    //"[a-z]"                       
    "]"                             {System.out.println( "corAbre... " +  yytext());return symbol(sym.CORCHETECIERRA, yytext(), yyline, yycolumn);}
    "["                             {System.out.println( "corCierra...."+ yytext() ); return symbol(sym.CORCHETEABRE, yytext(), yyline, yycolumn);}
    "("                             {System.out.println( "parAbre...."+ yytext() ); return symbol(sym.PARABRE, yytext(), yyline, yycolumn);}
    ")"                             {System.out.println( "parCierra...."+ yytext() ); return symbol(sym.PARCIERRA, yytext(), yyline, yycolumn);}
   // "&"                           {System.out.println( "simAND...."+ yytext() ); return symbol(sym.SIM_AND, yytext(), yyline, yycolumn);}                                
    "*"                             {System.out.println( "asterisco...."+ yytext() ); return symbol(sym.ASTERISCO, yytext(), yyline, yycolumn);}  
    "?"                             {System.out.println( "SymInterrogacionC...."+ yytext() ); return symbol(sym.INTERROGACIONC, yytext(), yyline, yycolumn);}
    ","                             {System.out.println( "coma...."+ yytext() ); return symbol(sym.COMA, yytext(), yyline, yycolumn);}
    "Barra"                         {System.out.println( "barraO...."+ yytext() ); return symbol(sym.BARRAOvg, yytext(), yyline, yycolumn);}
    "-"                             {System.out.println( "GUION...."+ yytext() ); return symbol(sym.GUION, yytext(), yyline, yycolumn);}
    "\\n"                           {System.out.println( "SALTOLINEA...."+ yytext() ); return symbol(sym.SALTOLINEA, yytext(), yyline, yycolumn);}
    "\\t"                           {System.out.println( "TAB...."+ yytext() ); return symbol(sym.TABULADOR, yytext(), yyline, yycolumn);}
    "\\b"                           {System.out.println( "espacio en balnco...."+ yytext() ); return symbol(sym.ESPACIOBLANCO, yytext(), yyline, yycolumn);}
    "+"                             {System.out.println( "SIM MAS...."+ yytext() ); return symbol(sym.SIMMAS, yytext(), yyline, yycolumn);}
    {Comilla}                       {System.out.println( "comilla...."+ yytext() ); return symbol(sym.COMILLA, yytext(), yyline, yycolumn);}
    .                               {System.out.println( "Caracter no reconocido: "+ yytext());}
}