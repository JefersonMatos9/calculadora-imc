public class CalculadoraImc {
        public static void main(String[] args) {

            double kg = 75;
            double altura = 1.70;
            double imc = kg/(altura * altura);

            if (imc <= 18.5){
                System.out.println("Você está abaixo do peso");

            }else if (imc >=18.6 && imc <= 24.9){
                System.out.println("Você está no peso ideal");

            } else if (imc >=25 && imc <=29.9) {
                System.out.println("Você está em sobrepeso!");

            }else if (imc >=30 && imc <= 34.99){
                System.out.println("Obesidade grau 1");

            } else if (imc >= 35 && imc <= 39.99) {
                System.out.println("Obesidade grau 2 (severa)");

            }else
                System.out.println("Obesidade grau 3 (morbida)");
        }
    }

