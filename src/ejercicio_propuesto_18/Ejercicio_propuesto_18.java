/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_propuesto_18;

/**
 *
 * @author Christopher
 */
public class Ejercicio_propuesto_18 {

    int codigo;
    int num_horas;
    double valor_hora;
    double porcentaje;
    
    Ejercicio_propuesto_18(int num_horas,double valor_hora,double porcentaje){
        this.num_horas = num_horas;
        this.valor_hora = valor_hora;
        this.porcentaje = porcentaje;
    }
    
    double Salario_Bruto(){
        return num_horas*valor_hora;
    }
            
       
    double Salario_neto(){
        double salariobruto = num_horas*valor_hora;
        double retencion_ = salariobruto * (porcentaje/100);
        return salariobruto - retencion_;
    }
            
            
    public static void main(String[] args) {
    Ventana18 ventana = new Ventana18();
    ventana.show(true);
    }
}