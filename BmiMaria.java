import java.util.Scanner;
public class BmiMaria {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int jenisKelamin, hasil; 
       float berat, tinggi, bmi, meter;
       double broca;
           System.out.println("Menghitung Berat Badan");
           System.out.println("1.Laki-Laki");
           System.out.println("2.Perempuan");
           System.out.println("Masukan Jenis Kelamin = ");
           jenisKelamin = input.nextInt();
           System.out.println("Masukan Berat Badan = ");
           berat = input.nextFloat();
           System.out.println("Masukan Tinggi Badan = ");
           tinggi = input.nextFloat();
           meter = tinggi / 100;
           bmi = (berat /(meter * meter));
           System.out.println("BMI = " + bmi + " ");
           if(bmi < 18.5){
               System.out.println("Kurus");
           }else if (bmi <=22.9){
               System.out.println("Normal");
           }else if (bmi < 24.9){
               System.out.println("Overweight");
           }else {
               System.out.println("Obesitas");
           }
          
           
           
       
       
    }
    
}
