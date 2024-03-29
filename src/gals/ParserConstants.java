package gals;

public interface ParserConstants {

    int START_SYMBOL = 49;

    int FIRST_NON_TERMINAL = 49;
    int FIRST_SEMANTIC_ACTION = 94;

    int[][] PARSER_TABLE
            = {
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 5, 6, -1, -1, 4, -1, -1, -1, 3, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, 8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 10, 10, -1, -1, 10, -1, -1, -1, 10, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 11, 11, -1, -1, 11, -1, -1, -1, 11, -1, -1, -1, -1, -1, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 14, 14, -1, -1, 14, -1, -1, -1, 14, -1, -1, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 17, 18, -1, -1, 16, -1, -1, -1, 15, -1, -1, -1, -1, -1, 19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 25, -1, -1, -1, -1, -1, -1, 25, 25, -1, -1, 25, -1, -1, -1, 25, -1, -1, -1, -1, 25, 25, -1, -1, -1, 25, -1, 25, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, -1},
                {-1, 26, -1, -1, -1, -1, -1, -1, 27, 27, -1, -1, 27, -1, -1, -1, 27, -1, -1, -1, -1, 26, 27, -1, -1, -1, 26, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 28, 28, -1, -1, 28, -1, -1, -1, 28, -1, -1, -1, -1, -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, 31, 31, -1, -1, 31, -1, -1, -1, 31, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, 32, -1, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1},
                {-1, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, -1, 37, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 39, -1},
                {-1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, 47, 48, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 51, 51, 51, 51, 51, -1, -1, -1, -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, 51, -1, -1, -1, 51, -1, -1, -1, -1, 51, -1, -1, -1, -1, -1, -1, -1, 51, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 57, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, -1},
                {-1, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, 59, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, -1, -1, 59, 59, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, 65, -1, -1, -1, -1, -1, -1, -1, 66, -1, -1, -1, 64, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, -1, -1, 63, 63, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 67, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, 71, 72, 73, 74, 75, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 76, 76, 76, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 76, -1, -1, -1, -1, -1, -1, -1, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 80, 80, 80, 80, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 80, -1, -1, -1, -1, -1, -1, -1, 80, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 84, 85, 86, 88, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 89, -1, -1, -1, -1, -1, -1, -1, 90, 91, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, 22, 21, 21, -1, -1, -1, -1, -1, -1},
                {-1, 29, -1, -1, -1, -1, -1, -1, 30, 30, -1, -1, 30, -1, -1, -1, 30, -1, -1, -1, -1, 29, 30, -1, -1, -1, 29, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1},
                {-1, 34, -1, -1, -1, -1, -1, -1, -1, -1, 33, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, 34, -1, 34, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, 53, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, -1, -1, -1, -1, -1, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, 60, 60, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, 68, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, -1, -1, -1, -1, -1, -1, -1, -1, 68, 69, 69, 69, 69, 69, 69, -1, -1, -1, 68, 68, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, 77, 77, 77, 77, 77, 77, 77, 78, 79, -1, 77, 77, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, 81, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 81, -1, -1, -1, -1, -1, -1, -1, -1, 81, 81, 81, 81, 81, 81, 81, 81, 81, 82, 81, 81, -1, -1, -1, -1, -1, -1, 83},
                {-1, -1, -1, -1, -1, -1, 92, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 92, -1, -1, -1, -1, -1, -1, -1, 93, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, -1, -1, -1, -1, -1, -1, 92},
                {-1, 95, 95, 95, 95, 95, -1, -1, -1, -1, -1, 95, -1, -1, -1, -1, -1, -1, -1, 95, -1, -1, -1, 95, -1, -1, -1, -1, 95, 94, -1, -1, -1, -1, -1, -1, 95, 95, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, -1, -1, -1, 42, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
            };

    int[][] PRODUCTIONS
            = {
                {109, 18, 50, 57, 110, 8, 58, 11, 111},
                {14, 19, 51, 2, 29, 52, 30, 50},
                {0},
                {17},
                {13},
                {9},
                {10},
                {23},
                {28},
                {0},
                {53},
                {54, 81},
                {0},
                {42, 53},
                {55, 43, 56},
                {17},
                {13},
                {9},
                {10},
                {23},
                {2, 126, 82},
                {0},
                {40, 56},
                {19, 2, 8, 58, 11, 57},
                {0},
                {59, 62},
                {0},
                {60},
                {61, 83},
                {0},
                {60},
                {55, 124, 43, 56, 41, 125},
                {63, 41, 84},
                {0},
                {62},
                {64},
                {66},
                {67},
                {92},
                {73},
                {131, 29, 74, 30, 93},
                {69},
                {71},
                {16, 132, 62, 70, 11, 133},
                {72, 135, 62, 11, 136},
                {2, 126, 65, 130, 74, 128},
                {44},
                {45},
                {46},
                {22, 29, 56, 129, 30},
                {27, 29, 68, 30},
                {74, 108, 85},
                {0},
                {40, 68},
                {0},
                {134, 15, 62},
                {26},
                {25},
                {47, 74},
                {75, 86},
                {0},
                {7, 75, 112, 86},
                {21, 75, 113, 86},
                {76},
                {24, 105},
                {12, 106},
                {20, 75, 107},
                {78, 87},
                {0},
                {77, 103, 78, 104},
                {31},
                {32},
                {33},
                {34},
                {35},
                {36},
                {79, 88},
                {0},
                {37, 79, 95, 88},
                {38, 79, 96, 88},
                {80, 89},
                {0},
                {39, 80, 97, 89},
                {48, 80, 98, 89},
                {2, 90},
                {3, 99},
                {4, 100},
                {6, 114},
                {5, 115},
                {29, 74, 30},
                {37, 80, 101},
                {38, 80, 102},
                {0},
                {29, 91},
                {30},
                {68, 30}
            };

