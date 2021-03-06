import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Matrix {
    private static Map<Character,char[][]> charset = new HashMap<>();
    private static char[][] matrix = new char[5][5*200];

    private static final int INDEX = 6;

    public static void main(String[] args) {
        charset();
        claerMatrix(' ');
        printMatrix(userInput(),userConf());

    }

    private static void charset() {
        char[][] A = {
                {' ', '#', '#', ' ',' '},
                {'#', ' ', ' ', '#',' '},
                {'#', '#', '#', '#',' '},
                {'#', ' ', ' ', '#',' '},
                {'#', ' ', ' ', '#',' '}
        };
        char[][] B = {
                {'#','#','#',' ',' '},
                {'#',' ',' ','#',' '},
                {'#','#','#','#',' '},
                {'#',' ',' ','#',' '},
                {'#','#','#',' ',' '}
        };
        char[][] C = {
                {' ','#','#',' ',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ',' ',' '},
                {'#',' ',' ','#',' '},
                {' ','#','#',' ',' '}
        };
        char[][] D = {
                {'#','#','#',' ',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#','#','#',' ',' '}
        };
        char[][] E = {
                {'#','#','#',' ',' '},
                {'#',' ',' ',' ',' '},
                {'#','#','#',' ',' '},
                {'#',' ',' ',' ',' '},
                {'#','#','#',' ',' '}
        };
        char[][] F = {
                {'#','#','#',' ',' '},
                {'#',' ',' ',' ',' '},
                {'#','#','#',' ',' '},
                {'#',' ',' ',' ',' '},
                {'#',' ',' ',' ',' '}
        };
        char[][] G = {
                {' ','#','#',' ',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ',' ',' '},
                {'#',' ','#','#',' '},
                {' ','#','#','#',' '}
        };
        char[][] H = {
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#','#','#','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '}
        };
        char[][] I = {
                {'#','#','#',' ',' '},
                {' ','#',' ',' ',' '},
                {' ','#',' ',' ',' '},
                {' ','#',' ',' ',' '},
                {'#','#','#',' ',' '}
        };
        char[][] J = {
                {'#','#','#','#',' '},
                {' ',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {' ','#','#',' ',' '}
        };
        char[][] K = {
                {'#',' ',' ','#',' '},
                {'#',' ','#',' ',' '},
                {'#','#',' ',' ',' '},
                {'#','#',' ',' ',' '},
                {'#',' ','#',' ',' '}
        };
        char[][] L = {
                {'#',' ',' ',' ',' '},
                {'#',' ',' ',' ',' '},
                {'#',' ',' ',' ',' '},
                {'#',' ',' ',' ',' '},
                {'#','#','#',' ',' '}
        };
        char[][] M = {
                {'#',' ',' ','#',' '},
                {'#','#','#','#',' '},
                {'#','#','#','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '}
        };
        char[][] N = {
                {'#',' ',' ','#',' '},
                {'#','#',' ','#',' '},
                {'#',' ','#','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '}
        };
        char[][] O = {
                {' ','#','#',' ',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {' ','#','#',' ',' '}
        };
        char[][] P = {
                {'#','#','#',' ',' '},
                {'#',' ',' ','#',' '},
                {'#','#','#',' ',' '},
                {'#',' ',' ',' ',' '},
                {'#',' ',' ',' ',' '}
        };
        char[][] Q = {
                {' ','#','#',' ',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ','#','#',' '},
                {' ','#','#','#',' '}
        };
        char[][] R = {
                {'#','#','#',' ',' '},
                {'#',' ',' ','#',' '},
                {'#','#','#',' ',' '},
                {'#',' ','#',' ',' '},
                {'#',' ',' ','#',' '}
        };
        char[][] S = {
                {' ','#','#',' ',' '},
                {'#',' ',' ',' ',' '},
                {' ','#',' ',' ',' '},
                {' ',' ','#',' ',' '},
                {'#','#',' ',' ',' '}
        };
        char[][] T = {
                {'#','#','#',' ',' '},
                {' ','#',' ',' ',' '},
                {' ','#',' ',' ',' '},
                {' ','#',' ',' ',' '},
                {' ','#',' ',' ',' '}
        };
        char[][] U = {
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {' ','#','#',' ',' '}
        };
        char[][] V = {
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {' ','#','#',' ',' '},
                {' ','#','#',' ',' '}
        };
        char[][] W = {
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {'#','#','#','#',' '},
                {'#','#','#','#',' '},
                {'#',' ',' ','#',' '}
        };
        char[][] X = {
                {'#',' ',' ','#',' '},
                {' ','#','#',' ',' '},
                {' ','#','#',' ',' '},
                {' ','#','#',' ',' '},
                {'#',' ',' ','#',' '}
        };
        char[][] Y = {
                {'#',' ',' ','#',' '},
                {'#',' ',' ','#',' '},
                {' ','#','#',' ',' '},
                {' ','#','#',' ',' '},
                {' ','#','#',' ',' '}
        };
        char[][] Z = {
                {'#','#','#','#',' '},
                {' ',' ',' ','#',' '},
                {' ',' ','#',' ',' '},
                {' ','#',' ',' ',' '},
                {'#','#','#','#',' '}
        };
        char[][] sp = {
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '}
        };
        charset.put('A',A);
        charset.put('a',A);
        charset.put('B',B);
        charset.put('b',B);
        charset.put('C',C);
        charset.put('c',C);
        charset.put('D',D);
        charset.put('d',D);
        charset.put('E',E);
        charset.put('e',E);
        charset.put('F',F);
        charset.put('f',F);
        charset.put('G',G);
        charset.put('g',G);
        charset.put('H',H);
        charset.put('h',H);
        charset.put('I',I);
        charset.put('i',I);
        charset.put('J',J);
        charset.put('j',J);
        charset.put('K',K);
        charset.put('k',K);
        charset.put('L',L);
        charset.put('l',L);
        charset.put('M',M);
        charset.put('m',M);
        charset.put('N',N);
        charset.put('n',N);
        charset.put('O',O);
        charset.put('o',O);
        charset.put('P',P);
        charset.put('p',P);
        charset.put('Q',Q);
        charset.put('q',Q);
        charset.put('R',R);
        charset.put('r',R);
        charset.put('S',S);
        charset.put('s',S);
        charset.put('T',T);
        charset.put('t',T);
        charset.put('U',U);
        charset.put('u',U);
        charset.put('V',V);
        charset.put('v',V);
        charset.put('W',W);
        charset.put('w',W);
        charset.put('X',X);
        charset.put('x',X);
        charset.put('Y',Y);
        charset.put('y',Y);
        charset.put('Z',Z);
        charset.put('z',Z);
        charset.put(' ',sp);
    }

    private static void claerMatrix(char replacement) {
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                matrix[i][j] = replacement;
            }
        }
    }

    private static void printMatrix(String word, boolean[] conf) {
        int z = 0;
        if (conf[0]){
            word=" " + word;
        }
        char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char[][] buchstabe = charset.get(chars[i]);
                if (conf[2]) {
                    for (int x = 0; x < buchstabe[2].length; x++){
                        buchstabe[2][x]='#';
                    }
                }
                for (int j = 0; j < buchstabe.length; j++) {
                    for (int k = 0; k < buchstabe[j].length; k++) {
                        matrix[j][k + z * INDEX] = buchstabe[j][k];
                    }
                }
                z++;
            }
        if (conf[1]){
            flipPrintToScreen();
        }else {
            printToScreen(conf[0]);
        }
    }

    private static void printToScreen(boolean inveres) {
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                char character = matrix[i][j];
                if(inveres){
                    if(character=='#'){
                        character=' ';
                    }else {
                        character='#';
                    }
                }
                System.out.print(character);
            }
            System.out.println();
        }
    }

    private static void flipPrintToScreen(){
        for (int i = matrix.length-1; i >= 0; i--){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib Bitte einen Text ein");
        return scanner.nextLine();
    }

    private static boolean[] userConf() {
        boolean[] userConf = new boolean[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wollen sie den Text Invers anzeigen lassen ? 'Y' ja\n\tWenn nicht Beliebige tasten dr??cken");
        String inveres = scanner.nextLine();
        if (inveres.equalsIgnoreCase("y")){
            userConf[0]=true;
        }

        System.out.println("Wollen sie den Text gespiegelt anzeigen lassen ? 'Y' ja\n\tWenn nicht Beliebige tasten dr??cken");
        String mirror = scanner.nextLine();
        if (mirror.equalsIgnoreCase("y")){
            userConf[1]=true;
        }

        System.out.println("Wollen sie den Text Durchgestriechen anzeigen lassen ? 'Y' ja\n\tWenn nicht Beliebige tasten dr??cken");
        String crossout = scanner.nextLine();
        if(crossout.equalsIgnoreCase("y")){
            userConf[2]=true;
        }

        return userConf;
    }
}