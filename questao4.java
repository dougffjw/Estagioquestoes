/* Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____*/

public class questao4 {
    public static void main(String[] args) {
        System.out.println("a) 1, 3, 5, 7, " + proximoA());
        System.out.println("b) 2, 4, 8, 16, 32, 64, " + proximoB());
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, " + proximoC());
        System.out.println("d) 4, 16, 36, 64, " + proximoD());
        System.out.println("e) 1, 1, 2, 3, 5, 8, " + proximoE());
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, " + proximoF());
    }

    
    public static int proximoA() {
        return 9; 
    }

    public static int proximoB() {
        return 128; 
    }

    public static int proximoC() {
        return 49; 
    }

    public static int proximoD() {
        return 100; 
    }

    public static int proximoE() {
        return 13; 
    }

    public static int proximoF() {
        return 20; 
    }
}
