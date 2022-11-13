public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3)); // and "&&" só é true, quando ambos forem true.

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4)); // or "||" só resulta em false, quando ambos forem false.

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1)); // xor "^", quando são diferentes resulta em true,quando iguais, resulta em false.

        System.out.println(!b1); // negação "!" , o que é true virará false
        System.out.println(!b2); // e false virará true.

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        // Operadores aritméticos, relacionais e lógicos, criando uma expressão.
        System.out.println("(( i1 + i2 ) < ( f2 - f1)) && true " + ((( i1 + i2 ) < ( f2 - f1)) && true));
        System.out.println("( i1 > i2 ) || ( f2 < f1) " + (( i1 > i2 ) || ( f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        // expressão de uma forma mais complexa
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;


        System.out.println((salarioBaixo) && (muitosDependentes));

        // expressão intermediária, falicita o entendimento do código
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxilio " + recebeAuxilio );
    }
}
