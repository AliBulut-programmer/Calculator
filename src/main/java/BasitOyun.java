

import java.util.Scanner;


public class BasitOyun {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int yuz = 100;
        while (true){
        int bir = 1;
       
        String Turkce = "Turkce";
        
        String English = "English";
        
        String dil;
        
        String rs = "rs";
        String giristr = "Hosgeldiniz\n"
                + "Oyunun nasıl oynandıgını ogrenmek icin 'T' tusuna ve ardından enter tusuna basınız\n"
                + "Oyun oynamak icin 'S' tusuna ve ardından enter tusuna basınız\n ";
        String tutorialtr = "Başlangıçta botun da oyuncunun da 100 canı vardır, 100 de olarak bir defans yapar bot da\n"
                + " buna bağlı olarak bir hamle yapar. Örneğin defans : 45,  atak : 55 , yani yazılan iki sayının toplamı 100 olmalıdır.\n"
                + " Yani amaç kendi canınız 0 olmadan botun canını 0 yapmaktır.\n"
                + " Eğer bu yazıyı okuduysanız 'N' tuşuna ve ardından enter tuşuna basın. ";
        String g = "N";
               
                
        int botatak;
        
        int oyuncucanara;
        
        
        int botcanara;
        
        int canoyuncu = 100;
        
        int botcan = 100;
        
        int hasar;
        
        int defans = 0;
        
        String kolay;
        
        String orta;
        
        String Zor;
        
        String Imkansız;
                
             
        
        System.out.println("Launguage :");
        dil = scanner.nextLine();
        
        
        
        
        
        if (dil.equals(Turkce)){
            
            
            
                System.out.println(giristr);
            String a = scanner.nextLine();

            if (a.equals("T") || a.equals("t")){
            System.out.println(tutorialtr);
            g = scanner.nextLine();
            }

            else if (a.equals("S") || a.equals("s") || g.equals("N")|| rs.equals("rs")){

            System.out.println("Bot zorluğu : ");

            String bot_zorlugu = scanner.nextLine();




            if (bot_zorlugu.equals("kolay") ) {








            while ( canoyuncu != 0 ){ //oyuncunun canını kontrol etmesi için while


                System.out.println("***********************************************************\n"
                    + "hasar :");

            hasar = scanner.nextInt();



            System.out.println("defans :");


            defans = scanner.nextInt();


            System.out.println("***********************************************************");
            int hdtoplam = hasar + defans;

            if (hdtoplam != yuz){
                System.out.println("Kuralları okuyun!(hata defans ve arağın toplamı 100 etmeli!)");

            }
                    if  (hasar >= 0 && hasar <= 25 ){

                        hasar = hasar / 6 ; // 60 defans yapar

                        botcan = botcan - hasar;

                        System.out.println("Bot Can = " + botcan);


                if (canoyuncu <= 0){


                    System.out.println("Oyun Bitti");



            }

                    }      
                    else if  (hasar >= 26 && hasar <= 50 ){

                        hasar = hasar / 3 ;//bot defans yapar

                        botcan = botcan - hasar;

                        System.out.println("Bot Can = " + botcan);


                if (canoyuncu <= 0){


                    System.out.println("Oyun Bitti");




            }
                    }


                    else if  (hasar >= 51 && hasar <= 75 ){

                        hasar = hasar / 5 ;

                        botcan = botcan - hasar;

                        System.out.println("Bot Can = " + botcan);
                while (canoyuncu < 1){


                    System.out.println("Oyun Bitti");

                break;
            }

                    }   
                    else if  (hasar >= 76 && hasar <= 100 ){

                        hasar = hasar / 5 ;

                        botcan = botcan - hasar;

                        System.out.println("Bot Can = " + botcan);

                if (canoyuncu <= 0){


                    System.out.println("Oyun Bitti");

            }

                    }       






                    if  (defans <= (25) && defans >=  (0)  ){

                        botatak = 40 / (100 / defans);
                        canoyuncu -= botatak;
                if (canoyuncu <= 0){


                    System.out.println("Oyun Bitti");
                break;
            }
                        System.out.println("Canınız = " + canoyuncu);

                        if (canoyuncu != 0){


                    continue;
                }




            }

            else if  (defans >= (26) && defans <=  (50)  ){

                        botatak = 60 / (100 / defans);

                        canoyuncu -= botatak ;
                if (canoyuncu <= 0){


                    System.out.println("Oyun Bitti");
                break;
            }
                        System.out.println("Canınız = " + canoyuncu);
                        canoyuncu = canoyuncu;
                if (canoyuncu != 0){


                    continue;
                }


            }

            else if  (defans >= (51) && defans <=  (75)  ){

                        botatak = 75 / (100 / defans);

                        canoyuncu -= botatak;

                        System.out.println("Canınız = " + canoyuncu);
                if (canoyuncu != 0){


                    continue;
                }
                if (canoyuncu <= 0){


                    System.out.println("Oyun Bitti");
                break;
        }
        
        }
        
        else if  (defans >= (76) && defans <=  (100)  ){
            
                    botatak = 90 / (100 / defans);
            
                    canoyuncu -= botatak ;
            if (canoyuncu <= 0){
                
                
                System.out.println("Oyun Bitti");
                
                break;
            }
                    System.out.println("Canınız = " + canoyuncu);
            
            if (canoyuncu != 0){
                
                
                continue;
                
                
            }
            }
            
            
        }
        
    }
        
        }
        }
        
        
        else {
            
            
                    System.out.println("Invalid language, Press rs keys to restart the game!(you can use just English and Turkce launguage)");
                    rs = scanner.nextLine();
                    
                   
        }
        }
        
   
        
        
        
        
        
            
        
        
        
        
        
            
        
        
        
               
    }

    private static boolean defans(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
