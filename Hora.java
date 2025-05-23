/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico03;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Hora {
    private int hora;
    private int min;
    private int seg;
    
    Scanner sc = new Scanner(System.in);
    
    public Hora(){
        // Interface pro usuario digitar
        
        do{
            System.out.println("Digite a hora");
            hora = sc.nextInt();
            
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida! Tente novamente.");
            }
        }while(hora > 23 || hora < 0);
        
        do {
            System.out.println("Digite o minuto");
            min = sc.nextInt();
            
            if (min < 0 || min > 59) {
                System.out.println("Minuto inválido! Tente novamente.");
            }
            
        } while (min > 59 || min < 0);
        
        do {
            System.out.println("Digite o segundo");
            seg = sc.nextInt();
            
            if (seg < 0 || seg > 59) {
                System.out.println("Segundo inválido! Tente novamente.");
            }
            
        } while (seg > 59 || seg < 0);
    }
    
    public Hora(int h, int m, int s){
        // Porrada só
        
        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida! Tente novamente.");
        }else{
            hora = h;
        }
        
        if (min < 0 || min > 59) {
            System.out.println("Minuto inválido! Tente novamente.");
        }else{
            min = m;
        }
        
        if (seg < 0 || seg > 59) {
            System.out.println("Segundo inválido! Tente novamente.");
        }else{
            seg = s;
        }
    }
    
    public void setHor(int h){
        
        if (hora < 0 || hora > 23) {
            System.out.println("Hora inválida! Tente novamente.");
        }else{
            hora = h;
        }
    }
    
    public void setMin(int m){
        
        if (min < 0 || min > 59) {
            System.out.println("Minuto inválido! Tente novamente.");
        }else{
            min = m;
        }
    }
    
    public void setSeg(int s){

        
        if (seg < 0 || seg > 59) {
            System.out.println("Segundo inválido! Tente novamente.");
        }else{
            seg = s;
        }
    }
    
    public void setHor(){
        do {
            System.out.println("Digite a hora");
            hora = sc.nextInt();

            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida! Tente novamente.");
            }
        } while (hora > 23 || hora < 0);
    }
    
    public void setMin() {
        do {
            System.out.println("Digite o minuto");
            min = sc.nextInt();

            if (min < 0 || min > 59) {
                System.out.println("Minuto inválido! Tente novamente.");
            }

        } while (min > 59 || min < 0);
    }
    
    public void setSeg() {
        do {
            System.out.println("Digite o segundo");
            seg = sc.nextInt();

            if (seg < 0 || seg > 59) {
                System.out.println("Segundo inválido! Tente novamente.");
            }

        } while (seg > 59 || seg < 0);
    }
    
    public int getHor(){
        return hora;
    }
    
    public int getMin(){
        return min;
    }
    
    public int getSeg(){
        return seg;
    }
    
    public String getHora1(){
        return hora+":"+min+":"+seg;
    }
    
    public String getHora2(){
        String am_pm = "AM";
        
        if (hora < 0 || hora > 23) {
            switch (hora) {
                case 13:
                    hora = 1;
                    am_pm = "PM";
                    break;
                case 14:
                    hora = 2;
                    am_pm = "PM";
                    break;
                case 15:
                    hora = 3;
                    am_pm = "PM";
                    break;
                case 16:
                    hora = 4;
                    am_pm = "PM";
                    break;
                case 17:
                    hora = 5;
                    am_pm = "PM";
                    break;
                case 18:
                    hora = 6;
                    am_pm = "PM";
                    break;
                case 19:
                    hora = 7;
                    am_pm = "PM";
                    break;
                case 20:
                    hora = 8;
                    am_pm = "PM";
                    break;
                case 21:
                    hora = 9;
                    am_pm = "PM";
                    break;
                case 22:
                    hora = 10;
                    am_pm = "PM";
                    break;
                case 23:
                    hora = 11;
                    am_pm = "PM";
                    break;
                default:
                    hora = 12;
                    am_pm = "PM";
                    break;
            }
        }
        
        return hora+":"+min+":"+seg+am_pm;
    }
    
    public int getSegundos(){
        return (hora * 3600) + (min * 60) + (seg);
    }
}
