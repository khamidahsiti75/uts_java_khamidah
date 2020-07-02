/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_sederhana_1955201284;

import java.util.Scanner;



/**
 *
 * @author OWNER
 */
public class memilih_menu_makanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan, pilih; 
        String nama;
        System.out.print("Masukkan nama :");
        nama = input.next();
        System.out.print("Menu pilihan: \n [1]. Rujak Cingur( Rp.12.000.00) \n [2]. Gado-Gado(Rp.10.000.00) \n [3]. Nasi Jagung(Rp.13.000.00)");
        System.out.print("\n Masukkan pilihan :");
        pilih = input.nextInt();
        
        
        System.out.println("================");
             Scanner scan = new Scanner(System.in);
        switch(pilih){       
                
            case 1 : 
                System.out.println("Nama pemesan :"+nama);
                System.out.println("Pesanan : Rujak Cingur");
                System.out.println("Harga  : 12.000");
                
                
                boolean running = true;
            String jawab;
       
            int counter = 0;
            
          while (running) {
              System.out.println("apakah anda ingin  memesan rujak cingur?");
              System.out.println("jawab [iya / tidak]");
              
              

              
              jawab = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab.equalsIgnoreCase("tidak") ){
            running = false;
        }
        counter++;
          }  
                System.out.println("anda sudah memesan rujak cingur sebanyak " + counter + " bungkus");
         
                
                break;
            case 2 :
                System.out.println("Nama pemesan :"+nama);
                System.out.println("Pesanan : Gado-Gado");
                System.out.println("Harga  : 10.000");
                
                boolean running1 = true;
            String jawab1;
            
            int counter1 = 0;
            
          while (running1) {
            System.out.println("apakah anda ingin  memesan gado-gado?");
            System.out.println("jawab [iya / tidak]");
              
              
              jawab = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab.equalsIgnoreCase("tidak") ){
            running1 = false;
        }
        counter1++;
          }  
                System.out.println("anda sudah memesan gado-gado sebanyak " + counter1 + " bungkus");
         
                break;
            case 3 :
                System.out.println("Nama pemesan :"+nama);
                System.out.println("Pesanan : Nasi Jagung");
                System.out.println("Harga  : 13.000");
                
                
                boolean running2 = true;
            String jawab2;
            int counter2 = 0;
            
          while (running2) {
              System.out.println("apakah anda ingin mencoba memesan nasi jagung"); 
              System.out.println("jawab [iya / tidak]");
              
              
              jawab = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab.equalsIgnoreCase("tidak") ){
            running = false;
        }
        counter2++;
          }  
                System.out.println("anda sudah memesan nasi jagung sebanyak " + counter2 + " bungkus");
         
                     
            break;
            default:
            System.out.println("Maaf Anda Salah Pilih Menu ! :(");
           
        }       
            
    } 
}
      
    

    
    

