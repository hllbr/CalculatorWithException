
import java.util.InputMismatchException;
import java.util.Scanner;

class CarpmaException extends Exception{

    @Override
    public void printStackTrace() {
       System.out.println("İki sayı da çok büyük. Lütfen daha küçük sayılar girin....");
    }
    
}
class BolmeException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("gerçekleştirmeye çalıştığınız işlem 0'a bölme olduğu için derleyici matematiğine aykırı oalrak nitelendirildi.\n"
                + "işleminiz gerçekleştirilemedi...");
    }
    
}





public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
       // System.out.println("***************************");
        String islemler = "1.islemleri göster\n"
                + "2.islem Toplama\n"
                + "3.islem Cıkarma\n"
                + "4.islem Bölme\n"
                + "5.islem Carpma"
                + "6.islem Kalan\n"
                + "q çıkış işlemi";
        System.out.println(islemler);
      boolean dongu_kosul = true;
        while(dongu_kosul){
            
        System.out.println("***************************");
        System.out.println("Lütfen yapmak istedğinizi işlemi giriniz...");
        System.out.println("***************************");
        String islem = scn.nextLine();
        int a ;
        int b ;
            try {
                
            
        switch(islem){
            case "1":
                System.out.println(islemler);
                break;
            case "2":
                System.out.println("birinci sayı :");
                a = scn.nextInt();
                System.out.println("ikinci sayı :");
                b = scn.nextInt();
                System.out.println("toplama işleminiz Gerçekleştiriliyor.Lütfen Bekleyiniz");
                Thread.sleep(2000);
                System.out.println("işleiminizin sonucu = "+(a+b));
                break;
            case "3":
                System.out.println("birinci sayı :");
                a = scn.nextInt();
                System.out.println("ikinci sayı :");
                b = scn.nextInt();   
                 System.out.println("Cıkarma işleminiz Gerçekleştiriliyor.Lütfen Bekleyiniz");
                Thread.sleep(2000);
                System.out.println("işleiminizin sonucu = "+(a-b));
                break;
            case "4":
                System.out.println("birinci sayı :");
                a = scn.nextInt();
                System.out.println("ikinci sayı :");
                b = scn.nextInt();   
                System.out.println("Bölme işleminiz Gerçekleştiriliyor.Lütfen Bekleyiniz");
                Thread.sleep(2000);
                if(b == 0){
                    throw new BolmeException();
                }
                System.out.println("işleiminizin sonucu = "+(a/b));
                break;
            case "5":
                          
                System.out.println("birinci sayı :");
                a = scn.nextInt();
                System.out.println("ikinci sayı :");
                b = scn.nextInt();   
                System.out.println("Carpma işleminiz Gerçekleştiriliyor.Lütfen Bekleyiniz");
                Thread.sleep(2000);
                if(a>= 10000  || b >= 10000 ){
                    throw new CarpmaException();
                }
                System.out.println("işleiminizin sonucu = "+(a*b));
                break;
            case "6":
                System.out.println("birinci sayı :");
                a = scn.nextInt();
                System.out.println("ikinci sayı :");
                b = scn.nextInt();   
                System.out.println("Kalan işleminiz Gerçekleştiriliyor.Lütfen Bekleyiniz");
                Thread.sleep(2000);
                System.out.println("işleiminizin sonucu = "+(a%b));
                break; 
            case "q":
                dongu_kosul = false;
                break;
            default:
                System.out.println("Geçersiz işlem");
                }
        } catch (BolmeException e) {//hataları ayıtlarken özelden genele gidiyoruz.
                e.printStackTrace();
            }catch(CarpmaException e){
            e.printStackTrace();
        }catch(InputMismatchException e){//sayıların 10000 üzerinde olması nı istemediğimiz için 
            System.out.println("Lütfen doğru formatta tanımlama yapınız.");
        }catch(ArithmeticException e){
                System.out.println("Bir sayı 0'a bölünemez");
        }

    }
    
}}
