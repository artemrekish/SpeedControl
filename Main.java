public class Main {

        public static void main (String[] args) throws java.lang.Exception
        {
            int carSpeed = 120;
            boolean isTown = false;
            int fineFor20to40 = 500;
            int fineFor40to60 = 1000;
            int fineFor60to80 = 2000;
            int fineFor80andMore = 5000;
            int overSpeed;
            int townSpeed = 60;
            int countrySpeed = 90;

            if(isTown) {
                overSpeed = carSpeed - townSpeed;
            }
            else {
                overSpeed = carSpeed - countrySpeed;
            }

            if(overSpeed < 20) {
                System.out.println("Скорость не превышена или превышена незначительно");
            }
            else if(overSpeed >= 20 && overSpeed < 40) {
                System.out.println("Штраф: " + fineFor20to40);
            }
            else if(overSpeed >= 40 && overSpeed < 60) {
                System.out.println("Штраф: " + fineFor40to60);
            }
            else if(overSpeed >= 60 && overSpeed < 80) {
                System.out.println("Штраф: " + fineFor60to80);
            }
            else if(overSpeed >= 80) {
                System.out.println("Штраф: " + fineFor80andMore);
            }
        }
}

