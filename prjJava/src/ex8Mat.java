import javax.swing.JOptionPane;
public class ex8Mat {
    //	Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
    //	A quantidade de cada produto vendido no mês;
    //	A quantidade de produtos vendidos por semana;
    //	O total de produtos vendidos no mês.

    static int mat[][] = new int [4][3];
    static int semana[] = new int [4];
    static int prod[] = new int [3];
    public static void main (String args[]){
       
        int i, j, opc;
        
        //Cadastro de produtos
         for (i = 0 ; i < 4; i ++){
            for (j = 0; j < 3; j ++){
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto " + (j + 1) + " vendido na semana " + (i + 1)));
            }
        }
        // MENU consultas
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA: \n 1 - Venda mensal de cada produto \n 2 - Qtd. vendas semanais \n 3 - Qtd. vendas mês \n 9 - Encerrar consulta" ));
            switch(opc){
                case 1:
                    prodmes(mat);
                     break;
                case 2:
                    prodsem(mat);
                    break;
                case 3:
                    total(semana);
                    break;
                case 9:
                    break;
                default:
                JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
            } 
        } while (opc != 9);        
    }
    
    public static void prodmes(int mat[][]){
        int i, j, opc;
        for (j = 0; j<3; j ++){
            prod[j] = 0;
            for (i=0; i<4 ; i++){
                prod[j] = prod[j] + mat[i][j];
            } 
        }
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto que deseja consultar. Digite 9 após o término da consulta."));
            switch(opc){
                case 1:
                    JOptionPane.showMessageDialog(null, "A quantidade do produto " + opc + " vendida no mês foi " + prod[opc - 1]);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "A quantidade do produto " + opc + " vendida do mês foi " + prod[opc - 1]);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "A quantidade do produto " + opc + " vendida no mês foi " + prod[opc - 1]);
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO");
            } 
        }while (opc != 9);
    }
    
    public static void prodsem(int mat[][]){
        int i, j, opc;
        
        for (i = 0; i < 4 ; i++){
            semana[i] = 0;
            for (j = 0; j < 3; j++){
                semana[i] = semana[i] + mat[i][j];
            }
        } 
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a semana que deseja consultar. Digite 9 para encerrar a consulta."));
            switch(opc){
                case 1 :
                    JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos na semana " + opc + " foi " + semana[opc - 1]);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos na semana " + opc + " foi " + semana[opc-1]);
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos na semana " + opc + " foi " + semana[opc-1]);
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos na semana " + opc + " foi " + semana[opc -1]);
                break;
                case 9:
                break;
                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO");
            }
        } while (opc!=9);
    }
    
    public static void total(int semana[]){
        int i, j, total;
        total = 0;
        for (i=0; i<4; i++){
            for (j = 0; j < 3 ; j ++){
                total = total + mat[i][j];
            } 
        } JOptionPane.showMessageDialog(null, "O total de vendas no mês foi " + total);
    }            
}