    String[] PARSER_ERROR
            = {
                "",
                "Esperado fim de arquivo", // "Esperado fim de programa",
                "Esperado identificador",
                "Esperado constante int", //"Esperado constante_inteira",
                "Esperado constante float", //"Esperado constante_real",
                "Esperado constante string", //"Esperado constante_string",
                "Esperado constante caracter", //"Esperado constante_caracter",
                "Esperado and",
                "Esperado begin",
                "Esperado bool",
                "Esperado char",
                "Esperado end",
                "Esperado false",
                "Esperado float",
                "Esperado forward",
                "Esperado ifFalseDo",
                "Esperado ifTrueDo",
                "Esperado int",
                "Esperado main",
                "Esperado module",
                "Esperado not",
                "Esperado or",
                "Esperado read",
                "Esperado string",
                "Esperado true",
                "Esperado whileFalseDo",
                "Esperado whileTrueDo",
                "Esperado write",
                "Esperado void",
                "Esperado '('",
                "Esperado ')'",
                "Esperado '=='",
                "Esperado '!='",
                "Esperado '<'",
                "Esperado '<='",
                "Esperado '>'",
                "Esperado '>='",
                "Esperado '+'",
                "Esperado '-'",
                "Esperado '*'",
                "Esperado ','",
                "Esperado '.'",
                "Esperado ';'",
                "Esperado ':'",
                "Esperado '='",
                "Esperado '+='",
                "Esperado '-='",
                "Esperado '^'",
                "Esperado '/'",
                "Esperado main", //"<bnf> inv�lido",
                "Esperado begin, forward ou module", //"<declaracao> inv�lido",
                "Esperado tipo", //"<tipo_modulo> inv�lido",
                "Esperado tipo ou ')'", //"<parametros_formais> inv�lido",
                "Esperado tipo",//"<lista_de_parametros> inv�lido",
                "Esperado tipo",//"<parametro> inv�lido",
                "Esperado tipo",//"<tipo> inv�lido",
                "Esperado identificador",//"<lista_de_identificadores> inv�lido",
                "Esperado begin ou module",//"<modulo> inv�lido",
                "Esperado identificador, read, write, '(' ou '^'",//"<corpo> inv�lido",
                "Esperado identificador, tipo, read, write, '(' ou '^'",//"<declaracao_de_variaveis> inv�lido",
                "Esperado tipo",//"<lista_de_variaveis> inv�lido",
                "Esperado tipo",//"<variavel> inv�lido",
                "Esperado identificador, tipo, read, write, '(' ou '^'",//"<lista_de_comandos> inv�lido",
                "Esperado identificador, tipo, read, write, '(' ou '^'",//"<comando> inv�lido",
                "Esperado identificador",//"<atribuicao> inv�lido",
                "Esperado '=', '+=' ou '-='",//"<operador_de_atribuicao> inv�lido",
                "Esperado read",//"<entrada> inv�lido",
                "Esperado write",//"<saida> inv�lido",
                "Esperado expressão",//"<lista_de_expressoes> inv�lido",
                "Esperado ifTrueDo",//"<selecao> inv�lido",
                "Esperado ifFalseDo ou end",//"<else> inv�lido",
                "Esperado whileFalseDo ou whileTrueDo",//"<repeticao> inv�lido",
                "Esperado whileFalseDo ou whileTrueDo",//"<while> inv�lido",
                "Esperado '^'",//"<retorno> inv�lido",
                "Esperado expressão",//"<expressao> inv�lido",
                "Esperado expressão",//"<elemento> inv�lido",
                "Esperado expressão",//"<relacional> inv�lido",
                "Esperado expressão",//"<operador_relacional> inv�lido",
                "Esperado expressão",//"<aritmetica> inv�lido",
                "Esperado expressão",//"<termo> inv�lido",
                "Esperado expressão",//"<fator> inv�lido",
                "Esperado ')' ou ';'",//"<lista_de_parametros1> inv�lido",
                "Esperado ')', ',', '.' ou ';'",//"<lista_de_identificadores1> inv�lido",
                "Esperado identificador, tipo, read, write, '(' ou '^'",//"<lista_de_variaveis1> inv�lido",
                "Esperado identificador, end, ifFalseDo, read, write, '(' ou '^'",//"<lista_de_comandos1> inv�lido",
                "Esperado ')' ou ','",//"<lista_de_expressoes1> inv�lido",
                "Esperado expressão",//"<expressao1> inv�lido",
                "Esperado expressão",//"<relacional1> inv�lido",
                "Esperado expressão",//"<aritmetica1> inv�lido",
                "Esperado expressão",//"<termo1> inv�lido",
                "Esperado expressão",//"<fator1> inv�lido",
                "Esperado expressão",//"<fator3> inv�lido",
                "Esperado '('",//"<selecao_repeticao> inv�lido",
                "Esperado ifTrueDo, whileFalseDo ou whileTrueDo",//"<selecao_repeticao1> inv�lido"
            };
}
